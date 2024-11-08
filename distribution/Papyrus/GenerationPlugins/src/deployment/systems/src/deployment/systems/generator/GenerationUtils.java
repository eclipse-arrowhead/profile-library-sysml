package deployment.systems.generator;

import java.util.ArrayList;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.cbor.CBORFactory;
import com.fasterxml.jackson.dataformat.csv.CsvFactory;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.smile.SmileFactory;
import com.squareup.javapoet.CodeBlock;

import common.dto.APXInterfaceDesignDescription;

/**
 *
 * Generation Utilities
 *
 * @author cripan
 * 
 */
public class GenerationUtils {

	// =================================================================================================
	// methods

	// -------------------------------------------------------------------------------------------------
	/**
	 * Creates a Jackson object mapper based on a media type. It supports JSON, JSON
	 * Smile, XML, YAML and CSV.
	 * 
	 * @param MediaType  The media type of the encoding
	 * @param MapperName ???
	 * @return The Jackson object mapper.
	 */
	public static CodeBlock createObjectMapper(String MediaType, String MapperName) {

		CodeBlock.Builder BmapperBlock = CodeBlock.builder();

		String mapperCode = ""; // TODO Not Used

		if (MediaType.equalsIgnoreCase("JSON"))
			BmapperBlock.addStatement("$T jsonFactory_$L = new JsonFactory()", JsonFactory.class, MapperName)
					.addStatement("$T $L=new ObjectMapper(jsonFactory_$L)", ObjectMapper.class, MapperName, MapperName);

		else if (MediaType.equalsIgnoreCase("JSON_SMILE"))
			BmapperBlock.addStatement("$T smileFactory = new SmileFactory()", SmileFactory.class)
					.addStatement("ObjectMapper $L=new ObjectMapper(smileFactory)", ObjectMapper.class, MapperName);

		else if (MediaType.equalsIgnoreCase("CBOR"))
			BmapperBlock.addStatement("$T cborFactory = new CBORFactory()", CBORFactory.class)
					.addStatement("$T $L=new ObjectMapper(cborFactory)", ObjectMapper.class, MapperName);

		else if (MediaType.equalsIgnoreCase("XML")) // TODO Check if XMLFactory is needed
			BmapperBlock.addStatement("$T $L=new $T()", ObjectMapper.class, MapperName, XmlMapper.class);
			
			// javax.xml.stream.XMLInputFactory xif = XmlFactoryProvider.newInputFactory();
			// xif.setProperty(javax.xml.stream.XMLInputFactory.IS_SUPPORTING_EXTERNAL_ENTITIES,
			// isExpandingEntityRefs());
			// xif.setProperty(javax.xml.stream.XMLInputFactory.SUPPORT_DTD,
			// isExpandingEntityRefs());
			// xif.setProperty(javax.xml.stream.XMLInputFactory.IS_VALIDATING,
			// isValidatingDtd());
			// javax.xml.stream.XMLOutputFactory xof =
			// XmlFactoryProvider.newOutputFactory();
			// XmlFactory xmlFactory = new XmlFactory(xif, xof);
			// xmlFactory.configure(Feature.AUTO_CLOSE_TARGET, false);
			// result = new XmlMapper(xmlFactory);

		else if (MediaType.equalsIgnoreCase("CSV"))
			BmapperBlock.addStatement("$T csvFactory = new CsvFactory()", CsvFactory.class)
					.addStatement("$T $L=new $T(csvFactory))", ObjectMapper.class, CsvMapper.class, MapperName);

		else
			BmapperBlock.addStatement("$T $L=new ObjectMapper()", ObjectMapper.class, MapperName);

		return BmapperBlock.build();
	}

	// -------------------------------------------------------------------------------------------------
	/**
	 * 
	 * Checks that at least one service interface implements the CoAP protocol
	 * 
	 * @param serviceInterfaceList List of the service interfaces registered for a system
	 * @return If this system implements CoAP
	 */
	public static boolean checkCoapProtocol(ArrayList<APXInterfaceDesignDescription> serviceInterfaceList) {
		
		for (int i = 0; i < serviceInterfaceList.size(); i++)
			if (serviceInterfaceList.get(i).getProtocol().equalsIgnoreCase("CoAP"))
				return true;

		return false;
	}

	// -------------------------------------------------------------------------------------------------
	/**
	 * 
	 * Checks that at least one service interface implements the HTTP protocol
	 * 
	 * @param serviceInterfaceList List of the service interfaces registered for a system
	 * @return If this system implements HTTP
	 */
	public static boolean checkHttpProtocol(ArrayList<APXInterfaceDesignDescription> serviceInterfaceList) {
		
		for (int i = 0; i < serviceInterfaceList.size(); i++)
			if (serviceInterfaceList.get(i).getProtocol().startsWith("HTTP"))
				return true;

		return false;
	}
	
	// -------------------------------------------------------------------------------------------------
	/**
	 * 
	 * Build payload class
	 * 
	 * @param workspace The path to the file
	 * @param localCloud The name of the class
	 * @param system The name of the system
	 * @param operation The operation of the interface
	 * @param type The type of the system (consumer/provider)
	 */
	public static void buildDTO(String workspace, String localCloud, String system, APXInterfaceDesignDescription.APXServiceDescription operation, String type) {

		DTOBuilder dtoBuilder = new DTOBuilder();
		String behavior = type.equals("consumer") ? "-consumer" : "-provider";
		
		if(!operation.getRequestType().equals(""))
			dtoBuilder.classGen(operation.getRequestPayload(), operation.getRequestType(), workspace, localCloud, system + behavior);
		else if (!operation.getResponseType().equals(""))
			dtoBuilder.classGen(operation.getResponsePayload(), operation.getResponseType(), workspace, localCloud, system + behavior);
		
	}
		
	// -------------------------------------------------------------------------------------------------
	/**
	 * 
	 * Removes the service interface repetitions
	 * 
	 * @param serviceInterfaceList List of the service interfaces registered for a system
	 * @return Set of service interfaces
	 */
	public static ArrayList<APXInterfaceDesignDescription> removeRepetitions(ArrayList<APXInterfaceDesignDescription> serviceInterfaceList) {
		// TODO: Look if this is correct or the problem is the service name convention
		
		ArrayList<APXInterfaceDesignDescription> withoutRepetitions = new ArrayList<APXInterfaceDesignDescription>();
		
		for (int i = 0; i < serviceInterfaceList.size(); i++) {
			APXInterfaceDesignDescription element = serviceInterfaceList.get(i);
			
			if(!withoutRepetitions.contains(element))
				withoutRepetitions.add(element);
		}
		
		return withoutRepetitions;
	}
}

package cucumberTest;
import javax.xml.namespace.QName;
import javax.xml.soap.*;

import org.apache.commons.lang3.tuple.ImmutablePair;

public class WebserviceTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	        /*
	            The example below requests from the Web Service at:
	             http://www.webservicex.net/uszip.asmx?op=GetInfoByCity


	            To call other WS, change the parameters below, which are:
	             - the SOAP Endpoint URL (that is, where the service is responding from)
	             - the SOAP Action

	            Also change the contents of the method createSoapEnvelope() in this class. It constructs
	             the inner part of the SOAP envelope that is actually sent.
	         */
	        String soapEndpointUrl = "http://lbrusdkrengine01:49501/alert-jaxws/AlertInitiatorService";
	        //String soapAction = soapEndpointUrl;//+"/initiateAlert";

	        callSoapWebService(soapEndpointUrl);
	    }

	    private static void createSoapEnvelope(SOAPMessage soapMessage ) throws SOAPException {
	        SOAPPart soapPart = soapMessage.getSOAPPart();

	        String myNamespace = "wsdl";
	        String myNamespaceURI = "http://soprabanking.com/alert/WS/v1_0/wsdl";

	        // SOAP Envelope
	        SOAPEnvelope envelope = soapPart.getEnvelope();
	        envelope.addNamespaceDeclaration(myNamespace, myNamespaceURI);

	            /*
	            <soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:wsdl="http://soprabanking.com/alert/WS/v1_0/wsdl">
   				<soapenv:Header/>
   				<soapenv:Body>
      			<wsdl:initiateAlert>
       
         		<alert>
            	<!--Optional:-->
            	<addressee>AMANAWSP</addressee>
            	<!--Optional:-->
            	<contextClient>CL001</contextClient>
            	<!--Optional:-->
            	<contextContract>contract001</contextContract>
            	<!--Optional:-->
            	<notificationType>TRUC0</notificationType>
            	<!--Optional:-->
            	<priority>LOW</priority>
         	</alert>
      		</wsdl:initiateAlert>
   			</soapenv:Body>
			</soapenv:Envelope>
	            */

	        // SOAP Body
	        SOAPBody soapBody = envelope.getBody();
	        SOAPElement soapBodyElem = soapBody.addChildElement("initiateAlert", myNamespace);
	        
	        QName name = new QName("alert");
	        SOAPElement alert = soapBodyElem.addChildElement(name);
	        
	       // QName name1 = new QName("addressee");
	        SOAPElement Elem1 = alert.addChildElement("addressee");//addAttribute(arg0, arg1)addChildElemet(name1);
	        Elem1.addTextNode("AMANAWSP");
	        
	        SOAPElement Elem2 = alert.addChildElement("contextClient");
	        Elem2.addTextNode("CL001");
	        
	        SOAPElement Elem3 = alert.addChildElement("contextContract");
	        Elem3.addTextNode("contract001");
	        
	        SOAPElement Elem4 = alert.addChildElement("notificationType");
	        Elem4.addTextNode("NotifyTypeAlice2");
	        
	        SOAPElement Elem5 = alert.addChildElement("priority");
	        Elem5.addTextNode("HIGH");
	    }

	    private static void callSoapWebService(String soapEndpointUrl) {
	        try {
	            // Create SOAP Connection
	            SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
	            SOAPConnection soapConnection = soapConnectionFactory.createConnection();

	            // Send SOAP Message to SOAP Server
	            SOAPMessage soapResponse = soapConnection.call(createSOAPRequest(), soapEndpointUrl);

	            // Print the SOAP Response
	            System.out.println("Response SOAP Message:");
	            soapResponse.writeTo(System.out);
	            System.out.println();

	            soapConnection.close();
	        } catch (Exception e) {
	            System.err.println("\nError occurred while sending SOAP Request to Server!\nMake sure you have the correct endpoint URL and SOAPAction!\n");
	            e.printStackTrace();
	        }
	    }

	    private static SOAPMessage createSOAPRequest() throws Exception {
	        MessageFactory messageFactory = MessageFactory.newInstance();
	        SOAPMessage soapMessage = messageFactory.createMessage();

	        createSoapEnvelope(soapMessage);

	       // MimeHeaders headers = soapMessage.getMimeHeaders();
	        //headers.addHeader("SOAPAction", soapAction);

	        soapMessage.saveChanges();

	        /* Print the request message, just for debugging purposes */
	        System.out.println("Request SOAP Message:");
	        soapMessage.writeTo(System.out);
	        System.out.println("\n");

	        return soapMessage;
	    }

	}
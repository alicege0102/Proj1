package UtilityClass;
import UtilityClass.WebRequestHandler;
import java.io.IOException;
import java.util.Iterator;

import javax.xml.namespace.QName;
import javax.xml.soap.*;

public class UtilityForWebService {
    private static String _wsdlURL; 
    private String _xmlFileName;
    //private static SOAPConnectionFactory _soapConnectionFactory = null;
    //private static SOAPConnection _soapConnectionForAlertType = null;
    //private static SOAPConnection _soapConnectionForInitiateAlert = null;

    private static SOAPMessage _soapMessageRequest;
    //private static SOAPMessage _soapMessageForAlert;
    
    private static SOAPMessage _soapResponse;
    //private static SOAPMessage _soapResponseForAlert;


    public UtilityForWebService(String wsdlURL, String xmlFileName)
    {
    	_wsdlURL = wsdlURL;
    	_xmlFileName = xmlFileName;
    }
    

    
    public void CreateRequestFromFile()
    {
    	WebRequestHandler _xmlHandler = new WebRequestHandler(_xmlFileName);
    	_soapMessageRequest = _xmlHandler.getSoapMessageFromString();
    }
    
       
    public SOAPMessage callSoapWebService(){
    	try {
    		// Create SOAP Connection
            SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
            SOAPConnection soapConnection = soapConnectionFactory.createConnection();

            // Send SOAP Message to SOAP Server
            CreateRequestFromFile();
            System.out.println("SOAP Message Request:");
            _soapMessageRequest.writeTo(System.out);
			System.out.println();
			
            if (_soapMessageRequest != null)
            {
            	_soapResponse = soapConnection.call(_soapMessageRequest, _wsdlURL);
	            // Send SOAP Message to SOAP Server
	    		// Print the SOAP Response
	            System.out.println("SOAP Message Response:");
	            _soapResponse.writeTo(System.out);
				System.out.println();
            }
 			 soapConnection.close();
   
        } catch (Exception e) {
            System.err.println("\nError occurred while sending SOAP Request to Server!\nMake sure you have the correct endpoint URL and SOAPAction!\n");
            e.printStackTrace();
        }
    	return _soapResponse;
    }
    
    public boolean IsResponseExpected(String expectedResponse)
    {
    	//to do: parse _soapResponse to be String
    	return true;
    }
    
}

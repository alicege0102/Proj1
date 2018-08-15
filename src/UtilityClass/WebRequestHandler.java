package UtilityClass;


import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

import javax.xml.soap.MessageFactory;
import javax.xml.soap.MimeHeaders;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;

public class WebRequestHandler {
	
	private String _filePath = new File("").getAbsoluteFile()+"\\TestData\\"; 
	private String _fileName;
	
	public boolean IsFileExist(String fileNmae)
	{
		File f = new File(_filePath + _fileName);
		return (f.exists() && !f.isDirectory());
	}
	public WebRequestHandler()
	{
		_filePath = new File("").getAbsoluteFile()+"\\TestData\\"; 
	}
	public WebRequestHandler(String filePath, String fileName)
	{
		_filePath = filePath;
		_fileName = fileName;
	}
	public WebRequestHandler(String fileName)
	{
		_filePath = new File("").getAbsoluteFile()+"\\TestData\\"; 
		_fileName = fileName;
	}
	private String GetRequestFromFile()
	{
		StringBuilder sb = new StringBuilder();
		String sCurrentLine;
		try 
		{
			BufferedReader br = new BufferedReader(new FileReader(_filePath+_fileName));
			while ((sCurrentLine = br.readLine()) != null) {
	            sb.append(sCurrentLine);
	        	}
			br.close();
		} catch (Exception e) {System.err.println("Error during read file from "+_filePath+_fileName);}
		
		return sb.toString();
	}
	
	public SOAPMessage getSoapMessageFromString() {
		SOAPMessage message = null;
		String xml = GetRequestFromFile();
	    try {
		MessageFactory factory = MessageFactory.newInstance();
	     message= factory.createMessage(new MimeHeaders(), new ByteArrayInputStream(xml.getBytes(Charset.forName("UTF-8"))));
	    } catch (Exception e) {System.err.println("Error when create SOAP message " + xml);}
	    return message;
	}

}

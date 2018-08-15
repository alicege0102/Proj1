package UtilityClass;

public class Alert {
	//NotificationType alertType;
	String _attributeKey;
	String _attributeValue;
	String _addressee;
	String _addresseeType;
	String _contextClient;
	String _contextContract;
	String _notificationType;
	String _priority;
	String[] _alertElements = new String[] 
			{"attributes",
			"attributeKey",
			"attributeValue",
			"addressee",
			"addresseeType",
			"context",
			"contextClientIdentifier",
			"contextContractId",
			"notificationType",
			"priority",
			};
	static int _numberOfAlert =0;
	public Alert(String attributeKey, String attributeValue, String addressee,	String addresseeType,String contextClient,String contextContract,String notificationType,String priority)
	{
		_attributeKey = attributeKey;
		_attributeValue = attributeValue;
		_addressee = addressee;
		_addresseeType = addresseeType;
		_contextClient = contextClient;
		_contextContract = contextContract;
		_notificationType = notificationType;
		_priority = priority;
		_numberOfAlert++;
	}
	public String[] GetElementsOfAlert()
	{
		return _alertElements;
	}
	public String[] GetElementValueOfAlert()
	{
		String[] alertAttributeValues = new String[] {_attributeKey,_attributeValue,_addressee,_addresseeType,_contextClient,_contextContract,_notificationType,_priority};
		
		return alertAttributeValues;
	}
	
	public void SetAttributeKey(String attributeKey)
	{
		_attributeKey = attributeKey;
	}
	
	public void SetAttributeValue(String attributeValue)
	{
		_attributeValue = attributeValue;
	}
	public void SetAddressee(String addressee)
	{
		_addressee = addressee;
	}
	
	public void SetAddresseeType(String addresseeType)
	{
		_addresseeType = addresseeType;
	}
	public void SetContextClient(String contextClient)
	{
		_contextClient = contextClient;
	}
	
	public void SetContextContract(String contextContract)
	{
		_contextContract = contextContract;
	}
	
	public void SetNotificationType(String notificationType)
	{
		_notificationType = notificationType;
	}
	
	public void SetPriority(String priority)
	{
		_priority = priority;
	}
	public void AddAlertCount(int count)
	{
		_numberOfAlert += count;
	}
	public String GetAddressee()
	{
		return _addressee;
	}
	
	public String GetAttributeKey()
	{
		return _attributeKey;
	}
	
	public String GetAttributeValue()
	{
		return _attributeValue;
	}
	
	public String GetAddresseeType()
	{
		return _addresseeType;
	}
	public String GetNotificationTypet()
	{
		return _notificationType;
	}
	public int GetAlertCount()
	{
		return _numberOfAlert;
	}
	
	public String GetContextClient(String contextClient)
	{
		return _contextClient;
	}
	
	public String GetContextContract(String contextContract)
	{
		return _contextContract;
	}
	
	public String GetNotificationType(String notificationType)
	{
		return _notificationType;
	}
	
	public String GetPriority(String priority)
	{
		return _priority;
	}
	
	
}

package UtilityClass;

public class NotificationType {
	String _notificationTypeName;
	String _title;
	String _notificationCategory;
	String _priority;  
	String _targetTransaction;
	int _alertDisplayDuration;
	
	public NotificationType(String name, String title, String category, String priority, String transaction, int duration) 
	{
		  _notificationTypeName =name;
		  _title = title;
		  _notificationCategory =category;
		  _priority =priority;  
		  _targetTransaction=transaction;
		_alertDisplayDuration = duration;
	}
	
	public void SetNotificationTypeName  (String value)
	{
		_notificationTypeName = value;
	}
	public void SetTitle  (String value)
	{
		_title = value;
	}
	public void SetNotificationCategory  (String value)
	{
		_notificationCategory = value;
	}
	public void SetPriority    (String value)
	{
		_priority = value;
	}
	public void SetTargetTransaction  (String value)
	{
		_targetTransaction = value;
	}
	public void SetAlertDisplayDuration  (int value)
	{
		_alertDisplayDuration = value;
	}
	public String GetNotificationTypeName ()				
	{			
		return _notificationTypeName   ;		
	}			
	public String GetTitle ()			
	{			
		return _title;		
	}			
	public String GetNotificationCategory ()			
	{			
		return _notificationCategory   ;		
	}			
	public String GetPriority   ()			
	{			
		return _priority   ;		
	}			
	public String GetTargetTransaction ()			
	{			
		return _targetTransaction   ;		
	}			
	public int GetAlertDisplayDuration ()			
	{			
		return _alertDisplayDuration   ;		
	}			


}

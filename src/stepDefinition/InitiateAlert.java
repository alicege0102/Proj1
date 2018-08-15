package stepDefinition;


import org.junit.Assert;
import UtilityClass.Alert;
import UtilityClass.UtilityForWebService;
import UtilityClass.WebRequestHandler;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class InitiateAlert {
	Alert _alert;
	UtilityForWebService _webServiceAgent = new UtilityForWebService("wsdl","alert");
	WebRequestHandler _alertFile;

	@Given("^There is \"([^\"]*)\"$")
	public void there_is(String notificationType) throws Throwable {
	    _alert = new Alert("account", "42","ADIRWSP","OP","CL001","contract001","NotifyTypeAlice1","LOW");
	}
	
	@Given("^I generate (\\d+) alert with file \"([^\"]*)\"$")
	public void i_generate_alert_with_file(int number, String fileName) throws Throwable {
		//_webServiceAgent.CreateRequestFromFile(fileName);
		_webServiceAgent.callSoapWebService();
		
	}
	
	@Given("^There is a file \"([^\"]*)\"$")
	public void there_is_a_file(String fileName) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		_alertFile = new WebRequestHandler(fileName);
		Assert.assertTrue(_alertFile.IsFileExist(fileName));
	}

	@Then("^I found my alert in DB$")
	public void i_found_my_alert_in_DB() throws Throwable {
		System.out.println("I found my alert in DB");
	}

}

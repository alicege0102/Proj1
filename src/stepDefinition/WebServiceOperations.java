package stepDefinition;
import org.junit.Assert;
import UtilityClass.Alert;
import UtilityClass.UtilityForWebService;
import UtilityClass.WebRequestHandler;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WebServiceOperations {
	UtilityForWebService _webServiceAgent;
	WebRequestHandler _alertFileForWebService;
	
	@Given("^There is a file \"([^\"]*)\" for creating web service$")
	public void there_is_a_file_for_creating_web_service(String fileName) throws Throwable {
		_alertFileForWebService = new WebRequestHandler(fileName);
		Assert.assertTrue(_alertFileForWebService.IsFileExist(fileName));
	    
	}


	@Given("^I generate (\\d+) alert type with file \"([^\"]*)\"$")
	public void i_generate_alert_type(int alertTypeCount, String fileName) throws Throwable {
		//_webServiceAgent.CreateRequestFromFile(fileName);
		_webServiceAgent.callSoapWebService();
	    
	}
	
	@Given("^I create my web service: URL = \"([^\"]*)\", xml = \"([^\"]*)\"$")
	public void i_create_my_web_service_URL_xml(String wsdlURL, String xmlFileName) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 _webServiceAgent = new UtilityForWebService(wsdlURL,xmlFileName);
		//webServiceAgent.CreateRequestFromFile();
	    _webServiceAgent.callSoapWebService();
	}

	@Then("^I validate the \"([^\"]*)\"$")
	public void i_validate_the(String response) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    Assert.assertTrue(_webServiceAgent.IsResponseExpected(response));
	}

}

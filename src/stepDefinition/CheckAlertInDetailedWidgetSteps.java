package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CheckAlertInDetailedWidgetSteps {
	
	private static WebDriver driver = null;
	
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C://Selenium//chromedriver.exe");
		driver = new ChromeDriver();
 
		//Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
		 
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
        //Launch the Online Store Website
 
        driver.get("http://lbrusdkrengine01:49501/web/guest/home");
	}
	@Given("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String username, String password) throws Throwable {
	    
		// Find the element that's ID attribute is 'account'(My Account) 
		 
        driver.findElement(By.xpath(".//*[@id='_58_login']")).sendKeys(username);
        driver.findElement(By.xpath(".//*[@id='_58_password']")).sendKeys(password);
        driver.findElement(By.xpath(".//*[@id='_58_fm']/fieldset/div/button")).click();
	}

	@Then("^Users is on Work Station Page$")
	public void users_is_on_Work_Station_Page() throws Throwable {
	    //Assert.assertEquals("http://lbrusdkrengine01:49501/web/guest/chooseop", driver.getCurrentUrl());
	}
	
	@Then("^I click on Administration button$")
	public void i_click_on_Administration_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath(".//*[@id='cssmenu']/ul/li/a/span")).click();
	}

	@When("^User choose OP$")
	public void user_choose_OP() throws Throwable {
		driver.findElement(By.xpath(".//*[@id='_operationalPositionList_WAR_soprabankingworkstationweb_:j_idt3']/div[1]/ul/li/input")).click();
	}

	@Then("^User is on Widget Home Page$")
	public void user_is_on_Widget_Home_Page() throws Throwable {
		//Assert.assertEquals("http://lbrusdkrengine01:49501/user/test/alert_home", driver.getCurrentUrl());
	}
	
	@Then("^User logOut$")
	public void user_logOut() throws Throwable {
		//driver.findElement(By.xpath(".//*[@id='_wks_oneToRuleThemAll_WAR_soprabankingworkstationweb_:userBanner']/div/div[2]/span[1]")).click();
		//driver.findElement(By.xpath(".//*[@id='sign-out']/span")).click();
		driver.quit();
	}

}

package Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class step2 {
	WebDriver d;
	@Given("Open chrome browser and open login page of the application")
	public void open_chrome_browser_and_open_login_page_of_the_application() {
	    // Write code here that turns the phrase above into concrete actions
		d=new ChromeDriver();
		d.get("https://phptravels.org/login");
		d.manage().window().maximize();
		System.out.println("OPENING THE LOGIN PAGE");
	}

	@When("Enter Username , password and click on login button")
	public void enter_Username_password_and_click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		Login_Elements.email(d).sendKeys("anandhan.s2@hcl.com");
		Login_Elements.password(d).sendKeys("Hianandhan@2000");
		System.out.println("USER DETAILS ENTERED");
	}

	@Then("Login Successful")
	public void login_Successful() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(15000);
		Login_Elements.login(d).submit();
		System.out.println("LOGIN SUCCESSFUL");
	}



}

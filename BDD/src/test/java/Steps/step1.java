package Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class step1 {
	WebDriver d;
	@Given("Open chrome browser and url of the application")
	public void open_chrome_browser_and_url_of_the_application() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Asus\\Downloads\\chromedriver_win32\\chromedriver.exe");

		d=new ChromeDriver();
		d.get("https://phptravels.org/register.php");
		d.manage().window().maximize();
		System.out.println("OPENING THE PHP REGISTRATION PAGE");
	}

	@When("Enter the details of user such as Username, address , password and click on registration button")
	public void enter_the_details_of_user_such_as_Username_address_password_and_click_on_registration_button() {
	    // Write code here that turns the phrase above into concrete actions
		Signin_elements.f_name(d).sendKeys("ANANDHAN");
		Signin_elements.l_name(d).sendKeys("S");
		Signin_elements.email1(d).sendKeys("anandhan.s2@hcl.com");
		Signin_elements.inphone(d).sendKeys("26456626");
		Signin_elements.company_name(d).sendKeys("HCL");
		Signin_elements.add1(d).sendKeys("No 1, Kamaraj Nagar,");
		Signin_elements.add2(d).sendKeys("Nehru Street");
		Signin_elements.city(d).sendKeys("Pondicherry");
		Signin_elements.state(d).sendKeys("Pondicherry");
		Signin_elements.postcode(d).sendKeys("605110");
		Signin_elements.phone(d).sendKeys("9487512453");
		Signin_elements.pass(d).sendKeys("Hianandhan@2000");
		Signin_elements.pass2(d).sendKeys("Hianandhan@2000");
		System.out.println("REISTRATION DETAILS ENTERED");
	}

	@Then("Success in registration")
	public void success_in_registration() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(15000);

		Signin_elements.reg(d).submit();
		System.out.println("REGISTRATION SUCCESSFUL");
	}



}

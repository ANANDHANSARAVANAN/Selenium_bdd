package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Signin_elements {
	public static WebElement f_name(WebDriver d)
	{
	return d.findElement(By.name("firstname"));
	}
	public static WebElement l_name(WebDriver d)
	{
	return d.findElement(By.name("lastname"));
	}
	public static WebElement email1(WebDriver d)
	{
	return d.findElement(By.name("email"));
	}
	public static WebElement inphone(WebDriver d)
	{
	return d.findElement(By.id("inputPhone"));
	}
	public static WebElement company_name(WebDriver d)
	{
	return d.findElement(By.name("companyname"));
	}
	public static WebElement add1(WebDriver d)
	{
	return d.findElement(By.name("address1"));
	}
	public static WebElement add2(WebDriver d)
	{
	return d.findElement(By.name("address2"));
	}

	public static WebElement city(WebDriver d)
	{
	return d.findElement(By.name("city"));
	}
	public static WebElement state(WebDriver d)
	{
	return d.findElement(By.name("state"));
	}
	public static WebElement postcode(WebDriver d)
	{
	return d.findElement(By.name("postcode"));
	}
	public static WebElement phone(WebDriver d)
	{
	return d.findElement(By.id("customfield2"));
	}
	public static WebElement pass(WebDriver d)
	{
	return d.findElement(By.name("password"));
	}
	public static WebElement pass2(WebDriver d)
	{
	return d.findElement(By.name("password2"));
	}

	public static WebElement reg(WebDriver d)
	{
	return d.findElement(By.xpath("//*[@id=\"frmCheckout\"]/div[5]/input"));
	}
}

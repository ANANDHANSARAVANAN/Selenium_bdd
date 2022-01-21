package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_Elements {
	public static WebElement email(WebDriver d)
	{
		return d.findElement(By.name("username"));
	}
	public static WebElement password(WebDriver d)
	{
		return d.findElement(By.name("password"));
	}
	public static WebElement login(WebDriver d)
	{
		return d.findElement(By.xpath("//*[@id=\"login\"]"));
	}

}

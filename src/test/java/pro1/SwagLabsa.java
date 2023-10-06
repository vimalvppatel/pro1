package pro1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert;

public class SwagLabsa {

	public static void landingPageTest() {

		WebDriver wb = new ChromeDriver();
		wb.manage().window().maximize();
		wb.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		wb.get("https://www.saucedemo.com/v1/");

		boolean flag = wb.findElement(By.cssSelector("[class=\"login_logo\"]")).isDisplayed();

		org.testng.Assert.assertEquals(flag, true);
	}
	
	
	public static void errormessage() {

		WebDriver wb = new ChromeDriver();
		wb.manage().window().maximize();
		wb.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		wb.get("https://www.saucedemo.com/v1/");
		wb.findElement(By.cssSelector("[id=\"login-button\"]")).click();
		String errormessage = wb.findElement(By.xpath("//h3")).getText();
		
		org.testng.Assert.assertEquals(errormessage, "Epic sadface: Username is required");

		
	}
	
	public static void main(String[] args) {
	  SwagLabsa.errormessage();
	
}}


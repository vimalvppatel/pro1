package pro1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup(); 
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver wb = new ChromeDriver(op);
		
		wb.manage().window().maximize();

		wb.get("https://rahulshettyacademy.com/AutomationPractice");

		wb.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement drop = wb.findElement(By.cssSelector("[id=\"dropdown-class-example\"]"));
		   Select s = new Select(drop);
		   
	             ///s.selectByIndex(2);	   
               ///  s.selectByValue("option2");
		   
		   s.selectByVisibleText("Option3");
		   
		Thread.sleep(1000);
		   
	WebElement radio = wb.findElement(By.cssSelector("[value=\"radio2\"]"));	  
	     radio.click();
	     
	WebElement checkbox = wb.findElement(By.cssSelector("[id=\"checkBoxOption3\"]"));    
	     checkbox.click();	    
	     
	WebElement con = wb.findElement(By.cssSelector("[placeholder=\"Type to Select Countries\"]"));
	    con.sendKeys("India");
	    
	    
     List<WebElement> countries = wb.findElements(By.cssSelector("[class=\"ui-menu-item-wrapper\"]"));
		
		WebDriver driver = null;

		for (int i = 0; i < wb.findElements(By.cssSelector("[class=\"ui-menu-item-wrapper\"]")).size(); i++) {
			    // String name =
			   // wb.findElements(By.cssSelector("[class=\"ui-menu-item-wrapper\"]")).get(i).getText();

			if (wb.findElements(By.xpath("//li[@class=\"ui-menu-item\"]/div")).get(i).getText()
					.equalsIgnoreCase("India"))
			{
				wb.findElements(By.xpath("//li[@class=\"ui-menu-item\"]/div")).get(i).click();
		

		 JavascriptExecutor js = (JavascriptExecutor)wb;

		 Object executeScript = js.executeScript("window.scrollBy(0,1000)", args);
		 
		 Thread.sleep(1000);
		 
		 WebElement frame = wb.findElement(By.xpath("[id=\"courses-iframe\"]"));
		     frame.click();
		 
		 wb.switchTo().frame(frame); 
		 
		 Thread.sleep(1000);
		 
		 WebElement  hover = wb.findElement(By.cssSelector("(//a[@data-toggle=\"dropdown\"])[1]"));
		    
	     Actions action = new Actions(wb);
  
	   action.moveToElement(hover).perform();
	   
	   
			}
		}
	   

	   
	   
	   
	   

		
		 
}
}

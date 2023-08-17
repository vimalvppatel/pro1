package pro1;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver wb = new ChromeDriver(op);
		wb.manage().window().maximize();
		wb.get("https://rahulshettyacademy.com/AutomationPractice/");

		wb.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//	
//	JavascriptExecutor js = (JavascriptExecutor)wb;
//	
//	js.executeScript("window.scrollBy(0,300)", args);
//	
//  WebElement hover = wb.findElement(By.cssSelector("[id=\"mousehover\"]"));
//  
//   Actions a = new Actions(wb);
//   a.moveToElement(hover).perform();

		wb.findElement(By.cssSelector("[placeholder=\"Type to Select Countries\"]")).sendKeys("zi");

		List<WebElement> countries = wb.findElements(By.cssSelector("[class=\"ui-menu-item-wrapper\"]"));
		
		WebDriver driver = null;

		for (int i = 0; i < wb.findElements(By.cssSelector("[class=\"ui-menu-item-wrapper\"]")).size(); i++) {
			// String name =
			// wb.findElements(By.cssSelector("[class=\"ui-menu-item-wrapper\"]")).get(i).getText();

			if (wb.findElements(By.xpath("//li[@class=\"ui-menu-item\"]/div")).get(i).getText()
					.equalsIgnoreCase("Swaziland"))
			{
				wb.findElements(By.xpath("//li[@class=\"ui-menu-item\"]/div")).get(i).click();
			}
		}

		
		wb.findElement(By.cssSelector("[id=\"opentab\"]")).click();
	
    	Set<String> handles = wb.getWindowHandles();
		
		Iterator<String> handleiterator = handles.iterator();
		
		String tab1 = handleiterator.next();
		String tab2 = handleiterator.next();
		
		wb.switchTo().window(tab2);	
		/*wb.findElement(By.cssSelector("[class=\"button float-left\"]")).click();
		
		wb.switchTo().window(tab1);
		
   JavascriptExecutor js = (JavascriptExecutor)wb;

	 js.executeScript("window.scrollBy(0,1000)", args);
     
    WebElement frame = wb.findElement(By.cssSelector("[id=\"courses-iframe\"]"));
    
    wb.switchTo().frame(frame);
        
     wb.findElement(By.xpath("(//a[@href=\"lifetime-access\"])[2]")).click();
     
     
    /* WebElement hover = wb.findElement(By.xpath("(//a[text()=\"More \"])[1]"));
     
     Actions ab = new Actions(wb);
     ab.moveToElement(hover).perform();
   */  
     
     
     
    	}
	
}

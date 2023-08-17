package pro1;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class browserhandle {

	public static void launchbrowser() {

		
		
		WebDriver wb = null;
		String br = propertyreader.getProperty("br");

		if (br.equalsIgnoreCase("chrome")) {

			wb = new ChromeDriver();

		} else if (br.equalsIgnoreCase("edge")) {

			wb = new EdgeDriver();

		}
		
		
		wb.manage().window().maximize();
		wb.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}
	
	
	public static void main(String[] args) {
		launchbrowser();
	}
}

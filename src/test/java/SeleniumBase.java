import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumBase {

	
	public static void main(String[] args)
	 {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		
		driver.get("https://nuix.github.io/senior-sdet/productionCalc/index.html");
		driver.close();
		driver.quit();
		
		
		
		
		
	 }
}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CalculatorPage {
	
	
	private static WebElement element = null;
	
	
	public static WebElement  clear_Button(WebDriver driver) {
		element = driver.findElement(By.xpath("//body/div[@id='panel']/div[1]/input[1]"));
		return element;
	}
	public static WebElement  divide_Button(WebDriver driver) {
		element = driver.findElement(By.id("divide"));
		return element;
	}
	
	public static WebElement  add_Button(WebDriver driver) {
		element = driver.findElement(By.id("add"));
		return element;
	}
	public static WebElement multiply_Button(WebDriver driver) {
		 element = driver.findElement(By.id("multiply"));
			return element;
	}
	
	public static WebElement subtract_Button (WebDriver driver) {
		 element = driver.findElement(By.id("subtract"));
			return element;	
	}
	
	public static WebElement result_Button (WebDriver driver) {
		 element = driver.findElement(By.xpath("//body/div[@id='panel']/div[3]/input[3]"));
			return element;
	}
	
	public static WebElement one_Button (WebDriver driver) {
		 element = driver.findElement(By.xpath("//body/div[@id='panel']/div[2]/div[3]/input[1]"));
			return element;
}
	public static WebElement two_Button (WebDriver driver) {
		 element = driver.findElement(By.xpath("//body/div[@id='panel']/div[2]/div[3]/input[2]"));
			return element;
	
}

	public static WebElement three_Button (WebDriver driver) {
		 element = driver.findElement(By.xpath("//body/div[@id='panel']/div[2]/div[3]/input[3]"));
			return element;
	}
	public static WebElement four_Button (WebDriver driver) {
		 element = driver.findElement(By.xpath("//body/div[@id='panel']/div[2]/div[3]/input[4]"));
			return element;
	}
	public static WebElement five_Button (WebDriver driver) {
		 element = driver.findElement(By.xpath("//body/div[@id='panel']/div[2]/div[3]/input[5]"));
			return element;
	}

public static WebElement six_Button (WebDriver driver) {
	 element = driver.findElement(By.xpath("//body/div[@id='panel']/div[2]/div[3]/input[6]"));
		return element;
}

public static WebElement seven_Button (WebDriver driver) {
	 element = driver.findElement(By.xpath("//body/div[@id='panel']/div[2]/div[3]/input[7]"));
		return element;
}

public static WebElement eigh_Button (WebDriver driver) {
	 element = driver.findElement(By.xpath("//body/div[@id='panel']/div[2]/div[3]/input[8]"));
		return element;
}

public static WebElement nine_Button (WebDriver driver) {
	 element = driver.findElement(By.xpath("//body/div[@id='panel']/div[2]/div[3]/input[9]"));
		return element;
}

public static WebElement zero_Button (WebDriver driver) {
	 element = driver.findElement(By.xpath("//body/div[@id='panel']/div[2]/div[3]/input[0]"));
		return element;
}

public static WebElement Dot_Button (WebDriver driver) {
	 element = driver.findElement(By.xpath("//body/div[@id='panel']/div[2]/div[4]/input[2]"));
		return element;
}
	
	}
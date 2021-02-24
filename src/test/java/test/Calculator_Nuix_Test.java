package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.CalculatorPageObjects;

public class Calculator_Nuix_Test  {
	
	private static WebDriver driver; 
	
	@BeforeMethod
	public void setUoTest () {
		 System.setProperty("webdriver.gecko.driver", "/Test Data/Library/geckodriver");
		 driver = new FirefoxDriver();
		 driver.get("https://nuix.github.io/senior-sdet/productionCalc/index.html");
		 driver.manage().window().maximize();
		 
	}
	
	@AfterMethod
	public void tearDownTest() {
		driver.close();
		System.out.println("Test Completed Successfully");
	}

	@Test
	    // Simple addition  1+3
	public void simple_addition1() {
		
		 CalculatorPageObjects pageObj = new CalculatorPageObjects(driver);
		 pageObj.clickClearButton();
		 pageObj.clickOne_Button();
		 pageObj.clickAddButton();
		 pageObj.clickThree_Button();
		 pageObj.clickResult_Button();
		 
		 String result = driver.findElement(By.xpath("//div[contains(text(),'4')]")).getText();
		 Assert.assertEquals(result, "4");
	}
	
	
	@Test
    // Simple addition   5+6
public void simple_addition2() {
	
	 CalculatorPageObjects pageObj = new CalculatorPageObjects(driver);
	 
	 pageObj.clickClearButton();
	 pageObj.clickFive_Button();
	 pageObj.clickAddButton();
	 pageObj.clickSix_Button();
	 pageObj.clickResult_Button();
	 
	 String result = driver.findElement(By.xpath("//div[contains(text(),'11')]")).getText();
	 Assert.assertEquals(result, "11");

}
	@Test
    // Simple addition   3+7
public void simple_addition3() {
	
	 CalculatorPageObjects pageObj = new CalculatorPageObjects(driver);
	 
	 pageObj.clickClearButton();
	 pageObj.clickThree_Button();
	 pageObj.clickAddButton();
	 pageObj.clickSeven_Button();
	 pageObj.clickResult_Button();
	 
	 String result = driver.findElement(By.xpath("//div[contains(text(),'10')]")).getText();
	 Assert.assertEquals(result, "10");
	
}
	@Test
    // Simple division   5/1
public void simple_division1() {
	
	 CalculatorPageObjects pageObj = new CalculatorPageObjects(driver);
	 
	 pageObj.clickClearButton();
	 pageObj.clickFive_Button();
	 pageObj.clickDivide_Button();
	 pageObj.clickOne_Button();
	 pageObj.clickResult_Button();
	 
	 String result = driver.findElement(By.xpath("//div[contains(text(),'5')]")).getText();
	 Assert.assertEquals(result, "5");
	}
	
	@Test
    // Simple division   6/2
public void simple_division2() {
	
	 CalculatorPageObjects pageObj = new CalculatorPageObjects(driver);
	 
	 pageObj.clickClearButton();
	 pageObj.clickSix_Button();
	 pageObj.clickDivide_Button();
	 pageObj.clickTwo_Button();
	 pageObj.clickResult_Button();
	 
	 String result = driver.findElement(By.xpath("//div[contains(text(),'3')]")).getText();
	 Assert.assertEquals(result, "3");
	}
	
	@Test
    // Simple division   100/2
public void simple_division3() {
	
	 CalculatorPageObjects pageObj = new CalculatorPageObjects(driver);
	 
	 pageObj.clickClearButton();
	 pageObj.clickOne_Button();
	 pageObj.clickZero_Button();
	 pageObj.clickZero_Button();
	 pageObj.clickDivide_Button();
	 pageObj.clickTwo_Button();
	 pageObj.clickResult_Button();
	 
	 String result = driver.findElement(By.xpath("//div[contains(text(),'50')]")).getText();
	 Assert.assertEquals(result, "50");
	}
	
	@Test
    // Simple division   0/2
public void simple_division4() {
	
	 CalculatorPageObjects pageObj = new CalculatorPageObjects(driver);
	 
	 pageObj.clickClearButton();
	 pageObj.clickZero_Button();
	 pageObj.clickDivide_Button();
	 pageObj.clickTwo_Button();
	 pageObj.clickResult_Button();
	 
	 String result = driver.findElement(By.xpath("//div[contains(text(),'0')]")).getText();
	 Assert.assertEquals(result, "0");
	}
	
	@Test
    // Simple division   4/0
public void simple_division5() {
	
	 CalculatorPageObjects pageObj = new CalculatorPageObjects(driver);
	 pageObj.clickClearButton();
	 pageObj.clickFour_Button();
	 pageObj.clickDivide_Button();
	 pageObj.clickZero_Button();
	 pageObj.clickResult_Button();
	 
	 String result = driver.findElement(By.xpath("//div[contains(text(),'Error')]")).getText();
	 Assert.assertEquals(result, "Error");
	}
	
	@Test
    // Decimals   0.5+2.65354
     public void decimals1() {
	
	 CalculatorPageObjects pageObj = new CalculatorPageObjects(driver);
	 pageObj.clickClearButton();
	 pageObj.clickDot_Button();
	 pageObj.clickFive_Button();
	 pageObj.clickAddButton();
	 
	 pageObj.clickTwo_Button();
	 pageObj.clickDot_Button();
	 pageObj.clickSix_Button();
	 pageObj.clickFive_Button();
	 pageObj.clickThree_Button();
	 pageObj.clickFive_Button();
	 pageObj.clickFour_Button();
	 
	 pageObj.clickResult_Button();
	 
	 String result = driver.findElement(By.xpath("//div[contains(text(),'3.15354')]")).getText();
	 Assert.assertEquals(result, "3.15354");
	}
	
	@Test
    // Decimals   1.25-.25/0 - Devision by 0 was tested in of the previous scenarios and given test case validating the consequences of operation 
     public void decimals2() {
	
	 CalculatorPageObjects pageObj = new CalculatorPageObjects(driver);
	 pageObj.clickClearButton();
	 pageObj.clickOne_Button();
	 pageObj.clickDot_Button();
	 pageObj.clickTwo_Button();
	 pageObj.clickFive_Button();
	 pageObj.clickSubtract_Button();
	 pageObj.clickDot_Button();
	 pageObj.clickTwo_Button();
	 pageObj.clickFive_Button();
	 pageObj.clickDivide_Button();
	 pageObj.clickZero_Button();
	 pageObj.clickResult_Button();
	 
	 String result = driver.findElement(By.xpath("//div[contains(text(),'Error')]")).getText();
	 Assert.assertEquals(result, "Error");
	}
}

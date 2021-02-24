package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class CalculatorPageObjects {
	
	WebDriver driver;
	
	By clear_Button = By.xpath("//body/div[@id='panel']/div[1]/input[1]");
	By add_Button = By.id("add");
  	By divide_Button = By.id("divide");
  	By multiply_Button =(By.id("multiply"));
  	By subtract_Button = (By.id("subtract"));
  	By result_Button = (By.xpath("//body/div[@id='panel']/div[3]/input[3]"));
  	By one_Button = (By.xpath("//body/div[@id='panel']/div[2]/div[3]/input[1]"));
  	By two_Button = (By.xpath("//body/div[@id='panel']/div[2]/div[3]/input[2]"));
  	By three_Button = (By.xpath("//body/div[@id='panel']/div[2]/div[3]/input[3]"));
  	By four_Button = (By.xpath("//body/div[@id='panel']/div[2]/div[2]/input[1]"));
    By five_Button = (By.xpath("//body/div[@id='panel']/div[2]/div[2]/input[2]"));
  	By six_Button = (By.xpath("//body/div[@id='panel']/div[2]/div[2]/input[3]"));
  	By seven_Button = (By.xpath("//body/div[@id='panel']/div[2]/div[1]/input[1]"));
  	By eight_Button = (By.xpath("//body/div[@id='panel']/div[2]/div[1]/input[2]"));
  	By nine_Button = (By.xpath("//body/div[@id='panel']/div[2]/div[1]/input[3]"));
  	By zero_Button = (By.xpath("//body/div[@id='panel']/div[2]/div[4]/input[1]"));
  	By dot_Button = (By.xpath("//body/div[@id='panel']/div[2]/div[4]/input[2]"));

	
	public CalculatorPageObjects(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickClearButton() {
		driver.findElement(clear_Button).click();
	}
	
	public void clickAddButton() {
		driver.findElement(add_Button).click();
	}
	
	public void clickDivide_Button() {
		driver.findElement(divide_Button).click();
	}
	public void clickMultiply_Button() {
		driver.findElement(multiply_Button).click();
	} 
	public void clickSubtract_Button() {
		driver.findElement(subtract_Button).click();
}
	public void clickResult_Button() {
		driver.findElement(result_Button).click();
	}
	public void clickOne_Button() {
		driver.findElement(one_Button).click();
	}
	public void clickTwo_Button() {
		driver.findElement(two_Button).click();
	}
	public void  clickThree_Button() {
		driver.findElement(three_Button).click();
	}
	public void  clickFour_Button() {
		driver.findElement(four_Button).click();
	}
	public void  clickFive_Button() {
		driver.findElement(five_Button).click();
	}
	public void  clickSix_Button() {
		driver.findElement(six_Button).click();
	}
	public void  clickSeven_Button() {
		driver.findElement(seven_Button).click();
	}
	public void  clickEight_Button() {
		driver.findElement(eight_Button).click();
	}
	public void  clickNine_Button() {
		driver.findElement(nine_Button).click();
	}
	public void  clickZero_Button() {
		driver.findElement(zero_Button).click();
	}
	public void  clickDot_Button() {
		driver.findElement(dot_Button).click();
	}
}

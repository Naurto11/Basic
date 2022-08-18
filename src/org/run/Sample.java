package org.run;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\Admin\\\\eclipse-workspace\\\\Selenium\\\\src\\\\driver\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		
		WebElement txtuser = driver.findElement(By.xpath("//input[@type='text']"));
		
		js.executeScript("arguments[0].setAttribute('value','iphone')", txtuser);
		
		
		
		WebElement btnclk = driver.findElement(By.xpath("//input[@value='Go']"));
		
		js.executeScript("arguments[0].click()", btnclk);
		
	
		WebElement down = driver.findElement(By.xpath("//span[text()='(4% off)']"));
		
		js.executeScript("arguments[0].scrollIntoView('false')", down);
		
		WebElement up = driver.findElement(By.xpath("//div[@id='deliveryRefinements']"));
		
		js.executeAsyncScript("arguments[0].scrollIntoView('true')", up);
		
		
		driver.quit();
		                                                                                                                            
		
	
		
		

		

	}

}

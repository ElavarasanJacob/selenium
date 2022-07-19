package org.ssss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Driver\\chromedriver.exe");
		 
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://signin.ebay.com/ws/eBayISAPI.dll?SignIn&ru=https%3A%2F%2Fwww.ebay.com%2F");
		 
		
		WebElement findElement = driver.findElement(By.cssSelector("input#userid"));
		findElement.sendKeys("ewewewe");
		String attribute = findElement.getAttribute("id");
		System.out.println(attribute);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		WebElement findElement2 = driver.findElement(By.tagName("section"));
		String text = findElement2.getText();
		System.out.println(text);
		driver.close();
	
		
		
	}
}

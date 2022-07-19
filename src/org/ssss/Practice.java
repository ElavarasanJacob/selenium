package org.ssss;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com/");
	WebElement findElement = driver.findElement(By.xpath("//input[contains(@type,'text')]"));
	findElement.sendKeys("122223333");
	Thread.sleep(3000);
//	
//	WebElement findElement2 = driver.findElement(By.xpath("//a[contains(text(),'Forgotten')]"));
//	findElement2.click();
//	
//	 WebElement findElement3 = driver.findElement(By.xpath("//button[contains(@value,'1')]"));
//	 findElement3.click();
//	
driver.navigate().to("https://accounts.google.com/");
WebElement username = driver.findElement(By.xpath("//input[@type='email']"));
username.sendKeys("12123");

// WebElement google = driver.findElement(By.xpath("//button[@type='button']"));
//	 google.click();
	 
	driver.navigate().back();
	Thread.sleep(2000);
	 WebElement password = driver.findElement(By.xpath("(//input[contains(@class,'input')])[2]"));
password.sendKeys("124081990");
	driver.navigate().forward();
	

		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	}
package org.ssss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		WebElement findElement = driver.findElement(By.tagName("h2"));
		String text = findElement.getText();
		System.out.println(text);
		
		WebElement findElement2 = driver.findElement(By.linkText("Forgotten password?"));
		String text2 = findElement2.getText();
		System.out.println(text2);
		
		WebElement findElement3 = driver.findElement(By.partialLinkText("Forgotten"));
		String text3 = findElement2.getText();
		System.out.println(text3);
		
		WebElement findElement4 = driver.findElement(By.id("email"));
		findElement4.sendKeys("ela.s.arasan@gmail.com");
		
		WebElement findElement5 = driver.findElement(By.name("pass"));
		findElement5.sendKeys("1234567");
		
		WebElement findElement6 = driver.findElement(By.name("login"));
		findElement6.click();
		
		driver.close();
		
	



	}

}

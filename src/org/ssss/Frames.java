package org.ssss;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;

public class Frames {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
driver.get("https://netbanking.hdfcbank.com/netbanking/");

List<WebElement> findElements = driver.findElements(By.tagName("iframe"));
System.out.println(findElements.size());

driver.switchTo().frame(0);
WebElement userid = driver.findElement(By.xpath("//input[@type='text']"));
userid.sendKeys("elaaaa");

//driver.switchTo().defaultContent();
WebElement continueclick = driver.findElement(By.xpath("//a[text()='CONTINUE']"));
continueclick.click();





		
	}
	
}

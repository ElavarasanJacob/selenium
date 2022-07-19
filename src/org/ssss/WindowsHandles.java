package org.ssss;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandles {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		WebElement popup = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		popup.click();

		WebElement searchbar = driver.findElement(By.xpath("//input[@type='text']"));
		searchbar.sendKeys("iphone12");
		Thread.sleep(2000);

		WebElement searchicon = driver.findElement(By.xpath("//button[@type='submit']"));
		searchicon.click();
		Thread.sleep(2000);

		WebElement firstproduct = driver.findElement(By.xpath("(//div[@class='_4rR01T'])[2]"));
		firstproduct.click();
		Thread.sleep(2000);

		// to get all window id
		String parid = driver.getWindowHandle();

		// to get all window id's
		Set<String> a = driver.getWindowHandles();

		// iterate the set
		for (String b : a) {
			if (!parid.equals(b)) {
				driver.switchTo().window(b);
				WebElement addtocart = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']"));
				addtocart.click();
				TakesScreenshot ts = (TakesScreenshot) driver;
				File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(screenshotAs, new File("C:\\Selenium\\Flipkart.png"));

			}
		}

		driver.switchTo().window(parid);
		Thread.sleep(2000);
		WebElement iphonepurple = driver.findElement(By.xpath("(//div[contains(text(),'APPLE iPhone')])[2]"));
		iphonepurple.click();
		Thread.sleep(2000);
		
		 Set<String> purple = driver.getWindowHandles();
		 
		 List<String> li=new ArrayList<>(); //(purple);
		 li.addAll(purple);
		 
		 String x = li.get(2);
		driver.switchTo().window(x);
//		driver.findElement(By.id("pincodeInputId")).sendKeys("601206");
//		driver.findElement(By.xpath("//span[text()='Check']")).click();

		WebElement findElement5 = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']"));
		findElement5.click();

	}

}

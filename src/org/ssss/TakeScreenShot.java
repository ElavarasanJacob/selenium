package org.ssss;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TakeScreenShot {
	 public static void main(String[] args) throws IOException {
			System.setProperty("webdriver.chrome.driver","C:\\SeleniumTest\\Driver\\chromedriver.exe");
	       WebDriver driver =new ChromeDriver();
	       
	       driver.manage().window().maximize();
	       driver.get("http://greenstech.in/selenium-course-content.html");
	
	       TakesScreenshot t = (TakesScreenshot) driver;
	       
	       File screenshotAs = t.getScreenshotAs(OutputType.FILE);
	       FileUtils.copyFile(screenshotAs, new File ("C:\\Users\\ADMIN\\Downloads\\Screenshot\\sdasdasdasd.png"));
	       
	       Date d = new Date();
	       System.out.println(d);
	       
	       
	       
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	 }	
	
}

package org.ssss;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAndNavigation {

	public static void main(String[] args) throws InterruptedException {
      System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Driver\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      Dimension d = new Dimension(500,500);
      driver.manage().window().setSize(d);
      
      Point p = new Point(250,200);
      driver.manage().window().setPosition(p);
      driver.manage().window().maximize();

      driver.get("https:/www.facebook.com/");
      Thread.sleep(2000);
		driver.navigate().to("https://www.google.com/");
		driver.navigate().back();
		driver.navigate().forward();
		//driver.navigate().refresh();
		WebElement googletxt = driver.findElement(By.xpath("//input[@name='q']"));
		googletxt.sendKeys("vijay pictures");
		
		
		
		WebElement option = driver.findElement(By.xpath("(//div[@role='option'])[4]"));
		option.click();
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

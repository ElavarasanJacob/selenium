package org.ssss;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {
   public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Driver\\chromedriver.exe");
       WebDriver driver =new ChromeDriver();
       
       driver.manage().window().maximize();
       
       driver.get("http://greenstech.in/selenium-course-content.html");
       
       JavascriptExecutor s = (JavascriptExecutor)driver;
       
       WebElement scrolldown = driver.findElement(By.xpath("//h3[contains(text(),'Certification')]"));
      // j.executeScript("arguments[0],scrollIntoView(true)",scrolldown);
s.executeScript("arguments[0].scrollIntoView(true)", scrolldown);

Thread.sleep(2000);

WebElement scrollup = driver.findElement(By.xpath("//div[@title='Courses']"));
       s.executeScript("arguments[0].scrollIntoView(false)", scrollup);
       
       driver.navigate().to("https://www.facebook.com/");
       
       WebElement username = driver.findElement(By.id("email"));
       s.executeScript("arguments[0].setAttribute('value','ramss')",username);
       
       WebElement password = driver.findElement(By.name("pass"));
       s.executeScript("arguments[0].setAttribute('value','ellla')", password);
       
       WebElement login = driver.findElement(By.name("login"));
       s.executeScript("arguments[0].click()", login);
       
       
       
       
       
       
   }
	
	
	
	
	
	
}

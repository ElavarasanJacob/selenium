package org.ssss;

import java.awt.AWTException;
import java.awt.KeyEventDispatcher;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.KeyDownAction;

public class ActionAndRobot {
		public static void main(String[] args) throws InterruptedException, AWTException{
		      System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Driver\\chromedriver.exe");
		      WebDriver driver = new ChromeDriver();
//		      driver.get("http://greenstech.in/selenium-course-content.html");
		      
		     /* WebElement cource = driver.findElement(By.xpath("//div[@title='Courses']"));
		      cource.click();
		      
		      WebElement testing = driver.findElement(By.xpath("//div[@title='Software Testing']"));
                testing.click();
                
                driver.navigate().to("http://greenstech.in/selenium-course-content.html");
		      
		Actions a =new Actions(driver);
	      WebElement cource1 = driver.findElement(By.xpath("//div[@title='Courses']"));
	      a.moveToElement(cource1).perform();
	      
	      
	      WebElement testing1 = driver.findElement(By.xpath("//div[@title='Software Testing']"));
           a.moveToElement(testing1).perform();
           a.click(testing1).perform();
           
           driver.navigate().to("https://demo.guru99.com/test/drag_drop.html");
           WebElement source = driver.findElement(By.xpath("(//a[@style='color:#FFFFFF;'])[4]"));
           WebElement target = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));        
           //a.dragAndDrop(source, target).perform();
           a.clickAndHold(source).moveToElement(target).release().perform();*/
           
				Actions a =new Actions(driver);

           driver.navigate().to("https://www.facebook.com/");
           Thread.sleep(2000);
		WebElement username = driver.findElement(By.id("email"));
		a.keyUp(Keys.SHIFT).sendKeys(username,"elavsa").keyDown(Keys.SHIFT).perform();
		
		/*username.click();
//		username.sendKeys("12222");
		Robot r =new Robot();
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_E);
		r.keyRelease(KeyEvent.VK_E);
		r.keyPress(KeyEvent.VK_L);
		r.keyRelease(KeyEvent.VK_L);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_SHIFT);
r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);*/
		
//		WebElement password = driver.findElement(By.name("pass"));
//		password.click();
		


		




		

		
//		
//		a.doubleClick(username).perform();
//		a.contextClick(username).perform();
		
		
		
		}

}

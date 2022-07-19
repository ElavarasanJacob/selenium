package org.ssss;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Alerts.html");

		WebElement SimpleAlert = driver.findElement(By.xpath("(//a[contains(text(),'Alert')])[2]"));
		SimpleAlert.click();

		WebElement SimpleAlertclick = driver.findElement(By.xpath("(//button[contains(text(),'click')])[1]"));
		SimpleAlertclick.click();
		Thread.sleep(2000);

		Alert alert = driver.switchTo().alert();
		alert.accept();

		Thread.sleep(2000);

		WebElement confirmalert = driver.findElement(By.xpath("(//a[contains(text(),'Alert')])[3]"));
		confirmalert.click();

		WebElement confirmclick = driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
		confirmclick.click();

		Alert alert2 = driver.switchTo().alert();
		alert2.dismiss();

		Thread.sleep(2000);

		WebElement Prompt = driver.findElement(By.xpath("(//a[contains(text(),'Alert')])[4]"));
		Prompt.click();

		WebElement promptclick = driver.findElement(By.xpath("(//button[contains(text(),'click')])[3]"));
		promptclick.click();

		Alert alert3 = driver.switchTo().alert();
		// String text = alert3.getText();
		System.out.println(alert3.getText());
		Thread.sleep(2000);
		alert3.sendKeys("good evening");
		alert3.accept();

	}

}

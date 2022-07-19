package org.ssss;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
		
		driver.get("https://www.cricbuzz.com/cricket-series/4061/indian-premier-league-2022/points-table");
		
		WebElement tabless = driver.findElement(By.tagName("table"));
		//System.out.println(tabless.getText());
		WebElement heading = tabless.findElement(By.tagName("thead"));
		System.out.println(heading.getText());
		WebElement tablerow = heading.findElement(By.tagName("tr"));
		List<WebElement> tableheadings = tablerow.findElements(By.tagName("th"));
		for (int i = 0; i < tableheadings.size(); i++) {
			System.out.println(tableheadings.get(i).getText());
			}
		WebElement tbodyd = driver.findElement(By.tagName("tbody"));
		List<WebElement> tablerows = tbodyd.findElements(By.tagName("tr"));
		//System.out.println(tablerows.getText());

		
		
		
		
		
		
		
	}

}

package org.ssss;

import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		WebElement button = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		button.click();
		Thread.sleep(2000);
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Select s = new Select(day);
		s.selectByIndex(13);

		Thread.sleep(2000);

		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select s1 = new Select(month);
		s1.selectByValue("8");

		Thread.sleep(2000);

		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		Select s2 = new Select(year);
		s2.selectByVisibleText("1990");
		Thread.sleep(2000);

		WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.sendKeys("Elavarasan");

		WebElement lastname = driver.findElement(By.name("lastname"));
		lastname.sendKeys("S");

		WebElement emailid = driver.findElement(By.name("reg_email__"));
		emailid.sendKeys("ela.s.arasanjacob@gmail.com");

		WebElement reenter = driver.findElement(By.xpath("(//input[@type='text'])[5]"));
		reenter.sendKeys("ela.s.arasanjacob@gmail.com");

		WebElement password = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
		password.sendKeys("1234567@i");

		WebElement gender = driver.findElement(By.xpath("(//label[@class='_58mt'])[2]"));
		gender.click();

		// WebElement signup = driver.findElement(By.xpath("//button[text()='Sign
		// Up']"));
		// signup.click();

		driver.navigate().to("https://www.ironspider.ca/forms/dropdowns.htm");

		WebElement multiselect = driver.findElement(By.xpath("//select[@name='coffee2']"));
		Select s3 = new Select(multiselect);
		List<WebElement> options = s3.getOptions();
		int size = options.size();
		System.out.println(size);
		boolean multiple = s3.isMultiple();
		System.out.println(multiple);

		System.out.println("===============Get all options===============");
		for (int i = 0; i < options.size(); i++) {
			// WebElement webElement = options.get(i);
			// String text = webElement.getText();
			System.out.println(options.get(i).getText());
		}
		Thread.sleep(2000);
		System.out.println("==============MultiSelect=================");

		s3.selectByIndex(0);
		s3.selectByValue("milk2");
		s3.selectByVisibleText("Cream");
		Thread.sleep(2000);
		System.out.println("=========selected all option=========");

		List<WebElement> allSelectedOptions = s3.getAllSelectedOptions();
		for (WebElement b : allSelectedOptions) {
			System.out.println(b.getText());
			// String text = b.getText();
			// System.out.println(text);
		}
		Thread.sleep(2000);
		System.out.println("=========selected 1st option=========");

		WebElement firstSelectedOption = s3.getFirstSelectedOption();
		System.out.println(firstSelectedOption.getText());

		System.out.println("=========deselect option by index=========");

		s3.deselectByIndex(1);
	}

}

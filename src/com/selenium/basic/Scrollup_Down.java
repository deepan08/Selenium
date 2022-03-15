package com.selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollup_Down {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DEEPAN\\eclipse-workspace\\Selenium_Project\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement close = driver.findElement(By.xpath("//button [@class = '_2KpZ6l _2doB4z' ]"));
		close.click();
		Thread.sleep(3000);
		
		WebElement sdown = driver.findElement(By.xpath("//*[@id=\"container\"]/div/footer/div/div[3]/div[2]/div/div[1]/a/span"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].ScrollIntoView();", sdown);
		//js.executeScript("arguments[0].ScrollIntoView();", sdown);
	}
}
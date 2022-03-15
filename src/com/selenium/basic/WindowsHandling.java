package com.selenium.basic;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DEEPAN\\eclipse-workspace\\Selenium_Project\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		Set<String> all_id = driver.getWindowHandles();
		
		for (String ot : all_id) {
			System.out.println(ot);
			String title = driver.switchTo().window(ot).getTitle();
			System.out.println(title);
		}
		
		
	}

}

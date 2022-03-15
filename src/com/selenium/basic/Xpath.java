package com.selenium.basic;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Xpath {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DEEPAN\\eclipse-workspace\\Selenium_Project\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		WebElement casualDress = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a"));
		Actions ac = new Actions(driver);
		ac.moveToElement(casualDress).build().perform();

		// WebElement women =
		// driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a"));
		// women.click();
		// Thread.sleep(3000);

		WebElement dress = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[2]/ul/li[1]/a"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click() ;", dress);
		Thread.sleep(3000);

		WebElement cart = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[1]/span"));
		JavascriptExecutor jas = (JavascriptExecutor) driver;
		jas.executeScript("arguments[0].click() ;", cart);
		Thread.sleep(3000);
	
		WebElement proceed = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span"));
		proceed.click();
		Thread.sleep(3000);

		WebElement pay = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span"));
		pay.click();
		Thread.sleep(3000);

		WebElement username = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		username.sendKeys("hello@gmail.com");
		Thread.sleep(3000);

		WebElement password = driver.findElement(By.xpath("//*[@id=\"passwd\"]"));
		password.sendKeys("567891234");
		Thread.sleep(3000);

		// driver.findElement(By.xpath(""))

		Set<String> all_id = driver.getWindowHandles();

		for (String ot : all_id) {
			System.out.println(ot);
			String title = driver.switchTo().window(ot).getTitle();
			System.out.println(title);
		}

	}

}

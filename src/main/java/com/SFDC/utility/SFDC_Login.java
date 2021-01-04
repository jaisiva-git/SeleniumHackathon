package com.SFDC.utility;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SFDC_Login {
	public static WebDriver driver;

	public static void launchingBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	public static void LoginUrl() {
		driver.get("https://login.salesforce.com/");
	}
	
	public static void LoginCredential() {
		//username: jaisri123@abc.com    // Pwd: Jaisiva@123
				WebElement ele = driver.findElement(By.xpath("//input[@id='username']"));
				waitExplicitly(10, ele);
				ele.clear();
				
				ele.sendKeys("jaisri123@abc.com");
				
				WebElement ele2 = driver.findElement(By.xpath("//input[@id='password']"));
				waitExplicitly(10, ele2);

				ele2.sendKeys("Jaisiva@123");
				driver.findElement(By.xpath("//input[@id='rememberUn']")).click();
				driver.findElement(By.xpath("//input[@id='Login']")).click();
	}
	
	public static void waitExplicitly(int iSeconds, WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver, iSeconds);
		wait.ignoring(NoSuchElementException.class, ElementNotVisibleException.class);
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
	
	public static void quitBrowser() {
		driver.close();
		driver.quit();
	}


}

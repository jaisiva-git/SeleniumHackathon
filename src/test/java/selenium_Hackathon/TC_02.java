package selenium_Hackathon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.SFDC.utility.SFDC_Login;

public class TC_02 extends SFDC_Login{

	public static void main(String[] args) {
		launchingBrowser();
		LoginUrl();
		LoginToSaleforce();
		quitBrowser();


	}
	
	public static void LoginToSaleforce() {
		WebElement ele = driver.findElement(By.xpath("//input[@id='username']"));
		waitExplicitly(10, ele);
		ele.clear();
		
		ele.sendKeys("jaisri123@abc.com");
		
		WebElement ele2 = driver.findElement(By.xpath("//input[@id='password']"));
		waitExplicitly(10, ele2);

		ele2.sendKeys("Jaisiva@123");
		
		driver.findElement(By.xpath("//input[@id='rememberUn']")).click();
		waitExplicitly(10, driver.findElement(By.xpath("//input[@id='Login']")));
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		
		
		
		//Verify the Homepage is displayed
		waitExplicitly(10, driver.findElement(By.id("home_Tab")));
		WebElement homepage = driver.findElement(By.id("home_Tab"));
		WebElement linktext = homepage.findElement(By.linkText("Home"));
		
		System.out.println("homepage: " + homepage.getText());
		System.out.println("linktext: " + linktext.getText());
		
	}

}

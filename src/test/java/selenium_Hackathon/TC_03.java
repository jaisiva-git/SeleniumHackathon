package selenium_Hackathon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.SFDC.utility.SFDC_Login;

public class TC_03 extends SFDC_Login{

	public static void main(String[] args) {
		launchingBrowser();
		LoginUrl();
		quitBrowser();
	}

	public static void CheckRememberMe() {
		WebElement ele = driver.findElement(By.xpath("//input[@id='username']"));
		waitExplicitly(10, ele);
		ele.clear();
		
		ele.sendKeys("jaisri123@abc.com");
		
		WebElement ele2 = driver.findElement(By.xpath("//input[@id='password']"));
		waitExplicitly(10, ele2);

		ele2.sendKeys("Jaisiva@123");
		driver.findElement(By.xpath("//input[@id='rememberUn']")).click();
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		
		//check the remember username field
		
	}
}

package selenium_Hackathon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.SFDC.utility.SFDC_Login;

public class TC_04b extends SFDC_Login{

	public static void main(String[] args) {
		launchingBrowser();
		LoginUrl();
		forgotPassword2();
		quitBrowser();
	}
	
	public static void forgotPassword2() {
		
		WebElement ele = driver.findElement(By.xpath("//input[@id='username']"));
		waitExplicitly(10, ele);
		ele.sendKeys("jaisri123@abc12.com");
		
		WebElement ele2 = driver.findElement(By.xpath("//input[@id='password']"));
		waitExplicitly(10, ele2);
		ele2.sendKeys("Jaisiva@12345");
		
		WebElement ele3 = driver.findElement(By.xpath("//input[@id='Login']"));
		ele3.click();
		
		//Verify the error message
		String ActualMessage = driver.findElement(By.id("error")).getText();
		String ExpectedMessage = "Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
		Assert.assertEquals(ActualMessage, ExpectedMessage);

	}

}

package selenium_Hackathon;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.SFDC.utility.SFDC_Login;


public class TC_04A extends SFDC_Login{

	public static void main(String[] args) throws InterruptedException {
		launchingBrowser();
		LoginUrl();
		forgotPassword();
		quitBrowser();
		

	}
	public static void forgotPassword() throws InterruptedException {
		//Forgot password element
		WebElement forgotPwd = driver.findElement(By.id("forgot_password_link"));
		forgotPwd.click();
		
		//Element from username in forgot pwd
		
		WebElement userna = driver.findElement(By.id("un"));
		userna.sendKeys("jaisri123@abc.com");
		
		//Click continue
		WebElement ContButton = driver.findElement(By.id("continue"));
		ContButton.click();
		
		//verify the email message
		String Reset = driver.findElement(By.xpath("//p[text()='We’ve sent you an email with a link to finish resetting your password.']")).getText();
		
		String Expected = "We’ve sent you an email with a link to finish resetting your password.";
		Thread.sleep(5000);	
		Assert.assertEquals( Reset, Expected);
		
	}
	

}

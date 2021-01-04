package selenium_Hackathon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.SFDC.utility.SFDC_Login;

public class TC_01 extends SFDC_Login{
	

	public static void main(String[] args) {
		launchingBrowser();
		LoginUrl();
		LoginErrorMessage();
		quitBrowser();
	}
	public static void LoginErrorMessage() {
		//username: jaisri123@abc.com    // Pwd: Jaisiva@123
		WebElement ele = driver.findElement(By.xpath("//input[@id='username']"));
		waitExplicitly(10, ele);
		ele.clear();
		
		ele.sendKeys("jaisri123@abc.com");
		
		WebElement ele2 = driver.findElement(By.xpath("//input[@id='password']"));
		waitExplicitly(10, ele2);

		ele2.sendKeys("Jaisiva@123");
		ele2.clear();
		driver.findElement(By.xpath("//input[@id='rememberUn']")).click();
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		
		
		//Verify error message
		String ActualMsg = driver.findElement(By.xpath("//div[@id='error']")).getText();
		
		String ExpectMsg = "Please enter your password.";
		
		Assert.assertEquals(ActualMsg, ExpectMsg);
		
		if(ActualMsg.equals(ExpectMsg)) {
	        System.out.println("Test Case Passed");
	    }else{
	        System.out.println("Test Case Failed");
	    }
	}
}

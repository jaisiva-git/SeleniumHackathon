package selenium_Hackathon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.SFDC.utility.SFDC_Login;

public class TC_10 extends SFDC_Login{

	public static void main(String[] args) throws InterruptedException  {
		launchingBrowser();
		LoginUrl();
		LoginCredential();
		createAccount();
		quitBrowser();
	}
	public static void createAccount() throws InterruptedException {
		

		
		//click on new button and displayed the message
		WebElement newButton = driver.findElement(By.name("new"));
		newButton.click();
		Thread.sleep(5000);
		
		//Click on Account name  
		WebElement accName =  driver.findElement(By.id("acc2"));
		accName.sendKeys("Jayasri");
		
		//Select type in the account
		WebElement type = driver.findElement(By.id("acc6"));
		type.click();
		Select te = new Select(type);
		te.selectByValue("Technology Partner");
		
		//Select Customer priority
		WebElement customerPriority = driver.findElement(By.id("acc6"));
		customerPriority.click();
		Select cp = new Select(customerPriority);
		cp.selectByValue("High");
		
		//Click the save button
		WebElement saveAndNewButton = driver.findElement(By.id("save_new"));
		saveAndNewButton.click();
		
		
		
	}
}

package selenium_Hackathon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.SFDC.utility.SFDC_Login;

public class TC_10 extends SFDC_Login {

	public static void main(String[] args) throws InterruptedException {
		launchingBrowser();
		LoginUrl();
		LoginCredential();
		createAccount();
		quitBrowser();
	}

	public static void createAccount() throws InterruptedException {
		// click the account
		WebElement accountMenu = driver.findElement(By.xpath("//li[@id='Account_Tab']"));
		accountMenu.click();
		Thread.sleep(5000);
		// close the popupbox
		driver.findElement(By.id("tryLexDialogX")).click();

		// click on new button and displayed the message
		WebElement newButton = driver.findElement(By.name("new"));
		newButton.click();
		Thread.sleep(5000);

		// Click on Account name
		WebElement accName = driver.findElement(By.id("acc2"));
		accName.sendKeys("Jayasri");

		// Select type in the account
		WebElement type = driver.findElement(By.id("acc6"));
		type.click();
			
		Select te = new Select(type);
		te.selectByValue("Technology Partner");

		// Select Customer priority
		WebElement customerPriority = driver.findElement(By.id("00N4x00000Df8vY"));
		customerPriority.click();
		waitExplicitly(10, customerPriority);

		Select cp = new Select(customerPriority);
		cp.selectByValue("High");

		// Click the save button
		WebElement saveAndNewButton = driver.findElement(By.name("save"));
		waitExplicitly(10, saveAndNewButton);

		saveAndNewButton.click();

	}
}

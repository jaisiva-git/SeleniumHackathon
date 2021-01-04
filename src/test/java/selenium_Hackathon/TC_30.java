package selenium_Hackathon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.SFDC.utility.SFDC_Login;

import junit.framework.Assert;

public class TC_30 extends SFDC_Login {

	public static void main(String[] args) throws InterruptedException {
		launchingBrowser();
		LoginUrl();
		LoginCredential();
		checkErrorMessage();
		quitBrowser();

	}

	public static void checkErrorMessage() throws InterruptedException {
		// click the contacts tab link
		WebElement contactsLink = driver
				.findElement(By.xpath("//ul/li[@id='Contact_Tab']/a[contains(text(),'Contacts')]"));
		contactsLink.click();
		Thread.sleep(5000);

		// close the popupbox
		driver.findElement(By.id("tryLexDialogX")).click();

		// create new contacts link
		WebElement createNewContacts = driver.findElement(By.xpath("//a[contains(text(),'Create New View')]"));
		createNewContacts.click();
		
		//enter wrong data "EFGH"
		String UniqueName = "EFGH";
		WebElement viewUniqueName = driver.findElement(By.id("devname"));
		viewUniqueName.sendKeys(UniqueName);
		
		//click save button
		driver.findElement(By.name("save")).click();
		
		//verify the error message
		String actualMsg = driver.findElement(By.xpath("//div[contains(text(),' You must enter a value')]")).getText();
		String ExpectedMsg = "Error: You must enter a value";
		Assert.assertEquals(actualMsg, ExpectedMsg);
		
		
		
	}
}

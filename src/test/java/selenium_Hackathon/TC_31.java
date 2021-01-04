package selenium_Hackathon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.SFDC.utility.SFDC_Login;

public class TC_31 extends SFDC_Login {

	public static void main(String[] args) throws InterruptedException {
		launchingBrowser();
		LoginUrl();
		LoginCredential();
		cancelButton();
		quitBrowser();

	}

	public static void cancelButton() throws InterruptedException {
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
		// enter view name
		String Fname = "Jayasri";
		WebElement viewName = driver.findElement(By.id("fname"));
		viewName.sendKeys(Fname);

		String UniqueName = "Jayasri";
		WebElement viewUniqueName = driver.findElement(By.id("devname"));
		viewUniqueName.sendKeys(UniqueName);

		// cancel button
		driver.findElement(By.name("cancel"));

	}

}

package selenium_Hackathon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.SFDC.utility.SFDC_Login;

public class TC_32 extends SFDC_Login {

	public static void main(String[] args) throws InterruptedException {
		launchingBrowser();
		LoginUrl();
		LoginCredential();
		checkSaveAndNew();
		quitBrowser();
	}

	public static void checkSaveAndNew() throws InterruptedException {
		// click the contacts tab link
		WebElement contactsLink = driver.findElement(By.xpath("//ul/li[@id='Contact_Tab']/a[contains(text(),'Contacts')]"));
		contactsLink.click();
		Thread.sleep(5000);

		// close the popupbox
		driver.findElement(By.id("tryLexDialogX")).click();
		
		//click the new button
		driver.findElement(By.name("new")).click();
		
		//enter the required fields
		String Lname = "Indian";
		String Accname = "Global Media";
		driver.findElement(By.id("name_lastcon2")).sendKeys(Lname);
		driver.findElement(By.id("con4")).sendKeys(Accname);
		
		//Click the save button
		driver.findElement(By.name("save_new")).click();
	}
}

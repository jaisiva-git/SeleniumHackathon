package selenium_Hackathon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.SFDC.utility.SFDC_Login;

public class TC_28 extends SFDC_Login {

	public static void main(String[] args) throws InterruptedException {
		launchingBrowser();
		LoginUrl();
		LoginCredential();
        myContacts();
		quitBrowser();
	}

	public static void myContacts() throws InterruptedException {
		// click the contacts tab link
		WebElement contactsLink = driver
				.findElement(By.xpath("//ul/li[@id='Contact_Tab']/a[contains(text(),'Contacts')]"));
		contactsLink.click();
		Thread.sleep(5000);

		// close the popupbox
		driver.findElement(By.id("tryLexDialogX")).click();
		
		//click on My conatcts in dropdown 
		WebElement MyContacts = driver.findElement(By.xpath("//select[@id='fcf']"));
		MyContacts.click();
		
		Select s = new Select(MyContacts);
		s.selectByVisibleText("My Contacts");
		
	}
}

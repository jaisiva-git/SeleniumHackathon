package selenium_Hackathon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.SFDC.utility.SFDC_Login;

public class TC_29 extends SFDC_Login {

	public static void main(String[] args) throws InterruptedException {
		launchingBrowser();
		LoginUrl();
		LoginCredential();
		viewContacts();
		quitBrowser();

	}

	public static void viewContacts() throws InterruptedException {
		// click the contacts tab link
		WebElement contactsLink = driver
				.findElement(By.xpath("//ul/li[@id='Contact_Tab']/a[contains(text(),'Contacts')]"));
		contactsLink.click();
		Thread.sleep(5000);

		// close the popupbox
		driver.findElement(By.id("tryLexDialogX")).click();
		//Switch to frame
		driver.switchTo().frame("bPageBlock brandSecondaryBrd secondaryPalette");
		System.out.println(driver.findElement(By.xpath("//div/table/tbody/tr[2]/th[1]")).getText());
		Thread.sleep(5000);
		driver.switchTo().defaultContent();

		
	}
}

package selenium_Hackathon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.SFDC.utility.SFDC_Login;

public class TC_27 extends SFDC_Login {

	public static void main(String[] args) throws InterruptedException {
		launchingBrowser();
		LoginUrl();
		LoginCredential();
		selectRecentlyCreated();
		quitBrowser();
	}

	public static void selectRecentlyCreated() throws InterruptedException {
		// click the contacts tab link
		WebElement contactsLink = driver.findElement(By.xpath("//ul/li[@id='Contact_Tab']/a[contains(text(),'Contacts')]"));
		contactsLink.click();
		Thread.sleep(5000);

		// close the popupbox
		driver.findElement(By.id("tryLexDialogX")).click();
		
		//Select the recent page created
		WebElement select = driver.findElement(By.xpath("//select[@id='hotlist_mode']"));
		select.click();
		Select s = new Select(select);
		s.selectByValue("2");
		

	}
}

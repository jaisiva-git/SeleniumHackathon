package selenium_Hackathon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.SFDC.utility.SFDC_Login;

public class TC_22 extends SFDC_Login {

	public static void main(String[] args) throws InterruptedException {
		launchingBrowser();
		LoginUrl();
		LoginCredential();
		leadDefaultview();
		LoginCredential();
		leadDefaultview();
		goButton();
		quitBrowser();
	}

	public static void leadDefaultview() throws InterruptedException {
		// Click the leads links
		WebElement leads = driver.findElement(By.xpath("//li[@id='Lead_Tab']/a"));
		leads.click();
		Thread.sleep(5000);

		// close the popupbox
		driver.findElement(By.id("tryLexDialogX")).click();
		
		
		//Select the my unread leads
		WebElement unreadLeads = driver.findElement(By.xpath("//select[@id='fcf']"));
		waitExplicitly(10, unreadLeads);
		unreadLeads.click();
		
		Select Mleads = new Select (unreadLeads);
		Mleads.selectByVisibleText("My Unread Leads");
		waitExplicitly(10, unreadLeads);

		
		//Click the UserMenu link
		WebElement UMenu = driver.findElement(By.xpath("//span[@id='userNavLabel']"));
		UMenu.click();
		waitExplicitly(10, UMenu);
		//Click the logout button
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		
	}
	public static void goButton() {
		//click the goButton
		WebElement go = driver.findElement(By.name("go"));
		go.click();
	}
}

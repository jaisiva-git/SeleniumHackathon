package selenium_Hackathon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.SFDC.utility.SFDC_Login;

public class TC_17 extends SFDC_Login {

	public static void main(String[] args) throws InterruptedException {
		launchingBrowser();
		LoginUrl();
		LoginCredential();
		opportunityLInk();
		quitBrowser();
	}

	public static void opportunityLInk() throws InterruptedException {
		// Click the opportunites
		WebElement Opp = driver.findElement(By.id("Opportunity_Tab"));
		Opp.click();
		Thread.sleep(5000);

		// close the popupbox
		driver.findElement(By.id("tryLexDialogX")).click();
		
		//click the Opportunity pipeline
		WebElement oppLink = driver.findElement(By.xpath("//a[contains(text(),'Opportunity Pipeline')]"));
		oppLink.click();
	}
}

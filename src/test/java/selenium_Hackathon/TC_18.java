package selenium_Hackathon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.SFDC.utility.SFDC_Login;

public class TC_18 extends SFDC_Login {

	public static void main(String[] args) throws InterruptedException {
		launchingBrowser();
		LoginUrl();
		LoginCredential();

		quitBrowser();
	}

	public static void oppStuck() throws InterruptedException {
		
		// Click the opportunites
		WebElement Opp = driver.findElement(By.id("Opportunity_Tab"));
		Opp.click();
		Thread.sleep(5000);

		// close the popupbox
		driver.findElement(By.id("tryLexDialogX")).click();
		
		//Click the Stuck Opportunity
		WebElement OppStu = driver.findElement(By.id("//a[contains(text(),'Stuck Opportunities')]"));
		OppStu.click();
		

	}

}

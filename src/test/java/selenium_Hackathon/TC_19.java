package selenium_Hackathon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.SFDC.utility.SFDC_Login;

public class TC_19 extends SFDC_Login {

	public static void main(String[] args) throws InterruptedException {
		launchingBrowser();
		LoginUrl();
		LoginCredential();
		quarterlySummer();
		quitBrowser();
	}

	public static void quarterlySummer() throws InterruptedException {
		// Click the opportunites
		WebElement Opp = driver.findElement(By.id("Opportunity_Tab"));
		Opp.click();
		Thread.sleep(5000);

		// close the popupbox
		driver.findElement(By.id("tryLexDialogX")).click();
		
		//Click the Quarterly Summary
		WebElement Interval = driver.findElement(By.xpath("//select[@id='quarter_q']"));
		Select QS = new Select(Interval);
		QS.selectByValue("current");
		
		///select[@id='open']
		WebElement Include = driver.findElement(By.xpath("//select[@id='open']"));
		Select QS1 = new Select(Include);
		QS1.selectByValue("open");
		
		driver.findElement(By.name("go")).click();
	}
}

package selenium_Hackathon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.SFDC.utility.SFDC_Login;

public class TC_20 extends SFDC_Login {

	public static void main(String[] args) throws InterruptedException {
		launchingBrowser();
		LoginUrl();
		LoginCredential();
		leads();
		quitBrowser();
	}
	public static void leads() {
		//Click the leads links
		WebElement leads= driver.findElement(By.xpath("//li[@id='Lead_Tab']/a"));
		leads.click();
		// close the popupbox
				driver.findElement(By.id("tryLexDialogX")).click();
		
	}
}
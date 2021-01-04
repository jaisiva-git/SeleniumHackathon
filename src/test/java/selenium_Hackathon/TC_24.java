package selenium_Hackathon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.SFDC.utility.SFDC_Login;

public class TC_24 extends SFDC_Login {

	public static void main(String[] args) throws InterruptedException {
		launchingBrowser();
		LoginUrl();
		LoginCredential();
		quitBrowser();
	}

	public static void newLeads() throws InterruptedException {
		// Click the leads links
		WebElement leads = driver.findElement(By.xpath("//li[@id='Lead_Tab']/a"));
		leads.click();
		Thread.sleep(5000);
		// close the popupbox
		driver.findElement(By.id("tryLexDialogX")).click();
		
		//Click new button in leads tab
		WebElement NewLeads = driver.findElement(By.name("new"));
		NewLeads.click();
		
		//Enter input fields
		String LastName ="ABCD";
		String CompanyName = "ABCD";
		
		driver.findElement(By.id("name_lastlea2")).sendKeys(LastName);
		driver.findElement(By.id("lea3")).sendKeys(CompanyName);
		
		//click save button
		driver.findElement(By.name("save")).click();

	}
}

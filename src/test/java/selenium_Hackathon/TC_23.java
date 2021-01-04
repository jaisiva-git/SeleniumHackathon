package selenium_Hackathon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.SFDC.utility.SFDC_Login;

public class TC_23 extends SFDC_Login {

	public static void main(String[] args) throws InterruptedException {
		launchingBrowser();
		LoginUrl();
		LoginCredential();
		todayLeads();

		quitBrowser();
	}

	public static void todayLeads() throws InterruptedException {
		// Click the leads links
		WebElement leads = driver.findElement(By.xpath("//li[@id='Lead_Tab']/a"));
		leads.click();
		Thread.sleep(5000);
		// close the popupbox
		driver.findElement(By.id("tryLexDialogX")).click();
		

		// click the today leads in lead tab
		WebElement TodayLeads = driver.findElement(By.xpath("//select[@id='fcf']"));
		waitExplicitly(10, TodayLeads);
		TodayLeads.click();
		
		Select Mleads = new Select (TodayLeads);
		Mleads.selectByVisibleText("Today's Leads");
		waitExplicitly(10, TodayLeads);
		

	}
}
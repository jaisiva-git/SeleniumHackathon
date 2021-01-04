package selenium_Hackathon;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.SFDC.utility.SFDC_Login;

public class TC_21 extends SFDC_Login {

	public static void main(String[] args) throws InterruptedException {
		launchingBrowser();
		LoginUrl();
		LoginCredential();
		leadSelectView();
		quitBrowser();
	}

	public static void leadSelectView() throws InterruptedException {
		// Click the lead select view
		//// select[@id='fcf']
		// Click the leads links
		WebElement leads = driver.findElement(By.xpath("//li[@id='Lead_Tab']/a"));
		leads.click();
		Thread.sleep(5000);
		
		// close the popupbox
				driver.findElement(By.id("tryLexDialogX")).click();

		// Click the all lead dropdown
		WebElement leadDropdown = driver.findElement(By.xpath("// select[@id='fcf']"));
		leadDropdown.click();
		Select lDrop = new Select(leadDropdown);
		// getting all the list in the options
		List<WebElement> op = lDrop.getOptions();
		int size = op.size();
		for (int i = 0; i < size; i++) {
			String options = op.get(i).getText();
			System.out.println(options);

		}

	}
}
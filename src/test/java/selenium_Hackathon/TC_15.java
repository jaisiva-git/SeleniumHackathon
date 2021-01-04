package selenium_Hackathon;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.SFDC.utility.SFDC_Login;

public class TC_15 extends SFDC_Login{

	public static void main(String[] args) throws InterruptedException  {
		launchingBrowser();
		LoginUrl();
		LoginCredential();
		opportunities();
		quitBrowser();
	}
	
	public static void opportunities() throws InterruptedException {
		//Click the opportunites
		WebElement Opp = driver.findElement(By.id("Opportunity_Tab"));
		Opp.click();
		Thread.sleep(5000);
		
		//close the popupbox
		driver.findElement(By.id("tryLexDialogX")).click();
		
		//Select the All opportunities dropdown
		Select allOpp = new Select(driver.findElement(By.xpath("//select[@id='fcf']")));
		
		//getting all the list in the options
		List<WebElement> op = allOpp.getOptions();
		int size = op.size();
	      for(int i =0; i<size ; i++){
	         String options = op.get(i).getText();
	         System.out.println(options);
		
	      }
		
	}
}


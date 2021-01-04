package selenium_Hackathon;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.SFDC.utility.SFDC_Login;

public class TC_16 extends SFDC_Login {

	public static void main(String[] args) throws InterruptedException {
		launchingBrowser();
		LoginUrl();
		LoginCredential();
		newOpportunity();
		quitBrowser();
	}

	public static void newOpportunity() throws InterruptedException {
		// Click the opportunites
		WebElement Opp = driver.findElement(By.id("Opportunity_Tab"));
		Opp.click();
		Thread.sleep(5000);

		// close the popupbox
		driver.findElement(By.id("tryLexDialogX")).click();

		// click the new button
		driver.findElement(By.name("new")).click();

		// Click the Opportunity name
		driver.findElement(By.id("opp3")).sendKeys("Jayasri");

		// Click the lookup link
		driver.findElement(By.xpath("//input[@id='opp4']//following::img[1]")).click();

		// switch to windows
		String mainWindowHandle = driver.getWindowHandle();
		Set<String> allWindowHandles = driver.getWindowHandles();
		Iterator<String> iterator = allWindowHandles.iterator();
		String childWindow = iterator.next();
		while (iterator.hasNext()) {
			if (!mainWindowHandle.equalsIgnoreCase(childWindow)) {

				driver.switchTo().window(childWindow);

				WebElement text = driver.findElement(By.xpath("//h1[contains(text(),'Lookup')]"));
				waitExplicitly(10, text);
				System.out.println("Heading of child window is " + text.getText());
			}
		}
		Thread.sleep(5000);
		driver.switchTo().frame(driver.findElement(By.xpath("//a[contains(text(),'Jayasri')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Jayasri')]")).click();
		// go to main window
		driver.switchTo().window(mainWindowHandle);

	}
}

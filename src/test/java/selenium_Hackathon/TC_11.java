package selenium_Hackathon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.SFDC.utility.SFDC_Login;

public class TC_11 extends SFDC_Login {

	public static void main(String[] args) throws InterruptedException {
		launchingBrowser();
		LoginUrl();
		LoginCredential();
		createNewView();
		quitBrowser();
	}

	public static void createNewView() throws InterruptedException {
		// Click the account menu
		WebElement accountMenu = driver.findElement(By.xpath("//li[@id='Account_Tab']"));
		accountMenu.click();
		Thread.sleep(5000);
		// close the popupbox
		driver.findElement(By.id("tryLexDialogX")).click();

		// Click the createNewView
		WebElement createNew = driver.findElement(By.xpath("//a[contains(text(),'Create New View')]"));
		createNew.click();

		// enter fname and lname
		driver.findElement(By.id("fname")).sendKeys("Jaya");
		driver.findElement(By.name("save")).click();

	}
}

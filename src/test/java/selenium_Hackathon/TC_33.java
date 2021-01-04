package selenium_Hackathon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.SFDC.utility.SFDC_Login;

public class TC_33 extends SFDC_Login {

	public static void main(String[] args) throws InterruptedException {
		launchingBrowser();
		LoginUrl();
		LoginCredential();
		randomScenarios();
		quitBrowser();
	}

	public static void randomScenarios() throws InterruptedException {
		// click the home page
		WebElement HomePage = driver.findElement(By.id("home_Tab"));
		HomePage.click();
		Thread.sleep(5000);
		// close the popupbox
		driver.findElement(By.id("tryLexDialogX")).click();

		// check the home page is displayed
		if (driver.findElement(By.id("home_Tab")).isDisplayed()) {
			System.out.println("Element is Visible");
		} else {
			System.out.println("Element is InVisible");
		}

		// Check username and password is same
		WebElement Uname = driver.findElement(By.xpath("//span/h1/a[@href='/_ui/core/userprofile/UserProfilePage']"));
		if (Uname.isDisplayed()) {
			System.out.println("Username and Password is verified");
		} else {
			System.out.println("Username and Password is not verified");
		}

	}
}

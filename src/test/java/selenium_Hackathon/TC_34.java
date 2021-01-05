package selenium_Hackathon;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.SFDC.utility.SFDC_Login;

public class TC_34 extends SFDC_Login {

	public static void main(String[] args) throws InterruptedException {
		launchingBrowser();
		LoginUrl();
		LoginCredential();
		randomScenarios1();
		quitBrowser();
	}

	@SuppressWarnings("unlikely-arg-type")
	public static void randomScenarios1() throws InterruptedException {
		// clikc the home button
		WebElement home = driver.findElement(By.id("home_Tab"));
		home.click();
		Thread.sleep(5000);
		// close the popupbox
		driver.findElement(By.id("tryLexDialogX")).click();

		// click the user link
		WebElement userlink = driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div[1]/div[1]/div[1]/div[2]/span[1]/h1[1]/a[1]"));
		String link = "Jayasri Kasinathan";
		if (userlink.equals(link)) {
			System.out.println("User link is same");
		} else {
			System.out.println("It is not same");
		}
		userlink.click();

		// click the menu
		WebElement btn = driver.findElement(By.id("moderatorMutton"));
		btn.click();

		// click the edit button
		WebElement editbtn = driver.findElement(By.xpath("//a[contains(text(),'Edit Profile')]"));
		editbtn.click();
		// inside the frame
		WebElement myFrame = driver.findElement(By.xpath("//iframe[@id='aboutMeContentId']"));
		driver.switchTo().frame(myFrame);
		System.out.println("Inside the edit frame");
		// enter the lastname inside theframe
		WebElement Lname = driver.findElement(By.id("lastName"));
		Lname.clear();
		Lname.sendKeys("Kasinathan");
		waitExplicitly(10, Lname);
		driver.findElement(By.xpath("//input[@onclick='javascript: validateAndSave();']")).click();
		
		driver.switchTo().defaultContent();

	}

}

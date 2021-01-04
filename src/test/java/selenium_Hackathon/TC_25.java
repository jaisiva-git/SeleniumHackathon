package selenium_Hackathon;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.SFDC.utility.SFDC_Login;

public class TC_25 extends SFDC_Login {

	public static void main(String[] args) throws InterruptedException {
		launchingBrowser();
		LoginUrl();
		LoginCredential();
		contactsTab();
		quitBrowser();
	}

	public static void contactsTab() throws InterruptedException {
		// click the contacts tab link
		WebElement contactsLink = driver
				.findElement(By.xpath("//ul/li[@id='Contact_Tab']/a[contains(text(),'Contacts')]"));
		contactsLink.click();
		Thread.sleep(5000);
		
		// close the popupbox
		driver.findElement(By.id("tryLexDialogX")).click();

		// click the new button
		driver.findElement(By.name("new")).click();

		// enter the fields in new contacts
		String LastName = "ABCD";
		WebElement Lname = driver.findElement(By.id("name_lastcon2"));
		Lname.sendKeys(LastName);

		// click the account name look up
		WebElement AccountName = driver.findElement(By.xpath("//tbody/tr[5]/td[2]/span[1]/a[1]/img[1]"));
		AccountName.click();

		// Switch to another window
		String parentWindow = driver.getWindowHandle();
		// Switch to new window opened
		Set<String> handles =  driver.getWindowHandles();

		for (String windowHandle : handles) {
			 {
			       if(!windowHandle.equals(parentWindow))
			driver.switchTo().window(windowHandle);
		}
		}
		// perform the action on new window
		/*
		 * int size = driver.findElements(By.tagName("iframe")).size(); for(int i=0;
		 * i<=size; i++){ driver.switchTo().frame(i); int
		 * total=driver.findElements(By.xpath("html/body/a/img")).size();
		 * System.out.println(total); driver.switchTo().defaultContent(); }
		 */
		//switch to frame
		Thread.sleep(5000);
		//driver.switchTo().frame();
		System.out.println("********We are switch to the iframe*******");
		WebElement iframe = driver.findElement(By.xpath("//tbody/tr[2]/th[1]"));
		iframe.click();
		waitExplicitly(10, iframe);
		System.out.println("*********We are done***************");

		//driver.switchTo().parentFrame();

		driver.close();
		
		driver.switchTo().window(parentWindow);

		//click save button
		driver.findElement(By.name("save")).click();
	}
}

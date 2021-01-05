package selenium_Hackathon;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.SFDC.utility.SFDC_Login;

public class TC_05 extends SFDC_Login {

	public static void main(String[] args) throws InterruptedException {

		launchingBrowser();
		LoginUrl();
		LoginCredential();
		Chrome();
		userMenuDropdown();
		quitBrowser();
	}

	public static void Chrome() throws InterruptedException {
		// check the user menu drop down

		WebElement UserMenu = driver.findElement(By.xpath("//span[@id='userNavLabel']"));
		//UserMenu.click();
		
		Actions builder = new Actions(driver);
		Thread.sleep(5000);
		builder.moveToElement(UserMenu).build().perform();
		
		//Usermenu is displayed
	
		if (UserMenu.isDisplayed()) {
			System.out.println("User menu's dropdown is displayed");
		}else
			System.out.println("User menu 's dropdown is not displayed");
		
		
	}
	public static void userMenuDropdown() {
		//List of UserMenu drop down
		WebElement UserMenu = driver.findElement(By.xpath("//span[@id='userNavLabel']"));
		UserMenu.click();
		List<WebElement> elements = UserMenu.findElements(By.xpath("//div[@id='userNavMenu']"));
		
		//Prints the all elements
		System.out.println(elements);
		
		
		
	}

}

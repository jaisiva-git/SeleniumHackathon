package selenium_Hackathon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.SFDC.utility.SFDC_Login;

public class TC_08 extends SFDC_Login{

	public static void main(String[] args)  {
		launchingBrowser();
		LoginUrl();
		LoginCredential();
		developerConsole();
		quitBrowser();
	}
	public static void developerConsole() {
		//click the Usermenu
		WebElement UserMenu = driver.findElement(By.xpath("//span[@id='userNavLabel']"));
		UserMenu.click();
		
		//Click the element in developer console
		WebElement DevConsole = driver.findElement(By.xpath("//a[contains(text(),'Developer Console')]"));
		DevConsole.click();
		
		//Switch to main window to developer window
		
		String parentWindow = driver.getWindowHandle();
		//// Switch to new window opened

		for(String childWindow : driver.getWindowHandles()){
		    driver.switchTo().window(childWindow);
		}
		//driver.switchTo().window(childWindow);
		//System.out.println(driver.switchTo().window(childWindow).getTitle());
		driver.close();
		driver.switchTo().window(parentWindow);


	}
}

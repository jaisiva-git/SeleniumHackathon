package selenium_Hackathon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.SFDC.utility.SFDC_Login;

public class TC_09  extends SFDC_Login{

	public static void main(String[] args)  {
		launchingBrowser();
		LoginUrl();
		LoginCredential();
		logout();
		quitBrowser();
	}
	public static void logout() {
		//click the Usermenu
			WebElement UserMenu = driver.findElement(By.xpath("//span[@id='userNavLabel']"));
			waitExplicitly(10, UserMenu );
			UserMenu.click();
			
		//Click the logout
			
			WebElement logout = driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
			waitExplicitly(10, logout);
			logout.click();
				
	}

}

package selenium_Hackathon;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.SFDC.utility.SFDC_Login;

public class TC_07 extends SFDC_Login {

	public static void main(String[] args) throws InterruptedException {
		launchingBrowser();
		LoginUrl();
		LoginCredential();
		mySetting();
		quitBrowser();
	}

	public static void mySetting() throws InterruptedException {
		// click the my setting in user menu
		WebElement UserMenu = driver.findElement(By.xpath("//span[@id='userNavLabel']"));
		UserMenu.click();

		Thread.sleep(5000);
		// click oon my setting My Settings
		WebElement Mysetting = driver.findElement(By.xpath("//a[contains(text(),'My Settings')]"));

		Mysetting.click();
		// clikc the personal tab on left side
		WebElement personal = driver.findElement(By.id("PersonalInfo_font"));
		personal.click();
		WebElement LoginHistory = driver.findElement(By.id("LoginHistory_font"));
		LoginHistory.click();
		WebElement download = driver
				.findElement(By.xpath("//a[@href='/servlet/servlet.LoginHistory?id=0054x000001oJ7M']"));
		download.click();

		// click the display and layout
		WebElement displayLayout = driver.findElement(By.id("DisplayAndLayout_font"));
		displayLayout.click();
		waitExplicitly(10, displayLayout);

		WebElement customizeTabs = driver.findElement(By.id("CustomizeTabs_font"));
		customizeTabs.click();

		WebElement Content = driver.findElement(By.id("p4"));
		Content.click();
		waitExplicitly(10, Content);
		Select s = new Select(Content);
		s.selectByVisibleText("Salesforce Chatter");

		WebElement Tabs = driver.findElement(By.id("duel_select_0"));
		Tabs.click();
		waitExplicitly(10, Tabs);
		WebElement Tabs1 = driver.findElement(By.xpath("//tbody/tr[1]/td[1]/select[1]/option[60]"));
		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Tabs1);
		waitExplicitly(20, Tabs);
		//Select s1 = new Select(Tabs);
		//s1.selectByVisibleText("Reports");

		// verfiy it is selected or not
		if (Tabs.isSelected()) {
			System.out.println("It is selected");
		} else {
			System.out.println("It is not selected");
		}

		// Select s1 = new Select(Tabs);
		// s1.selectByVisibleText("Reports");

		// click the add button
		driver.findElement(By.id("duel_select_0_right")).click();
		driver.findElement(By.name("save"));

	}
}

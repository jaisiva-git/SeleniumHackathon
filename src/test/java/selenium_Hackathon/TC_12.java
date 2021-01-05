package selenium_Hackathon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.SFDC.utility.SFDC_Login;

public class TC_12 extends SFDC_Login {

	public static void main(String[] args) throws InterruptedException {
		launchingBrowser();
		LoginUrl();
		LoginCredential();
		editView();
		quitBrowser();
	}

	public static void editView() throws InterruptedException {
		// Click the account menu
		WebElement accountMenu = driver.findElement(By.xpath("//li[@id='Account_Tab']"));
		accountMenu.click();
		Thread.sleep(5000);
		// close the popupbox
		driver.findElement(By.id("tryLexDialogX")).click();
		//click on the link
		WebElement editlink= driver.findElement(By.xpath("//tbody/tr[2]/th[1]/a[1]"));
		editlink.click();
		//edit the link
		WebElement edit= driver.findElement(By.name("edit"));
		edit.click();
		//edit the name
		WebElement editName= driver.findElement(By.id("acc2"));
		editName.sendKeys("jais");
		WebElement saveAndNewButton = driver.findElement(By.name("save"));
		waitExplicitly(10, saveAndNewButton);

		saveAndNewButton.click();

		

}
}

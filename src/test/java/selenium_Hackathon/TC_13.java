package selenium_Hackathon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.SFDC.utility.SFDC_Login;

public class TC_13 extends SFDC_Login {

	public static void main(String[] args) throws InterruptedException {
		launchingBrowser();
		LoginUrl();
		LoginCredential();
		mergeAccount();
		quitBrowser();

	}

	public static void mergeAccount() throws InterruptedException {
		// click the account
		// Click the account menu
		WebElement accountMenu = driver.findElement(By.xpath("//li[@id='Account_Tab']"));
		accountMenu.click();
		Thread.sleep(5000);
		
		// close the popupbox
		driver.findElement(By.id("tryLexDialogX")).click();
		
		// click on the merge Account
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		WebElement mergeAcc= driver.findElement(By.xpath("//a[contains(text(),'Merge Accounts')]"));
		mergeAcc.click();
		
		//enter the data
		String text = "Jai";
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		WebElement acc= driver.findElement(By.id("srch"));
		acc.sendKeys(text);
		
		//click find accounts
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		WebElement findacc= driver.findElement(By.name("srchbutton"));
		findacc.click();
		//check the accounts
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		WebElement checkbox=driver.findElement(By.id("cid0"));
		checkbox.click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		WebElement checkbox1=driver.findElement(By.id("cid1"));
		checkbox1.click();
		
		//click next button
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		WebElement next = driver.findElement(By.name("goNext"));
		next.click();
		
		//click merge button
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		WebElement merge = driver.findElement(By.name("save"));
		merge.click();
		//pop up window
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		Alert alert= driver.switchTo().alert();
		String alerttext= alert.getText();
		System.out.println(alerttext);
		alert.accept();
		
		
		
	}
}

package selenium_Hackathon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.SFDC.utility.SFDC_Login;

public class TC_14 extends SFDC_Login {

	public static void main(String[] args) throws InterruptedException {
		launchingBrowser();
		LoginUrl();
		LoginCredential();
		createAccountReport();
		
		quitBrowser();
	}

	public static void createAccountReport() throws InterruptedException {

		// Click the account menu
		WebElement accountMenu = driver.findElement(By.xpath("//li[@id='Account_Tab']"));
		accountMenu.click();
		Thread.sleep(5000);

		// close the popupbox
		driver.findElement(By.id("tryLexDialogX")).click();

		// click the reports link
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement reportsLink = driver.findElement(By.xpath("//tbody/tr[1]/td[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]"));
		reportsLink.click();

		// create latest activity in the report
		WebElement Reports = driver.findElement(By.id("ext-gen20"));
		Reports.click();

		// click the created date
		driver.findElement(By.xpath("//div[@id='ext-gen265']/div[3]")).click();

		// click the datePickers
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement datepickers = driver.findElement(By.id("ext-gen152"));
		datepickers.click();
	
		//click the today button
		try {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement btn= driver.findElement(By.id("ext-gen290"));
		btn.click();
		waitExplicitly(10,btn);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement btn1 = driver.findElement(By.id("ext-gen306"));
		btn1.click();
		waitExplicitly(10,btn1);
		}catch (Exception e) {
            e.printStackTrace();
		}
		
		//click the button
		WebElement SaveButton = driver.findElement(By.id("ext-gen49"));
		SaveButton.click();
		
		//Alert
		//Alert alert =  driver.switchTo().alert();
		driver.findElement(By.id("saveReportDlg_reportNameField"));
		
	}

}
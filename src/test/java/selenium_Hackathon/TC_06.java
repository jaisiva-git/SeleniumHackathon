package selenium_Hackathon;

import java.io.File;
import java.net.URISyntaxException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.SFDC.utility.SFDC_Login;

public class TC_06 extends SFDC_Login {

	public static void main(String[] args) throws InterruptedException {
		launchingBrowser();
		LoginUrl();
		LoginCredential();
		myProfile();
		// getIframe();
		quitBrowser();
	}

	public static void myProfile() throws InterruptedException {
		// Click the usermenu dropdown
		WebElement UserMenu = driver.findElement(By.xpath("//span[@id='userNavLabel']"));
		UserMenu.click();

		Thread.sleep(5000);

		// Click the myprofile element

		WebElement Myprofile = driver.findElement(By.xpath("//a[contains(text(),'My Profile')]"));

		Myprofile.click();

		// click on edit contact information
		WebElement editInfo = driver.findElement(By.xpath("//a[@id='moderatorMutton']"));
		editInfo.click();

		Actions builder1 = new Actions(driver);
		builder1.moveToElement(editInfo).build().perform();

		WebElement ele = driver.findElement(By.xpath("//a[contains(text(),'Edit Profile')]"));
		waitExplicitly(10, ele);
		ele.click();
		// switch to frame
		WebElement myFrame = driver.findElement(By.xpath("//iframe[@id='aboutMeContentId']"));
		driver.switchTo().frame(myFrame);
		System.out.println("Inside the edit frame");
		// enter the lastname inside theframe
		WebElement Lname = driver.findElement(By.id("lastName"));
		Lname.clear();
		Lname.sendKeys("Kasinathan");
		waitExplicitly(10, Lname);
		driver.findElement(By.xpath("//input[@onclick='javascript: validateAndSave();']")).click();

		// Click the post link
		WebElement post = driver.findElement(By.xpath("//ul/li/a/span[contains(text(),'Post')]"));
		post.click();
		// inside the frame1
		// WebElement myFrame1 =
		// driver.findElement(By.xpath("//iframe[@id='aboutMeContentId']"));
		driver.switchTo().frame(0);
		System.out.println("Inside the Post frame");

		String text = "Enter text value in frame";
		WebElement Frame1 = driver.findElement(By.xpath("//body[contains(text(),'Share an update, @mention someone...')]"));
		Frame1.sendKeys(text);
		waitExplicitly(10, Frame1);
	    driver.switchTo().defaultContent();

		WebElement btn = driver.findElement(By.xpath("//input[@id='publishersharebutton']"));

		btn.click();
		waitExplicitly(10, btn);
		// text should be displayed on the page.

		// click link
		WebElement File= driver.findElement(By.xpath("//ul/li/a/span[contains(text(),'File')]"));
				File.click();
		waitExplicitly(10, File);
		// upload a file
		WebElement uploadElement = driver.findElement(By.id("chatterUploadFileAction"));
		uploadElement.click();
		waitExplicitly(10, uploadElement);
		WebElement uploadfile = driver.findElement(By.id("chatterFile"));
		//.sendKeys("/Users/sasha/Jai.Java.txt");
		String filename = "Java.txt";
		File file = new File(filename);       
		String path = file.getAbsolutePath();
		
	}

	public static void getIframe() {
		List<WebElement> iframes = driver.findElements(By.tagName("iframe"));
		for (WebElement iframe : iframes) {
			System.out.println(iframe.getAttribute("id"));
		}

	}

}

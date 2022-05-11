import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EsignFlow {

	WebDriver  d;
	@BeforeMethod
	public void setup() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		d = new ChromeDriver();
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		d.get("https://app.documentesign.com/");
		d.manage().window().maximize();


		
		d.findElement(By.xpath("/html[1]/body[1]/app-root[1]/layout-auth[1]/app-login[1]/div[1]"
				+ "/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/d"
				+ "iv[1]/input[1]")).sendKeys("prushi822@gmail.com");

		

		d.findElement(By.xpath("/html[1]/body[1]/app-root[1]/layout-auth[1]/app-login[1]/div[1]/div[1]"
				+"/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[2]/input[1]")).sendKeys("Quality@analyst123");


		

		d.findElement(By.xpath("/html[1]/body[1]/app-root[1]/layout-auth[1]/"
				+ "app-login[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]/button[1]")).click();

		
	}
	@Test
	public void uploaddocument() throws InterruptedException {

		d.findElement(By.xpath("//a[contains(text(),'Documents')]")).click();

		d.findElement(By.xpath("//body/app-root[1]/app-layout-document[1]/div[1]/div[1]/div[1]/app-document-lis"
				+ "t[1]/div[1]/div[1]/button[1]")).click();

		// upload documents	
		WebElement upload= d.findElement(By.xpath("//input[@id='fileDropRef']"));
		upload.sendKeys("C:\\Users\\AM-LP-41\\Desktop\\offerDemo.txt");
		Thread.sleep(3000);
		// Add recipients
		d.findElement(By.xpath("//body/app-root[1]/layout-auth[1]/app-request-sign-wizard[1]/div[1]/div[2]/"
				+ "app-step-one[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/am-button[1]/button[1]")).click();                       

		d.findElement(By.xpath("//body/app-root[1]/layout-auth[1]/app-request-sign-wizard[1]/div[1]/div"
				+ "[2]/app-step-two[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/input[1]")).sendKeys("T1");



		d.findElement(By.xpath("//body/app-root[1]/layout-auth[1]/app-request-sign-wizard[1]/div[1]/div"
				+ "[2]/app-step-two[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/input[1]"))
		.sendKeys("lipefe9510@zherben.com");

		d.findElement(By.xpath("//button[contains(text(),'Add')]")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//body/app-root[1]/layout-auth[1]/app-request-sign-wizard[1]/div"
				+ "[1]/div[2]/app-step-two[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/am-button[2]/button[1]")).click();

		d.findElement(By.xpath("//div[@id='page-wrapper-0']")).click();

		d.findElement(By.xpath("//body/app-root[1]/layout-auth[1]/app-request-sign-wizard[1]/div[1]/div[2]/app-s"
				+ "tep-three[1]/div[1]/div[1]/div[1]/div[2]/div[1]/app-document-editor[1]/div[1]/div[1]/div[1]/div[1]"
				+ "/div[1]/app-placeholder-field-type[1]/div[1]/div[1]/div[1]/div[2]/a[1]")).click();   

		d.findElement(By.xpath("//body/modal-container[1]/div[1]/div[1]/app-choose-placeholder[1]/div[1]/"
				+ "form[1]/div[1]/ng-select[1]/div[1]/div[1]/div[2]/input[1]")).click();

		d.findElement(By.xpath("//body/modal-container[1]/div[1]/div[1]/app-choose-placeholder[1]/div[1]/form"
				+ "[1]/div[1]/ng-select[1]/ng-dropdown-panel[1]/div[1]")).click();

		// review request
		d.findElement(By.xpath("//span[contains(text(),'Review request')]")).click();


		d.findElement(By.xpath("//body/app-root[1]/layout-auth[1]/app-request-sign-wizard[1]/div[1]/div["
				+ "2]/app-step-four[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]/div[2]/am-button[2]/button[1]")).click();
		Thread.sleep(3000);	
		d.findElement(By.xpath("//body/app-root[1]/layout-auth[1]/app-step-five[1]/div[1]/div[1]/div[1]/button[1]")).click();



		// logout    
		d.findElement(By.xpath("/html/body/app-root/layout-app/am-topbar/nav/div/div[3]/button/span/ngx-avatar/div/div")).click();

		d.findElement(By.xpath("//body/app-root[1]/layout-app[1]/am-topbar[1]/nav[1]/div[1]/div[3]/div[1]/a[6]")).click();

	}	
	
	@AfterMethod
	public void teardown() {

		d.quit();
	}
}

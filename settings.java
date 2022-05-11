import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class settings {

	WebDriver  d;
	@BeforeMethod
	public void setup() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		d = new ChromeDriver();
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		d.get("https://app.documentesign.com/");
		d.manage().window().maximize();


		// login
		d.findElement(By.xpath("/html[1]/body[1]/app-root[1]/layout-auth[1]/app-login[1]/div[1]"
				+ "/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/d"
				+ "iv[1]/input[1]")).sendKeys("prushi822@gmail.com");

		//    Thread.sleep(4000);

		d.findElement(By.xpath("/html[1]/body[1]/app-root[1]/layout-auth[1]/app-login[1]/div[1]/div[1]"
				+"/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[2]/input[1]")).sendKeys("Quality@analyst123");


		//     Thread.sleep(4000);

		d.findElement(By.xpath("/html[1]/body[1]/app-root[1]/layout-auth[1]/"
				+ "app-login[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]/button[1]")).click();

		//	Thread.sleep(4000);
	}
	@Test(priority = 1)
	public void settings() throws InterruptedException {
		d.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[5]/a")).click();

		d.findElement(By.xpath("/html/body/app-root/app-layout-setting/div/div/div[2]/div/"
				+ "app-user-profile/div[1]/div/div/button")).click();
		Thread.sleep(4000);


		d.findElement(By.xpath("/html/body/modal-container/div/div/app-update-profile/div/div/form/div[1]/input")).clear();
		Thread.sleep(2000);
		d.findElement(By.xpath("/html/body/modal-container/div/div/app-update-profile/div/div/form"
				+ "/div[1]/input")).sendKeys("quality-analyst");
		Thread.sleep(2000);
		d.findElement(By.xpath("/html/body/modal-container/div/div/app-update-profile/div/div/form/div[2]/input")).clear();
		d.findElement(By.xpath("/html/body/modal-container/div/div/app-update-profile/div/div/form/div[2]/input")).sendKeys("qa");
		Thread.sleep(2000);
		d.findElement(By.xpath("/html/body/modal-container/div/div/app-update-profile/div/div/form/div[4]/div/input")).clear();
		d.findElement(By.xpath("/html/body/modal-container/div/div/app-update-profile/div/div/form/di"
				+ "v[4]/div/input")).sendKeys("9834166795");
		Thread.sleep(2000);
		d.findElement(By.xpath("/html/body/modal-container/div/div/app-update-profile/div/div/div/div/am-button/button")).click();

	}
	@Test(priority = 2)
	public void editsigniture() throws InterruptedException {
		d.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[5]/a")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("/html/body/app-root/app-layout-setting/div/div/div[2]"
				+ "/div/app-user-profile/div[2]/div[2]/div/a")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("/html/body/modal-container/div/div/app-signature-panel/div/div"
				+ "[2]/div/app-type-signature/div/form/div[2]/div[4]/div/div/label")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("/html/body/modal-container/div/div/app-signature-panel/div/div[3]/am-button/button/span")).click();
		Thread.sleep(2000);
	}
	@Test( priority =  3)
	public void editinitials() {
	   d.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[5]/a")).click();
	   d.findElement(By.xpath("/html/body/app-root/app-layout-setting/div/div/div[2]/div/app-user-profile/div[2]/div[1]/a[2]")).click()	;
	   d.findElement(By.xpath("/html/body/app-root/app-layout-setting/div/div/div[2]/"
	   		+ "div/app-user-profile/div[2]/div[2]/div/div[2]/a")).click();
	   d.findElement(By.xpath("/html/body/modal-container/div/div/app-signature-panel/div/div[2]/div/"
	   		+ "app-type-signature/div/form/div[2]/div[2]/div/div/label")).click();
	   d.findElement(By.xpath("/html/body/modal-container/div/div/app-signature-panel/div/div[3]/am-button/button/span")).click();
	}
	@AfterMethod
	public void teardown() {
		d.quit();
	}

}

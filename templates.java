import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.ExecuteAsyncScript;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.host.event.InputEvent;

public class templates {

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
	@Test
	public void templates() throws InterruptedException, AWTException {
		Thread.sleep(3000);
		d.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[3]/a")).click();
		Thread.sleep(4000);

		String actual = d.getTitle();
		System.out.println(actual );

		String expected= "Document eSign | Templates";
		System.out.println(expected);

		Assert.assertEquals(actual, expected);
		Thread.sleep(4000);
		d.findElement(By.xpath("/html/body/app-root/layout-app/div/div/div/app-template-list/div[1]/div/button")).click();


		WebElement brows=  d.findElement(By.id("fileDropRef"));
		brows.sendKeys("C:\\Users\\AM-LP-41\\Desktop\\offerDemo.txt");
		Thread.sleep(4000);
		d.findElement(By.xpath("/html/body/app-root/layout-auth/app-template-wizard/div/div[2]/"
				+ "app-template-step-one/div/div/div/div[2]/div/div[2]/am-button/button/span")).click();
		d.findElement(By.xpath("/html/body/app-root/layout-auth/app-template-wizard/div/div[2]/app-template-step-two/div"
				+ "/div/div/div[1]/div/form/div/div[2]/input")).sendKeys("hr");
		d.findElement(By.xpath("/html/body/app-root/layout-auth/app-template-wizard/div/div[2]/"
				+ "app-template-step-two/div/div/div/div[1]/div/form/div/div[3]/button")).click();
		d.findElement(By.xpath("/html/body/app-root/layout-auth/app-template-wizard/div/div[2]/app-template-step-two/div/d"
				+ "iv/div/div[2]/div/div[2]/"
				+ "am-button[2]/button/span")).click();
		Thread.sleep(3000);
		Robot robot = new Robot();
		robot.mouseMove(1000, 503);
		Thread.sleep(1000);
		robot.mousePress(java.awt.event.InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(1000);
		robot.mouseRelease(java.awt.event.InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(2000);
		// add sign
		d.findElement(By.xpath("//*[@id=\"popover\"]/div/div[2]/a[1]")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("/html/body/modal-container/div/div/app-choose-placeholder"
				+ "/div/form/div/ng-select/div/div/div[2]/input")).click();
		Thread.sleep(2000);
		//add name
		d.findElement(By.xpath("/html/body/modal-container/div/div/app-choose-placeholder/div"
				+ "/form/div/ng-select/ng-dropdown-panel/div/div[2]/div")).click();
	//    d.findElement(By.className("ng-option ng-option-marked ng-star-inserted")).click();
		Thread.sleep(2000);
		//review document
		
		d.findElement(By.xpath("/html/body/app-root/layout-auth/app-template-wizard/div/div[2]"
				+ "/app-template-step-three/div/div/div/div[2]/div[2]/div/div[2]/am-button[2]/button/span")).click();
		Thread.sleep(2000);
		
        //click on finish
		d.findElement(By.xpath("/html/body/app-root/layout-auth/app-template-wizard/div/div[2]/ap"
				+ "p-template-step-four/div/div/div/form/div[2]/div/div[2]/am-button/button/span")).click();
		Thread.sleep(2000);
	}
	@Test(priority = 1)
	public void use_template() throws InterruptedException {
		d.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[3]/a")).click();
		Thread.sleep(4000);
	
		d.findElement(By.xpath("/html/body/app-root/layout-app/div"
				+ "/div/div/app-template-list/div[2]/div/div/div[3]/div[1]/div/div[3]/button")).click();
		Thread.sleep(2000);
		// user details
		d.findElement(By.xpath("/html/body/app-root/layout-auth/app-use-template/"
				+ "div[1]/div[1]/div/form[1]/div/div/div/div/div[2]/div[1]/input")).sendKeys("Raghini");
		Thread.sleep(2000);
		d.findElement(By.xpath("/html/body/app-root/layout-auth/app-use-template/div[1]/div[1"
				+ "]/div/form[1]/div/div/div/div/div[2]/div[2]/div/input")).sendKeys("prushi822@gmail.com");
		Thread.sleep(2000);
	// cc details
		d.findElement(By.xpath("/html/body/app-root/layout-auth/"
				+ "app-use-template/div[1]/div[1]/div/div[2]/div/div/form/div/div[1]/input")).sendKeys("prashant");
		Thread.sleep(2000);
		d.findElement(By.xpath("/html/body/app-root/layout-auth/app-use-template/"
				+ "div[1]/div[1]/div/div[2]/div/div/form/div/div[2]/input")).sendKeys("prashant@gmail.com");
		Thread.sleep(2000);
		// click on add button 
	d.findElement(By.xpath("/html/body/app-root/layout-auth/app-use-template"
			+ "/div[1]/div[1]/div/div[2]/div/div/form/div/div[3]/button")).click();
	//send button
	d.findElement(By.xpath("/html/body/app-root/layout-auth/app-use-template/div[2]/am-button/button/span")).click();
	Thread.sleep(2000);
	//send document
	d.findElement(By.xpath("/html/body/modal-container/div/div/app-confirmation/div/div[2]/am-button/button/span")).click();
	Thread.sleep(2000);
	// back to dashboard
	d.findElement(By.xpath("/html/body/app-root/layout-auth/app-step-five/div/div/div/button")).click();
					
	}

	@AfterMethod
	public void teardown() throws InterruptedException {
		Thread.sleep(2000);
		d.findElement(By.xpath("/html/body/app-root/layout-app/am-topbar/nav/div/div[3]/button/span/ngx-avatar/div/div")).click();

		d.findElement(By.xpath("//body/app-root[1]/layout-app[1]/am-topbar[1]/nav[1]/div[1]/div[3]/div[1]/a[6]")).click();
		d.quit();
	}
}

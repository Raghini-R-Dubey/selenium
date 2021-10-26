package swaglabs.demo;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
	public class swaglabs {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.saucedemo.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement user=	driver.findElement(By.id("user-name")); //.sendKeys("standard_user");
			Thread.sleep(2000);
		
			sendkeys(driver, user, 2, "problem_user");
			driver.findElement(By.id("password")).sendKeys("secret_sauce");
			Thread.sleep(2000);
			driver.findElement(By.name("login-button")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("react-burger-menu-btn")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.id("logout_sidebar_link")).click();
			Thread.sleep(2000);
			WebElement user1 =	driver.findElement(By.id("user-name")); //.sendKeys("standard_user");
			Thread.sleep(2000);
		
			sendkeys(driver, user1, 2, "standard_user");
			driver.findElement(By.id("password")).sendKeys("secret_sauce");
			Thread.sleep(2000);
			driver.findElement(By.name("login-button")).click();
			Thread.sleep(2000);
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(0,350)");
			Thread.sleep(2000);
			driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
			Thread.sleep(2000);
			JavascriptExecutor jse1 = (JavascriptExecutor)driver;
			jse1.executeScript("window.scrollBy(0,-350)");
			Thread.sleep(2000);
			driver.findElement(By.className("shopping_cart_link")).click();
			Thread.sleep(3000);
			
			
			driver.findElement(By.id("remove-sauce-labs-backpack")).click();
			driver.findElement(By.id("checkout")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("first-name")).sendKeys("raghini");
			Thread.sleep(2000);
			driver.findElement(By.id("last-name")).sendKeys("dubey");
			Thread.sleep(2000);
			driver.findElement(By.id("postal-code")).sendKeys("411035");
			Thread.sleep(2000);
			driver.findElement(By.id("continue")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("finish")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("back-to-products")).click();
			Thread.sleep(2000);
			driver.findElement(By.className("product_sort_container")).click();
			Thread.sleep(2000);
            Select obj = new Select (driver.findElement(By.className("product_sort_container")));
            obj.selectByVisibleText("Price (low to high)");
			Thread.sleep(2000); 
			
		    driver.navigate().to("https://www.linkedin.com/company/sauce-labs/");
			Thread.sleep(5000);
			driver.navigate().back();
		
			
		   driver.findElement(By.xpath("//a[@href='https://www.facebook.com/saucelabs']")).click();
		   Thread.sleep(2000);
		   
		   
		   driver.navigate().to("https://twitter.com/saucelabs/");
			Thread.sleep(5000);
			driver.navigate().back();
			
		}	
		public static void sendkeys(WebDriver driver1,WebElement element,int Timeout, String Value) { new WebDriverWait(driver1,
				 Timeout).until(ExpectedConditions.visibilityOf(element));
				  element.sendKeys(Value);
	}
		
		public static void clickon(WebDriver
				  driver1,WebElement element,int timeout){ new WebDriverWait(driver1,
				  timeout).until(ExpectedConditions.elementToBeClickable(element));
				  element.click(); 
	}
	}
			


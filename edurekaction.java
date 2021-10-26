package swaglabs.demo;

	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	public class edurekaction {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.edureka.co/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
			Actions action= new Actions(driver);
			action.moveToElement(driver.findElement(By.cssSelector("body:nth-child(2) "
					+ "nav.navbar.navbar-default.nav_category:nth-child(9) > div.dropdown.dropdown_category_list"
				))).build().perform();
			Thread.sleep(5000);
		    WebElement element1=driver.findElement(By.cssSelector("nav.navbar.navbar-default.nav_category:nth-child(9)"
		    		+ " div.dropdown.dropdown_category_list "
		    		+ "ul.dropdown-menu.dropdown_menu_multi_level.hidden-xs.hidden-sm li.dropdown-submenu.dropdown_submenu_multi:nth-child(9) > "
		    		+ "a.dropdown-toggle.ga_top_category"));
		    		
		    action.moveToElement(element1).build().perform();
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//a[contains(text(),'Software Testing')]")).click();
		    Thread.sleep(3000);
	        driver.quit();
	        		}
		
	}
	
	




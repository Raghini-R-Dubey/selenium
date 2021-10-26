package swaglabs.demo;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	public class dragndrop
	{
	    public static void main(String[] args) throws InterruptedException
	    {
	        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
	        WebDriver driver = new ChromeDriver();
	        driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
	        String xp1 = "//h1[.='Block 1']";
	        WebElement block1 = driver.findElement(By.xpath(xp1));
	        Thread.sleep(2000);

	        String xp2 = "//h1[.='Block 3']";
	        WebElement block3 = driver.findElement(By.xpath(xp2));
	        Actions actions = new Actions(driver);
	        actions.dragAndDrop(block1, block3).perform();
	        Thread.sleep(2000);
	        driver.quit();
	    }
	}



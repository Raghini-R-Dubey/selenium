import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Democlass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//System.out.println("demo");
System.setProperty("Webdriver.chrome.driver", "Downloads\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
//Thread.sleep(5000);
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.get("https://app.documentesign.com/");
driver.manage().window().maximize();



driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/layout-auth[1]/app-login[1]/div[1]"
		+ "/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/d"
		+ "iv[1]/input[1]")).sendKeys("prushi822@gmail.com");

Thread.sleep(4000);

driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/layout-auth[1]/app-login[1]/div[1]/div[1]"
		+ "/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[2]/input[1]")).sendKeys("Quality@analyst123");


Thread.sleep(4000);

driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/layout-auth[1]/"
		+ "app-login[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]/button[1]")).click();

Thread.sleep(4000);
driver.close();
	}

}

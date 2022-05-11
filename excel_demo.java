
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class excel_demo 
{
	String driverpath = "C:\\chromedriver.exe";
	String baseurl = "https://app.documentesign.com/auth/login";
    public WebDriver driver;
    
	@BeforeTest
	public void LaunchBrowser() throws InterruptedException
    {   
	System.out.println("Launch chrome browser");
    System.setProperty("webdriver.chrome.driver",driverpath);
    driver=new ChromeDriver();
    Thread.sleep(1000);
    }
	
	@Test(dataProvider="test")
	public void test1(String Useraname, String Password) throws InterruptedException
	{
		System.out.println("Username is "+ Useraname +" And Password is "+ Password);
		driver.get(baseurl);
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/layout-auth[1]/app-login[1]/div[1]"
				+ "/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/d"
				+ "iv[1]/input[1]")).sendKeys(Useraname);
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/layout-auth[1]/app-login[1]/div[1]/div[1]" +
				 "/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[2]/input[1]")).sendKeys(Password);
		Thread.sleep(1000);

       

		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/layout-auth[1]/"
				+ "app-login[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]/button[1]")).click();
		String s1 =driver.getCurrentUrl();
	//	Thread.sleep(4000);
	//	Assert.assertEquals(s1, "https://app.documentesign.com/home", "login failed ..");
        
		Thread.sleep(4000);
		driver.close();
	}

    @DataProvider(name="test")
	public Object[][] dataProvider() throws IOException
	{
    	 String path=System.getProperty("user.dir");
	     Object Data[][]=testData(path+"/Excel/Data1.xlsx","Sheet1");
	     return Data;
	 }
    
	public Object[][] testData(String excelpath, String sheetname) throws IOException
	{
	    ExcelDataProvider ex = new ExcelDataProvider(excelpath,sheetname);
		int rowCount=ex.getrowcount();
		int colcount=ex.getcolcount();
		Object Data[] []= new Object[rowCount-1][colcount];
		for(int i=1; i<rowCount; i++)
		{
			for(int j=0; j<colcount; j++)
			{
				String cellData= ex.getData(i,j);
				Data[i-1][j]=cellData;
			}
		}
		return Data;
		}
	
      @AfterMethod
      public void closeBrowser()
      { 
	    driver.quit();
      }
}



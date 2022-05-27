package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class KeywordActions {
	public static WebDriver driver;
	  
	 public static void openBrowser()
	 { 

	// WebDriverManager.chromedriver().setup();
//		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijayaks\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
//		 driver = new ChromeDriver();
		 
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijayakumar\\Downloads\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		 System.out.println("Browser Launched...");
	 }
	  
	 public static void navigate()
	 { 
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 driver.get("https://semantic-ui.com/examples/login.html");
	 System.out.println("Navigated to the Url...");

	 }
	  
	 public static void input_Username() throws InterruptedException
	 {
	 driver.findElement(By.name("email")).sendKeys("lsjdj"); 
	 System.out.println("Entered Email...");

	 }
	  
	 public static void input_Password() throws InterruptedException
	 {
		 driver.findElement(By.name("password")).sendKeys("fsdflskj"); 
		 System.out.println("Enterd Password...");

	 }
	  
	 public static void click_Login()
	 {
	 driver.findElement(By.xpath("/html/body/div/div/form/div[1]/div[3]")).click();
	 System.out.println("Login button clicked Launched...");

	 }
	 
	 public static void verify_login()
	 {
		 String pageTitle = driver.getTitle();
		 Assert.assertEquals(pageTitle, "Login Example - Semantic");
		 System.out.println("Verified login...");

	 }
	 
	 public static void closeBrowser()
	 {
	 driver.quit();
	 System.out.println("Browser logged out...");

	 }
}

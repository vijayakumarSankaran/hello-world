package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dummy {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Welcome");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijayakumar\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://webui.myaccount.dev.ecfax-fedramp.ccs.biz/login");
		driver.findElement(By.id("userEmailInput")).sendKeys("isidro.peralta+1@consensus.com");
		driver.findElement(By.id("inputPassword")).sendKeys("Ab*123456789012345");
		driver.findElement(By.xpath("//*[@id='pageTheme']/div/div/main/div/div/div[1]/div/form/div/div[3]/div/label")).click();
		driver.findElement(By.id("signIn")).click();
		//driver.findElement(By.cssSelector("secondary-nav > div.drop.drop-settings > a > span")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("firstName")).sendKeys("Test");
		driver.findElement(By.id("lastName")).sendKeys("Test");
		driver.findElement(By.id("company")).sendKeys("Test");
		driver.findElement(By.id("faxNumber")).sendKeys("11523658131");
		driver.findElement(By.id("faxSubject")).sendKeys("Test");

		
	}

}

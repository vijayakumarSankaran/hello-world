package demo;

import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Log4jDemo {
private static Logger log = Logger.getLogger(Log4jDemo.class.getName());//
public static void main(String[] args) {
DOMConfigurator.configure("log4j.xml");
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijayakumar\\Downloads\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
//PropertyConfigurator.configure("log4j.properties");
driver.get("https://www.google.com");
log.info("Browser launched successfully....");

}

}
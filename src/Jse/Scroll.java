package Jse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("https://www.amazon.in/");
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    JavascriptExecutor j=(JavascriptExecutor) driver;
	    for(int i=0;i<5;i++)
	    j.executeScript("window.scrollBy(0,500)");
	    Thread.sleep(3000);
	    for(int i=0;i<5;i++)
	    j.executeScript("window.scrollBy(0,-500)");
	    

	}

}
 
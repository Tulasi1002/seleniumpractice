package Jse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Disele {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("C:\\Users\\Arun\\Desktop\\jse.html");
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    JavascriptExecutor j=(JavascriptExecutor) driver;
	    j.executeScript("document.getElementById('abc').value='Tulasi'");

	}

}

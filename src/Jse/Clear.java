package Jse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("C:\\Users\\Arun\\Desktop\\jse.html");
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    driver.findElement(By.id("efg")).sendKeys("Tulasi");
	    Thread.sleep(3000);
	    JavascriptExecutor j=(JavascriptExecutor) driver;
	    j.executeScript("document.getElementById('efg').value=''");


	}

}

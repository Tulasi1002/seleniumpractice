package loginscipts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Paytm {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("https://paytm.com/");
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//div[.='Log In/Sign Up']")).click();
	    Thread.sleep(3000);
	    driver.switchTo().frame(0);
	    driver.findElement(By.id("input_0")).sendKeys("7204227751");
	    Thread.sleep(3000);
	    driver.findElement(By.id("input_1")).sendKeys("Tvinay_102");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    String title=driver.getTitle();
	    System.out.println(title);
	    String url=driver.getCurrentUrl();
	    System.out.println(url);
	    if(title.equals("Paytm.com – Digital & Utility Payment, Entertainment, Travel, Payment Gateway & more Online !"))
	    System.out.println("pass");
	    else
	    	System.out.println("fail");

}
}
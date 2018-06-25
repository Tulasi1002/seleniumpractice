package loginscipts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("https://www.facebook.com/login/");
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("tulasireddy1002@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Tulasi_1002");
	    driver.findElement(By.id("loginbutton")).click();
	    String tit = driver.getTitle();
	    System.out.println(tit);
	    String url = driver.getCurrentUrl();
	    System.out.println(url);
	    if(url.equals("https://www.facebook.com/"))
	    System.out.println("PASS:home page is displayed");
	    else
	    System.out.println("FAIL:home page is not displayed");
	    driver.close();

	}}

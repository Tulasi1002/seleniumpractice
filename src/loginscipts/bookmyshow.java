package loginscipts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

public class bookmyshow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("https://in.bookmyshow.com");
	/*  WebElement ele = driver.findElement(By.xpath("//div[@class='__top-cities']"));
	  Select s=new Select(ele);
	  s.selectByValue("3");*/
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    driver.findElement(By.id("preSignIn")).click();
	    driver.findElement(By.id("iUserName")).sendKeys("tulasireddy1002@gmail.com");
	    driver.findElement(By.id("iPwd")).sendKeys("Tvinay_102");
	    driver.findElement(By.xpath("//div[@class='submit-form']")).click();
	    String title=driver.getTitle();
	    System.out.println(title);
	    String url=driver.getCurrentUrl();
	    System.out.println(url);
	    
	}

}
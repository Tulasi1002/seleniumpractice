package loginscipts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class m4maths {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("https://m4maths.com/");
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    driver.findElement(By.id("LOGINNAME")).sendKeys("7204227751");
	    driver.findElement(By.id("LOGINPASSWORD")).sendKeys("Tvinay_102");
	    driver.findElement(By.id("loginbutton")).click();
	    String title=driver.getTitle();
	    System.out.println(title);
	    String url=driver.getCurrentUrl();
	    System.out.println(url);
	    if(title.equals("Online Job Exam Preparation for Placement"))
	    {
	    System.out.println("pass");	
	    }
	    else
	    {
	    	System.out.println("fail");
	    }

	}

}

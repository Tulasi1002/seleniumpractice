package loginscipts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmail {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("https://accounts.google.com/");
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    driver.findElement(By.id("identifierId")).sendKeys("tulasireddy1002@gmail.com");
	    driver.findElement(By.xpath("//span[.='Next']")).click();
	    driver.findElement(By.name("password")).sendKeys("Tulasiv_1002");
	    driver.findElement(By.xpath("//span[.='Next']")).click();
	    String title = driver.getTitle();
	    System.out.println(title);
	    String url = driver.getCurrentUrl();
	    System.out.println(url);
	    if(title.equals("Sign in - Google Accounts"))
	    	System.out.println("pass");
	    else
	    	System.out.println("fail");
	}

}

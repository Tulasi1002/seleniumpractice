package loginscipts;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class saavn {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		WebDriverWait w=new WebDriverWait(driver,20);
	    driver.get("https://www.saavn.com");
	  //  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	   // driver.findElement(By.id("login-btn")).click();
	    w.until(ExpectedConditions.visibilityOfElementLocated(By.id("login-btn"))).click();
	    driver.findElement(By.id("login_username")).sendKeys("tulasireddy1807@gmail.com");
	    driver.findElement(By.id("login_password")).sendKeys("Tvinay_102");
	    driver.findElement(By.id("static-login-btn")).click();
	   // String title=driver.getTitle();
	  //  System.out.println(title);
	    w.until(ExpectedConditions.titleContains("Saavn"));
	    String url=driver.getCurrentUrl();
	    System.out.println(url);
	    if(url.equals("https://www.saavn.com/"))
	    	System.out.println("pass");
	    else
	    	System.out.println("fail");
	    
	    
	    
	}

}

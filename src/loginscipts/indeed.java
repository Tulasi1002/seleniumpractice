package loginscipts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class indeed {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		WebDriverWait w=new WebDriverWait(driver, 20);
	    driver.get("https://www.indeed.co.in/");
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    driver.findElement(By.id("userOptionsLabel")).click();
	    driver.findElement(By.id("signin_email")).sendKeys("tulasireddy1002@gmail.com");
	    driver.findElement(By.id("signin_password")).sendKeys("tulasi.vinay");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    w.until(ExpectedConditions.titleIs("Job Search India | Indeed"));
	    String title= driver.getTitle();
	    System.out.println(title);
	    String url= driver.getCurrentUrl();
	    System.out.println(url);
	    if(title.equals("Job Search India | Indeed"))
	    	 System.out.println("pass");
		 else
			 System.out.println("fail");
	   
	   
	}

}

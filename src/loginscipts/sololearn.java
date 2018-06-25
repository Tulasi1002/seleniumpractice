package loginscipts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sololearn {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.sololearn.com/User/Login?ReturnUrl=%2FProfile");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    driver.findElement(By.id("Email")).sendKeys("tulasireddy1002@gmail.com");
	    driver.findElement(By.id("Password")).sendKeys("Tvinay_102");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    String title=driver.getTitle();
	    System.out.println(title);
	    String url=driver.getCurrentUrl();
	    System.out.println(url);
	    if(url.equals("https://www.sololearn.com/Profile/5647319"))
	    System.out.println("pass");
	    else
	    	System.out.println("fail");
	    driver.close();

	}

}

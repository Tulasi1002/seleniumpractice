package loginscipts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shine {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("https://www.shine.com/myshine/login/");
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    driver.findElement(By.id("id_email")).sendKeys("tulasireddy1002@gmail.com");
	    driver.findElement(By.id("id_password")).sendKeys("tulasi.vinay");
	    driver.findElement(By.id("btn_login")).click();
	    String title=driver.getTitle();
	    System.out.println(title);
	    if(title.equals("Shine.com - My Shine | Home"))
	    	System.out.println("pass");
	    else
	    	System.out.println("fail");
	   
	}

}

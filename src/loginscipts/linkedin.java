package loginscipts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkedin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.linkedin.com/");
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.id("login-email")).sendKeys("tulasireddy1002@gmail.com");
		driver.findElement(By.id("login-password")).sendKeys("Tvinay_102");
		driver.findElement(By.id("login-submit")).click();
		String title=driver.getTitle();
		System.out.println(title);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		if(url.equals("https://www.linkedin.com/feed/"))
			System.out.println("pass");
		else
			System.out.println("fail");
			
		driver.close();
	}	

	}



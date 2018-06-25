package loginscipts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class naukri {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/nlogin/login");
		driver.manage().window().maximize();
		//Thread.sleep(3000);
		driver.findElement(By.id("usernameField")).sendKeys("tulasireddy1002@gmail.com");
		driver.findElement(By.id("passwordField")).sendKeys("tulasi.vinay");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		if(title.equals("Jobseeker's Login: Search the Best Jobs available in India & Abroad - Naukri.com"))
				{
			System.out.println("pass:home page is displaying");
				}
		else
		{
			System.out.println("fail:home page is not displaying");
				}
	//driver.close();
		
	}

}



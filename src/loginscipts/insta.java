package loginscipts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class insta {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("https://www.instagram.com/");
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//a[.='Log in']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.name("username")).sendKeys("tulasireddy1002@gmail.com");
	    driver.findElement(By.name("password")).sendKeys("tulasi.vinay");
	    driver.findElement(By.xpath("//button[.='Log in']")).click();
	    Thread.sleep(3000);
	    String title=driver.getTitle();
	    System.out.println(title);
	    String url=driver.getCurrentUrl();
	    System.out.println(url);
	    if(title.equals("Instagram"))
	    	System.out.println("pass");
	    else
	    	System.out.println("fail");
	    
	}

}

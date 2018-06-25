package loginscipts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flikart {
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("https://www.flipkart.com/");
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@class='_2zrpKA']")).sendKeys("tulasireddy1002@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Tvinay_102");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		if(url.equals("https://www.flipkart.com/"))
			System.out.println("pass");
		else
			System.out.println("fail");
		
		driver.close();

		
		

}
}
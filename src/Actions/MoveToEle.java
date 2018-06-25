
package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToEle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("https://www.flipkart.com/");
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@class='_2zrpKA']")).sendKeys("tulasireddy1002@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Tvinay_102");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']")).click();
		Thread.sleep(5000);
		Actions a=new Actions(driver);
		WebElement ele=	driver.findElement(By.xpath("//span[.='TVs & Appliances']"));
		a.moveToElement(ele).perform();
		Thread.sleep(8000);
		WebElement ele1 = driver.findElement(By.xpath("//span[contains(.,'Mi')]"));
		 a.moveToElement(ele1).perform();
		 ele1.click();
	}

}

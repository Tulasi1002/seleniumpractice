package Dropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class singledd {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("https://www.facebook.com");
	    driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	WebElement ele=   driver.findElement(By.id("month"));
	Select s=new Select(ele);
	boolean m=s.isMultiple();
	System.out.println(m);
	//s.selectByIndex(2);
	s.selectByVisibleText("Feb");
	//s.selectByValue("5");
	//driver.close();
	}

}

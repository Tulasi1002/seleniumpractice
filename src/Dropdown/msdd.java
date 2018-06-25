package Dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class msdd {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("C:\\Users\\Arun\\Desktop\\msdd.html");
	    driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    WebElement ele =driver.findElement(By.id("states"));
	    Select s=new Select(ele);
	    boolean t = s.isMultiple();
	    System.out.println("MULTI SELECTIVE DROP DOWN " + t);
	    System.out.println("ALL OPTIONS");
	   List<WebElement> optns = s.getOptions();
	   for(WebElement option:optns)
	   {
		   String txt=option.getText();
		   System.out.println(txt);
	   }
	    s.selectByIndex(1);
	    s.selectByValue("m");
	    s.selectByVisibleText("Tamil Nadu");
	    s.deselectByIndex(2);
	    WebElement firstsel=s.getFirstSelectedOption();
	    String fst=firstsel.getText();
	    System.out.println("FIRST SEECTED OPTION " + fst);
	    System.out.println("SELECTED OPTIONS");
	    List<WebElement> selected = s.getAllSelectedOptions();
	    for(WebElement sel:selected)
	    {
	    	String text=sel.getText();
	    	System.out.println(text);
	    }
	 
	    Thread.sleep(3000);
	    s.deselectAll();
	    
	    
	    


	}

}

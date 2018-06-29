package PageObjects;

//import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class loginfb {

	@Test
	 public void fblogin() throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "E://driver objects//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" http://automationpractice.com/index.php");
		
		WebElement Woman = driver.findElement(By.xpath("//*[@id='block_top_menu']/ul/li/a"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(Woman).build().perform();
		
		driver.findElement(By.xpath("//*[@id='block_top_menu']/ul/li[1]/ul/li[1]/a")).click();
		
		String text=driver.findElement(By.xpath("//*[@id='center_column']/div[1]/div/div")).getText();
		
		System.out.println(text);
		
		WebElement ele=driver.findElement(By.id("selectProductSort"));
		
		Select s=new Select(ele);
		
		s.selectByValue("name:desc");
		
		//driver.findElement(By.xpath("//*[@id='center_column']/ul/li[1]/div/div[2]/div[2]/a[1]/span")).click();
	     
	    
	     
		
		 
		 
	
	 }

	}



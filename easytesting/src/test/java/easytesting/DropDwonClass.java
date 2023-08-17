package easytesting;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDwonClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		Thread.sleep(2000);
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//select[@name='country']")));
		
		Select drpAll = new Select(driver.findElement(By.xpath("//select[@name='country']")));
			drpAll.selectByIndex(5);
			
		//select[@name="country"]
		
		
		
		//driver.findElement(By.id("searchDropdownBox")).click();
		//driver.findElement(By.xpath("//option[text()='Amazon Devices']")).click();
		
		//Select drpAll = new Select(driver.findElement(By.id("searchDropdownBox")));
		//drpAll.deselectByVisibleText("Amazon Devices");
		
		
		
	}

}

package easytesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Act {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		WebElement tdhome=driver.findElement(By.xpath("//tr[@class='mouseOut']/td"));
		System.out.println("before mouser over"+tdhome.getCssValue("color"));
		WebElement homelink= driver.findElement(By.xpath("//a[text()='Home']"));
		Actions act=new Actions(driver);
		 act.moveToElement(homelink).build().perform();
		
		System.out.println("after mouser over"+tdhome.getCssValue("color"));
	}

}

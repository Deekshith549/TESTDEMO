package easytesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://learn.be10x.in/");
		driver.manage().window().maximize();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//tagName[@attribute="value"]
		//span[@class="nav-a-content" and contains(text(),"Mobiles & Accessories")]
		
	/* css selectedor
	 * 	tagName#id
		tagNmae.class
		tagename[attribute="value"]*/
driver.findElement(By.cssSelector("input[name='username']")).sendKeys("deekshit.usr@gmail.com");	
//driver.findElement(By.id("username")).sendKeys("deekshit.usr@gmail.com");
driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Gei321itc@12");
driver.findElement(By.name("login")).click();

driver.close();
	}

}

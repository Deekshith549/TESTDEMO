package easytesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {3,4,5,6,7,8};
		int b[]= {4,3,6,7,8,5};
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://be10x.in/");
		driver.findElement(By.xpath("(//span[text()='Blog'])[1]")).click();
		String s=driver.getCurrentUrl();
		Assert.assertTrue(s.contains("blog"));
	
		
		/*if(s.contains("blog1")) {
			System.out.println("test case is passed");
		}else {
			System.out.println("test case is failed");
		}*/
		
	}

}

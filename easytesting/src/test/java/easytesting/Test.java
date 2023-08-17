package easytesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {

	public static void main(String[] args) {
		// textBox Y, button Y, Checkbox Y, radio button, dropdown, table calender,mouse action,keyboard , image ,linktext, partails, upload ,download and alart
		//dropdown,Mouse action,alrt and table
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://learn.be10x.in/");
		WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys("deekshit.usr@gmail.com");
		System.out.println(username.getAttribute("placeholder"));
		
		
		System.out.print(driver.findElement(By.xpath("//button[@type='submit']")).getCssValue("background-color"));
		
		//get attreibute what is mean by css 
		
		
		
		
		
		/*WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("Gei321itc@12");
		
		WebElement check=driver.findElement(By.xpath("//input[@type='checkbox']"));
		System.out.println("check before click "+check.isSelected());
		check.click();
		System.out.println("check after click "+check.isSelected());
		
		WebElement submit=driver.findElement(By.xpath("//button[@type='submit']"));
		submit.click();*/
		
		
	}

}

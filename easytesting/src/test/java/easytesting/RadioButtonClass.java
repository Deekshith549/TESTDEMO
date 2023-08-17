package easytesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtonClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//"https://demo.guru99.com/test/radio.html"
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/radio.html");
		driver.manage().window().maximize();
		WebElement radio=driver.findElement(By.xpath("//input[@value='Option 2']"));
		System.out.println("befor "+ radio.isSelected());
		radio.click();
		System.out.println("After "+ radio.isSelected());
	}

}

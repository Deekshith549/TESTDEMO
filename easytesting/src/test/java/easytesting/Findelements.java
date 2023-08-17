package easytesting;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Findelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//select[@id='searchDropdownBox1']")).click();
		List<WebElement> weblist= driver.findElements(By.xpath("//select[@id='searchDropdownBox']/option1"));
		//Iterator itr=list.iterator();  
		Iterator<WebElement> itr=weblist.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next().getText());
	}
		
		
		//select[@id="searchDropdownBox"]/option
	}

}

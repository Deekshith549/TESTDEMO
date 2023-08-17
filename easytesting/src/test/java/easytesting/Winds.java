package easytesting;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Winds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		String mainwindow=driver.getWindowHandle();
		
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		Set<String> s1=driver.getWindowHandles();
		Iterator<String> it=s1.iterator();
		
		while(it.hasNext()) {
			String child=it.next();
			if(!mainwindow.equalsIgnoreCase(child)) {
				driver.switchTo().window(child);
				driver.findElement(By.name("emailid")).sendKeys("deekshit.usr@gamil.com");
			}
		}
	}

}

package easytesting;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Iterator;
import java.util.Set;

public class HandleMultipleWindowsStepDefs {

    private WebDriver driver;
    private String mainwindow;

    @Given("the user launches window the website")
    public void launchWebsite() {
        //ChromeOptions options = new ChromeOptions();
       // options.addArguments("--headless"); // Run Chrome in headless mode (optional)
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/popup.php");
        mainwindow = driver.getWindowHandle();
    }

    @When("the user clicks on the Click Here link multiple times")
    public void clickMultipleTimes() {
        for (int i = 0; i < 3; i++) {
            driver.findElement(By.xpath("//a[text()='Click Here']")).click();
        }
    }

    @Then("the user should be able to enter an email in the child window")
    public void enterEmailInChildWindow() {
        Set<String> windowHandles = driver.getWindowHandles();
        Iterator<String> it = windowHandles.iterator();

        while (it.hasNext()) {
            String child = it.next();
            if (!mainwindow.equalsIgnoreCase(child)) {
                driver.switchTo().window(child);
                driver.findElement(By.name("emailid")).sendKeys("deekshit.usr@gmail.com");
                driver.close(); // Close the child window
            }
        }

        driver.switchTo().window(mainwindow);
        driver.quit();
    }
}

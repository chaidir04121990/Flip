package TestAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class Config{
    public static WebDriver driver;
    private String baseURL = "https://flip.id";

    @BeforeMethod
    public void Setup(){
        System.out.println("==========Browser is Launching==========");
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/Driver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get(baseURL);
    }

    @AfterMethod
    public void teardown(){
        driver.close();
        driver.quit();
        System.out.println("==========Browser is closed==========");
    }
}

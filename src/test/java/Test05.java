import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Test05 {

    public static WebDriver driver;

    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(5000, TimeUnit.SECONDS);
        System.out.println("It is inside the Before method ");
    }

    @Test
    public void loginTest_01()throws Exception{
        driver.navigate().to("http://spree.shiftedtech.com/");
        System.out.println("The Title of the Website is : "+driver.getTitle());
        driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
        driver.findElement(By.xpath("//input[@id='spree_user_email']")).sendKeys("shiftqa01@gmail.com");
        driver.findElement(By.xpath("//input[@id='spree_user_password']")).sendKeys("shiftedtech");
        driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/p[2]/input[1]")).click();
        System.out.println("Successfully logged in ");
        Thread.sleep(4000);
    }
    @AfterMethod
    public void tearDown(){
        driver.close();
        driver.quit();
    }
}

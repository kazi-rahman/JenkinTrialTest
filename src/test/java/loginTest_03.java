import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class loginTest_03 {

    @Test
    public void addToCart() throws Exception{

        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        System.out.println("Test is inside the loginTest_03");
        driver.navigate().to("http://spree.shiftedtech.com");
        driver.manage().timeouts().pageLoadTimeout(5000, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
        System.out.println("The Title of the Website is : "+driver.getTitle());
        driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
        driver.findElement(By.xpath("//input[@id='spree_user_email']")).sendKeys("shiftqa01@gmail.com");
        driver.findElement(By.xpath("//input[@id='spree_user_password']")).sendKeys("shiftedtech");
        driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/p[2]/input[1]")).click();
        System.out.println("Successfully logged in and inside the loginTest_03");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//a[normalize-space()='Ruby on Rails Tote']")).click();
        driver.findElement(By.xpath("//button[@id='add-to-cart-button']")).click();
        driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/p[1]/input[1]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
        System.out.println("Logged out from chrome Test 03");
        Thread.sleep(4000);
        driver.close();

    }



}

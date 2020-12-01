import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginTest_02 {
    public static void main(String[] args) throws Exception {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        System.out.println("loginTest_02");
        driver.navigate().to("http://spree.shiftedtech.com");
        System.out.println("The Title of the Website is : "+driver.getTitle());
        driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
        driver.findElement(By.xpath("//input[@id='spree_user_email']")).sendKeys("shiftqa01@gmail.com");
        driver.findElement(By.xpath("//input[@id='spree_user_password']")).sendKeys("shiftedtech");
        driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/p[2]/input[1]")).click();
        System.out.println("Successfully logged in ");
        Thread.sleep(4000);
        driver.close();
    }
}

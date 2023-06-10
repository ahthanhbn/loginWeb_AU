import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws Throwable {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(5000);
        // Nhập thông tin đăng nhập
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
       // Submit form để đăng nhập
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
        // kiểm tra đăng nhập
        String u =driver.getCurrentUrl();
        if(u.equals("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index")){
            System.out.println("Test Case Passed");
        }
        else{
            System.out.println("Test Case Failed");
        }
       // Đóng trình duyệt
//        driver.quit();
    }

}
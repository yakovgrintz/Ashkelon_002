import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TTT {
    public static void main(String[] args) {
        final String START_URL_WHATSAPP="https://wa.me/+972";
        System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\files to project\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("user-data-dir=C:\\Users\\User\\AppData\\Local\\Google\\Chrome\\User Data");
        options.addArguments("--disable-notifications");
        WebDriver driver =new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get(START_URL_WHATSAPP+586010301);
        driver.findElement(By.id("action-button")).click();
    }
}

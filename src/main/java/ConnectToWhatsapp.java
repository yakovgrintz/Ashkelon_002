import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ConnectToWhatsapp {
    public ConnectToWhatsapp(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\files to project\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("user-data-dir=C:/Users/User/AppData/Local/Google/Chrome/User Data");
        options.addArguments("--start-maximized");
        ChromeDriver driver =new ChromeDriver(options);
        driver.get("https://web.whatsapp.com/");

    }

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\files to project\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("user-data-dir=C:/Users/User/AppData/Local/Google/Chrome/User Data");
        WebDriver driver =new ChromeDriver(options);
        options.addArguments("--start-maximized");
        driver.get("https://mail.google.com/mail/u/0/#inbox");
    }
}

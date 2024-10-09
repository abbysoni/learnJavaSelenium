import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver","D://Testing/chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        System.out.println("Hello, World!");
        System.out.println("none of you know what you're doing");

        driver.get("https://www.google.com");
        driver.quit();
    }
}

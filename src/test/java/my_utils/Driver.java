package my_utils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;
import java.util.concurrent.TimeUnit;
public class Driver {
    private Driver() {
    }
   private static InheritableThreadLocal<WebDriver> driverPool = new InheritableThreadLocal<>();
       public static WebDriver getDriver() {
        if (driverPool.get() == null) { // if driver/browser was never opened
            String browserType = ConfigReader.getProperty("browser");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--incognito");
            options.addArguments("lang=en-GB");
            switch (browserType) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driverPool.set(new ChromeDriver(options));
                    driverPool.get().manage().window().maximize();
                    driverPool.get().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driverPool.set(new FirefoxDriver());
                    driverPool.get().manage().window().maximize();
                    driverPool.get().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                    break;
                case "opera":
                    WebDriverManager.operadriver().setup();
                    driverPool.set(new OperaDriver());
                    driverPool.get().manage().window().maximize();
                    driverPool.get().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                    break;
                case "explorer":
                    WebDriverManager.iedriver().setup();
                    driverPool.set(new InternetExplorerDriver());
                    driverPool.get().manage().window().maximize();
                    driverPool.get().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                    break;
                case "safari":
                    WebDriverManager.safaridriver().setup();
                    driverPool.set(new SafariDriver());
                    driverPool.get().manage().window().maximize();
                    driverPool.get().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                    break;
            }
        }return driverPool.get();

    }
    public static void setDriver(WebDriver driver) {
    }
    public static void closeDriver() {
        if (driverPool.get() != null) {
            driverPool.get().quit(); // this line will kill the session, value will not be null
            driverPool.remove();
        }
    }
}
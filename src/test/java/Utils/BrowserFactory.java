package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserFactory {
    static WebDriver driver;

    public static WebDriver startBrowser(String browserChoice, String url) {
        if (browserChoice.equalsIgnoreCase("chrome")) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--headless");
            driver = new ChromeDriver(options);
        } else if (browserChoice.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else if (browserChoice.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            driver = new SafariDriver();
        }
        driver.get(url);
        driver.manage().window().maximize();
        return driver;
    }
}

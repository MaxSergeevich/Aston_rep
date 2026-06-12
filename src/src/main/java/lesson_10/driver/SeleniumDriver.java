package lesson_10.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.Objects;

public class SeleniumDriver {
    private static final ThreadLocal<WebDriver> driverThreadLocal = new ThreadLocal<>();
    private static ChromeOptions options = new ChromeOptions();

    public static void setOptions(ChromeOptions customOptions) {
        options = Objects.requireNonNull(customOptions);
    }

    public static WebDriver getInstance() {
        WebDriver currentDriver = driverThreadLocal.get();
        if (currentDriver == null) {
            currentDriver = new ChromeDriver(options);
            driverThreadLocal.set(currentDriver);
        }
        return currentDriver;
    }

    public static void quitDriver() {
        WebDriver driver = driverThreadLocal.get();
        if (driver != null) {
            driver.quit();
            driverThreadLocal.remove();
        }
    }
}


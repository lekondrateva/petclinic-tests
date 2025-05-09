package ui;

import config.TestConfig;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class BaseUiTest {

    protected WebDriver driver;

    @BeforeEach
    void setupDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @AfterEach
    void teardownDriver() {
        if (driver != null) {
            driver.quit();
        }
    }

    protected String getBaseUrl() {
        return TestConfig.getBaseUrl();
    }
}

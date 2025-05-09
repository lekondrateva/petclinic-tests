package ui;

import config.TestConfig;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.qameta.allure.*;

import static io.qameta.allure.SeverityLevel.CRITICAL;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginTest {

    private WebDriver driver;

    @BeforeEach
    void setup() {
        WebDriverManager.chromedriver().setup();  // загрузка и настройка
        driver = new ChromeDriver();
    }

    @Epic("UI Tests")
    @Feature("Homepage")
    @Story("PetClinic UI")
    @Severity(CRITICAL)
    @Test
    void homepageShouldBeAccessible() {
        driver.get(TestConfig.getBaseUrl());
        assertTrue(driver.getTitle().contains("PetClinic"));
    }

    @AfterEach
    void teardown() {
        if (driver != null) driver.quit();
    }

}
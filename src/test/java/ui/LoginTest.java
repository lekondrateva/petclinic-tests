package ui;

import config.TestConfig;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.SeverityLevel.CRITICAL;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginTest extends BaseUiTest {

    @Epic("UI Tests")
    @Feature("Homepage")
    @Story("PetClinic UI")
    @Severity(CRITICAL)
    @Test
    void homepageShouldBeAccessible() {
        driver.get(getBaseUrl());
        assertTrue(driver.getTitle().contains("PetClinic"));
    }

}
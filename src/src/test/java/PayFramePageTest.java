import lesson_10.driver.SeleniumDriver;
import lesson_10.steps.PayFrameSteps;
import lesson_10.steps.PaySectionSteps;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;
public class PayFramePageTest extends BaseTest{

    private final WebDriver driver = SeleniumDriver.getInstance();
    private PayFrameSteps payFrameSteps;
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    @BeforeEach
    public void homePage(){
        driver.get("https://www.mts.by/");
        List<WebElement> cookieButtons = By.xpath("//div[@class='cookie__wrapper']//button[text()='Отклонить']")
                .findElements(driver);
        if (!cookieButtons.isEmpty() && cookieButtons.get(0).isDisplayed()) {
            cookieButtons.get(0).click();
        }

        payFrameSteps = new PayFrameSteps();
        PaySectionSteps paySectionSteps = new PaySectionSteps();

        paySectionSteps.fillPhoneField("297777777")
                .fillSumField("100")
                .fillEmailField("email@mail.ru")
                .clickContinueButton();
    }

    @Test
    @DisplayName("Проверка полей внутри фрейма")
    public void paymentFrame() {

        try {
            wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(payFrameSteps.getIframe()));
            wait.until(ExpectedConditions.visibilityOf(payFrameSteps.getTotalCost()));
            wait.until(ExpectedConditions.visibilityOf(payFrameSteps.getCostOnButton()));
            wait.until(ExpectedConditions.visibilityOf(payFrameSteps.getNumberField()));
            wait.until(ExpectedConditions.visibilityOf(payFrameSteps.getCardNumberElement()));
            wait.until(ExpectedConditions.visibilityOf(payFrameSteps.getValidityPeriodElement()));
            wait.until(ExpectedConditions.visibilityOf(payFrameSteps.getNameFieldElement()));
            wait.until(ExpectedConditions.visibilityOf(payFrameSteps.getCvcFieldElement()));
            wait.until(ExpectedConditions.visibilityOf(payFrameSteps.getVisaLogo()));
            wait.until(ExpectedConditions.visibilityOf(payFrameSteps.getMasterCardLogo()));
            wait.until(ExpectedConditions.visibilityOf(payFrameSteps.getBelcartLogo()));
            wait.until(ExpectedConditions.visibilityOf(payFrameSteps.getMaestroLogo()));
            wait.until(ExpectedConditions.visibilityOf(payFrameSteps.getMirLogo()));
        } finally {
            driver.switchTo().defaultContent();
        }
    }
}

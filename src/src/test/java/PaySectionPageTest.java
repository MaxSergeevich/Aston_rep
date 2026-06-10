import lesson_10.driver.SeleniumDriver;
import lesson_10.steps.PayFrameSteps;
import lesson_10.steps.PaySectionSteps;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PaySectionPageTest extends BaseTest{

    private final WebDriver driver = SeleniumDriver.getInstance();
    private PaySectionSteps paySectionSteps;
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    private PayFrameSteps payFrameSteps;

    @BeforeEach
    public void homePage(){
        driver.get("https://www.mts.by/");
        List<WebElement> cookieButtons = By.xpath("//div[@class='cookie__wrapper']//button[text()='Отклонить']")
                .findElements(driver);
        if (!cookieButtons.isEmpty() && cookieButtons.get(0).isDisplayed()) {
            cookieButtons.get(0).click();
        }
        paySectionSteps = new PaySectionSteps();
        payFrameSteps = new PayFrameSteps();
    }

    @Test
    @DisplayName("Проверка названия секции платежа")
    public void checkSectionTitle(){
        String actualTitle = paySectionSteps.getTitle();
        paySectionSteps.checkTitle("Онлайн пополнение\nбез комиссии", actualTitle);
    }

    @ParameterizedTest
    @DisplayName("Проверка наличия логотипов")
    @ValueSource(strings = {"Visa", "Verified By Visa", "MasterCard",
            "MasterCard Secure Code", "Белкарт"})
    public void checkLogos(String expectedLogoName) {
        List<WebElement> logos = paySectionSteps.getLogos();
        List<String> altTexts = logos.stream()
                .map(logo -> logo.getAttribute("alt"))
                .filter(altText -> altText != null && !altText.isEmpty())
                .toList();
        boolean logoFound = altTexts.stream()
                .anyMatch(altText -> altText.contains(expectedLogoName));
        assertTrue(logoFound,
                "Логотип '" + expectedLogoName + "' не найден среди " + altTexts);
    }

    @Test
    @DisplayName("Проверка работоспособности ссылки 'Подробнее о сервисе'")
    public void checkLink(){
        paySectionSteps.clickLink();
        paySectionSteps.checkLink();
    }

    @Test
    @DisplayName("Проверка работы кнопки 'Продолжить'")
    public void checkContinueButton() {
        paySectionSteps.fillPhoneField("297777777")
                       .fillSumField("54")
                       .fillEmailField("email@mail.ru")
                       .clickContinueButton();
        try {
            wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(payFrameSteps.getIframe()));
        } finally {
            driver.switchTo().defaultContent();
        }
    }

    @Test
    @DisplayName("Проверка надписи в незаполненных полях")
    public void checkPhone(){
        paySectionSteps.checkPhoneBox();
        paySectionSteps.checkSumBox();
        paySectionSteps.checkEmailBox();
        paySectionSteps.checkInternetPhoneBox();
        paySectionSteps.checkInternetSumBox();
        paySectionSteps.checkInternetEmailBox();
        paySectionSteps.checkScoreInstalmentBox();
        paySectionSteps.checkInstalmentSumBox();
        paySectionSteps.checkInstalmentEmailBox();
        paySectionSteps.checkArrearsScoreBox();
        paySectionSteps.checkArrearsSumBox();
        paySectionSteps.checkArrearsEmailBox();
    }
}

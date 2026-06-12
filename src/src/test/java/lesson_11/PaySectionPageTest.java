package lesson_11;

import io.qameta.allure.Link;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import jdk.jfr.Description;
import lesson_10.driver.SeleniumDriver;
import lesson_10.steps.PayFrameSteps;
import lesson_10.steps.PaySectionSteps;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

import static io.qameta.allure.SeverityLevel.CRITICAL;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PaySectionPageTest extends BaseTest {

    private final WebDriver driver = SeleniumDriver.getInstance();
    private PaySectionSteps paySectionSteps;
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    private PayFrameSteps payFrameSteps;

    @BeforeEach
    public void homePage(){
        driver.get("https://www.mts.by/");
        List<WebElement> cookieButtons = By.xpath("//div[@class='cookie__wrapper']//button[text()='Отклонить']")
                .findElements(driver);
        if (!cookieButtons.isEmpty() && cookieButtons.getFirst().isDisplayed()) {
            cookieButtons.getFirst().click();
        }
        paySectionSteps = new PaySectionSteps();
        payFrameSteps = new PayFrameSteps();
    }

    @Test
    @DisplayName("Проверка названия секции платежа")
    @Description("Проверка наличия названия секции 'Онлайн пополнение без комиссии'")
    @Severity(CRITICAL)
    @Owner("Maxim Naumov")
    @Link(name = "MTS", url = "https://www.mts.by/")
    public void checkSectionTitle(){
        String actualTitle = paySectionSteps.getTitle();
        paySectionSteps.checkTitle("Онлайн пополнение\nбез комиссии", actualTitle);
    }

    @ParameterizedTest
    @DisplayName("Проверка наличия логотипов")
    @Description("Проверка наличия логотипов (Visa, Verified By Visa, MasterCard, MasterCard Secure Code, Белкарт)")
    @Severity(CRITICAL)
    @Owner("Maxim Naumov")
    @Link(name = "MTS", url = "https://www.mts.by/")
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
    @Description("Проверка работоспособности ссылки 'Подробнее о сервисе' на главной странице сайта")
    @Severity(CRITICAL)
    @Owner("Maxim Naumov")
    @Link(name = "MTS", url = "https://www.mts.by/")
    public void checkLink(){
        paySectionSteps.clickLink();
        paySectionSteps.checkLink();
    }

    @Test
    @DisplayName("Проверка работы кнопки 'Продолжить'")
    @Description("Проверка работы кнопки 'Продолжить' после заполнения формы")
    @Severity(CRITICAL)
    @Owner("Maxim Naumov")
    @Link(name = "MTS", url = "https://www.mts.by/")
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
    @Description("Проверка надписи в незаполненных полях формы")
    @Severity(CRITICAL)
    @Owner("Maxim Naumov")
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

    @Test
    @DisplayName("Проверка полей внутри фрейма")
    @Description("Проверка надписи в незаполненных полях фрейма после заполнения формы и последующим нажатием кнопки 'Продолжить'")
    @Severity(CRITICAL)
    @Owner("Maxim Naumov")
    public void paymentFrame() {

        paySectionSteps.fillPhoneField("297777777")
                .fillSumField("100")
                .fillEmailField("email@mail.ru")
                .clickContinueButton();
        try {
            wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(payFrameSteps.getIframe()));
            List<WebElement> elementsToCheck = List.of(
                    payFrameSteps.getTotalCost(),
                    payFrameSteps.getCostOnButton(),
                    payFrameSteps.getNumberField(),
                    payFrameSteps.getCardNumberElement(),
                    payFrameSteps.getValidityPeriodElement(),
                    payFrameSteps.getNameFieldElement(),
                    payFrameSteps.getCvcFieldElement(),
                    payFrameSteps.getVisaLogo(),
                    payFrameSteps.getMasterCardLogo(),
                    payFrameSteps.getBelcartLogo(),
                    payFrameSteps.getMaestroLogo(),
                    payFrameSteps.getMirLogo()
            );
            elementsToCheck.forEach(element ->
                    wait.until(ExpectedConditions.visibilityOf(element))
            );
        } finally {
            driver.switchTo().defaultContent();
        }
    }
}

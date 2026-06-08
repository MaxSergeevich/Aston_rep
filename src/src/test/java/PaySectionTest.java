import lesson_8.SeleniumDriver;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PaySectionTest extends BaseTest{

    private WebDriver driver = SeleniumDriver.getInstance();

    @BeforeEach
    public void homePage(){
        driver.get("https://www.mts.by/");
        List<WebElement> cookieButtons = driver.findElements(By.xpath("//div[@class='cookie__wrapper']//button[text()='Отклонить']"));
        if (!cookieButtons.isEmpty() && cookieButtons.get(0).isDisplayed()) {
            cookieButtons.get(0).click();
        }

    }

    @Test
    @DisplayName("Проверка названия секции платежа")
    public void checkSectionTitle(){
        WebElement title = driver.findElement(By.xpath("//section[@class='pay']//h2"));
        Assertions.assertEquals("Онлайн пополнение\nбез комиссии", title.getText());
    }

    @ParameterizedTest
    @DisplayName("Проверка наличия логотипов")
    @ValueSource(strings = {"Visa", "Verified By Visa", "MasterCard",
            "MasterCard Secure Code", "Белкарт"})
    public void checkLogos(String expectedLogoName) {
        List<WebElement> logos = driver.findElements(
                By.xpath("//section[@class='pay']//div[@class='pay__partners']/ul/li/img"));
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
        WebElement link = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/a"));
        link.click();
        String currentUrl = driver.getCurrentUrl();
        assertTrue(currentUrl.contains("https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/"));
    }

    @Test
    @DisplayName("Проверка работы кнопки 'Продолжить'")
    public void checkContinueButton() {
        WebElement phoneField = driver.findElement(By.xpath("//section[@class='pay']//input[@id='connection-phone']"));
        WebElement sumField = driver.findElement(By.xpath("//section[@class='pay']//input[@id='connection-sum']"));
        WebElement emailField = driver.findElement(By.xpath("//section[@class='pay']//input[@id='connection-email']"));
        WebElement continueButton = driver.findElement(By.xpath("//*[@id=\"pay-connection\"]/button"));
        By iframeLocator = By.xpath("//iframe[@class='payment-widget-iframe']");

        phoneField.sendKeys("297777777");
        sumField.sendKeys("200");
        emailField.sendKeys("email@mail.ru");
        continueButton.click();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iframeLocator));
    }
}

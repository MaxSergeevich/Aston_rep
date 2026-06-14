package lesson_10.steps;
import io.qameta.allure.Step;
import lesson_10.driver.SeleniumDriver;
import lesson_10.page.PaySectionPage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PaySectionSteps {

    private final PaySectionPage paySectionPage;

    public PaySectionSteps() {
        this.paySectionPage = PageFactory.initElements(SeleniumDriver.getInstance(), PaySectionPage.class);
    }

    @Step("Получаем заголовок блока платежей")
    public String getTitle() {
        return paySectionPage.getTitle().getText();
    }

    @Step("Сравниваем название секции 'Онлайн пополнение без комиссии' с актуальной")
    public void checkTitle(String exceptedTitle, String actualTitle) {
        Assertions.assertEquals(exceptedTitle, actualTitle);
    }

    @Step("Заполняем поле телефона")
    public PaySectionSteps fillPhoneField(String phone) {
        paySectionPage.getPhoneField().sendKeys(phone);
        return this;
    }

    @Step("Заполняем поле суммы")
    public PaySectionSteps fillSumField(String sum) {
        paySectionPage.getSumField().sendKeys(sum);
        return this;
    }

    @Step("Заполняем поле email")
    public PaySectionSteps fillEmailField(String email) {
        paySectionPage.getEmailField().sendKeys(email);
        return this;
    }

    @Step("Нажимаем кнопку 'Продолжить'")
    public void clickContinueButton(){
        paySectionPage.getContinueButton().click();
    }

    @Step("Нажимаем на ссылку 'Подробнее о сервисе'")
    public void clickLink(){
        paySectionPage.getLink().click();
    }

    @Step("Сравниваем полученную ссылку с актуальной")
    public void checkLink() {
        Assertions.assertEquals(paySectionPage.getCurrentUrl(),
                "https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/");
    }

    @Step ("Получаем логотипы платежных систем")
    public List<WebElement> getLogos() {
        return paySectionPage.getLogos();
    }

    @Step("Раздел 'Услуги связи': получаем строку 'Номер телефона'")
    public WebElement getPhoneBox() {
        return paySectionPage.getPhoneBox();
    }

    @Step("Раздел 'Услуги связи': сравниваем строку с актуальной")
    public void checkPhoneBox() {
        Assertions.assertEquals("Номер телефона", getPhoneBox().getAttribute("placeholder"));
    }

    @Step("Раздел 'Услуги связи': получаем строку 'Сумма платежа")
    public WebElement getSumBox() {
        return paySectionPage.getSumBox();
    }

    @Step("Раздел 'Услуги связи': сравниваем строку с актуальной")
    public void checkSumBox() {
        Assertions.assertEquals("Сумма", getSumBox().getAttribute("placeholder"));
    }

    @Step("Раздел 'Услуги связи': получаем строку 'E-mail для отправки чека'")
    public WebElement getEmailBox() {
        return paySectionPage.getEmailBox();
    }

    @Step("Раздел 'Услуги связи': сравниваем строку с актуальной")
    public void checkEmailBox() {
        Assertions.assertEquals("E-mail для отправки чека", getEmailBox().getAttribute("placeholder"));
    }

    @Step("Раздел 'Домашний интернет': получаем строку 'Номер абонента'")
    public WebElement getInternetPhoneBox() {
        return paySectionPage.getInternetPhoneBox();
    }

    @Step("Раздел 'Домашний интернет': сравниваем строку с актуальной")
    public void checkInternetPhoneBox() {
        Assertions.assertEquals("Номер абонента", getInternetPhoneBox().getAttribute("placeholder"));
    }

    @Step("Раздел 'Домашний интернет': получаем строку 'Сумма'")
    public WebElement getInternetSumBox() {
        return paySectionPage.getInternetSumBox();
    }

    @Step("Раздел 'Домашний интернет': сравниваем строку с актуальной")
    public void checkInternetSumBox() {
        Assertions.assertEquals("Сумма", getInternetSumBox().getAttribute("placeholder"));
    }

    @Step("Раздел 'Домашний интернет': получаем строку 'E-mail для отправки чека'")
    public WebElement getInternetEmailBox() {
        return paySectionPage.getEmailBox();
    }

    @Step("Раздел 'Домашний интернет': сравниваем строку с актуальной")
    public void checkInternetEmailBox() {
        Assertions.assertEquals("E-mail для отправки чека", getInternetEmailBox().getAttribute("placeholder"));
    }

    @Step("Раздел 'Рассрочка': получаем строку 'Номер счета на 44'")
    public WebElement getScoreInstalmentBox() {
        return paySectionPage.getScoreInstalmentBox();
    }

    @Step("Раздел 'Рассрочка': сравниваем строку с актуальной")
    public void checkScoreInstalmentBox() {
        Assertions.assertEquals("Номер счета на 44", getScoreInstalmentBox().getAttribute("placeholder"));
    }

    @Step("Раздел 'Рассрочка': получаем строку 'Сумма'")
    public WebElement getInstalmentSumBox() {
        return paySectionPage.getInstalmentSumBox();
    }

    @Step("Раздел 'Рассрочка': сравниваем строку с актуальной")
    public void checkInstalmentSumBox() {
        Assertions.assertEquals("Сумма", getInstalmentSumBox().getAttribute("placeholder"));
    }

    @Step("Раздел 'Рассрочка': получаем строку 'E-mail для отправки чека'")
    public WebElement getInstalmentEmailBox() {
        return paySectionPage.getEmailBox();
    }

    @Step("Раздел 'Рассрочка': сравниваем строку с актуальной")
    public void checkInstalmentEmailBox() {
        Assertions.assertEquals("E-mail для отправки чека", getInstalmentEmailBox().getAttribute("placeholder"));
    }

    @Step("Раздел 'Задолженность': получаем строку 'Номер счета на 2073'")
    public WebElement getArrearsScoreBox() {
        return paySectionPage.getArrearsScoreBox();
    }

    @Step("Раздел 'Задолженность': сравниваем строку с актуальной")
    public void checkArrearsScoreBox() {
        Assertions.assertEquals("Номер счета на 2073", getArrearsScoreBox().getAttribute("placeholder"));
    }

    @Step("Раздел 'Задолженность': получаем строку 'Сумма'")
    public WebElement getArrearsSumBox() {
        return paySectionPage.getArrearsSumBox();
    }

    @Step("Раздел 'Задолженность': сравниваем строку с актуальной")
    public void checkArrearsSumBox() {
        Assertions.assertEquals("Сумма", getArrearsSumBox().getAttribute("placeholder"));
    }

    @Step("Раздел 'Задолженность': получаем строку 'E-mail для отправки чека'")
    public WebElement getArrearsEmailBox() {
        return paySectionPage.getArrearsEmailBox();
    }

    @Step("Раздел 'Задолженность': сравниваем строку с актуальной")
    public void checkArrearsEmailBox() {
        Assertions.assertEquals("E-mail для отправки чека", getArrearsEmailBox().getAttribute("placeholder"));
    }
}

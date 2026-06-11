package lesson_10.steps;
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

    public String getTitle() {
        return paySectionPage.getTitle().getText();
    }

    public PaySectionSteps fillPhoneField(String phone) {
        paySectionPage.getPhoneField().sendKeys(phone);
        return this;
    }

    public PaySectionSteps fillSumField(String sum) {
        paySectionPage.getSumField().sendKeys(sum);
        return this;
    }

    public PaySectionSteps fillEmailField(String email) {
        paySectionPage.getEmailField().sendKeys(email);
        return this;
    }

    public void clickContinueButton(){
        paySectionPage.getContinueButton().click();
    }

    public void clickLink(){
        paySectionPage.getLink().click();
    }

    public void checkLink() {
        paySectionPage.getCurrentUrl();
        assertTrue(true);
    }

    public List<WebElement> getLogos() {
        return paySectionPage.getLogos();
    }

    public WebElement getPhoneBox() {
        return paySectionPage.getPhoneBox();
    }

    public void checkPhoneBox() {
        Assertions.assertEquals("Номер телефона", getPhoneBox().getAttribute("placeholder"));
    }

    public WebElement getSumBox() {
        return paySectionPage.getSumBox();
    }

    public void checkSumBox() {
        Assertions.assertEquals("Сумма", getSumBox().getAttribute("placeholder"));
    }

    public WebElement getEmailBox() {
        return paySectionPage.getEmailBox();
    }

    public void checkEmailBox() {
        Assertions.assertEquals("E-mail для отправки чека", getEmailBox().getAttribute("placeholder"));
    }

    public WebElement getInternetPhoneBox() {
        return paySectionPage.getInternetPhoneBox();
    }

    public void checkInternetPhoneBox() {
        Assertions.assertEquals("Номер абонента", getInternetPhoneBox().getAttribute("placeholder"));
    }

    public WebElement getInternetSumBox() {
        return paySectionPage.getInternetSumBox();
    }

    public void checkInternetSumBox() {
        Assertions.assertEquals("Сумма", getInternetSumBox().getAttribute("placeholder"));
    }

    public WebElement getInternetEmailBox() {
        return paySectionPage.getEmailBox();
    }

    public void checkInternetEmailBox() {
        Assertions.assertEquals("E-mail для отправки чека", getInternetEmailBox().getAttribute("placeholder"));
    }

    public WebElement getScoreInstalmentBox() {
        return paySectionPage.getScoreInstalmentBox();
    }

    public void checkScoreInstalmentBox() {
        Assertions.assertEquals("Номер счета на 44", getScoreInstalmentBox().getAttribute("placeholder"));
    }

    public WebElement getInstalmentSumBox() {
        return paySectionPage.getInstalmentSumBox();
    }

    public void checkInstalmentSumBox() {
        Assertions.assertEquals("Сумма", getInstalmentSumBox().getAttribute("placeholder"));
    }

    public WebElement getInstalmentEmailBox() {
        return paySectionPage.getEmailBox();
    }

    public void checkInstalmentEmailBox() {
        Assertions.assertEquals("E-mail для отправки чека", getInstalmentEmailBox().getAttribute("placeholder"));
    }

    public WebElement getArrearsScoreBox() {
        return paySectionPage.getArrearsScoreBox();
    }

    public void checkArrearsScoreBox() {
        Assertions.assertEquals("Номер счета на 2073", getArrearsScoreBox().getAttribute("placeholder"));
    }

    public WebElement getArrearsSumBox() {
        return paySectionPage.getArrearsSumBox();
    }

    public void checkArrearsSumBox() {
        Assertions.assertEquals("Сумма", getArrearsSumBox().getAttribute("placeholder"));
    }

    public WebElement getArrearsEmailBox() {
        return paySectionPage.getArrearsEmailBox();
    }

    public void checkArrearsEmailBox() {
        Assertions.assertEquals("E-mail для отправки чека", getArrearsEmailBox().getAttribute("placeholder"));
    }

    public void checkTitle(String exceptedTitle, String actualTitle) {
        Assertions.assertEquals(exceptedTitle, actualTitle);
    }
}

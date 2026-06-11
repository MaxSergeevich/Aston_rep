package lesson_10.page;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class PayFramePage {

    @FindBy(xpath = "//iframe[contains(@class, 'payment-widget-iframe')]")
    private WebElement iframe;
    @FindBy(xpath = "//app-payment-container//span[contains(@class, 'ng-star')]")
    private WebElement totalCost;
    @FindBy(xpath = "//app-card-page//button//span")
    private WebElement costOnButton;
    @FindBy(xpath = "//span[contains(text(), '375297777777')]")
    private WebElement numberField;
    @FindBy(xpath = "//img[contains(@class, 'ng')]")
    private WebElement logosField;
    @FindBy(xpath = "//label[contains(text(), 'Номер карты')]")
    private WebElement cardNumberElement;
    @FindBy(xpath = "//label[contains(text(), 'Срок действия')]")
    private WebElement validityPeriodElement;
    @FindBy(xpath = "//label[contains(text(), 'Имя и фамилия на карте')]")
    private WebElement nameFieldElement;
    @FindBy(xpath = "//label[contains(text(), 'CVC')]")
    private WebElement cvcFieldElement;
    @FindBy(xpath = "(//app-card-input//img)[1]")
    private WebElement visaLogo;
    @FindBy(xpath = "(//app-card-input//img)[2]")
    private WebElement masterCardLogo;
    @FindBy(xpath = "(//app-card-input//img)[3]")
    private WebElement belcartLogo;
    @FindBy(xpath = "(//app-card-input//img)[4]")
    private WebElement maestroLogo;
    @FindBy(xpath = "(//app-card-input//img)[5]")
    private WebElement mirLogo;
}


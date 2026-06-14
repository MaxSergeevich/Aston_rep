package lesson_10.page;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

@Getter
public class PaySectionPage {

    @FindBy(xpath = "//div[@id='pay-section']//section[@class='pay']//h2")
    private WebElement title;
    @FindBy(xpath = "//section[@class='pay']//div[@class='pay__partners']/ul/li/img")
    private List<WebElement> payLogos;
    @FindBy(xpath = "//section[@class='pay']//input[@id='connection-phone']")
    private WebElement phoneField;
    @FindBy(xpath = "//section[@class='pay']//input[@id='connection-sum']")
    private WebElement sumField;
    @FindBy(xpath = "//section[@class='pay']//input[@id='connection-email']")
    private WebElement emailField;
    @FindBy(xpath = "//form[@class='pay-form opened']//button[@type='submit']")
    private WebElement continueButton;
    @FindBy(xpath = "//*[@id=\"pay-section\"]/div/div/div[2]/section/div/a")
    private WebElement link;
    @FindBy(xpath = "//section[@class='pay']//div[@class='pay__partners']/ul/li/img")
    private List<WebElement> logos;
    @FindBy(xpath = "//input[@class='phone' and @placeholder='Номер телефона']")
    private WebElement phoneBox;
    @FindBy(xpath = "//input[@id='connection-sum' and @placeholder='Сумма']")
    private WebElement sumBox;
    @FindBy(xpath = "//input[@id='connection-email' and @placeholder='E-mail для отправки чека']")
    private WebElement emailBox;
    @FindBy(xpath = "//input[@class='phone' and @placeholder='Номер абонента']")
    private WebElement internetPhoneBox;
    @FindBy(xpath = "//input[@id='internet-sum' and @placeholder='Сумма']")
    private WebElement internetSumBox;
    @FindBy(xpath = "//input[@id='internet-email' and @placeholder='E-mail для отправки чека']")
    private WebElement internetEmailBox;
    @FindBy(xpath = "//input[@id='score-instalment' and @placeholder='Номер счета на 44']")
    private WebElement scoreInstalmentBox;
    @FindBy(xpath = "//input[@id='instalment-sum' and @placeholder='Сумма']")
    private WebElement instalmentSumBox;
    @FindBy(xpath = "//input[@id='instalment-email' and @placeholder='E-mail для отправки чека']")
    private WebElement instalmentEmailBox;
    @FindBy(xpath = "//input[@id='score-arrears' and @placeholder='Номер счета на 2073']")
    private WebElement arrearsScoreBox;
    @FindBy(xpath = "//input[@id='arrears-sum' and @placeholder='Сумма']")
    private WebElement arrearsSumBox;
    @FindBy(xpath = "//input[@id='arrears-email' and @placeholder='E-mail для отправки чека']")
    private WebElement arrearsEmailBox;
    String currentUrl = "https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/";
}
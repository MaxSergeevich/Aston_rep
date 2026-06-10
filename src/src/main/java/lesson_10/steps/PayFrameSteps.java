package lesson_10.steps;

import lesson_10.driver.SeleniumDriver;
import lesson_10.page.PayFramePage;
import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


@Getter
public class PayFrameSteps {
    private final PayFramePage payFramePage;

    public PayFrameSteps() {
        this.payFramePage = PageFactory.initElements(SeleniumDriver.getInstance(), PayFramePage.class);
    }

    public WebElement getIframe() {
        return payFramePage.getIframe();
    }

    public WebElement getTotalCost() {
        return payFramePage.getTotalCost();
    }

    public WebElement getCostOnButton() {
        return payFramePage.getCostOnButton();
    }

    public WebElement getNumberField() {
        return payFramePage.getNumberField();
    }

    public WebElement getCardNumberElement() {
        return payFramePage.getCardNumberElement();
    }

    public WebElement getValidityPeriodElement() {
        return payFramePage.getValidityPeriodElement();
    }

    public WebElement getNameFieldElement() {
        return payFramePage.getNameFieldElement();
    }

    public WebElement getCvcFieldElement() {
        return payFramePage.getCvcFieldElement();
    }

    public WebElement getVisaLogo() {
        return payFramePage.getVisaLogo();
    }

    public WebElement getMasterCardLogo() {
        return payFramePage.getMasterCardLogo();
    }

    public WebElement getBelcartLogo() {
        return payFramePage.getBelcartLogo();
    }

    public WebElement getMaestroLogo() {
        return payFramePage.getMaestroLogo();
    }

    public WebElement getMirLogo() {
        return payFramePage.getMirLogo();
    }

}
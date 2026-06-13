package lesson_10.steps;

import io.qameta.allure.Step;
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
    @Step("Получаем элемент Frame")
    public WebElement getIframe() {
        return payFramePage.getIframe();
    }

    @Step("Получаем итоговую стоимость в верхней части фрейма")
    public WebElement getTotalCost() {
        return payFramePage.getTotalCost();
    }

    @Step("Получаем итоговую стоимость на кнопке")
    public WebElement getCostOnButton() {
        return payFramePage.getCostOnButton();
    }

    @Step("Получаем строку с номером телефона")
    public WebElement getNumberField() {
        return payFramePage.getNumberField();
    }

    @Step("Получаем строку 'Номер карты'")
    public WebElement getCardNumberElement() {
        return payFramePage.getCardNumberElement();
    }

    @Step("Получаем строку 'Срок действия'")
    public WebElement getValidityPeriodElement() {
        return payFramePage.getValidityPeriodElement();
    }

    @Step("Получаем строку 'Имя и фамилия на карте'")
    public WebElement getNameFieldElement() {
        return payFramePage.getNameFieldElement();
    }

    @Step("Получаем строку 'CVC'")
    public WebElement getCvcFieldElement() {
        return payFramePage.getCvcFieldElement();
    }

    @Step("Получаем логотип карты Visa")
    public WebElement getVisaLogo() {
        return payFramePage.getVisaLogo();
    }

    @Step("Получаем логотип карты Mastercard")
    public WebElement getMasterCardLogo() {
        return payFramePage.getMasterCardLogo();
    }

    @Step("Получаем логотип карты Belcart")
    public WebElement getBelcartLogo() {
        return payFramePage.getBelcartLogo();
    }

    @Step("Получаем логотип карты Maestro")
    public WebElement getMaestroLogo() {
        return payFramePage.getMaestroLogo();
    }

    @Step("Получаем логотип карты Mir")
    public WebElement getMirLogo() {
        return payFramePage.getMirLogo();
    }

}
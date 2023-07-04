package org.example;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Selenide.$;

public class ForgottenPasswordPage {

    private final SelenideElement emailInput =
            $(By.xpath("//*[@id='input-email']"));

    private final SelenideElement continueButton =
            $(By.xpath("//button[text()='Continue']"));

    private final SelenideElement alertMessage =
            $(By.xpath("//div[@id='alert']//div"));


    public ForgottenPasswordPage setEmailIntoEmailField() {
        emailInput.setValue("lady.cat@mail.com");
        return this;
    }

    public ForgottenPasswordPage clickOnContinueButton() {
        continueButton.click();
        return this;
    }

    public void waitSeconds(long seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            System.out.println("Can`t wait for " + seconds + " seconds");
        }
    }

    public SelenideElement getAlertMessageAfterOneSecond() {
        waitSeconds(1);
        return alertMessage;
    }


}

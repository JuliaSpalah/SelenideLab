package org.example;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    private final SelenideElement forgottenPassword =
            $(By.xpath("//a[@class='list-group-item' and text()='Forgotten Password']"));

    public ForgottenPasswordPage clickOnForgottenPassword() {
        forgottenPassword.click();
        return new ForgottenPasswordPage();
    }

}

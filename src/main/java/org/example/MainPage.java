package org.example;


import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;


public class MainPage {

    private final SelenideElement brandsLinkLocator =
            $(By.xpath("//a[text()='Brands']"));

    private final SelenideElement myAccount =
            $(By.xpath("//span[text()='My Account']"));

    private final SelenideElement login =
            $(By.xpath("//a[@class='dropdown-item' and text()='Login']"));

    public BrandsPage clickBrandsLink() {
        brandsLinkLocator.click();
        return new BrandsPage();
    }

    public MainPage clickOnMyAccount() {
        myAccount.click();
        return this;
    }

    public LoginPage clickOnLogin() {
        login.click();
        return new LoginPage();
    }


}

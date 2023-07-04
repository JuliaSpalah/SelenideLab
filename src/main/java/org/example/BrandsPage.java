package org.example;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class BrandsPage {

    private final ElementsCollection brandsLocator =
            $$(By.xpath("//div[@id='product-manufacturer']//div[@class='col-sm-3']/a"));

    public ElementsCollection getBrands(){
        return brandsLocator;
    }



}

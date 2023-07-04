import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.example.LoginPage;
import org.example.MainPage;
import org.testng.annotations.Test;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;

public class Test1 extends BaseTest {

    @Test

    public void testCheckAlertMessage() {
        MainPage mainPage = new MainPage();

        SelenideElement actualMessage = mainPage
                .clickOnMyAccount()
                .clickOnLogin()
                .clickOnForgottenPassword()
                .setEmailIntoEmailField()
                .clickOnContinueButton()
                .getAlertMessageAfterOneSecond();

        String expectedAlertMessage = "Warning: The E-Mail Address was not found in our records!";

        actualMessage.shouldHave(Condition.text(expectedAlertMessage));


    }

}


import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import org.assertj.core.api.Assertions;
import org.example.MainPage;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class Test0 extends BaseTest {

    @Test
    public void testBrands() {
        MainPage mainPage = new MainPage();

        ElementsCollection actualBrandsList = mainPage
                .clickBrandsLink()
                .getBrands();

        List<String> expectedBrandsList = Arrays.asList("Apple", "Canon", "Hewlett-Packard", "HTC", "Palm", "Sony");
        actualBrandsList.shouldHave(CollectionCondition.exactTexts(expectedBrandsList));



    }

}

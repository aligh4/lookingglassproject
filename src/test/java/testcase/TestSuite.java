package testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pagefactory.DressesCategoryPage;
import pagefactory.HomePage;
import pagefactory.ShoppingCartSummary;

public class TestSuite extends TestBase {

    @Test
    public void test_case01_populate_cart() throws Exception {
        SoftAssert softAssert = new SoftAssert();

        HomePage homePage = new HomePage(driver);
        driver.get("http://www.automationpractice.com");
        driver.manage().window().maximize();
        homePage.goToDressesCategoryPage();
        DressesCategoryPage dressesCategoryPage = new DressesCategoryPage(driver);
        dressesCategoryPage.addDress03ToCart();
        dressesCategoryPage.addDress04ToCart();
        dressesCategoryPage.addDress05ToCart();
        dressesCategoryPage.addDress06ToCart();
        dressesCategoryPage.addDress07ToCart();
        ShoppingCartSummary shoppingCartSummary = new ShoppingCartSummary(driver);

        //5 dresses are listed on the summary page
        int expectedQty = 5;
        softAssert.assertEquals(shoppingCartSummary.totalQty(), expectedQty);

        //Verify all 5 expected dresses are listed on the summary page
        shoppingCartSummary.isDress03BodyTextPresent();
        boolean present = shoppingCartSummary.isDress03BodyTextPresent() &&
                shoppingCartSummary.isDress04bodyTextPresent() &&
                shoppingCartSummary.isDress05bodyTextPresent() &&
                shoppingCartSummary.isDress06BodyTextPresent() &&
                shoppingCartSummary.isDress07bodyTextPresent();
        softAssert.assertTrue(present);

        //Verify Total Product Price is the same as sum of individual total prices.
        waitForElement(By.cssSelector("[id='total_product']"));
        String actualResultString = driver.findElement(By.cssSelector("[id='total_product']")).getText();
        double actualResultDouble = Double.parseDouble(actualResultString);
        softAssert.assertEquals(shoppingCartSummary.totalProductsPrice(), actualResultDouble);
        softAssert.assertAll();
        }



}






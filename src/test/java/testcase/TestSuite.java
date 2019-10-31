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
        homePage.goToWomenCategoryPage();
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
        softAssert.assertTrue(shoppingCartSummary.isDress03BodyTextPresent() && shoppingCartSummary.isDress04bodyTextPresent() && shoppingCartSummary.isDress05bodyTextPresent() && shoppingCartSummary.isDress06BodyTextPresent() && shoppingCartSummary.isDress07bodyTextPresent());;

        //Verify Total Product Price is the same as sum of individual total prices.
        String actualResultString = driver.findElement(By.cssSelector("[id='total_product']")).getText();
        double actualResultDouble = Double.parseDouble(actualResultString);
        softAssert.assertEquals(shoppingCartSummary.totalProductsPrice(), actualResultDouble);

        softAssert.assertAll();


  /*      // 2. Total price of every dress is correct
        assertions.assertEquals();


        // 3. Total product price is correct
        assertions.assertEquals();
        assertions.assertAll();   // <---- */
    }
/*
    @Test
    public void testcase02_verify_cart_is_populated() throws Exception {
        int expectedQty = 5;
        Assert.assertEquals(shoppingCartSummary.totalQty(), expectedQty);
    }

    @Test
    void testcase03_verify_dress03_is_present() throws Exception{
        String expectedText = "SKU : demo_6";
        boolean bodyTextPresent = shoppingCartSummary.dress03Text.getText();
        Assert.assertTrue(bodyTextPresent);
    }

    @Test
    void testCase04_verify_total_price_is_correct() throws Exception{
        String actualResultString = driver.findElement(By.cssSelector("[id='total_product']")).getText();
        double actualResultDouble = Double.parseDouble(actualResultString);
        Assert.assertEquals(ShoppingCartSummary.totalProductsPrice, actualResultDouble);
    }
*/
}






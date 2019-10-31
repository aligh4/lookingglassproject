import PageFactory.HomePage;
import PageFactory.DressesCategoryPage;
import PageFactory.ShoppingCartSummary;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.internal.EclipseInterface;

public class TestSuite {

    private static WebDriver driver;
    // @Parameters({"browser"})

    @BeforeSuite

    // This method will instantiate the desired browser for this suite.

    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        /*        if (browser.equalsIgnoreCase("chrome")) {
             WebDriverManager.chromedriver().setup();
             driver = new ChromeDriver();
         }

        if (browser.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver= new FirefoxDriver();

       } */
    }

    //The first 5 test cases will add 5 dresses to the cart

    @Test
    public ShoppingCartSummary test_case01_populate_cart() throws Exception {
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
        return new ShoppingCartSummary(driver);
    }

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
}





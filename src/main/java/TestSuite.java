import PageFactory.HomePage;
import PageFactory.DressesCategoryPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestSuite {

    private static WebDriver driver;
   // @Parameters({"browser"})

     @BeforeSuite

     // This method will instantiate the desired browser for this suite.

     public void setUp(){
 WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
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

   @Test public void test_case01_populate_cart() throws Exception {
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
    }
    @Test public void test01_verify_cart_is_populated() throws Exception{


    }





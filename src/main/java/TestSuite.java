import PageFactory.HomePage;
import PageFactory.WomenCategoryPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestSuite {

    private static WebDriver driver;

     @BeforeSuite

     @Parameters({"browser"})

     // This method will instantiate the desired browser for this suite.

     public void setUp(String browserName){
         if (browserName.equalsIgnoreCase("chrome")) {
             WebDriverManager.chromedriver().setup();
             driver = new ChromeDriver();
         }

        if (browserName.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver= new FirefoxDriver();
       }
     }

    //The first 5 test cases will add 5 dresses to the cart

    @Test     public void testCase01() throws Exception {
    HomePage homePage = new HomePage(driver);
    driver.get("http://www.automationpractice.com");
    driver.manage().window().maximize();
    homePage.goToWomenCategoryPage();
    WomenCategoryPage womenCategoryPage = new WomenCategoryPage(driver);
    womenCategoryPage.addDress03ToCart();



    }
}

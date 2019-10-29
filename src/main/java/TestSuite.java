import PageFactory.HomePage;
import PageFactory.WomenCategoryPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestSuite {

    private static WebDriver driver;

    @BeforeSuite
    public void setUp(){
        WebDriverManager.getInstanc
        driver = new ChromeDriver();

    }
@Test     public void testCase01() throws Exception {
    HomePage homePage = new HomePage(driver);
    driver.get("http://www.automationpractice.com");
    driver.manage().window().maximize();
    homePage.goToWomenCategoryPage();
    WomenCategoryPage womenCategoryPage = new WomenCategoryPage(driver);
    womenCategoryPage.addDress03ToCart();


    }
}

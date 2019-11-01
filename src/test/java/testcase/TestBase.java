package testcase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public abstract class TestBase {

    protected static WebDriver driver;

    @BeforeMethod
    public void setUp() {
        System.out.println("AT THE BEFORE METHOD");
        String chosenBrowser = System.getProperty("browser");
        System.out.println("CHOSEN:  " + chosenBrowser);

        if(chosenBrowser.equalsIgnoreCase("CHROME")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        else if(chosenBrowser.equalsIgnoreCase("FIREFOX")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        else {
            // default
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        System.out.println("AT THE END OF SETUP");
    }

    @AfterMethod
    public void tearDown() {
        if(driver != null) {
            driver.close();
            driver.quit();
        }
    }

    // ===== Common Functions Used in any Test Cases =========== //
    public static void waitFor(int second) {
        try{
            Thread.sleep(second * 1000);
        }catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void waitForElement(By location) {
        new WebDriverWait(driver, 15).until(
                ExpectedConditions.visibilityOfElementLocated(location)
        );
    }
}

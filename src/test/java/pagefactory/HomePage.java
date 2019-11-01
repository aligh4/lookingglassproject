package pagefactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {

//WebElements
@FindBy(css = "ul[class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']  > li >  a[title=Dresses]")
private WebElement dressesButtonTopBanner;

//Constructor

private WebDriver driver;

public HomePage(WebDriver inputDriver){

    driver = inputDriver;

    PageFactory.initElements(driver, this);

}

//Methods
public void goToDressesCategoryPage(){
    dressesButtonTopBanner.click();
}

}

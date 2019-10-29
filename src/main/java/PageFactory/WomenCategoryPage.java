package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class WomenCategoryPage {


//Constructor
    private WebDriver driver;

    public WomenCategoryPage(WebDriver inputDriver) {

        driver = inputDriver;
        PageFactory.initElements(driver, this);

    }

   /*Actions hover = new Actions(driver);

    public void setHover(Actions hover) {
        this.hover = hover;
    }*/
    //WebElements

   /* @FindBy(xpath = "//a[@data-id-product'3' and @title='Add to cart']")
    private WebElement dress03AddToCart; */
   @FindBy(css = "img[src='http://automationpractice.com/img/p/8/8-home_default.jpg']")
   private WebElement dress03Image;

 //  @FindBy(css = "div[class=button-container] > a[data-id-product='3']")
   //@FindBy(css = "li[class='ajax_block_product col-xs-12 col-sm-6 col-md-4 first-in-line first-item-of-tablet-line first-item-of-mobile-line hovered'] >div > div[class='right-block'] > div[class='button-container'] > a[class='button ajax_add_to_cart_button btn btn-default']")
   // @FindBy(xpath = "//p[@id='add_to_cart']/button")
    @FindBy(xpath = "a[href='http://automationpractice.com/index.php?controller=cart&add=1&id_product=3&token=e817bb0705dd58da8db074c69f729fd8']")
    private WebElement addToCart;

    @FindBy(css = "//a[@data-id-product'4' and @title='Add to cart']")
    private WebElement dress04AddToCart;

    @FindBy(css = "//a[@data-id-product'5' and @title='Add to cart']")
    private WebElement dress05AddToCart;

    @FindBy(css = "//a[@data-id-product'6' and @title='Add to cart']")
    private WebElement dress06AddToCart;

    @FindBy(css = "//a[@data-id-product'7' and @title='Add to cart']")
    private WebElement dress07AddToCart;

    @FindBy(css = "i[class='icon-chevron-left left']")
    private WebElement continueShoppingButton;

//methods

    //To add individual dresses to cart and remain on the same page
    public void addDress03ToCart() throws Exception{
        Actions hover = new Actions(driver);
        hover.moveToElement(dress03Image, 0 , 5).perform();
        hover.moveToElement(addToCart).perform();
       // dress03Image.click();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        addToCart.click();
       // continueShoppingButton.click();

    }
    public void addDress04ToCart() {
        dress04AddToCart.click();
        continueShoppingButton.click();
    }
    public void addDress05ToCart() {
        dress05AddToCart.click();
        continueShoppingButton.click();
    }
    public void addDress06ToCart() {
        dress06AddToCart.click();
        continueShoppingButton.click();
    }
    public void addDress07ToCart() {
        dress07AddToCart.click();
        continueShoppingButton.click();
    }
}

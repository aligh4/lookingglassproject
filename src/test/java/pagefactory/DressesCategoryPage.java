package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DressesCategoryPage {
    //Constructor
    private WebDriver driver;

    public DressesCategoryPage(WebDriver inputDriver) {
        driver = inputDriver;
        PageFactory.initElements(driver, this);
    }

   //WebElements
   @FindBy(css = "img[src='http://automationpractice.com/img/p/8/8-home_default.jpg']")
   private WebElement dress03Image;

    @FindBy(css = "img[src='http://automationpractice.com/img/p/1/0/10-home_default.jpg']")
    private WebElement dress04Image;

    @FindBy(xpath = "//div[@id='center_column']/ul/li[3]/div[@class='product-container']//div[@class='product-image-container']/a[@title='Printed Summer Dress']/img[@alt='Printed Summer Dress']")
    private WebElement dress05Image;

    @FindBy(css = "img[src='http://automationpractice.com/img/p/1/6/16-home_default.jpg']")
    private WebElement dress06Image;

    @FindBy(css = "img[title='Printed Chiffon Dress']")
    private WebElement dress07Image;

     @FindBy(css = ".ajax_block_product.col-md-4.col-sm-6.col-xs-12.first-in-line.first-item-of-mobile-line.first-item-of-tablet-line > .product-container > .right-block > .button-container > a[title='Add to cart'] > span")
    private WebElement dress03addToCart;

    @FindBy(css = "li:nth-of-type(2) .right-block [rel] span")
    private WebElement dress04AddToCart;

    @FindBy(xpath = "//div[@id='center_column']/ul/li[3]/div[@class='product-container']//a[@title='Add to cart']/span[.='Add to cart']")
    private WebElement dress05AddToCart;

    @FindBy(xpath = "//div[@id='center_column']/ul/li[4]/div[@class='product-container']//a[@title='Add to cart']/span[.='Add to cart']")
    private WebElement dress06AddToCart;

    @FindBy(css = ".ajax_block_product.col-md-4.col-sm-6.col-xs-12.first-item-of-tablet-line.last-line.last-mobile-line > .product-container > .right-block > .button-container > a[title='Add to cart'] > span")
    private WebElement dress07AddToCart;

    @FindBy(css = "span[title='Continue shopping'] > span")
    private WebElement continueShoppingButton;

    @FindBy(css = "a[title='Proceed to checkout'] > span")
    private WebElement proceedToCheckoutButton;

    //methods
    private void selectDressToCart(WebElement dressImage, WebElement dress) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        Actions hover = new Actions(driver);
        hover.moveToElement(dressImage).perform();
        wait.until(ExpectedConditions.visibilityOf(dress));
        hover.moveToElement(dress).perform();
        dress.click();
        wait.until(ExpectedConditions.visibilityOf(continueShoppingButton));
    }

    //To add individual dresses to cart and remain on the same page for the 5 dresses
    public void addDress03ToCart() {
        selectDressToCart(dress03Image, dress03addToCart);
        continueShoppingButton.click();
    }

    public void addDress04ToCart() {
        selectDressToCart(dress04Image, dress04AddToCart);
        continueShoppingButton.click();
    }

    public void addDress05ToCart() {
        selectDressToCart(dress05Image, dress05AddToCart);
        continueShoppingButton.click();
    }

    public void addDress06ToCart() {
        selectDressToCart(dress06Image, dress06AddToCart);
        continueShoppingButton.click();
    }

   //This Method Contains the checkout WebElement
    public void addDress07ToCart() {
        selectDressToCart(dress07Image, dress07AddToCart);
        proceedToCheckoutButton.click();
    }
}

package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartSummary {

    //WebElements

    @FindBy(css = "input[name^='quantity_3_'][type='text']")
    private WebElement qtyBoxDress03;

    @FindBy(css = "input[name^='quantity_4_'][type='text']")
    private WebElement qtyBoxDress04;

    @FindBy(css = "input[name^='quantity_5_'][type='text']")
    private WebElement qtyBoxDress05;

    @FindBy(css = "input[name^='quantity_6_'][type='text']")
    private WebElement qtyBoxDress06;

    @FindBy(css = "input[name^='quantity_7_'][type='text']")
    private WebElement qtyBoxDress07;

    @FindBy(xpath = "//small[contains(text(), 'SKU : demo_3')]")
    private WebElement dress03text;

    @FindBy(xpath = "//small[contains(text(), 'SKU : demo_4')]")
    private WebElement dress04text;

    @FindBy(xpath = "//small[contains(text(), 'SKU : demo_5')]")
    private WebElement dress05text;

    @FindBy(xpath = "//small[contains(text(), 'SKU : demo_6')]")
    private WebElement dress06text;

    @FindBy(xpath = "//small[contains(text(), 'SKU : demo_7')]")
    private WebElement dress07text;

    @FindBy(css = "[id^='total_product_price_3']")
    private WebElement dress03PriceWebElement;

    @FindBy(css = "[id^='total_product_price_4']")
    private WebElement dress04PriceWebElement;

    @FindBy(css = "[id^='total_product_price_5']")
    private WebElement dress05PriceWebElement;

    @FindBy(css = "[id^='total_product_price_6']")
    private WebElement dress06PriceWebElement;

    @FindBy(css = "[id^='total_product_price_7']")
    private WebElement dress07PriceWebElement;

    //Constructor
    private WebDriver driver;

    public ShoppingCartSummary(WebDriver inputDriver) {

        driver = inputDriver;
        PageFactory.initElements(driver, this);
    }

//Methods

    //The next methods will get texts from the 'Quantity' box for each item and parse it into a double data type.

    private double itemQtyDress(WebElement qtyBoxDress) {
        String item = qtyBoxDress.getText();
        double dressQtyDouble = Double.parseDouble(item);
        return dressQtyDouble;
    }

    private double itemQtyDress03() {
        return itemQtyDress(qtyBoxDress03);
    }

    private double itemQtyDress04() {
        return itemQtyDress(qtyBoxDress04);
    }

    private double itemQtyDress05() {
        return itemQtyDress(qtyBoxDress05);
    }

    private double itemQtyDress06() {
        return itemQtyDress(qtyBoxDress06);
    }

    private double itemQtyDress07() {
        return itemQtyDress(qtyBoxDress07);
    }


    //This method will supply the total of all items from the 'Quantity' boxes on the Shopping Cart Summary screen.

    public double totalQty(){
        double totalNumberOfItem = itemQtyDress03() + itemQtyDress04() + itemQtyDress05() + itemQtyDress06() + itemQtyDress07();
        return totalNumberOfItem;

    }
    private double dressPrice(WebElement dressPriceWebElement) {
        String dressPriceString = dressPriceWebElement.getText();
        double dressPrice = Double.parseDouble(dressPriceString);
        return dressPrice;
    }

    private double dress03price(){
        return dressPrice(dress03PriceWebElement);
    }
    private double dress04price(){
       return dressPrice(dress04PriceWebElement);
    }
    private double dress05price(){
        return dressPrice(dress05PriceWebElement);
    }
    private double dress06price(){
        return dressPrice(dress06PriceWebElement);
    }
    private double dress07price(){
        return dressPrice(dress07PriceWebElement);
    }
    public double totalProductsPrice(){
        double totalProductsPrice = dress03price() + dress04price() + dress05price() + dress06price() + dress07price();
        return totalProductsPrice;
    }

    //This method will return a boolean value depending on whether an item description is present on page or not.

    public boolean isDressBodyTextPresent(String dressExpectedText, WebElement dressBodyText) {
        String dressBodyTextPresent = dressBodyText.getText();
        boolean isDress03bodyTextPresent = dressExpectedText.equals(dressBodyTextPresent);
        return isDress03bodyTextPresent;
    }
    public boolean isDress03BodyTextPresent() {
        return isDressBodyTextPresent("SKU : demo_3", dress03text);
    }
    public boolean isDress04bodyTextPresent() {
        return isDressBodyTextPresent("SKU : demo_4", dress04text);

    }
    public boolean isDress05bodyTextPresent() {
        return isDressBodyTextPresent("SKU : demo_5", dress05text);

    }
    public boolean isDress06BodyTextPresent() {
        return isDressBodyTextPresent("SKU : demo_6", dress06text);

    }
    public boolean isDress07bodyTextPresent() {
        return isDressBodyTextPresent("SKU : demo_7", dress07text);

    }
}
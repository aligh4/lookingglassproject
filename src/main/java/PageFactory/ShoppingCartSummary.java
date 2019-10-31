package PageFactory;

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

    private double itemQtyDress03() {
        String firstItem = qtyBoxDress03.getText();
        double dress03Double = Double.parseDouble(firstItem);
        return dress03Double;
    }

    private double itemQtyDress04() {
        String secondItem = qtyBoxDress04.getText();
        double dress04Double = Double.parseDouble(secondItem);
        return dress04Double;
    }

    private double itemQtyDress05() {
        String secondItem = qtyBoxDress05.getText();
        double dress05Double = Double.parseDouble(secondItem);
        return dress05Double;
    }

    private double itemQtyDress06() {
        String secondItem = qtyBoxDress05.getText();
        double dress06Double = Double.parseDouble(secondItem);
        return dress06Double;
    }

    private double itemQtyDress07() {
        String secondItem = qtyBoxDress05.getText();
        double dress07Double = Double.parseDouble(secondItem);
        return dress07Double;
    }


    //This method will supply the total of all items from the 'Quantity' boxes on the Shopping Cart Summary screen.

    public double totalQty(){
        double totalNumberOfItem = itemQtyDress03() + itemQtyDress04() + itemQtyDress05() + itemQtyDress06() + itemQtyDress07();
        return totalNumberOfItem;

    }
    private double dress03price(){
        String dress03PriceString = dress03PriceWebElement.getText();
        double dress03Price = Double.parseDouble(dress03PriceString);
        return dress03Price;
    }
    private double dress04price(){
    String dress04PriceString = dress04PriceWebElement.getText();
    double dress04Price = Double.parseDouble(dress04PriceString);
            return dress04Price;
    }
    private double dress05price(){
        String dress05PriceString = dress05PriceWebElement.getText();
        double dress05Price = Double.parseDouble(dress05PriceString);
        return dress05Price;
    }
    private double dress06price(){
        String dress06PriceString = dress06PriceWebElement.getText();
        double dress06Price = Double.parseDouble(dress06PriceString);
        return dress06Price;
    }
    private double dress07price(){
        String dress07PriceString = dress07PriceWebElement.getText();
        double dress07Price = Double.parseDouble(dress07PriceString);
        return dress07Price;
    }
    private double totalProductsPrice(){
        double totalProductsPrice = dress03price() + dress04price() + dress05price() + dress06price() + dress07price();
        return totalProductsPrice;
    }
}
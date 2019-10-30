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


    //This method will supply the total of all items from the 'Quantity' boxes om the Shopping Cart Summary screen.
    public double totalQty(){
        double totalNumberOfItem = itemQtyDress03() + itemQtyDress04() + itemQtyDress05() + itemQtyDress06() + itemQtyDress07();
        return totalNumberOfItem;

    }

}
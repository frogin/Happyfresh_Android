package pages;

import Base.BaseUtil;
import Base.ElementAction;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;



public class ProductPage extends BaseUtil {

    ElementAction action = new ElementAction();
    LoginPage page = new LoginPage(driver);

    public ProductPage(AndroidDriver<MobileElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "ui_view_input_product_find_product_edittext")
    public MobileElement boxSearch;

    @AndroidFindBy(id = "ui_view_input_product_find_product_edittext")
    public static MobileElement inputSearch;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Fresh Produce']")
    public MobileElement txtFreshProduce;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Sunpride Cavendish Banana']")
    public MobileElement txtSunpride;

    @AndroidFindBy(id = "ui_view_add_to_cart_text_view")
    public static MobileElement btnAddToCart;
    String addtoCard ="ui_view_add_to_cart_text_view";

    @AndroidFindBy(id = "ui_view_shopper_notes")
    public static MobileElement btnAddNotes;

    @AndroidFindBy(id = "ui_view_cart_menu_icon")
    public static MobileElement btnViewCard;

    @AndroidFindBy(id = "ui_view_product_list_ripple")
    public static MobileElement listProduct;

    @AndroidFindBy(id = "ui_view_store_name_textview")
    public static MobileElement txtStoreName;

    @AndroidFindBy(id = "ui_view_remove_item")
    public static MobileElement btnRemoveProduct;


    public void GoToProductDetails(){
        HomePage.btnBeranda.click();
        txtFreshProduce.click();
        txtSunpride.click();
        action.waitUntiElementPresent(By.id(addtoCard));
    }

    public void CheckProductDetails(){
        btnAddToCart.isDisplayed();
        btnViewCard.isDisplayed();
        btnRemoveProduct.isDisplayed();
        txtStoreName.isDisplayed();
    }

    public void AddToCardProduct(){
        btnAddToCart.click();
        btnAddNotes.isDisplayed();
    }

    public void CheckProuctList(){
        btnViewCard.click();
        listProduct.isDisplayed();
    }

}

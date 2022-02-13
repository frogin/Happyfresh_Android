package steps;

import Base.BaseUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.ProductPage;

public class ProductStep extends BaseUtil {

    @And("I go to product details")
    public void iGoToProductDetails() {
        ProductPage product= new ProductPage(driver);
        product.GoToProductDetails();
    }

    @Then("I check product details element")
    public void iCheckProductDetailsElement() {
        ProductPage product= new ProductPage(driver);
        product.CheckProductDetails();
    }

    @And("I add to card the product")
    public void iAddToCardTheProduct() {
        ProductPage product= new ProductPage(driver);
        product.AddToCardProduct();
    }

    @Then("I check the product list")
    public void iCheckTheProductList() {
        ProductPage product= new ProductPage(driver);
        product.CheckProuctList();
    }
}

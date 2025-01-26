package pageLayer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import baseLayer.baseClass;
import utilityLayer.DropDownHandle;
import utilityLayer.Utils;
import utilityLayer.WebElementHelper;

public class ProductPage extends baseClass {

	@FindBy(xpath = "//select[@class='product_sort_container']")
	private WebElement sortProduct;

	@FindBys(@FindBy(xpath = "//div[@class='inventory_item_price']/following-sibling::button"))
	private List<WebElement> productList;

	@FindBy(id = "shopping_cart_container")
	private WebElement shoppingTrolly;

	public ProductPage() {
		PageFactory.initElements(driver, this);
	}

	public void sortProductByRangeFunctionality(String ProductRange) {
		DropDownHandle.HandleDropdown(sortProduct, ProductRange);
	}

	public void productChoserFunctionality(int number) {
		Utils.selectProducts(productList, number);
	}

	public void shoppingTrollyFunctionality() {
		WebElementHelper.clickOnWebElement(shoppingTrolly);
	}

}

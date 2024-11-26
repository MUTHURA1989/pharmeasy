package in.pharmeasy.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import in.pharmeasy.baseclass.BaseClass;

public class Pharmeasy extends BaseClass {
	public Pharmeasy() {
		PageFactory.initElements(driver,this);
	
	}
@FindBy(xpath="//a[@class='Navbar_medicine__AoMQm']")
private WebElement medicine;

@FindBy(xpath="//div[@class='SearchStrip_rhs__0izDK']")
private WebElement search;

@FindBy(xpath="//div[text()='Ecosprin 75mg Strip Of 14 Tablets']")
private WebElement tablet;

@FindBy(xpath="//button[@id='proceed' and text()='Add To Cart']")
private WebElement add;

@FindBy(xpath="//li[@data-value='4']")
private WebElement quantity;

@FindBy(xpath="//button[@id='proceed']//span")
private WebElement viewcart;

@FindBy(xpath="//a[@class='Navbar_labTests__2SoAH']")
private WebElement labtest ;

@FindBy(xpath="//div[@class='_2viMf _1d8Yq' and text()='PharmEasy Labs (Thyrocare powered)']")
private WebElement pack;

@FindBy(xpath="//div[@class='PRjss']//h2[text()='Uric Acid Test']")
private WebElement test;

@FindBy(xpath="//button[@id='book-test-btn-pdp']")
private WebElement book;

@FindBy(xpath="//div[@id='patient-4']")
private WebElement patient;

@FindBy(xpath="//div[@class='Navbar_megaMenuTitle__4e4aI']")
private WebElement health;

@FindBy(xpath="//a[@href='/health-care/sports-nutrition-12931' and @class='ClickableElement_clickable__ItKj2 Category_categoryContainerLandingPageHome__67AGL']")
private WebElement p;

@FindBy(xpath="//div[@class='ProductCard_productName__5Z65V' and text()='Nutrabay Gold Tri-Blend Whey Protein Str...']")
private WebElement nutrition;

@FindBy(xpath="//button[@type='submit' and text()='Add To Cart']")
private WebElement add1;

@FindBy(xpath="//li[@data-value='3']")
private WebElement quantity1;

@FindBy(xpath="//span[text()='View Cart']")
private WebElement add2;

public WebElement getMedicine() {
	return medicine;
}

public WebElement getSearch() {
	return search;
}

public WebElement getTablet() {
	return tablet;
}

public WebElement getAdd() {
	return add;
}

public WebElement getQuantity() {
	return quantity;
}

public WebElement getViewcart() {
	return viewcart;
}

public WebElement getLabtest() {
	return labtest;
}

public WebElement getPack() {
	return pack;
}

public WebElement getTest() {
	return test;
}

public WebElement getBook() {
	return book;
}

public WebElement getPatient() {
	return patient;
}

public WebElement getHealth() {
	return health;
}

public WebElement getP() {
	return p;
}

public WebElement getNutrition() {
	return nutrition;
}

public WebElement getAdd1() {
	return add1;
}

public WebElement getQuantity1() {
	return quantity1;
}

public WebElement getAdd2() {
	return add2;
}



}

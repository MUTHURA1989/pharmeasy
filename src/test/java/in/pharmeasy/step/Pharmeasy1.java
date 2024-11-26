package in.pharmeasy.step;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import in.pharmeasy.baseclass.BaseClass;
import in.pharmeasy.objectrepository.Pharmeasy;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Pharmeasy1 extends BaseClass {
	BaseClass base=new BaseClass();
		Pharmeasy pharm=new Pharmeasy();

	@Given("the user launch the application {string}")
	public void the_user_launch_the_application(String string) {
	 try {
	  base.applicationLaunch(string);
	}
catch(Exception e)
	 {
	e.printStackTrace();
	 }
	}
	@When("the user click the medicine")
	public void the_user_click_the_medicine() {
	   try {
	    base.button(pharm.getMedicine());
	   }
	   catch(Exception e)
		 {
		e.printStackTrace();
		 }
	}
	@When("the user click the search")
	public void the_user_click_the_search() {
		try {
		base.button(pharm.getSearch());
		
	}
		catch(Exception e)
		 {
		e.printStackTrace();
		 }
	}
	@When("the user select the medicine")
	public void the_user_select_the_medicine() {
		try {
		base.button(pharm.getTablet());
	}
		catch(Exception e)
		 {
		e.printStackTrace();
		 }
	}

	@When("the user click addtocart button")
	public void the_user_click_addtocart_button() {
		try {
         base.button(pharm.getAdd());

	}
		catch(Exception e)
		 {
		e.printStackTrace();
		 }
	}

	@When("the user select the quantity")
	public void the_user_select_the_quantity() {
		try {
		base.button(pharm.getQuantity());
		
	}
		catch(Exception e)
		 {
		e.printStackTrace();
		 }
	}

	@When("the user click the viewcart button")
	public void the_user_click_the_viewcart_button() {
		try {
		base.button(pharm.getViewcart());

	}
		catch(Exception e)
		 {
		e.printStackTrace();
		 }
	}

	@When("the user click the Lab Test")
	public void the_user_click_the_Lab_Test() {
		try {
		base.button(pharm.getLabtest());
		
	}
		catch(Exception e)
		 {
		e.printStackTrace();
		 }
	}

	@When("the user select any Certified Lab partner")
	public void the_user_select_any_Certified_Lab_partner() {
		try {
		base.button(pharm.getPack());
	}
		catch(Exception e)
		 {
		e.printStackTrace();
		 }
	}

	@When("the user select the Test type")
	public void the_user_select_the_Test_type() {
		try {
		base.button(pharm.getTest());
	
	}
		catch(Exception e)
		 {
		e.printStackTrace();
		 }
	}
	@When("the user book the test")
	public void the_user_book_the_test() {
		try {
		base.button(pharm.getBook());
	}
		catch(Exception e)
		 {
		e.printStackTrace();
		 }
	}

	@When("the user enter the number of patients")
	public void the_user_enter_the_number_of_patients() {
		try {
		base.button(pharm.getPatient());
	}
		catch(Exception e)
		 {
		e.printStackTrace();
		 }
	}
	@When("the user click the healthcare dropdown")
	public void the_user_click_the_healthcare_dropdown() {
		try {
		base.button(pharm.getHealth());
		
	}
		catch(Exception e)
		 {
		e.printStackTrace();
		 }
	}

	@When("the user select the product")
	public void the_user_select_the_product() {
		try {
		base.button(pharm.getP());
	}
		catch(Exception e)
		 {
		e.printStackTrace();
		 }
	}

	@When("the user click the product")
	public void the_user_click_the_product() {
		try {
		base.button(pharm.getNutrition());
	}
		catch(Exception e)
		 {
		e.printStackTrace();
		 }
	}
	@When("the user click add to cart")
	public void the_user_click_add_to_cart() {
		try {
		base.button(pharm.getAdd1());
	}
		catch(Exception e)
		 {
		e.printStackTrace();
		 }
	}

	
	@When("the user select the quntity")
	public void the_user_select_the_quntity() {
		try {
		base.button(pharm.getQuantity1());
	}
		catch(Exception e)
		 {
		e.printStackTrace();
		 }
	}

	@When("the user click the view to cart")
	public void the_user_click_the_view_to_cart() {
		try {
		base.button(pharm.getAdd2());
		}
		catch(Exception e)
		 {
		e.printStackTrace();
		 }
		
	}


	@When("the user validate the product")
	public void the_user_validate_the_product() {
		try {
		WebElement table=driver.findElement(By.xpath("//table[@class='ProductPriceTable_table__rmy6R']"));
		List<WebElement> tr=driver.findElements(By.tagName("tr"));
		for(int i=0;i<tr.size();i++) {
			WebElement head=tr.get(i);
			String headname=head.getText();
			System.out.println(headname);
			
		}
		}
		catch(Exception e)
		 {
		e.printStackTrace();
		 }
	}
	@Then("User Takescreenshot")
	public void user_Takescreenshot() throws IOException {
		 TakesScreenshot ts = (TakesScreenshot)driver ;
		    File source =ts.getScreenshotAs(OutputType.FILE);
		    File target = new File("C:\\Users\\MUTHURA\\eclipse-workspace\\CGT\\Pharmeasy\\target\\pharmeasy.png");
		    FileUtils.copyFile(source, target);
	}





}

package Testcase;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import functaionalities.Cart;
import functaionalities.Checkout;
import functaionalities.Home_CLP_PLP_Search;
import functaionalities.adyen;
import generalUtilities.BaseTest;
import io.restassured.RestAssured;


public class RegressionTest extends BaseTest {

	@BeforeTest
	public static void hitClientResource(){
		RestAssured.baseURI="https://development-eu01-lecreuset.demandware.net";
		RestAssured.basePath="/s/lecUK/dw/shop/v18_8";
		System.out.println("programme start");
		
	}
	
	
	
	@Test (enabled=false)
	public void regression_Content() throws IOException{
	Home_CLP_PLP_Search.contentMethod();
	}
	
	@Test (priority=1)
	public void regression_CategoryLists() throws IOException {
		//Home_CLP_PLP_Search.categoryLists();
		
		Cart.createAuth();
		Cart.createBasket();
		Cart.addItemToBasket();
		Checkout.checkoutShippingAddress();
		Checkout.addCustomeremail();
		Checkout.addBillingAddress();
		Checkout.addShippingMethod();
		Checkout.addPayment();
		Checkout.placeOrder();
	
		
		adyen.hitAdyen();
		adyen.linkOrderToAdyen();
		Checkout.updateOrder();
		
		
		
	}
	
	
}

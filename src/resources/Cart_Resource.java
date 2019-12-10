package resources;

import generalUtilities.BaseTest;

public class Cart_Resource extends BaseTest {

	public static String authResource() {
		res="/customers/auth";
		return res;
	}
	
	public static String cartResource() {
		res="/baskets";
		return res;
	}
	
	public static String addItemResource() {
		res="/baskets/{basket_id}/items";
		return res;
	}
	
	
	
	
}

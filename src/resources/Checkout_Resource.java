package resources;

import generalUtilities.BaseTest;

public class Checkout_Resource extends BaseTest{
	public static String shippingAddressResource() {
		res="/baskets/{basket_id}/shipments/me/shipping_address";
		return res;
	}
	
	public static String shippingMethodResource() {
		res="/baskets/{basket_id}/shipments/me/shipping_method";
		return res;
	}
	
	public static String billingAddressResource() {
		res="/baskets/{basket_id}/billing_address";
		return res;
	}
	
	public static String paymentResource() {
		res="/baskets/{basket_id}/payment_instruments";
		return res;
	}
	
	public static String placeOrderResource() {
		res="/orders";
		return res;
	}
	
	public static String updateOrderResource() {
		res="/orders/{orderID}";
		return res;
	}
	
	public static String addEmailResource()
	{
		String res = "/baskets/{basket_id}/customer";
		return res;
	}
	
}

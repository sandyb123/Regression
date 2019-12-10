package payloads;

import java.util.HashMap;

import generalUtilities.BaseTest;

public class Checkout_Payloads extends BaseTest {
	public static String shippingPayload() {
		 shippingAddress = "{\\r\\n  \\\"id\\\": \\\"StandardShipping\\\",\\r\\n  \\\"shipping_method\\\":\\r\\n  {\\r\\n    \\\"id\\\":\\\"002\\\"\\r\\n  },\\r\\n  \\\"shipping_address\\\" :\\r\\n  {\\r\\n    \\\"first_name\\\":\\\"John\\\",\\r\\n    \\\"last_name\\\":\\\"Smith\\\",\\r\\n    \\\"city\\\":\\\"Boston\\\",\\r\\n    \\\"country_code\\\":\\\"US\\\",\\r\\n   },\\r\\n   \\\"c_somestring\\\":\\\"shipment_custom_property\\\"\\r\\n}";
		return shippingAddress;
	}
	
	public static HashMap<String, Object> shippingAddreessPayload()
	{
		/*
		 * map = new HashMap<String, Object>(); map.put("gift","true");
		 * map.put("gift_message","abc"); map.put("id","StandardShipping");
		 * HashMap<String, Object> map1 = new HashMap<String, Object>(); map1.put("id",
		 * "002"); map.put("shipping_method",map1); HashMap<String, Object> map2 = new
		 * HashMap<String, Object>(); map2.put("first_name", "John");
		 * map2.put("last_name", "Smith"); map2.put("city", "Boston");
		 * map2.put("country_code", "US"); map.put("shipping_address", map2);
		 * map.put("c_somestring", "shipment_custom_property");
		 */
		
		map = new HashMap<String, Object>();
		map.put("first_name", "John");
		map.put("last_name", "Smith");
		map.put("city", "Boston");
		map.put("state_code", "Alaska");
		map.put("postal_code", "11122");
		map.put("phone", "3333333333");
		map.put("address1", "1 Microsoft way");
		map.put("country_code", "US");
		
		
	
		return map;
	}
	
	public static HashMap<String, Object> placeOrderPayload() {
		map=new HashMap<String, Object>();
		map.put("basket_id", basketId);
		return map;
	}
}

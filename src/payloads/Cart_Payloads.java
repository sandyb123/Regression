package payloads;

import java.util.HashMap;

import generalUtilities.BaseTest;

public class Cart_Payloads extends BaseTest{
	/*
	 * public static HashMap<String,Object> authPayload() { map=new HashMap<String,
	 * Object>(); map.put("type","guest"); System.out.println(map); return map;
	 * 
	 * }
	 */
	
	public static HashMap<String, Object> authPayload()
	{
		map = new HashMap<String, Object>();
		map.put("type","guest");
		return map;
	}
}

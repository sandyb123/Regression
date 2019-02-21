package resources;

import generalUtilities.BaseTest;

public class Home_CLP_PLP_Search_Resource extends BaseTest {
	
	public static  String content(){
		 res = "/content/{id}";
		return res;
	}
	
	public static String categoryListsResource() {
		 res = "/categories/({id}";
		 return res;
	}

}

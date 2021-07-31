package valid;

import java.util.HashMap;
import java.util.Map;



public class Validation {
	static int count=0;
	static HashMap<String,String> hp=new HashMap<>();
   public static boolean check(String name,String pass) {
	 
	    
	    for(Map.Entry<String, String> set:hp.entrySet()) {
	    	if(set.getKey().equalsIgnoreCase(name)) {
	    		if(set.getValue().equals(pass)) {
	    			count++;
	    			return true;
	    		}
	    		
	    	}
	    }
		return false;
	    
	   
   }
   public static String Existuser() {
	return null;
	   
   }
   
   public static boolean add(String name,String pass) {
	   hp.put(name, pass);
	   
	   return true;
   }
   
   public static boolean register(String name,String pass) {
	   hp.put(name,pass);
	   return true;
   }
   
}

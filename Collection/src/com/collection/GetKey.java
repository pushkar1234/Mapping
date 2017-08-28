package com.collection;

import java.io.ObjectOutputStream.PutField;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class GetKey {
	

	public static void main(String[] args) {
		  HashMap<Integer, String> hashMap=new HashMap<>();
			hashMap.put(1,"abc");
			hashMap.put(2,"pqr");
			hashMap.put(3,"str");
		   System.out.println(hashMap);
		   System.out.println("key for value abc:"+getKey(hashMap, "abc"));
		
	}
	  
	  static Object getKey(Map map, Object vaObject)
	  {
		
		   Set set= map.keySet();
	       for (Object object2 : set) {
	    	   if(map.get(object2).equals(vaObject))
	    	   {
	    		  return object2; 
	    	   }
			
		}
		return null;
			
		}
		
		   
		  
	  }



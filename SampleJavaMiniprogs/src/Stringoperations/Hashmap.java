package Stringoperations;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Hashmap {

	public static void main(String[] args) {
		
HashMap<String, Integer> hm=new HashMap<String, Integer>();
		
		hm.put("kc", 1);
		hm.put("rc", 2);
		
		@SuppressWarnings("rawtypes")
		Set e=hm.entrySet();
		
		@SuppressWarnings("rawtypes")
		Iterator i=e.iterator();
		
		while(i.hasNext())
		{
			@SuppressWarnings("rawtypes")
			Map.Entry me=(Entry) i.next();
			System.out.print(me.getKey()+" ");
			System.out.println(me.getValue());
		}
		System.out.println();
		
		int x=hm.get("kc");
		hm.put("kc", x+1000);
		System.out.println("kc's balance: "+hm.get("kc"));

		
		

	}

}

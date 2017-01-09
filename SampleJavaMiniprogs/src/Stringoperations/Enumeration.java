package Stringoperations;

import java.util.Vector;

public class Enumeration {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		
		Vector<String> v=new Vector<String>();
		java.util.Enumeration d;
		
		v.add("kc");
		v.add("karthik");
		d=v.elements();
		
		while(d.hasMoreElements())
		{
			System.out.println(d.nextElement());
		}
		
		
		
		

	}

}

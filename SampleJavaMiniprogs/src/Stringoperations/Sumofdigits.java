package Stringoperations;

public class Sumofdigits {

	public static void main(String[] args) {
		
		int i=123;
		String s=String.valueOf(i);
		int total=0;
		int n=s.length();
		for(int j=0;j<n;j++)
		{
			char c=s.charAt(j);
		    total+=Character.getNumericValue(c);	
		}
		System.out.println(total);
	}


}

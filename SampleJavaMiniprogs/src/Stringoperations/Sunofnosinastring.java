package Stringoperations;

public class Sunofnosinastring {

	public static void main(String[] args) {
		String s="12dad13";
		int total=0;
		int n=s.length();
		for(int i=0;i<n;i++)
		{
			char c=s.charAt(i);
			if(Character.isDigit(c))
			{
				total+=Character.getNumericValue(c);
			}
		
		}
		System.out.println(total);

	}

}

package Stringoperations;

public class Findthepositionofnumber {

	public static void main(String[] args) {
		int j=436217486;
		String s=String.valueOf(j);
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c=='7')
			{
				System.out.println(i+1);
			}
		}

	}

}

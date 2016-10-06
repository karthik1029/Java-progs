package Stringoperations;

import java.util.Arrays;

public class Anagram {
	public void anagram(String x,String y)
	{
		if(x.length()!=y.length())
		{
			
			System.out.println("Not an anagram");
		}
		else
		{
			char[] chx=x.toCharArray();
			char[] chy=y.toCharArray();
			
			Arrays.sort(chx);
			Arrays.sort(chy);
			
			boolean status=Arrays.equals(chx, chy);
			
			if(status)
			{
				System.out.println("Anagram");
			}
			else
			{
				System.out.println("Not an anagram");
			}
			
		}
	}

	public static void main(String[] args) {
		String x="cinema";
		String y="iceman";
		Anagram ob=new Anagram();
		ob.anagram(x, y);
		

	}

}

package Stringoperations;

public class Stringpermutation {
	
	public static boolean perm(String x, String y)
	{
		if(x.length()!=y.length())
			return false;
		
		char[] chx=x.toCharArray();
		char[] chy=y.toCharArray();
		int sx=0; 
		int sy=0;
		 
		
		for(char cx: chx)
		{
			sx+=(int)cx;
		}
		
		for(char cy: chy)
		{
			sy+=(int)cy;
		}
		
		if(sy==sx)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public static void main(String[] args) {
		String s="key";
		String s1="yek";
		if(perm(s,s1))
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
		

	}

}

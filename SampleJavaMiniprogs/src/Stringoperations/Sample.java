package Stringoperations;

import java.util.Arrays;

public class Sample {
	public static char nonrp(String s)
	{
		
		char[] ch=s.toCharArray();
		char c=0;
		int n=ch.length;
		int count=0;
		
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++)
			{
				if(ch[i]==ch[j])
				{
				
					count++;
				}
			}
				if(count==1)
				{
					c=ch[i];
					break;
				}
				else
				{
					count=0;
				}
			
		}
		return c;
		
	}
	public static void main(String[] args) {
		String s="geeeefeg";
		char c=nonrp(s);
		System.out.println(c);
	}
}


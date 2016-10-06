package Stringoperations;

import java.util.Scanner;

public class Vowels {
	
	public int vowels(String s)
	{
		char[] ch=s.toCharArray();
		int count=0;
		for (char c:ch)
		{
			switch(c)
			{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			count++;
			break;
			default : 
			}
			
		}
		return count;
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String:");
		String s=sc.next();
		Vowels vw=new Vowels();
		int i=vw.vowels(s);
		System.out.println("Vowels count:" + i);
		sc.close();
		

	}

}

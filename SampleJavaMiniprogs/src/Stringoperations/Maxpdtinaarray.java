package Stringoperations;

import java.util.Arrays;
import java.util.Scanner;

public class Maxpdtinaarray {
	
	public static void pdt(int n)
	{
		Scanner sc=new Scanner(System.in);
		int[] ch=new int[n];
		int ch1=1;
		for(int i=0; i<n;i++)
		{
			System.out.print("Enter:");
			ch[i]= sc.nextInt();
			System.out.print("");
		}
		Arrays.sort(ch);
		ch1=ch[n-1];
		for(int i=n-2; i>=n/2;i--)
		{
			ch1*=ch[i];
			
		}
		sc.close();
		System.out.println(ch1);
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size:");
		int n=sc.nextInt();
		System.out.print("");
		if(n<=2)
		{
			System.out.println("The array size is less than 3");
			System.out.print("Enter the size:");
		    n=sc.nextInt();
			System.out.print("");
			pdt(n);
		}
		else
		{
			pdt(n);
		}
		sc.close();

	}

}

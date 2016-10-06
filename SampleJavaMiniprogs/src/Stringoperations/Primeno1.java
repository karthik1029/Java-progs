package Stringoperations;

import java.util.Scanner;

public class Primeno1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int flag=1;
		System.out.print("Enter a number:");
		int num=sc.nextInt();
		int b=num-1;
		while(b!=1)
		{
			if(num%b==0)
			{
				flag=0;
			}
			b=b-1;
		}
		if(flag==1)
		{
			System.out.println("Prime");
		}
		else
		{
			System.out.println("Not a prime");
		}
		sc.close();
	}

}

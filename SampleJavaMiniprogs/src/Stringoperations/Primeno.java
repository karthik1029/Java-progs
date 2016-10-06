package Stringoperations;

import java.util.Scanner;

public class Primeno {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int flag=0;
		System.out.print("Enter a number:");
		int num=sc.nextInt();
		if(num>1)
		{
			for(int i=2;i<=num/2;i++)
			{
				if(num%i==0)
				{
					System.out.println("Not a prime number");
					flag=1;
					break;
				}	
			}
			if(flag==0)
			{
				System.out.println("Prime");
			}
		}
		sc.close();

	}

}

package Stringoperations;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		int result=1;
		while(num!=0)
		{
			result*=num;
			num--;
		}
		System.out.println("The Factorial is: "+result);
		sc.close();
	}

}

package Stringoperations;

import java.util.Scanner;

public class Digitalroot {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number:");
		int i=sc.nextInt();
		int i1=(1+(i-1)%9);
		System.out.println(i1);
		sc.close();

	}

}

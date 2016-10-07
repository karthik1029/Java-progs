package Stringoperations;

public class Fibonacci {

	public static void main(String[] args) {
		int a=1,b=0,i=1;
		while(i<10)
		{
			
			int n=a+b;
			System.out.println(b);
			a=b;
			b=n;
			i++;
		}

	}

}

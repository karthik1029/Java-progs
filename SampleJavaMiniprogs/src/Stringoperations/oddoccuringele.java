package Stringoperations;

public class oddoccuringele {

	public static void main(String[] args) {
		int[] a={2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2};
		int x=0;
		
		for(int i=0;i<a.length;i++)
		{
			x^=a[i];
		}
		
		System.out.println(x);
		

	}

}

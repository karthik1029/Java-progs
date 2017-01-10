package Stringoperations;

import java.util.HashSet;

public class Sumofpairs {
	
	public static void nu(int[] array, int sum) {
	    HashSet<Integer> set = new HashSet<Integer>();
	    for (int num : array) {
	        if (set.contains(sum - num)) {
	            String s = num + ", " + (sum - num) + " add up to " + sum;
	            System.out.println(s);
	        }
	        set.add(num);
	    }
	}

	public static void main(String[] args) {
	    int []a = {3,5,4,4};
	    nu(a,8);  

	}

}

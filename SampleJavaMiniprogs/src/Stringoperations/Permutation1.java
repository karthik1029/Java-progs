package Stringoperations;



public class Permutation1 {
	
	public static void perm(String prefix, String str) {
		
	    int n=str.length();
	    if(n==0)
	    {
	    	System.out.println(prefix);
	    }
	    else
	    {
	    	for(int i=0;i<n;i++)
	    	{
	    		perm(prefix+str.charAt(i),str.substring(0, i)+str.substring(i+1, n));
	    	}
	    }
	 
	}
	

	public static void main(String[] args) {
		perm("","ant");

	}

}

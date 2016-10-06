package Stringoperations;

public class Palindrome {
	
	public void palindrome(String s)
	{
		if(s==null || s=="")
		{
			System.out.println("Empty String");
		}
		
		char[] ch=s.toCharArray();
		int len=ch.length-1;
		int count=0;
		for(int i=0;i<len;i++)
		{
			if(ch[i]==ch[len-i])
			{
				count++;
			}
			
		}
		if(count==len)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}
	}
	
	

	public static void main(String[] args) {
		String s="hannah";
		Palindrome pd=new Palindrome();
		pd.palindrome(s);

	}

}

package Stringoperations;

public class Runlengthencoding {

	public static void main(String[] args) {
		String s="aaabb";
		char ch=0;
		int count=1;
		String com="";
		
		for(int i=0;i<s.length();i++)
		{
			if(ch==s.charAt(i))
			{
				count++;
			}
			else
			{
				com+=ch;
				if(count!=1)
				{
					com+=count;
				}
				ch=s.charAt(i);
				count=1;
			}
			
		}
		
		com=com+ch;
		if(count!=1)
		{
			com=com+count;
		}
		
		System.out.println(com);

	}

}

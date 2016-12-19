package Stringoperations;

public class Sample {

	public static void main(String[] args)  {
		
		String s="geegf";
		char c=0;
		int count;
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			count=0;
			for(int j=0;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
				}
			}
			if(count==1)
			{
				
				c=ch[i];
				break;
			}
		}
		
		System.out.println(c);
	}
}
package Stringoperations;

public class Nonrepetitivecharacter {
	
	public static char nonrep(String s)
	{
		
		char[] ch=s.toCharArray();
		int n=ch.length;
		int count=0;
		char ch1 =0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(ch[i]==ch[j])
				
					count++;
			}
				if(count==1)
				{
					ch1= ch[i];
					break;
				}
				else
				{
					count=0;
				}
			}
		return ch1;

	}
	
	public static void main(String[] args) {
		
		String s="geegf";
		if(nonrep(s)==0)
		{
			System.out.println("No Repeating Character");
		}
		else
		{
			System.out.println(nonrep(s));
		}

		}
	}


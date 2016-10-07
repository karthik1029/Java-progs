package Stringoperations;

public class Maxrepeatedcharinastring {

	public static void main(String[] args) {
		String s= "geeekkkkkeee";
		char[] ch=s.toCharArray();
		char ch1=0;
		int n=s.length();
		int count=0,max=0;
		for(int i=0;i<n;i++)
		{
			count=0;
			for(int j=i;j<n;j++)
			{
				if(ch[i]==ch[j])
					count++;
			}
			
			if(count>max)
			{
				max=count;
				ch1=ch[i];
			}
		}
		System.out.println(ch1+"  "+max);
	}

}

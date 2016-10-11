package Stringoperations;

public class Reversewordsinasentence {

	public static void main(String[] args) {
		  
		  String s="It is a miracle day.";
		  String lt=s.substring(s.length()-1);
		  s=s.replace(s.substring(s.length()-1), "");
		  String[] s1=s.split(" ");
		  int count=0;
		  for(String c:s1)
		  {
			  count++;
			  char[] ch=c.toCharArray();
			  for(int i=ch.length-1;i>=0;i--)
			  {
				  System.out.print(ch[i]);
			  }
			  if(count<s1.length)
			  {
				  System.out.print(" ");
			  }
			  
		  }
		  System.out.print(lt);

	}

}

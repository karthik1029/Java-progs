package Stringoperations;

public class Removeduplicatefrominteger {

	public static void main(String[] args) {
		
		int x=1345381;
		String s=String.valueOf(x);
		char[] ch=s.toCharArray();		
		int size=ch.length;
		for (int i = 0; i < size; i++) {
		      for (int j = i + 1; j < size;) {
		         if (ch[j] == ch[i]) {
		            for (int k = j; k < size-1; k++) {
		               ch[k] = ch[k + 1];
		            }
		            size--;
		         } else
		            j++;
		      }
		   }
		 
		for(int i=0;i<size;i++)
		{
			System.out.print(ch[i]);
		}
		

	}

}

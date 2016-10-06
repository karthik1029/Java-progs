package Stringoperations;

public class Vowelprint {

	public static void main(String[] args) {
		String s="cow";
		int count=0;
		char[] c=s.toCharArray();
		
			for(char c1:c)
			{
				switch(c1)
				{
				case 'a':
					System.out.println(c1);
					count++;
					break;
					
				case 'e':
					System.out.println(c1);
					count++;
					break;
				case 'i':
					System.out.println(c1);
					count++;
					break;
				case 'o':
					System.out.println(c1);
					count++;
					break;
				case 'u':
					System.out.println(c1);
					count++;
					break;
					default:
				}
			}
		
		
		System.out.println(count);

	}

}

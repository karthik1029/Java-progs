package Stringoperations;

public class Deleteacharacterinstring {

	public static void main(String[] args) {
		String s="ajddfudXuebfcb";
		  int index=s.indexOf('X');
		  
		  String s1=s.substring(0, index)+s.substring(index+1);
		  System.out.println(s1);

	}

}

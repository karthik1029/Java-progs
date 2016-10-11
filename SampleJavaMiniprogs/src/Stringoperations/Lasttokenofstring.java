package Stringoperations;

public class Lasttokenofstring {

	public static void main(String[] args) {
		 String s="karthik chandran";
		   String surname=s.substring(s.lastIndexOf(" ")+1);
		   System.out.println(surname);

	}

}

package Stringoperations;

public class Substringoccurence {

	public static void main(String[] args) {

		   String s="this is a tpe of is all is";
		   int index=0;
		   while(index!=-1)
		   {
			   index=s.indexOf("is",index);
			   if(index!=-1)
			   {
				   System.out.println(index);
				   index++;
			   }
		   }
	 

	}

}

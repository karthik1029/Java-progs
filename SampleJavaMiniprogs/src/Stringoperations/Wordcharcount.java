package Stringoperations;

import java.io.IOException;


public class Wordcharcount {

	public static void main(String[] args) throws IOException {
		

        String s1 ="Abracadabra      Alakazam!!";
        int count=0;
        String[] wCount=s1.split(" ");

        for(int i=0;i<wCount.length;i++){

            if(!wCount[i].isEmpty())
            {
                count++;
            }
        }
        System.out.println("Word Count = "+count);
        System.out.println("Non-whitespace character count = "+s1.replace(" ", "").length());
        System.out.println("Unique character breakdown in order they appeared...");
        
        
        String s2=s1.replaceAll(" ", "");
        StringBuffer sb=new StringBuffer(s2);

        while(sb.length() != 0)
        {
           char c = sb.charAt(0);
           int cnt = 0;
           for(int i=0; i< sb.length(); i++)
           {


           if(c == sb.charAt(i))
           {
  
               cnt++;
               sb.deleteCharAt(i);
               i--;

           }

           }
           
           System.out.println(c + ": " + cnt);

        }
	}
}

package Stringoperations;

public class Bubblesort {
	
	public static void BubbleSort( int [ ] num )
	{
	     int j;
	     boolean flag = true;   // set flag to true to begin first pass
	     int temp;   //holding variable

	     while ( flag )
	     {
	            flag= false;    //set flag to false awaiting a possible swap
	            for( j=0;  j < num.length -1;  j++ )
	            {
	                   if ( num[ j ] > num[j+1] )   // change to > for ascending sort
	                   {
	                           temp = num[ j ];                //swap elements
	                           num[ j ] = num[ j+1 ];
	                           num[ j+1 ] = temp;
	                          flag = true;              //shows a swap occurred  
	                  } 
	            } 
	      } 
	} 
	public static void main(String[] args)
	{
		int[] num={3,56,7,1,3,2};
		BubbleSort(num);
		for(int i=0;i<num.length;i++)
		{
			System.out.print(num[i]);
		}
	}

	
	
}

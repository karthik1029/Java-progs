package Stringoperations;

public class Selectionsort {
	
	
	public static void SelectionSort ( int [ ] arr )
	{
		 for (int i = 0; i < arr.length - 1; i++)
	        {
	            int index = i;
	            for (int j = i + 1; j < arr.length; j++)
	                if (arr[j] < arr[index])
	                    index = j;
	      
	            int smallerNumber = arr[index]; 
	            arr[index] = arr[i];
	            arr[i] = smallerNumber;
	        }

	}

	public static void main(String[] args) {
		

		int[] num={3,56,7,1,3,2};
		SelectionSort(num);
		for(int i=0;i<num.length;i++)
		{
			System.out.print(num[i]);
		}
		
	}

}

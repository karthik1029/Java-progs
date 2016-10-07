package Stringoperations;

public class Removeduplicatesunsortedarray {

	public static void main(String[] args) {
		int[] arr={0,1,1,0,4,8,3,4,5,8};
		 int size=arr.length;
		    for(int i=0;i<size;i++)
		    {
		        for(int j=i+1;j<size;)
		        {

		            if(arr[i]==arr[j])
		            {
		            	for (int k = j; k < size-1; k++) {
				               arr[k] = arr[k + 1];
				            }
		                size--;
		            }
		            else
		            {
		            	j++;
		            }
		        }
		    }

		    for(int a=0;a<size;a++)
		    {
		        System.out.print(arr[a]+" ");
		    }

	}

}

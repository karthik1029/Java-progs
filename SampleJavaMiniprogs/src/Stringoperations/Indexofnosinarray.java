package Stringoperations;

public class Indexofnosinarray {

	 public static void main(String[] args) {
			int[] a={0,9,1,8,3,6,4,5};
			int[] tmp=new int[10];
			int x,y,count=0;
			
			for(int i=0;i<a.length;i++)
			{
				x=a[i];
				if(x==9)
				{
					tmp[count]=i;
					count++;
				}
				for(int j=i+1;j<a.length;j++)
				{
					y=a[j];
					if(x+y==9)
					{
						tmp[count]=i;
						count++;
						tmp[count]=j;
						count++;
					}
				}
			}
			//Arrays.sort(tmp);
			for(int i=0;i<count;i++)
			{
				System.out.print(tmp[i]);
			}
			
		   }

}

package Stringoperations;



public class Sample extends Thread {


public static void main(String[] args)  {
	
Sample s1=new Sample();
Sample s2=new Sample();

s1.start();


s2.start();

}

public void run() {
	for(int i=1;i<5;i++)
	{
		
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName());
		System.out.println(i);
	}
	
}
}



	

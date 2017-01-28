package Stringoperations;

public class Threadsam extends Thread {
	
	public void run()
	{
		for(int i=1;i<=3;i++)
		{
			try
			{
				Thread.sleep(10);
			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName());//gets thread name
			System.out.println(i);
		}
	}

	public static void main(String[] args) throws InterruptedException {
		
		Threadsam s1=new Threadsam();
		Threadsam s2=new Threadsam();
		s1.setName("kc1"); //changes thread name, default is Thread-n
		
		s1.start();
		//s1.join(); //allows the current thread to continue execution
		s2.start();
		

	}

}

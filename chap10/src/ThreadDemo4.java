
public class ThreadDemo4 implements Runnable
{
	public void run()
	{
		for(int count=1,row=1;row<10;row++,count++)
		{
			for(int i=0;i<count;i++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args)
	{
		Runnable rb1=new ThreadDemo4();
		Runnable rb2=new ThreadDemo4();
		Runnable rb3=new ThreadDemo4();
		Thread td1=new Thread(rb1);
		Thread td2=new Thread(rb2);
		Thread td3=new Thread(rb3);
		td1.start();
		td2.start();
		td3.start();
	}

}

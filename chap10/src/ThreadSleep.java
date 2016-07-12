
public class ThreadSleep
{
	public static void main(String[] args) 
	{
		SubThread1 st=new SubThread1("SubThread");
		st.start();
	}
}
class SubThread1 extends Thread
{
	SubThread1(){}
	SubThread1(String Name)
	{
		super(Name);
	}
	public void run()
	{
		for(int count=1,row=1;row<10;row++,count++)
		{
			for(int i=0;i<count;i++)
			{
				System.out.print("*");
			}
			try 
			{
				Thread.sleep(1000);				
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
			System.out.println();
		}
	}
	
}

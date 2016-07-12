
public class ThreadDemo2 extends Thread
{	
	ThreadDemo2() {}
	ThreadDemo2(String szName)
	{
		super(szName);
	}
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
	public static void main(String argv[]) 
	{
		ThreadDemo2 td1=new ThreadDemo2();
		ThreadDemo2 td2=new ThreadDemo2();
		ThreadDemo2 td3=new ThreadDemo2();
		td1.start();		
		td2.start();		
		td3.start();
	}

}

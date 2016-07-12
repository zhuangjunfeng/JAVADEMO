class ShareData
{
	public static String szData="";
}
class ThreadDemo extends Thread
{
	private ShareData oShare;
	ThreadDemo(){}
	ThreadDemo(String szName,ShareData oShare)
	{
		super(szName);
		this.oShare=oShare;
	}
	public void run()
	{
		synchronized(oShare)
		{
		for(int i=0;i<5;i++)
		{
			if(this.getName().equals("Thread1"))
			{
				oShare.szData="这是第1个线程";
				try 
				{
					Thread.sleep((int)Math.random()*50);
				}
				catch (InterruptedException e) {}
				System.out.println(this.getName()+":"+oShare.szData);
			}
			else if(this.getName().equals("Thread2"))
			{
				oShare.szData="这是第二个线程";
				try 
				{
					Thread.sleep((int)Math.random()*50);
				} catch (InterruptedException e) {}
				System.out.println(this.getName()+":"+oShare.szData);
			}
		}
	}
	}
}
public class ThreadSynchronizedMain 
{
	public static void main(String argv[]) 
	{
		ShareData oShare=new ShareData();
		ThreadDemo th1=new ThreadDemo("Thread1",oShare);
		ThreadDemo th2=new ThreadDemo("Thread2",oShare);
		th1.start();
		th2.start();
	}

}

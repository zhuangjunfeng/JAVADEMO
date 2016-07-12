
public class ThreadNoSynchronized 
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

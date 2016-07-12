public class ThreadCommunication 
{
	public static void main(String[] args) 
	{
		Queue q=new Queue();
		Producer p=new Producer(q);
		Consumer c=new Consumer(q);
		c.start();
		p.start();
	}
	
}
class Producer extends Thread
{
	Queue q;
	Producer(Queue q)
	{
		this.q=q;
	}
	public void run()
	{
		for(int i=1;i<5;i++)
		{
			q.put(i);
		}
	}
}
class Consumer extends Thread
{
	Queue q;
	Consumer(Queue q)
	{
		this.q=q;
	}
	public void run()
	{
		while(true)
		{
			q.get();
		}
	}
}
class Queue
{
	int value=0;
	boolean isEmpty=true;
	public synchronized void put(int v)
	{
		if(!isEmpty)
		{
			try 
			{
				System.out.println("�����ߵȴ�");
				wait();
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
		value+=v;
		isEmpty=false;
		System.out.println("�����߹�����������"+v);
		notify();
	}

public synchronized int get()
{
	if(isEmpty)
	{
		try 
		{
			System.out.println("�����ߵȴ�");
			wait();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	value--;
	if(value<1)
	{
		isEmpty=true;
	}
	System.out.println("����������һ����ʣ�ࣺ"+value);
	notify();
	return value;
	}		
}

	
		
	



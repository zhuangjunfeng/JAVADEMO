
public class ChengFaBiao 
{
	public static void main(String[] args) 
	{
		int x;
		System.out.println("99³Ë·¨±í");
		out:for( int i=1;i<10;i++)
		{
				for(int j=1;j<10;)
				{
						if(j<=i)
						{
							x=i*j;
							System.out.print(j+"*"+i+"="+x+" ");
							j=j+1;
						}
				else
					{
					System.out.println("");
					continue out;
					}
				}
		}
	}

}

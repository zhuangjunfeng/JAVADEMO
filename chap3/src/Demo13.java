
public class Demo13 
{
	public static void main(String[] args) 
	{
		out:for(int i=0;i<10;i++)
				for(int j=0;j<10;j++)
					if(j>=i)
					{
						System.out.println();
						continue out;
					}
					else
						System.out.print(" i="+i+" j="+j);
	}

}

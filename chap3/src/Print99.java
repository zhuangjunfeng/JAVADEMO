
public class Print99 
{
	public static void main(String[] args) 
	{
		System.out.println("99³Ë·¨±í");
		System.out.print("  ");
		for(int i=1;i<=9;i++)
			System.out.print(i+" ");
		System.out.println();
		for(int i=1;i<=9;i++)
			{
			System.out.print(i+" ");
			for(int j=1;j<=9;j++)
				if(j<=i)
					System.out.print(i*j+" ");
				System.out.println();
			}
	}

}

import java.io.*;
public class RingDemo 
{
	public static void main(String[] args) 
	{
		String strln="";
		System.out.print("������������������");
		InputStreamReader input=new InputStreamReader(System.in);
		BufferedReader buff = new BufferedReader(input);
		try
		{
			strln=buff.readLine();
		}catch(IOException e)
		{
			System.out.println(e.toString());
		}
		int int1=Integer.parseInt(strln);
		int n=int1;
		System.out.println("����������Ϊ"+n+"������������");
		int intA=1;
		int[][]array=new int[n][n];
		int intB;
		if(n%2!=0)
		{
			intB=n/2+1;
		}else
			intB=n/2;
		for(int i=0;i<intB;i++)
		{
			for(int j=i;j<n-i;j++)
			{
				array[i][j]=intA;
				intA++;
			}
			for(int k=i+1;k<n-i;k++)
			{
				array[k][n-i-1]=intA;
				intA++;
			}
			for(int l=n-i-2;l>=i;l--)
				{
				array[n-i-1][l]=intA;
				intA++;
				}
			for (int m=n-i-2;m>i;m--)
			{
				array[m][i]=intA;
				intA++;
			}
		}
		for (int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}

}

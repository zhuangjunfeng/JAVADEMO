import java.io.IOException;
public class Demo5 
{

	public static void main(String[] args)throws IOException
	{
		char n;
		do
		{System.out.println("1ѡ��1");
		 System.out.println("2ѡ��2");
		 System.out.println("3ѡ��3");
		 System.out.println("4ѡ��4");
		 System.out.println("5ѡ��5");
		 System.out.println("������ѡ��");
		 n=(char)System.in.read();
		 switch(n)
		 {
		 case '1':
			 System.out.println("ѡ��1");
			 break;
		 case '2':
			 System.out.println("ѡ��2");
			 break;
		 case '3':
			 System.out.println("ѡ��3");
			 break;
		 case '4':
			 System.out.println("ѡ��4");
			 break;
		 case '5':
			 System.out.println("ѡ��5");
			 break;
		default:
			System.out.println("����Ƿ�");
			break;
		}

	}while(n<'1'|n>'5');

}
}

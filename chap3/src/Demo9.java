
public class Demo9 {

	public static void main(String[] args) {
		for(int k=0;k<3;k++)
		{
			System.out.println("��"+(++k)+"����ѭ��");
			k--;
			for(int i=0;i<50;i++)
			{
				System.out.println("��ѭ����"+"i="+i);
				if(i==3)
					break;
			}
		}
		System.out.println("ѭ������");
	}

}

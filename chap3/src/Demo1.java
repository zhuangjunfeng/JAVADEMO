
public class Demo1 {
	public static void main(String[] args) {
		int k=87;
		String str=null;
		if(k<0|k>100)
			str="�ɼ����Ϸ�";
		else if(k<60)
			str=("�ɼ����ϸ�");
		else if(k>60&k<75)
			str="�ɼ��ϸ�";
		else if(k>75&k<85)
			str=("�ɼ�����");
		else if(k>85)
			str=("�ɼ�����");
		System.out.println("������"+k+str);
	}

}


public class Demo1 {
	public static void main(String[] args) {
		int k=87;
		String str=null;
		if(k<0|k>100)
			str="成绩不合法";
		else if(k<60)
			str=("成绩不合格");
		else if(k>60&k<75)
			str="成绩合格";
		else if(k>75&k<85)
			str=("成绩良好");
		else if(k>85)
			str=("成绩优秀");
		System.out.println("分数："+k+str);
	}

}

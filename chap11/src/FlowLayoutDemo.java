import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class FlowLayoutDemo 
{	
	public FlowLayoutDemo()
	{
		b1=new Button("����");
		b2=new Button("ȡ��");
		b3=new Button("ȷ��");	
	}
	public static void main(String[] args) 
	{
		FlowLayoutDemo f1=new FlowLayoutDemo();
		f1.show();
	}
	public void show()
	{
		f=new Frame("FlowLayout˳�򲼾�");
		f.setSize(300,240);
		f.setLayout(new FlowLayout(FlowLayout.CENTER,30,20));
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.addWindowListener(new WindowAdapter() 
		{
			public void windowClosing(WindowEvent evt)
			{
				f.setVisible(false);
				f.dispose();
				System.exit(0);
			}
		});
		f.setVisible(true);
	}
	private Frame f;
	private Button b1,b2,b3;
}

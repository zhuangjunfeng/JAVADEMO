import java.awt.*;
import java.awt.event.*;
public class LabelDemo 
{	
	public static void main(String[] args) 
	{
		final Frame f=new Frame();
		f.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
		Label label1=new Label("������ӭ��");
		Label label2=new Label("2008���˻�");
		f.add(label1);
		f.add(label2);
		f.setSize(200, 150);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() 
		{
			public void windowClosing(WindowEvent evt)
			{
				f.setVisible(false);
				f.dispose();
				System.exit(0);
			}
		});
	}

}

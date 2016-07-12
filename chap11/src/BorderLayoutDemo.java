import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class BorderLayoutDemo 
{	
	
	public BorderLayoutDemo()
	{
		b1=new Button("�ϱ�");
		b2=new Button("����");
		b3=new Button("����");
		b4=new Button("�Ҷ�");
		b5=new Button("�м�");
	}
	public static void main(String args[]) 
	{
		BorderLayoutDemo f1=new BorderLayoutDemo();
		f1.show();
	}
	public void show()
	{
		f=new Frame(" BorderLayout������ʾ");
		f.setSize(400,300);
		f.setLayout(new BorderLayout());
		f.add(BorderLayout.NORTH,b1);
		f.add(BorderLayout.SOUTH,b2);
		f.add(BorderLayout.WEST,b3);
		f.add(BorderLayout.EAST,b4);
		f.add(BorderLayout.CENTER,b5);
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
	private Button b1,b2,b3,b4,b5;
}

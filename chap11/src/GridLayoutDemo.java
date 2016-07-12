import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class GridLayoutDemo 
{
	public GridLayoutDemo()
	{
		b1=new Button("[0][0]");
		b2=new Button("[0][1]");
		b3=new Button("[0][2]");
		b4=new Button("[1][0]");
		b5=new Button("[1][1]");
		b6=new Button("[1][2]");
	}
	
	public static void main(String[] args) 
	{
		GridLayoutDemo f1=new GridLayoutDemo();
		f1.show();
	}
	public void show()
	{
		f=new Frame(" GridLayout²¼¾ÖÑÝÊ¾");
		f.setSize(400,300);
		f.setLayout(new GridLayout(2,3));
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(b6);
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
	private Button b1,b2,b3,b4,b5,b6;
}

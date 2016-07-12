import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;;
public class FirstFrame extends Frame
{
	public FirstFrame(String string)
	{
		super(string);
	}
	public static void main(String args[]) 
	{
		FirstFrame f=new FirstFrame("这是第一个Frame");
		f.setSize(300,200);
		f.setBackground(Color.BLUE);
		f.setVisible(true);
		f.addWindowListener(f.new Mywindowadapter());
	}
	class Mywindowadapter extends WindowAdapter
	{
		public void windowClosing(WindowEvent we)
		{
			System.exit(0);
		}
	}
}

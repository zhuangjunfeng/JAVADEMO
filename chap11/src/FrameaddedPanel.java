import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class FrameaddedPanel extends Frame
{
	public FrameaddedPanel(String str)
	{
		super(str);
	}
	public static void main(String[] args) 
	{
		FrameaddedPanel f=new FrameaddedPanel("ÔÚFrameÖÐÌí¼ÓPanel");
		Panel p=new Panel();
		f.setSize(400,300);
		f.setBackground(Color.blue);
		f.setLayout(null);
		p.setSize(200,200);
		p.setBackground(Color.red);
		f.add(p);
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


import java.awt.*;
import java.awt.event.*;
public class CanvasDemo extends Panel
{
	
	public static void main(String[] args)
	{
		new CanvasDemo();
	}
	public CanvasDemo()
	{
		f=new Frame();
		mc=new MyCanvas();
		mc.repaint(0,0,100,100);
		add("Center",mc);
		f.add(mc);
		f.setSize(300, 200);
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
	private MyCanvas mc;
	private Frame f;	
	class MyCanvas extends Canvas
	{
		public void paint(Graphics g)
		{
			g.setColor(Color.red);
			g.drawRect(100, 40, 100, 100);
			g.drawString("Canvas", 100, 50);
		}
	}
}

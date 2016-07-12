import java.awt.*;
import java.awt.event.*;
public class CardLayoutDemo extends Frame implements MouseListener
{
	public CardLayoutDemo(String string)
	{
		super(string);
		init();
	}
	public static void main(String[] args)
	{
		new CardLayoutDemo("CardLayout1");
	}
	public void init()
	{
		setLayout(new BorderLayout());
		setSize(400,300);
		Panel p=new Panel();
		p.setLayout(new FlowLayout());
		first.addMouseListener(this);
		second.addMouseListener(this);
		third.addMouseListener(this);
		p.add(first);
		p.add(second);
		p.add(third);
		add("North",p);
		cards.setLayout(cl);
		cards.add("First card",new Button("第一页内容"));
		cards.add("Second card",new Button("第二页内容"));
		cards.add("Third card",new Button("第三页内容"));
		add("Center",cards);
		addWindowListener(new WindowAdapter() 
		{
			public void windowClosing(WindowEvent evt)
			{
				setVisible(false);
				dispose();
				System.exit(0);
			}
		});
		setVisible(true);
	}
	public void mouseClicked(MouseEvent evt)
	{
		if(evt.getSource()==first)
		{
			cl.first(cards);
		}
		else if(evt.getSource()==second)
		{
			cl.first(cards);
			cl.next(cards);			
		}
		else if(evt.getSource()==third)
		{
			cl.last(cards);
		}
	}
	public void mouseEntered(MouseEvent arg0){}
	public void mouseExited(MouseEvent arg0){}
	public void mousePressed(MouseEvent arg0){}
	public void mouseReleased(MouseEvent arg0){}
	private Button first=new Button("第一页");
	private Button second=new Button("第二页");
	private Button third=new Button("第三页");
	private Panel cards=new Panel();
	private CardLayout cl=new CardLayout();
	
}

import java.awt.*;
import java.awt.event.*;
public class NestedContainer 
{
	public static void main(String[] args) 
	{
		new NestedContainer().show();		
	}
	public void show()
	{
		f= new Frame("����Ƕ��ʹ��");
		bo=new Button("��");
		bc=new Button("�ر�");
		pn=new Panel();
		pn.setBackground(Color.green);
		pn.add(bo);
		pn.add(bc);
		f.add(pn,"North");
		bw=new Button("����");
		f.add(bw,"West");
		p=new Panel();
		p.setBackground(Color.red);
		f.add(p,"Center");
		f.setSize(400,300);
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
	private Panel pn,p;
	private Button bw;
	private Button bo,bc;
}

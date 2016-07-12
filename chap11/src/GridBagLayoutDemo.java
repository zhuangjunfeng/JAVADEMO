import java.awt.*;
import java.awt.event.*;
public class GridBagLayoutDemo extends Frame
{	
	Label l1,l2,l3,l4;
	TextField ft1,ft2,ft3;
	Button btn1,btn2;
	CheckboxGroup cbg;
	Checkbox cb1,cb2,cb3,cb4;
	GridBagLayout gb;
	GridBagConstraints gbc;
	public GridBagLayoutDemo(String title)
	{
		super(title);
		l1=new Label("用户名");
		l2=new Label("密码");
		l3=new Label("重复密码");
		l4=new Label("获取途径");
		ft1=new TextField(20);
		ft2=new TextField(20);
		ft3=new TextField(20);
		gb=new GridBagLayout();
		setLayout(gb);
		gbc=new GridBagConstraints();
		Panel p=new Panel();
		cbg=new CheckboxGroup();
		cb1=new Checkbox("搜索",cbg,false);
		cb2=new Checkbox("广告",cbg,false);
		cb3=new Checkbox("朋友",cbg,false);
		cb4=new Checkbox("其他",cbg,false);
		p.add(cb1);
		p.add(cb2);
		p.add(cb3);
		p.add(cb4);
		btn1=new Button("提交");
		btn2=new Button("重置");
		Panel p1=new Panel();
		p1.add(btn1);
		p1.add(btn2);
		addWindowListener(new WindowAdapter() 
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		gbc.fill=GridBagConstraints.HORIZONTAL;
		addComponent(l1,0,0,1,1);
		addComponent(ft1,0,2,1,1);
		addComponent(l2,1,0,1,1);
		addComponent(ft2,1,2,1,1);
		addComponent(l3,2,0,1,1);
		addComponent(ft3,2,2,1,4);
		addComponent(l4,4,0,1,0);
		addComponent(p,4,2,1,0);
		addComponent(p1,5,2,1,5);
	}
	public void addComponent(Component c,int row,int col,int nrow,int ncol)
	{
		gbc.gridx=col;
		gbc.gridy=row;
		gbc.gridheight=ncol;
		gbc.gridwidth=nrow;
		gb.setConstraints(c,gbc);
		add(c);
	}
	public static void main(String[] args) 
	{
		GridBagLayoutDemo mygb=new GridBagLayoutDemo("网格包布局管理器");
		mygb.setSize(300,200);
		mygb.setVisible(true);
	}

}

import java.awt.*;
import java.awt.event.*;

public class ScrollbarDemo extends Frame {
	public ScrollbarDemo() {
		super();
		init();
	}

	public static void main(String[] args) {
		new ScrollbarDemo();
	}

	Scrollbar slider;
	Label label;

	public void init() {
		setLayout(new GridLayout(1, 3));
		slider = new Scrollbar(Scrollbar.HORIZONTAL, 0, 1, 0, 100);
		label = new Label("0~100");
		label.setBackground(Color.cyan);
		add(label);
		add(slider);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent evt) {
				setVisible(false);
				dispose();
				System.exit(0);
			}
		});
		setSize(300, 50);
		setVisible(true);
	}
}

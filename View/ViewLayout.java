package View;

import javax.swing.*;
import java.awt.*;

public class ViewLayout extends JFrame {
	public ViewLayout() {
		this.init();
	}

	private void init() {

		this.add(new StudentView());
		this.setLayout(new FlowLayout());
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}

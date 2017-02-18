import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorTeacher implements ActionListener {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton yellow = new JButton("Yellow");
	JButton red = new JButton("Red");
	JButton blue = new JButton("Blue");
	JButton green = new JButton("Green");

	public static void main(String[] args) {
		ColorTeacher cT = new ColorTeacher();
		cT.run();

	}

	public void run() {

		frame.add(panel);
		panel.add(yellow);
		panel.add(red);
		panel.add(blue);
		panel.add(green);
		frame.pack();
		frame.setVisible(true);
		panel.setVisible(true);
		yellow.setBackground(Color.YELLOW);
		yellow.setOpaque(true);
		red.setBackground(Color.RED);
		red.setOpaque(true);
		blue.setBackground(Color.BLUE);
		blue.setOpaque(true);
		green.setBackground(Color.GREEN);
		green.setOpaque(true);
		yellow.addActionListener(this);
		red.addActionListener(this);
		blue.addActionListener(this);
		green.addActionListener(this);
		yellow.setVisible(true);
		red.setVisible(true);
		blue.setVisible(true);
		green.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton clicked = (JButton) e.getSource();
		if (clicked == yellow) {
			speak("Yellow");
		} else if (clicked == red) {
			speak("Red");
		} else if (clicked == green) {
			speak("Green");
		} else if (clicked == blue) {
			speak("Blue");
		}

	}

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

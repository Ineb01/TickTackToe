import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TickPanelToe extends JPanel {

	ButtonTackToe[][] buttons;
	boolean player = false;

	public TickPanelToe() {

		Pressed pressed = new Pressed();
		this.setLayout(new GridLayout(3, 3));

		buttons = new ButtonTackToe[3][];
		for (int i = 0; i < 3; i++) {
			buttons[i] = new ButtonTackToe[3];
			for (int j = 0; j < 3; j++) {
				buttons[i][j] = new ButtonTackToe();
				this.add(buttons[i][j]);
				buttons[i][j].addActionListener(pressed);
			}
		}

	}

	public void clear() {

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				buttons[i][j].reset();
			}
		}

	}

	private class Pressed implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (((ButtonTackToe) e.getSource()).set(player)) {
				player = !player;
			}
			boolean winO = false;
			boolean winX = false;
			for (int i = 0; i < 3; i++) {
				if (buttons[i][0].playerO && buttons[i][1].playerO && buttons[i][2].playerO) {
					winO = true;
				}
				if (buttons[0][i].playerO && buttons[1][i].playerO && buttons[2][i].playerO) {
					winO = true;
				}
				if (buttons[i][0].playerX && buttons[i][1].playerX && buttons[i][2].playerX) {
					winX = true;
				}
				if (buttons[0][i].playerX && buttons[1][i].playerX && buttons[2][i].playerX) {
					winX = true;
				}
			}
			if (buttons[0][0].playerX && buttons[1][1].playerX && buttons[2][2].playerX) {
				winX = true;
			}
			if (buttons[0][2].playerX && buttons[1][1].playerX && buttons[2][0].playerX) {
				winX = true;
			}
			if (buttons[0][0].playerO && buttons[1][1].playerO && buttons[2][2].playerO) {
				winO = true;
			}
			if (buttons[0][2].playerO && buttons[1][1].playerO && buttons[2][0].playerO) {
				winO = true;
			}
			if (winX) {
				JOptionPane.showMessageDialog(new JFrame(), "Win X");
				clear();
			}
			if (winO) {
				JOptionPane.showMessageDialog(new JFrame(), "Win O");
				clear();
			}
			
		}

	}

}

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class TickPanelToe extends JPanel{
	JButton[][] buttons;
	boolean player = false;
	public TickPanelToe() {
		Pressed pressed = new Pressed();
		this.setLayout(new GridLayout(3, 3));
		buttons = new JButton[3][];
		for (JButton[] jButtons : buttons) {
			jButtons = new JButton[3];
			for (JButton jButton : jButtons) {
				jButton = new JButton();
				this.add(jButton);
				jButton.addActionListener(pressed);
			}
		}
	}
	public void clear() {
		for (JButton[] jButtons : buttons) {
			jButtons = new JButton[3];
			for (JButton jButton : jButtons) {
				jButton = new JButton();
				jButton.setText("");
			}
		}
	}
	private class Pressed implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(player) {
				((JButton)e.getSource()).setText("X");
			} else {
				((JButton)e.getSource()).setText("O");
			}
			player = !player;
		}
		
	}
}

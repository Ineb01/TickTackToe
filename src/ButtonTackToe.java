import javax.swing.JButton;

public class ButtonTackToe extends JButton {
	
	public boolean playerO = false;
	public boolean playerX = false;

	public boolean set(boolean player) {
		if (!playerO && !playerX) {
			if (player) {
				this.playerO = true;
				this.setText("O");
			} else {
				this.playerX = true;
				this.setText("X");
			}
			return true;
		} else {
			return false;
		}
	}

	public void reset() {
		this.playerO = false;
		this.playerX = false;
		this.setText("");
	}
	
}

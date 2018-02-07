import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TickTackFrame extends JFrame{
	
	public TickTackFrame() {
		
		super("TickTackToe");
		TickPanelToe panel = new TickPanelToe();
		this.add(panel);
		JButton clear = new JButton("Clear");
		clear.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				panel.clear();
				
			}
			
		});
		this.add(clear, BorderLayout.SOUTH);
		
		this.setSize(300,300);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		
		new TickTackFrame();
		
	}
	
}

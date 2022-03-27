package snake;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GameFrame extends JFrame{

	JLabel L1;
	
	GameFrame(){
		
		
//		GamePanel panel = new GamePanel();
//		this.add(panel);
		this.add(new GamePanel());
		this.setTitle("Ohad's Third Game");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //terminate the program if we exit
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	
	}
}

package VaccineSignUp;

import java.awt.*;
import javax.swing.*;

public class scratchPad extends JFrame {
	
	private JButton signMeUp = new JButton("Sign Me Up!");
	
	//constructor
	public scratchPad (String title) {
		super(title);
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		
		JPanel newPanel = new JPanel();
		newPanel.add(signMeUp);
		newPanel.setBorder(BorderFactory.createLineBorder(Color.black));
	}
	
	public static void main(String[] args) {
		
		scratchPad scratch = new scratchPad("latest scratch");
		
	}

}

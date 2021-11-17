package VaccineSignUp;

import java.awt.*;
import javax.swing.*;

public class VaccineSignUp extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * constructor
	 */
	public VaccineSignUp(String title) {
		
		super(title);
		setSize(550, 350);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		/**
		 * Panels
		 */
		JPanel personalInfoPanel = new JPanel();
		personalInfoPanel.setLayout(new GridLayout(10,2));
		
		JPanel conditionsPanel = new JPanel();
		conditionsPanel.setLayout(new GridLayout(14,1));
		
		JPanel bottomPanel = new JPanel(new BorderLayout());
		
		/**
		 * personalInfo Panel
		 */
		personalInfoPanel.setBorder(BorderFactory.createTitledBorder("Personal Info"));
		
		personalInfoPanel.add(new JLabel("First Name: "));
		personalInfoPanel.add(new JTextField(14));
		
		personalInfoPanel.add(new JLabel("Last Name: "));
		personalInfoPanel.add(new JTextField(14));
		
		personalInfoPanel.add(new JLabel("Birth Date: "));
		personalInfoPanel.add(new JTextField(14));
		
		personalInfoPanel.add(new JLabel("Phone #: "));
		personalInfoPanel.add(new JTextField(14));
		
		personalInfoPanel.add(new JLabel("email: "));
		personalInfoPanel.add(new JTextField(14));
		
		personalInfoPanel.add(new JLabel("Address Line 1: "));
		personalInfoPanel.add(new JTextField(14));
		
		personalInfoPanel.add(new JLabel("Address Line 2: "));
		personalInfoPanel.add(new JTextField(14));
		
		personalInfoPanel.add(new JLabel("City: "));
		personalInfoPanel.add(new JTextField(14));
		
		personalInfoPanel.add(new JLabel("State: "));
		personalInfoPanel.add(new JTextField(14));
		
		personalInfoPanel.add(new JLabel("Zip: "));
		personalInfoPanel.add(new JTextField(14));
		
		/**
		 * conditionsPanel
		 */
		conditionsPanel.setBorder(BorderFactory.createTitledBorder("Conditions"));
		
		conditionsPanel.add(new JLabel("Choose all that apply to you:"));
		conditionsPanel.add(new Checkbox("Health Care Personnel"));
		conditionsPanel.add(new Checkbox("Long term care resident"));
		conditionsPanel.add(new Checkbox("Age 65 or older"));
		conditionsPanel.add(new Checkbox("Pre-k to 12 educators"));
		conditionsPanel.add(new Checkbox("Specific underlying conditions"));
		conditionsPanel.add(new Checkbox("Targeted essential workers"));
		conditionsPanel.add(new Checkbox("Rare conditions"));
		conditionsPanel.add(new Checkbox("Age 45-64 with enderlying conditions"));
		conditionsPanel.add(new Checkbox("Age 16-44 with 2+ underlying conditions"));
		conditionsPanel.add(new Checkbox("Essential frontline workers"));
		conditionsPanel.add(new Checkbox("Age 50+ in multi-generational housing"));
		conditionsPanel.add(new Checkbox("Age 16+ with underlying conditions"));
		conditionsPanel.add(new Checkbox("Age 50 or older"));
		
		/**
		 * bottomePanel
		 */
		bottomPanel.add(new JButton("Sign Me Up!"), BorderLayout.SOUTH);
		
		/**
		 * Arranging each Panel
		 */
		add(personalInfoPanel, BorderLayout.WEST);
		add(conditionsPanel, BorderLayout.EAST);
		add(bottomPanel, BorderLayout.SOUTH);
		
		personalInfoPanel.revalidate();
		conditionsPanel.revalidate();
		bottomPanel.revalidate();
	}
	
	/**
	 * main method
	 */
	public static void main(String[] args) {
		
		new VaccineSignUp("Vaccine Signup");
		
	}
}

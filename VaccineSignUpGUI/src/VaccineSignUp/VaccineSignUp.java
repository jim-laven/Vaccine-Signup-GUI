package VaccineSignUp;

import java.awt.*;
import javax.swing.*;

public class VaccineSignUp extends JFrame {
	
	/*
	 * labels for text fields in PersonalInfoPanel
	 */
	private JLabel firstName = new JLabel("First Name: ");
	private JLabel lastName = new JLabel("Last Name: ");
	private JLabel birthDate = new JLabel("Birth Date: ");
	private JLabel phoneNum = new JLabel("Phone #: ");
	private JLabel email = new JLabel("email: ");
	private JLabel address1 = new JLabel("Address Line 1: ");
	private JLabel address2 = new JLabel("Address Line 2: ");
	private JLabel city = new JLabel("City: ");
	private JLabel state = new JLabel("State: ");
	private JLabel zipCode = new JLabel("Zip: ");
	
	/*
	 * text fields for personalInfoPanel
	 */
	private JTextField firstNameText = new JTextField(10);
	private JTextField lastNameText = new JTextField(10);
	private JTextField birthText = new JTextField(10);
	private JTextField phoneText = new JTextField(10);
	private JTextField emailText = new JTextField(10);
	private JTextField address1Text = new JTextField(10);
	private JTextField address2Text = new JTextField(10);
	private JTextField cityText = new JTextField(10);
	private JTextField stateText = new JTextField(10);
	private JTextField zipText = new JTextField(10);
	
	/*
	 * checkboxes for conditionsPanel
	 *
	private JCheckBox checkBox1 = new JCheckBox();
	private JCheckBox checkBox2 = new JCheckBox();
	private JCheckBox checkBox3 = new JCheckBox();
	private JCheckBox checkBox4 = new JCheckBox();
	private JCheckBox checkBox5 = new JCheckBox();
	private JCheckBox checkBox6 = new JCheckBox();
	private JCheckBox checkBox7 = new JCheckBox();
	private JCheckBox checkBox8 = new JCheckBox();
	private JCheckBox checkBox9 = new JCheckBox();
	private JCheckBox checkBox10 = new JCheckBox();
	private JCheckBox checkBox11 = new JCheckBox();
	private JCheckBox checkBox12 = new JCheckBox();
	private JCheckBox checkBox13 = new JCheckBox();
	
	/*
	 * label for conditionsPanel
	 *
	private JLabel healthCarePersonnel = new JLabel("Health Care Personnel");
	private JLabel longTermCareResident = new JLabel("Long term care resident");
	private JLabel age65OrOlder = new JLabel("Age 65 or older");
	private JLabel preKTo12Educators = new JLabel("Pre-k to 12 educators");
	private JLabel specificUnderlyingConditions = new JLabel("Specific underlying conditions");
	private JLabel targetedEssentialWorkers = new JLabel("Targeted essential workers");
	private JLabel rareConditions = new JLabel("Rare conditions");
	private JLabel age4564WithUnderlyingConditions = new JLabel("Age 45-64 with enderlying conditions");
	private JLabel age1644with2PlusUnderlyingConditions = new JLabel("Age 16-44 with 2+ underlying conditions");
	private JLabel essentialFrontlineWorkers = new JLabel("Essential frontline workers");
	private JLabel age50PlusInMultiGenHousing = new JLabel("Age 50+ in multi-generational housing");
	private JLabel age16PlusWithUnderlyingConditions = new JLabel("Age 16+ with underlying conditions");
	private JLabel age50OrOlder = new JLabel("Age 50 or older");
	*/
	
	/*
	 * new conditions checkboxes
	 */
	
	private JButton signMeUp = new JButton("Sign Me Up!");
	
	/*
	 * constructor
	 */
	public VaccineSignUp(String title) {
		
		super(title);
		setSize(800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		
		/*
		 * Panels
		 */
		JPanel personalInfoPanel = new JPanel();
		personalInfoPanel.setLayout(new GridLayout(10,2));
		
		JPanel conditionsPanel = new JPanel();
		conditionsPanel.setLayout(new GridLayout(13,1));
		
		JPanel bottomPanel = new JPanel(new BorderLayout());
		
		/*
		 * personalInfo Panel
		 */
		personalInfoPanel.setBorder(BorderFactory.createTitledBorder("Personal Info"));
		
		
		personalInfoPanel.add(firstName);
		personalInfoPanel.add(firstNameText);
		
		personalInfoPanel.add(lastName);
		personalInfoPanel.add(lastNameText);
		
		personalInfoPanel.add(birthDate);
		personalInfoPanel.add(birthText);
		
		personalInfoPanel.add(phoneNum);
		personalInfoPanel.add(phoneText);
		
		personalInfoPanel.add(email);
		personalInfoPanel.add(emailText);
		
		personalInfoPanel.add(address1);
		personalInfoPanel.add(address1Text);
		
		personalInfoPanel.add(address2);
		personalInfoPanel.add(address2Text);
		
		personalInfoPanel.add(city);
		personalInfoPanel.add(cityText);
		
		personalInfoPanel.add(state);
		personalInfoPanel.add(stateText);
		
		personalInfoPanel.add(zipCode);
		personalInfoPanel.add(zipText);
		
		/*
		 * conditionsPanel
		 */
		conditionsPanel.setBorder(BorderFactory.createTitledBorder("Conditions"));
		
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
		
		
		bottomPanel.add(signMeUp, BorderLayout.SOUTH);
		
		add(personalInfoPanel, BorderLayout.WEST);
		add(conditionsPanel, BorderLayout.EAST);
		add(bottomPanel, BorderLayout.SOUTH);
		
		personalInfoPanel.revalidate();
		conditionsPanel.revalidate();
		bottomPanel.revalidate();
	}
	
	/*
	 * main method
	 */
	public static void main(String[] args) {
		
		VaccineSignUp firstSignUp = new VaccineSignUp("Vaccine Signup");
		
	}
}

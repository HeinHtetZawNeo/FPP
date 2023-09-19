package day8.exercise7_1;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AddressForm extends JFrame {
	private final int TXTBOX_WIDTH = 100;
	private final int TXTBOX_HEIGHT = 30;
	private final int BUTTON_WIDTH = 100;
	private final int BUTTON_HEIGHT = 100;
	// Data Member
	// button
	private JButton btnSubmit;

	// labels
	private JLabel lblName;
	// textfields
	private JTextField txtName;
	private JTextField txtStreet;
	private JTextField txtCity;
	private JTextField txtState;
	private JTextField txtZip;

	public static void main(String[] args) {
		assert false:"hello world";
		AddressForm af = new AddressForm();
		af.setVisible(true);
	}

	public AddressForm() {
		// Name Label
		this.getContentPane().add(new JLabel("Name"));
		// Street label
		this.getContentPane().add(new JLabel("Street"));
		// City label
		this.getContentPane().add(new JLabel("City"));
		// Name Textbox
		txtName = new JTextField();
		txtName.setBounds(0, 0, TXTBOX_WIDTH, TXTBOX_HEIGHT);
		this.getContentPane().add(txtName);

		//Street Textbox
		txtStreet = new JTextField();
		txtStreet.setBounds(50, 100, TXTBOX_WIDTH, TXTBOX_HEIGHT);
		this.getContentPane().add(txtStreet);

		// city textbox
		txtCity = new JTextField();
		txtCity.setBounds(50, 100, TXTBOX_WIDTH, TXTBOX_HEIGHT);
		this.getContentPane().add(txtCity);

		// State Label
		this.getContentPane().add(new JLabel("State"));
		// Zip label
		this.getContentPane().add(new JLabel("Zip"));
		// blank
		this.getContentPane().add(new JLabel());

		txtState = new JTextField();
		txtState.setBounds(50, 100, TXTBOX_WIDTH, TXTBOX_HEIGHT);
		this.getContentPane().add(txtState);

		txtZip = new JTextField();
		txtZip.setBounds(50, 100, 200, 30);
		this.getContentPane().add(txtZip);
		this.getContentPane().add(new JLabel());

		this.getContentPane().add(new JLabel());

		btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {

			/*
			 * 	Dave Smith
				123 North B
				Fairfield, Iowa 52556
			 */
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(e.getSource() instanceof JButton);
				System.out.print(((JButton)e.getSource()).getText().equals("Submit"));
				System.out.println(txtName.getText());
				System.out.println(txtStreet.getText());
				System.out.printf("%s, %s %s",txtCity.getText(),txtState.getText(),txtZip.getText());
			}
		});
		this.getContentPane().add(btnSubmit);

		this.getContentPane().add(new JLabel());

		this.setSize(900, 400);
		this.setResizable(true);
		this.setTitle("Address Form");
		this.setLocation(200, 200);
		this.setLayout(new GridLayout(5, 3));

	}
}

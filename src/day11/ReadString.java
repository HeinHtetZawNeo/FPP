package day11;

import java.awt.event.ActionEvent;
import java.util.LinkedList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ReadString extends JFrame{
	private final int WINDOW_WIDTH = 430;
	private final int WINDOW_HEIGHT = 280;
	
	private final int BUTTON_WIDTH = 100;
	private final int BUTTON_HEIGHT = 50;
	
	private final int LABEL_WIDTH = 100;
	private final int LABEL_HEIGHT = 50;
	
	private final int TEXTBOX_WIDTH = 300;
	private final int TXTBOX_HEIGHT = 50;
	
	private JLabel lblStringA;
	private JLabel lblStringB;
	private JLabel lblStringC;
	
	private JTextField txtStringA;
	private JTextField txtStringB;
	private JTextField txtStringC;
	
	private JButton btnSave;
	private JButton btnCancel;
	
	public ReadString() {
		this.setTitle("Day 11 - Read A StringB");
		this.setBounds(100, 100, WINDOW_WIDTH, WINDOW_HEIGHT);
		this.setDefaultCloseOperation(this.HIDE_ON_CLOSE);
		this.setLayout(null);
		
		//Label
		lblStringA = new JLabel();
		lblStringA.setBounds(10,10,LABEL_WIDTH,LABEL_HEIGHT);
		lblStringA.setText("String A");
		this.add(lblStringA);
		
		lblStringB = new JLabel();
		lblStringB.setBounds(10,70,LABEL_WIDTH,LABEL_HEIGHT);
		lblStringB.setText("String B");
		this.add(lblStringB);
		
		lblStringC = new JLabel();
		lblStringC.setBounds(10,130,LABEL_WIDTH,LABEL_HEIGHT);
		lblStringC.setText("String C");
		this.add(lblStringC);
		
		//textbox
		txtStringA = new JTextField();
		txtStringA.setBounds(120, 10, TEXTBOX_WIDTH, TXTBOX_HEIGHT);
		this.add(txtStringA);
		
		txtStringB = new JTextField();
		txtStringB.setBounds(120, 70, TEXTBOX_WIDTH, TXTBOX_HEIGHT);
		txtStringB.addActionListener(e->{
			System.out.println("I am here");
		});
		this.add(txtStringB);
		
		txtStringC = new JTextField();
		txtStringC.setBounds(120, 130, TEXTBOX_WIDTH, TXTBOX_HEIGHT);
		this.add(txtStringC);
		
		//button
		btnSave = new JButton();
		btnSave.setBounds(70, 190, BUTTON_WIDTH, BUTTON_HEIGHT);
		btnSave.setText("Save");
		btnSave.addActionListener(e -> {
			btnSaveActionListener(e);
		});
		this.add(btnSave);
		
		btnCancel = new JButton();
		btnCancel.setBounds(230, 190, BUTTON_WIDTH, BUTTON_HEIGHT);
		btnCancel.setText("Cancel");
		btnCancel.addActionListener(e -> {
			btnCancelActionListener();
		});
		this.add(btnCancel);
		this.setVisible(true);
	}
	private void btnSaveActionListener(ActionEvent e) {
		if(!this.txtStringA.getText().equals("")) {
			String temp = this.txtStringA.getText();
			char[] charList = temp.toCharArray();
			LinkedList<Character> lista = MainMenu.state.getListA();
			for(char c:charList) {
				lista.add(c);
			}
		}
		if(!this.txtStringB.getText().equals("")) {
			String temp = this.txtStringB.getText();
			char[] charList = temp.toCharArray();
			LinkedList<Character> listb = MainMenu.state.getListB();
			for(char c:charList) {
				listb.add(c);
			}
		}
		if(!this.txtStringC.getText().equals("")) {
			String temp = this.txtStringC.getText();
			char[] charList = temp.toCharArray();
			LinkedList<Character> listc = MainMenu.state.getListC();
			for(char c:charList) {
				listc.add(c);
			}
		}
		this.setVisible(false);
	}
	private void btnCancelActionListener() {
		super.dispose();
	}
}

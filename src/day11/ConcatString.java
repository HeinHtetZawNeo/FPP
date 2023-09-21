package day11;

import java.awt.event.KeyEvent;
import java.util.LinkedList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class ConcatString extends JFrame{
	private final int WINDOW_WIDTH = 450;
	private final int WINDOW_HEIGHT = 220;
	
	private final int BUTTON_WIDTH = 100;
	private final int BUTTON_HEIGHT = 50;
	
	private final int LABEL_WIDTH = 100;
	private final int LABEL_HEIGHT = 50;
	
	private final int RADIOBUTTON_WIDTH = 100;
	private final int RADIOBUTTON_HEIGHT = 50;
	
	private JLabel lblFirstString;
	private JLabel lblSecondString;
	
	private ButtonGroup Group1;
	private ButtonGroup Group2;
	
	private JRadioButton Rdo_Group1StringA;
	private JRadioButton Rdo_Group1StringB;
	private JRadioButton Rdo_Group1StringC;
	private JRadioButton Rdo_Group2StringA;
	private JRadioButton Rdo_Group2StringB;
	private JRadioButton Rdo_Group2StringC;
	
	private JButton btnOK;
	private JButton btnCancel;
	
	private LinkedList<Character> gp1;
	private LinkedList<Character> gp2;
	
	public ConcatString() {
		this.setTitle("Day 11 - Concat String");
		this.setBounds(100, 100, WINDOW_WIDTH, WINDOW_HEIGHT);
		this.setDefaultCloseOperation(this.HIDE_ON_CLOSE);
		this.setLayout(null);
		
		lblFirstString = new JLabel();
		lblFirstString.setText("First String");
		lblFirstString.setBounds(10,10,LABEL_WIDTH,LABEL_HEIGHT);
		this.add(lblFirstString);
		
		lblSecondString = new JLabel();
		lblSecondString.setText("Second String");
		lblSecondString.setBounds(10,70,LABEL_WIDTH,LABEL_HEIGHT);
		this.add(lblSecondString);
		
		Group1 = new ButtonGroup();
		
		gp1 = MainMenu.state.getListA();
		Rdo_Group1StringA = new JRadioButton("String A");
		Rdo_Group1StringA.setBounds(120, 10, RADIOBUTTON_WIDTH, RADIOBUTTON_HEIGHT);
		Rdo_Group1StringA.setSelected(true);
		Rdo_Group1StringA.addActionListener(e->{
			gp1 = MainMenu.state.getListA();
		});
		Group1.add(Rdo_Group1StringA);
		this.add(Rdo_Group1StringA);
		
		Rdo_Group1StringB = new JRadioButton("String B");
		Rdo_Group1StringB.setBounds(230, 10, RADIOBUTTON_WIDTH, RADIOBUTTON_HEIGHT);
		Rdo_Group1StringB.addActionListener(e->{
			gp1 = MainMenu.state.getListB();
		});
		Group1.add(Rdo_Group1StringB);
		this.add(Rdo_Group1StringB);
		
		Rdo_Group1StringC = new JRadioButton("String C");
		Rdo_Group1StringC.setBounds(340, 10, RADIOBUTTON_WIDTH, RADIOBUTTON_HEIGHT);
		Rdo_Group1StringC.addActionListener(e->{
			gp1 = MainMenu.state.getListC();
		});
		Group1.add(Rdo_Group1StringC);
		this.add(Rdo_Group1StringC);
		
		//gp2
		Group2 = new ButtonGroup();
		
		Rdo_Group2StringA = new JRadioButton("String A");
		Rdo_Group2StringA.setBounds(120, 70, RADIOBUTTON_WIDTH, RADIOBUTTON_HEIGHT);
		Rdo_Group2StringA.setSelected(true);
		Rdo_Group2StringA.addActionListener(e->{
			gp2 = MainMenu.state.getListA();
		});
		Group2.add(Rdo_Group2StringA);
		this.add(Rdo_Group2StringA);
		
		Rdo_Group2StringB = new JRadioButton("String B");
		Rdo_Group2StringB.setBounds(230, 70, RADIOBUTTON_WIDTH, RADIOBUTTON_HEIGHT);
		Rdo_Group2StringB.addActionListener(e->{
			gp2 = MainMenu.state.getListB();
		});
		Group2.add(Rdo_Group2StringB);
		this.add(Rdo_Group2StringB);
		
		Rdo_Group2StringC = new JRadioButton("String C");
		Rdo_Group2StringC.setBounds(340, 70, RADIOBUTTON_WIDTH, RADIOBUTTON_HEIGHT);
		Rdo_Group2StringC.addActionListener(e->{
			gp2 = MainMenu.state.getListC();
		});
		Group2.add(Rdo_Group2StringC);
		this.add(Rdo_Group2StringC);
		
		btnOK = new JButton("OK");
		btnOK.setBounds(70, 130, BUTTON_WIDTH, BUTTON_HEIGHT);
		btnOK.addActionListener(e->{
			
			concatString(gp1,gp2);
			this.dispose();
		});
		this.add(btnOK);
		
		btnCancel = new JButton("Cancel");
		btnCancel.setBounds(230, 130, BUTTON_WIDTH, BUTTON_HEIGHT);
		btnCancel.addActionListener(e->{
			super.dispose();
		});
		this.add(btnCancel);
		
		this.setVisible(true);
	}

	private void concatString(LinkedList<Character> gp1, LinkedList<Character> gp2) {
		for(Character c:gp2) {
			gp1.add(c);
		}
	}
	
}

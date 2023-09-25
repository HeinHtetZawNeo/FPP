package day11;

import java.util.Iterator;
import java.util.LinkedList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class EqualUI extends JFrame{
	private final int WINDOW_WIDTH = 450;
	private final int WINDOW_HEIGHT = 280;
	
	private final int BUTTON_WIDTH = 100;
	private final int BUTTON_HEIGHT = 50;
	
	private final int LABEL_WIDTH = 100;
	private final int LABEL_HEIGHT = 50;
	
	private final int RADIOBUTTON_WIDTH = 100;
	private final int RADIOBUTTON_HEIGHT = 50;
	
	private JTextField txtResult;
	
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
	
	public EqualUI() {
		this.setTitle("Day 11 - Equal String");
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
		
		Rdo_Group1StringA = new JRadioButton("String A");
		Rdo_Group1StringA.setBounds(120, 10, RADIOBUTTON_WIDTH, RADIOBUTTON_HEIGHT);
		Rdo_Group1StringA.setSelected(true);
		Rdo_Group1StringA.addActionListener(e->{
			gp1 = MainMenu.state.getListA();
			isEqual();
		});
		Group1.add(Rdo_Group1StringA);
		this.add(Rdo_Group1StringA);
		
		Rdo_Group1StringB = new JRadioButton("String B");
		Rdo_Group1StringB.setBounds(230, 10, RADIOBUTTON_WIDTH, RADIOBUTTON_HEIGHT);
		Rdo_Group1StringB.addActionListener(e->{
			gp1 = MainMenu.state.getListB();
			isEqual();
		});
		Group1.add(Rdo_Group1StringB);
		this.add(Rdo_Group1StringB);
		
		Rdo_Group1StringC = new JRadioButton("String C");
		Rdo_Group1StringC.setBounds(340, 10, RADIOBUTTON_WIDTH, RADIOBUTTON_HEIGHT);
		Rdo_Group1StringC.addActionListener(e->{
			gp1 = MainMenu.state.getListC();
			isEqual();
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
			isEqual();
		});
		Group2.add(Rdo_Group2StringA);
		this.add(Rdo_Group2StringA);
		
		Rdo_Group2StringB = new JRadioButton("String B");
		Rdo_Group2StringB.setBounds(230, 70, RADIOBUTTON_WIDTH, RADIOBUTTON_HEIGHT);
		Rdo_Group2StringB.addActionListener(e->{
			gp2 = MainMenu.state.getListB();
			isEqual();
		});
		Group2.add(Rdo_Group2StringB);
		this.add(Rdo_Group2StringB);
		
		Rdo_Group2StringC = new JRadioButton("String C");
		Rdo_Group2StringC.setBounds(340, 70, RADIOBUTTON_WIDTH, RADIOBUTTON_HEIGHT);
		Rdo_Group2StringC.addActionListener(e->{
			gp2 = MainMenu.state.getListC();
			isEqual();
		});
		Group2.add(Rdo_Group2StringC);
		this.add(Rdo_Group2StringC);
		
		//Result
		txtResult = new JTextField();
		txtResult.setEnabled(false);
		
		txtResult.setBounds(10, 130, 430, LABEL_HEIGHT);
		this.add(txtResult);
		
		btnOK = new JButton("Equal?");
		btnOK.setBounds(70, 190, BUTTON_WIDTH, BUTTON_HEIGHT);
		btnOK.addActionListener(e->{
			isEqual();
		});
		this.add(btnOK);
		
		btnCancel = new JButton("Close");
		btnCancel.setBounds(230, 190, BUTTON_WIDTH, BUTTON_HEIGHT);
		btnCancel.addActionListener(e->{
			super.dispose();
		});
		this.add(btnCancel);
		
		this.setVisible(true);
		
		gp1 = MainMenu.state.getListA();
		gp2 = MainMenu.state.getListA();
		isEqual();
	}
	private void isEqual() {
		if(Len(gp1) != Len(gp2)){
			txtResult.setText("They are not Equal");
			return;
		}
		
		Iterator<Character> myIteratorA = gp1.iterator();
		Iterator<Character> myIteratorB = gp2.iterator();
		
		
		while(myIteratorA.hasNext() && myIteratorB.hasNext()) {
			if(!myIteratorA.next().equals(myIteratorB.next())){
				txtResult.setText("They are not Equal");
				return;
			}
		}
		txtResult.setText("They are Equal");
	}
	
	private static int Len(LinkedList<Character> list) {
		int count =0;
		Iterator<Character> myIterator = list.iterator();
		while(myIterator.hasNext()) {
			count++;
			myIterator.next();
		}
		return count;
	}
}

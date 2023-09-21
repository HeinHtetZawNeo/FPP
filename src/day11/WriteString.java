package day11;

import java.util.Iterator;
import java.util.LinkedList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class WriteString extends JFrame{
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
	
	private JButton btnOK;
	
	public WriteString() {
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
		txtStringA.setText(printString(MainMenu.state.getListA()));
		txtStringA.setEditable(false);
		this.add(txtStringA);
		
		txtStringB = new JTextField();
		txtStringB.setBounds(120, 70, TEXTBOX_WIDTH, TXTBOX_HEIGHT);
		txtStringB.setEditable(false);
		txtStringB.setText(printString(MainMenu.state.getListB()));
		this.add(txtStringB);
		
		txtStringC = new JTextField();
		txtStringC.setBounds(120, 130, TEXTBOX_WIDTH, TXTBOX_HEIGHT);
		txtStringC.setEditable(false);
		txtStringC.setText(printString(MainMenu.state.getListC()));
		this.add(txtStringC);
		
		//button
		btnOK = new JButton();
		btnOK.setBounds(70, 190, BUTTON_WIDTH, BUTTON_HEIGHT);
		btnOK.setText("OK");
		btnOK.addActionListener(e -> {
			super.dispose();
		});
		this.add(btnOK);
		
		
		this.setVisible(true);
	}

	private String printString(LinkedList<Character> charList) {
		String result = "";
		Iterator<Character> it = charList.iterator();
		if(it.hasNext())
			result = it.next()+"";
		while(it.hasNext()) {
			result += ","+it.next();
		}
		return result;
	}
}

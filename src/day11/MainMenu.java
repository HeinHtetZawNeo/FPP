package day11;

import java.util.LinkedList;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainMenu extends JFrame {
	private final int WINDOW_WIDTH = 230;
	private final int WINDOW_HEIGHT = 280;

	private final int BUTTON_WIDTH = 100;
	private final int BUTTON_HEIGHT = 50;

	public static UIState state;
	public MainMenu() {
		state = new UIState();
		// Jframe
		this.setTitle("Day 11");

		this.setBounds(100, 100, WINDOW_WIDTH, WINDOW_HEIGHT);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setLayout(null);

		// JButton
		JButton btnReadAString = new JButton();
		btnReadAString.setBounds(10, 10, BUTTON_WIDTH, BUTTON_HEIGHT);
		btnReadAString.setText("Read A String");
		btnReadAString.addActionListener(e -> {
			new ReadString();
		});
		this.add(btnReadAString);

		JButton btnPrintAString = new JButton();
		btnPrintAString.setBounds(120, 10, BUTTON_WIDTH, BUTTON_HEIGHT);
		btnPrintAString.setText("Print A String");
		btnPrintAString.addActionListener(e -> {
			new WriteString();
		});
		this.add(btnPrintAString);

		JButton btnConcatenateAString = new JButton();
		btnConcatenateAString.setBounds(10, 70, BUTTON_WIDTH, BUTTON_HEIGHT);
		btnConcatenateAString.setText("Concatenate");
		btnConcatenateAString.addActionListener(e->{
			new ConcatString();
		});		
		this.add(btnConcatenateAString);

		JButton btnEqual = new JButton();
		btnEqual.setBounds(120, 70, BUTTON_WIDTH, BUTTON_HEIGHT);
		btnEqual.setText("Equal");
		btnEqual.addActionListener(e->{
			new EqualUI();
		});
		this.add(btnEqual);

		JButton btnInsert = new JButton();
		btnInsert.setBounds(10, 130, BUTTON_WIDTH, BUTTON_HEIGHT);
		btnInsert.setText("Insert");
		this.add(btnInsert);

		JButton btnDelete = new JButton();
		btnDelete.setBounds(120, 130, BUTTON_WIDTH, BUTTON_HEIGHT);
		btnDelete.setText("Delete");
		this.add(btnDelete);

		JButton btnSubString = new JButton();
		btnSubString.setBounds(10, 190, BUTTON_WIDTH, BUTTON_HEIGHT);
		btnSubString.setText("SubString");
		this.add(btnSubString);

		this.setVisible(true);
	}

	public static void main(String[] args) {
		new MainMenu();
	}
}

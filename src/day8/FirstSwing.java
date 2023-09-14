package day8;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class FirstSwing extends JFrame{

	private final static int WIDTH=400;
	private final static int HEIGHT=400;
	private final static int ORGIN_X=200;
	private final static int ORGIN_Y=200;
	public static void main(String[] args) {
		
		FirstSwing f = new FirstSwing(); 
				
		JButton b = new JButton("Click Me");
		
		b.setBounds(130,100,100, 40);
		
		f.add(b);
		
		f.setTitle("Hello World");
		f.setSize(WIDTH,HEIGHT);
		f.setLocation(ORGIN_X,ORGIN_Y);
		f.setLayout(null);
		f.setVisible(true);
		
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Hi hi");
			}
		});
	}
	
	private class ButtonHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton clickedButton = (JButton)e.getSource();
			
			JFrame f = (JFrame) clickedButton.getRootPane().getParent();
		}
		
	}

}

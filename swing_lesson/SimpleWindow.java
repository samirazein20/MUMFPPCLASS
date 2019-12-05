package swing_lesson;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class SimpleWindow extends JFrame{
	private JButton btn;
	
	public SimpleWindow() {
		
		JPanel panel = new JPanel();
		JPanel panels = new JPanel();
		btn = new JButton("Click Me");
		//add button to a panel
		//default is FlowLayout
		panel.add(btn);
		JTextArea textArea = new JTextArea();
		panels.add(textArea);
		
		panel.setBackground(Color.PINK);
		add(panel);
		
		panels.setBackground(Color.RED);
		add(panels);
		
		//add panel to frame
		//default is borderLayout
		
		add(BorderLayout.EAST, panel);
		add(BorderLayout.WEST, panels);
		
		//register with the button
		btn.addActionListener(new MyButtonListener());
		
		setTitle("Hello World");
		setVisible(true);
		setSize(500,500);
	}
	
	public class MyButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			btn.setText("I've been clicked");
			
		}	

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new SimpleWindow();

	}

}

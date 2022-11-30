/*
* This Class generates GUI functionality
*/
  
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUIConverter {
	
	//Exit event handler
	private static class ExitHandler implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	}
	
	//TemperatureConverter event handler
	private static class TemperatureHandler implements ActionListener {
		
		//Creates instance of TemperatureConverter object 
		double input;
		TemperatureConverter a1 = new TemperatureConverter(input);
		
		private JFrame window = null;
		
		//setup frame to be used in JOptionPane
		public TemperatureHandler(JFrame frame) {
			window = frame;
		}
		 
		public void actionPerformed(ActionEvent e) {
			
			//Collect response and converts to double and passes input to convert() method
			String response;
			response = JOptionPane.showInputDialog(window, "Input fahrenheit temperature to convert");
			double input = Double.parseDouble(response);
			a1.convert(input);
			JOptionPane.showMessageDialog(window, input + " F equals " + String.format("%.2f", a1.convert(input)) + " C");
		}
	}
	
	//DistanceConverter event handler
	private static class DistanceHandler implements ActionListener {
		
		//creates instance of DistanceConverter object
		double input;
		DistanceConverter b1 = new DistanceConverter(input);
		
		private JFrame window = null;
		
		//setup frame to be used in JOptionPane
		public DistanceHandler(JFrame frame) {
			window = frame;
		}
		
		public void actionPerformed(ActionEvent e) {	
			
			//Collect response and converts to double and passes input to convert() method
			String response;
			response = JOptionPane.showInputDialog(window, "Input miles distance to convert");
			double input = Double.parseDouble(response);
			b1.convert(input);
			JOptionPane.showMessageDialog(window, + input + " miles equals " + String.format("%.2f", b1.convert(input)) + " KMs");
		}
	}

	
	public static void main(String[] args) {
		
		//Creates Jbuttons instances
		JButton exitButton = new JButton("Exit");
		JButton tempButton = new JButton("   Temperature Converter   ");
		JButton disButton = new JButton("      Distance Converter      ");
		
		//Creates frame
		JFrame window = new JFrame("Welcome to Converter");
		
		//Add buttons to panel
		JPanel content = new JPanel();
		content.setLayout(new BorderLayout());
		
		//Create listeners and add buttons
		ExitHandler exitListener = new ExitHandler();
		exitButton.addActionListener(exitListener);
		TemperatureHandler tempListener = new TemperatureHandler(window);
		tempButton.addActionListener(tempListener);
		DistanceHandler disListener = new DistanceHandler(window);
		disButton.addActionListener(disListener);
		
		//Adds buttons to panel widget
		content.add(exitButton, BorderLayout.AFTER_LAST_LINE);
		content.add(tempButton, BorderLayout.LINE_END);
		content.add(disButton, BorderLayout.LINE_START);
		
		//Adds content created
		window.setContentPane(content);
		
		//Set size and location
		window.setSize(375,200);
		window.setLocation(300,400);
		window.setVisible(true);
	}
	
}

package GUI;

import java.io.*;
import java.net.*;
import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import Tests.*;


public class ButtonPanel extends JPanel implements ActionListener{

	public static final int HEIGHT = 80;
	public static final int WIDTH = 600;
	private JButton greenButton;
	private JButton blueButton;
	private JButton redButton;
	
	public ButtonPanel() {
		greenButton = new JButton("Tracerout");
		blueButton = new JButton("Connect: google.com");
		redButton = new JButton("Port test");
//		redButton = new JButton("Socket test");
		
		greenButton.addActionListener(this);
		blueButton.addActionListener(this);
		redButton.addActionListener(this);
		
		setLayout(new FlowLayout());
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		add(greenButton);
		add(blueButton);
		add(redButton);
	}
		
		public void actionPerformed(ActionEvent ev) {
			
			Object source = ev.getSource();
		SwingWorker<Void, Void> worker = new SwingWorker<Void, Void>(){
			
			@Override
			protected Void doInBackground() throws Exception{
				
			
		
			if(source == greenButton){
				String ad= "amazon.com";
				Traceroute Test2 = new Traceroute(ad);
				Test2.execute();
			}
			

			else if(source == blueButton){
				new GoogleTest();
			}


			else if(source == redButton){
				SocketTest Test3 = new SocketTest();
				Test3.PortCheck();
			//	int port_=Test3.PortCheck();
				//Test3.ConnectionCheck(port_);
			}

			
			return null;
			}
		};
		worker.execute();
	}
}

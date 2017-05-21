package GUI;
import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import GUI.ButtonPanel;
import GUI.TextPanel;

public class ActionFrame extends JFrame {
	public static final int HEIGHT = 600;
	public static final int WIDTH = 500;
	public ActionFrame() {
		
		
		super("Network diagnstic tests");

		
		JPanel buttonPanel = new ButtonPanel();
		JPanel textPanel =new TextPanel();
		
		

		setLocation(200,200);
		setResizable(false);
		
		add(buttonPanel, BorderLayout.PAGE_END);
		add(textPanel, BorderLayout.PAGE_START);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}
}


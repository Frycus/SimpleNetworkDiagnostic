package Tests;

import java.io.*;
import java.net.*;
import java.util.Scanner;

import GUI.TextPanel;

public class Traceroute {

	private String address_;
	public Traceroute(String addr){
		addr=address_;
	}
	
	  public void execute(){

		
	    try {
			InetAddress address = InetAddress.getByName("amazon.com");
	        Process p = Runtime.getRuntime().exec("tracert " + address.getHostAddress());
	        BufferedReader inputStream = new BufferedReader(new InputStreamReader(p.getInputStream()));
	        
	        TextPanel.textArea.setText("");
			String s;
			
	        while ((s = inputStream.readLine()) != null) {
	        	TextPanel.textArea.append(s+"\n");
	        }
	    }

	     catch (Exception e) {
	        e.printStackTrace();
	    }
	}

	}
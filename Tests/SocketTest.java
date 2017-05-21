package Tests;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import GUI.TextPanel;

public class SocketTest {
	String hostname;
	private int port;

	public SocketTest() {
		hostname = "localhost";
		port = 1;
	}

	public int PortCheck() {
		Socket s = null;

		// String hostname = new String("localhost");

		boolean flag = false;
		for (port = 1; port < 5000; port++) {
			try {
				TextPanel.textArea.setText("");
				TextPanel.textArea.append("Trying port " + String.valueOf(port)
						+ " on " + hostname + "... " + "\n");
				s = new Socket(hostname, port);
				TextPanel.textArea
						.append("Port " +  String.valueOf(port) + " is open." + "\n");
				flag = true;
			} catch (Exception e) {
				TextPanel.textArea.append("Port is closed." + "\n");

			}

			try {
				s.close();
				TextPanel.textArea.append("Disconnected!" + "\n");
			} catch (Exception e) {
				e.printStackTrace();
			}
			if (flag == true) {
				break;

			}

		}
		return port;
	}

/*	public void ConnectionCheck(int port) {
		Socket s = null;
		BufferedReader in;
		PrintWriter out;
		int in1;
		try {
			TextPanel.textArea.append("Connectiong to port " + String.valueOf(port)
					+ " on " + hostname + "... " + "\n");
			s = new Socket("localhost", port);
		} catch (Exception e) {
			TextPanel.textArea.append("Connection is down." + "\n");
		}
		try {
			s.getOutputStream().write((byte) '\n');
			in = new BufferedReader(new InputStreamReader(s.getInputStream()));
			out = new PrintWriter(s.getOutputStream(),true);
			String line;
			while ((line = in.readLine()) != null){
			TextPanel.textArea.append(line+"\n");
			  }
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			s.close();
			TextPanel.textArea.append("Disconnected!" + "\n");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}*/
}

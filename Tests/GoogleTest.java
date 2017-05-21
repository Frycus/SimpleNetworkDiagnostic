package Tests;

import java.io.*;
import java.net.*;

import GUI.TextPanel;

public class GoogleTest {

	public GoogleTest() {

		try {
			try {
				URL url = new URL("http://www.google.com");
				TextPanel.textArea.setText(url.getHost());
				HttpURLConnection con = (HttpURLConnection) url.openConnection();
				con.connect();
				if (con.getResponseCode() == 200) {
					TextPanel.textArea.setText("Connection with google.com established! Internet works");
				}

			} catch (Exception exception) {
				TextPanel.textArea.setText("No connection with Internet or google.com is down");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

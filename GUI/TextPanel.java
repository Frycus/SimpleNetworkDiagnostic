package GUI;

import java.awt.*;
import javax.swing.*;

public class TextPanel extends JPanel{

    public static JTextArea textArea;
    
	public static final int HEIGHT = 200;
	public static final int WIDTH = 400;
	
	

	
	public TextPanel()
	{
		super(new FlowLayout());
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
        
        textArea = new JTextArea(10, 50);
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        

        add(scrollPane);

	}
}

package ui;

import javax.swing.*;

public class DrawingApp extends JFrame{
	
	private final DrawingMenuBar m_drawingMenuBar;
	
	public DrawingApp()
	{
		super("Drawing application");
		
		m_drawingMenuBar = new DrawingMenuBar(this);
		setJMenuBar(m_drawingMenuBar);
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		pack();
		setVisible(true);
	}
	
}

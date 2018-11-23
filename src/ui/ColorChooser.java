package ui;

import javax.swing.JButton;

public class ColorChooser extends JButton{
	private final DrawingApp m_drawingApp;
	
	public ColorChooser(DrawingApp drawingApp)
	{
		super("Choose color");
		m_drawingApp = drawingApp;
	}
}

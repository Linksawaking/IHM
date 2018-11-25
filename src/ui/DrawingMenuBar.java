package ui;

import javax.swing.JMenuBar;

public class DrawingMenuBar extends JMenuBar{
	private FileMenu m_fileMenu;
	
	public DrawingMenuBar(DrawingApp drawingApp)
	{
		super();
		
		add(m_fileMenu = new FileMenu(drawingApp));
	}
	
}

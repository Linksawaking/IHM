package ui;

import javax.swing.JMenu;

public class FileMenu extends JMenu{
	
	private final QuitMenuItem m_quitMenuItem;
	
	public FileMenu(DrawingApp drawingApp)
	{
		super("File");
		
		add(m_quitMenuItem = new QuitMenuItem(drawingApp));
	}

}

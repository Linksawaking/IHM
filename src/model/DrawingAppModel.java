package model;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public final class DrawingAppModel {
	private final ArrayList<Segment> m_editedSegments;
	private Color m_currentColor;
	private Segment m_currentSegment;
	private Segment m_selectedSegment;
	private Boolean m_modified;
	
	public DrawingAppModel()
	{
		m_editedSegments = new ArrayList<Segment>();
		m_currentColor = Color.BLACK;
		m_currentSegment = null;
		m_selectedSegment = null;
		m_modified = false;
		
		m_editedSegments.add(new Segment(10, 10, 100, 100, Color.RED));
		m_currentSegment = m_editedSegments.get(0);
	}

	public Color getCurrentColor() {
		return m_currentColor;
	}

	public final void paintSegments(Graphics g) {
		for(Segment s : m_editedSegments)
			s.paintNormal(g);
		
		if(m_selectedSegment != null)
			m_selectedSegment.paintLarger(g);
		
		if(m_currentSegment != null)
			m_currentSegment.paintDashed(g);
		
	}
	
}

package model;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

public class Segment extends Line2D.Float{
	private final Color m_color;
	
	private final static float[] dash = {4.0f};
	private final static BasicStroke usualStroke;
	private final static BasicStroke largerStroke;
	private final static BasicStroke dashStroke;
	
	static
	{
		usualStroke = new BasicStroke();
		largerStroke = new BasicStroke(3.0f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_MITER);
		dashStroke = new BasicStroke(1.0f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_MITER, 10.0f, dash, 0.0f);
	}
	
	public Segment(float x1, float y1, float x2, float y2, Color color)
	{
		super(x1, y1, x2, y2);
		m_color=color;
	}
	
	public final void paintDashed(Graphics g)
	{
		Graphics2D g2d = (Graphics2D)g;
		
		g2d.setColor(m_color);
		
		g2d.setStroke(dashStroke);
		g2d.draw(this);
		g2d.setStroke(usualStroke);
	}
	
	public final void paintLarger(Graphics g)
	{
		Graphics2D g2d = (Graphics2D)g;
		
		g2d.setColor(m_color);
		
		g2d.setStroke(largerStroke);
		g2d.draw(this);
		g2d.setStroke(usualStroke);
	}
	
	public final void paintNormal(Graphics g)
	{
		Graphics2D g2d = (Graphics2D)g;
		
		g2d.setColor(m_color);
		
		g2d.draw(this);
	}
	
}

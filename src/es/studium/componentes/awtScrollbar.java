package es.studium.componentes;

import java.awt.*;

public class awtScrollbar extends Frame
{
	private static final long serialVersionUID = 1L;
	Scrollbar sVertical = new Scrollbar(Scrollbar.VERTICAL);
	Scrollbar sHorizontal= new Scrollbar(Scrollbar.HORIZONTAL);
	
	public awtScrollbar() {
		setLayout(new BorderLayout());
		setTitle("Scrolls");
		add("East",sVertical);
		add("South",sHorizontal);
		setLocationRelativeTo(null);
		setSize(200,200);
		setVisible(true);
	}
	public static void main(String[] args)
	{
		new awtScrollbar();
	}

}

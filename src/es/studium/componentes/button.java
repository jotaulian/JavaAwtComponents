package es.studium.componentes;

import java.awt.*;

public class button extends Frame
{
	private static final long serialVersionUID = 1L;
	Button btn = new Button("press");
	
	public button() {
		setLayout(new FlowLayout());
		setTitle("El nono botono");
		setSize(250,250);
		add(btn);
		setVisible(true);
		setLocationRelativeTo(null);
		
		
	}
	public static void main(String[] args)
	{
		new button();
	}

}

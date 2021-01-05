package es.studium.componentes;

import java.awt.*;

public class canvas extends Frame
{
	private static final long serialVersionUID = 1L;
	
	Canvas cnvC1 = new Canvas();
	
	public canvas() {
		setLayout(new FlowLayout());
		setTitle("Dibuje master");
		setSize(200,200);
		add(cnvC1);
		setLocationRelativeTo(null);
		cnvC1.requestFocus(); //foco para el canvas
		setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new canvas();
	}

}

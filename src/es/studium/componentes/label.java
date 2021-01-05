package es.studium.componentes;

import java.awt.*;

public class label extends Frame
{
	private static final long serialVersionUID = 1L;
	Label lblEtiqueta = new Label("Cervantes");
	
	public label() {
		setLayout(new FlowLayout());
		setTitle("La famosa Etiqueta");
		setSize(250,250);
		add(lblEtiqueta);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}
	public static void main(String[] args)
	{
		new label();
	}

}

package es.studium.componentes;

import java.awt.*;

public class AwtTextArea extends Frame
{
	private static final long serialVersionUID = 1L;
	TextArea areaTexto = new TextArea("Este es un area de texto para dejar comentarios",5,20);	
	
	public AwtTextArea()
	{
	setLayout(new FlowLayout());
	setTitle("TextArea");
	add(areaTexto);
	setLocationRelativeTo(null);
	setSize(200,200);
	setVisible(true);
	}
	public static void main(String[] args)
	{
	new AwtTextArea();
	}
}

package es.studium.componentes;

import java.awt.*;

public class awtChoice extends Frame
{
	private static final long serialVersionUID = 1L;
	Choice lista = new Choice();
	
	public awtChoice() {
		setLayout(new FlowLayout());
		setTitle("Lista desplegable");
		//Añadimos elementos a la lista
		lista.add("Blanco");
		lista.add("Rojo");
		lista.add("Azul");
		add(lista);
		setSize(200,200);
		setLocationRelativeTo(null);
		setVisible(true);
		
		
	}
	public static void main(String[] args)
	{
		new awtChoice();
	}

}

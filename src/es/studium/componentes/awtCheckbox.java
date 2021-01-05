package es.studium.componentes;

import java.awt.*;

public class awtCheckbox extends Frame
{
	private static final long serialVersionUID = 1L;
	Checkbox chk1 = new Checkbox("Opción Uno");
	Checkbox chk2 = new Checkbox("Opción dos");
	Checkbox chk3 = new Checkbox("Opción tres");
	Checkbox chk4 = new Checkbox("Opción cuatro");
	
	public awtCheckbox() {
		setLayout(new FlowLayout());
		setSize(200,250);
		add(chk1);
		add(chk2);
		add(chk3);
		add(chk4);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new awtCheckbox();
	}

}

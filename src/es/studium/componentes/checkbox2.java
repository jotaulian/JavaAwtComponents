package es.studium.componentes;

import java.awt.*;

public class checkbox2 extends Frame
{
	private static final long serialVersionUID = 1L;
	//Definimos grupo
	CheckboxGroup chkGrupo = new CheckboxGroup();
	
	//Al crear los checkboxes se indica la etiqueta, si esta o no activo, y el grupo al que pertence
	Checkbox chk1 = new Checkbox("Opción Uno",false,chkGrupo);
	Checkbox chk2 = new Checkbox("Opción dos",false,chkGrupo);
	Checkbox chk3 = new Checkbox("Opción Tres",false,chkGrupo);
	Button btn = new Button("Enviar");
	
	public checkbox2() {
		setLayout(new FlowLayout());
		setTitle("Los checkbox de opcion multiple");
		setSize(200,200);
		add(chk1);
		add(chk2);
		add(chk3);
		add(btn);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new checkbox2();
	}

}

package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.CrearPartido;

public class GestionPartido implements ActionListener{
private CrearPartido vista = new CrearPartido();
	
public GestionPartido (CrearPartido v) {
	this.vista = v;
}
	
@Override
public void actionPerformed(ActionEvent e) {	
	
}

}

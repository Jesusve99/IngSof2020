package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.CrearPartido2;

public class GestionPartido implements ActionListener{
private CrearPartido2 vista = new CrearPartido2();
	
public GestionPartido (CrearPartido2 v) {
	this.vista = v;
}
	
@Override
public void actionPerformed(ActionEvent e) {	
	
}

}

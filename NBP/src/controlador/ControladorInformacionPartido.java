package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import modelo.BD;
import vista.InformacionPartido;

public class ControladorInformacionPartido implements ActionListener {
	
	private InformacionPartido vista = new InformacionPartido();
	
	public ControladorInformacionPartido (InformacionPartido v) {
		this.vista = v;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
	
	
}

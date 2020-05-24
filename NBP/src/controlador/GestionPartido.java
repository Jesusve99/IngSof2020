package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import modelo.BD;
import modelo.BDException;
import modelo.Partido;
import modelo.Pista;
import net.proteanit.sql.DbUtils;
import vista.CrearPartido;
import vista.InformacionPartido;

public class GestionPartido implements ActionListener{
private CrearPartido vista = new CrearPartido();
	
public GestionPartido (CrearPartido v) {
	this.vista = v;
}
	
@Override
public void actionPerformed(ActionEvent e) {	
	
}

}

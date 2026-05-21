package py.edu.facitec.reutilizacion.toolbar;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import javax.swing.JToolBar;
import py.edu.facitec.reutilizacion.botones.MiBoton;
import py.edu.facitec.reutilizacion.interfaces.AccionesABM;
import javax.swing.JSeparator;

public class MiToolbar extends JToolBar {

    private MiBoton mbtnNuevo;
    private MiBoton mbtnModificar;
    private MiBoton mbtnEliminar;
    private MiBoton mbtnGuardar;
    private MiBoton mbtnCancelar;
    private MiBoton mbtnSalir;
    
    private AccionesABM acciones;
    private JSeparator separator;
    private JSeparator separator_1;
    private JSeparator separator_2;
    private JSeparator separator_3;
    private JSeparator separator_4;
    public void setAcciones(AccionesABM acciones) {
		this.acciones = acciones;
	}

    public MiToolbar() {
        setFloatable(false);

        mbtnNuevo = new MiBoton();
        mbtnNuevo.setNombreIcono("add_btn");
        mbtnNuevo.setText("Nuevo");
        add(mbtnNuevo);
        
        separator = new JSeparator();
        separator.setPreferredSize(new Dimension(30, 80));
        add(separator);

        mbtnModificar = new MiBoton();
        mbtnModificar.setNombreIcono("modificar_btn");
        mbtnModificar.setText("Modificar");
        add(mbtnModificar);
        
        separator_1 = new JSeparator();
        separator_1.setPreferredSize(new Dimension(30, 80));
        add(separator_1);

        mbtnEliminar = new MiBoton();
        mbtnEliminar.setNombreIcono("eliminar_btn");
        mbtnEliminar.setText("Eliminar");
        add(mbtnEliminar);
        
        separator_2 = new JSeparator();
        separator_2.setPreferredSize(new Dimension(30, 80));
        add(separator_2);

        mbtnGuardar = new MiBoton();
        mbtnGuardar.setNombreIcono("guardar_btn");
        mbtnGuardar.setText("Guardar");
        add(mbtnGuardar);
        
        separator_3 = new JSeparator();
        separator_3.setPreferredSize(new Dimension(30, 80));
        add(separator_3);

        mbtnCancelar = new MiBoton();
        mbtnCancelar.setNombreIcono("cancelar_btn");
        mbtnCancelar.setText("Cancelar");
        add(mbtnCancelar);
        
        separator_4 = new JSeparator();
        separator_4.setPreferredSize(new Dimension(30, 80));
        add(separator_4);

        mbtnSalir = new MiBoton();
        mbtnSalir.setNombreIcono("salir_btn");
        mbtnSalir.setText("Salir");
        add(mbtnSalir);

        // Se agregan los eventos
        setUpEvents();
    }

    private void setUpEvents() {
        mbtnNuevo.addActionListener(e -> acciones.nuevo());
        mbtnModificar.addActionListener(e -> acciones.eliminar());
        mbtnEliminar.addActionListener(e -> acciones.eliminar());
        mbtnEliminar.addActionListener(e -> acciones.guardar());
        mbtnEliminar.addActionListener(e -> acciones.cancelar());
        mbtnEliminar.addActionListener(e -> acciones.salir());
    }
public void estadoInicial(boolean esInicial) {
	mbtnNuevo.setEnabled(esInicial);
	mbtnModificar.setEnabled(esInicial);
	mbtnEliminar.setEnabled(esInicial);
	mbtnSalir.setEnabled(esInicial);
	
	// Botonoes activo si el estaod no es iniciañ
	mbtnGuardar.setEnabled(!esInicial);
	mbtnCancelar.setEnabled(!esInicial);
}
   
}
package py.edu.facitec.reutilizacion.ventanas;

import java.awt.Color;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import py.edu.facitec.reutilizacion.toolbar.MiToolbar;

public abstract class VentanaGenerica extends JDialog {

	private static final long serialVersionUID = 1L;
	private JTable table;
	private JTextField tBuscador;
	private JPanel panelFormulario;
	private MiToolbar miToolbar;


	/**
	 * Create the dialog.
	 */
	public VentanaGenerica() {
		setTitle(getTitulo());
		setBounds(100, 100, 1000, 800);
		// CENTRA LA VENTANA 
		setLocationRelativeTo(this);
//EVITA QUE EL FOCO DE LA VENTANA SE PIERDA
		setModal(true);
		getContentPane().setLayout(null);
		
		panelFormulario = new JPanel();
		panelFormulario.setBorder(new TitledBorder(null, getTituloFormulario(), TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelFormulario.setBackground(Color.WHITE);
		panelFormulario.setBounds(6, 42, 493, 560);
		getContentPane().add(panelFormulario);
		panelFormulario.setLayout(null);
		
		miToolbar = new MiToolbar();
		miToolbar.setBounds(6, 600, 483, 84);
		getContentPane().add(miToolbar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(511, 54, 441, 560);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel = new JLabel("Buscar");
		lblNewLabel.setBounds(511, 622, 85, 16);
		getContentPane().add(lblNewLabel);
		
		tBuscador = new JTextField();
		tBuscador.setBounds(563, 617, 354, 26);
		getContentPane().add(tBuscador);
		tBuscador.setColumns(10);
	}
// METODO ABSTRACTOS QUE DEFOINE LOS TITULOS 
	protected abstract String getTitulo();
	protected abstract String getTituloFormulario();
	
	
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public JTable getTable() {
		return table;
	}

	public JTextField gettBuscador() {
		return tBuscador;
	}

	public JPanel getPanelFormulario() {
		return panelFormulario;
	}

	public MiToolbar getMiToolbar() {
		return miToolbar;
	}
	
}

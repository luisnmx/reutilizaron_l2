package py.edu.facitec.reutilizacion.ventanas;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import py.edu.facitec.reutilizacion.toolbar.MiToolbar;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import javax.swing.table.DefaultTableModel;

public abstract class MiVentanaGenerica extends JDialog {

	private static final long serialVersionUID = 1L;
	private JTable table;
	private JTextField tBuscador;
	private JPanel panelFormulario;
	private MiToolbar miToolbar;
	private JPanel panelTitulo;
	private JLabel lblTitulo;


	/**
	 * Create the dialog.
	 */
	public MiVentanaGenerica() {
		setTitle(getTitulo());
		setBounds(100, 100, 1000, 872);
		// CENTRA LA VENTANA 
		setLocationRelativeTo(this);
//EVITA QUE EL FOCO DE LA VENTANA SE PIERDA
		setModal(true);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{493, 0};
		gridBagLayout.rowHeights = new int[]{0, 367, 92, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		
		panelTitulo = new JPanel();
		panelTitulo.setBackground(new Color(50, 108, 135));
		GridBagConstraints gbc_panelTitulo = new GridBagConstraints();
		gbc_panelTitulo.insets = new Insets(0, 0, 5, 0);
		gbc_panelTitulo.fill = GridBagConstraints.BOTH;
		gbc_panelTitulo.gridx = 0;
		gbc_panelTitulo.gridy = 0;
		getContentPane().add(panelTitulo, gbc_panelTitulo);
		
		lblTitulo = new JLabel(getTitulo());
		lblTitulo.setForeground(Color.WHITE);
		lblTitulo.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 27));
		panelTitulo.add(lblTitulo);
		
		panelFormulario = new JPanel();
		panelFormulario.setBorder(new TitledBorder(null,getTituloFormulario(), TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelFormulario.setLayout(null);
		GridBagConstraints gbc_panelFormulario = new GridBagConstraints();
		gbc_panelFormulario.insets = new Insets(0, 0, 5, 0);
		gbc_panelFormulario.fill = GridBagConstraints.BOTH;
		gbc_panelFormulario.gridx = 0;
		gbc_panelFormulario.gridy = 1;
		getContentPane().add(panelFormulario, gbc_panelFormulario);
		
		miToolbar = new MiToolbar();
		miToolbar.setMinimumSize(new Dimension(700, 80));
		GridBagConstraints gbc_miToolbar = new GridBagConstraints();
		gbc_miToolbar.insets = new Insets(0, 0, 5, 0);
		gbc_miToolbar.gridx = 0;
		gbc_miToolbar.gridy = 2;
		getContentPane().add(miToolbar, gbc_miToolbar);
		
		JPanel panelBusqueda = new JPanel();
		GridBagConstraints gbc_panelBusqueda = new GridBagConstraints();
		gbc_panelBusqueda.insets = new Insets(0, 0, 5, 0);
		gbc_panelBusqueda.fill = GridBagConstraints.BOTH;
		gbc_panelBusqueda.gridx = 0;
		gbc_panelBusqueda.gridy = 3;
		getContentPane().add(panelBusqueda, gbc_panelBusqueda);
		
		JLabel lblNewLabel = new JLabel("Buscar");
		panelBusqueda.add(lblNewLabel);
		
		tBuscador = new JTextField();
		panelBusqueda.add(tBuscador);
		tBuscador.setColumns(50);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 4;
		getContentPane().add(scrollPane, gbc_scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column"
			}
		));
		scrollPane.setViewportView(table);
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

package py.edu.facitec.reutilizacion.ventanas;

import java.awt.EventQueue;

import javax.swing.JDialog;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public abstract class BuscadorGenerico extends JDialog {

	private static final long serialVersionUID = 1L;
	private JTextField tBuscador;
	private JTable table;

	/**
	 * Create the dialog.
	 */
	public BuscadorGenerico() {
		setBounds(100, 100, 500, 300);
		setLocationRelativeTo(this);// centrar
		setModal(true); // evita quye se pierda el foco
		setTitle(getTitulo());
		getContentPane().setLayout(new BorderLayout(0, 0));

		tBuscador = new JTextField();
		getContentPane().add(tBuscador, BorderLayout.NORTH);
		tBuscador.setColumns(10);

		JScrollPane scrollPane = new JScrollPane();
		getContentPane().add(scrollPane, BorderLayout.CENTER);

		table = new JTable();
		scrollPane.setViewportView(table);

	}

	public JTextField gettBuscador() {
		return tBuscador;
	}

	public void settBuscador(JTextField tBuscador) {
		this.tBuscador = tBuscador;
	}

	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}

	protected abstract String getTitulo();

}

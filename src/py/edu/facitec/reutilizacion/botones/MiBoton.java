package py.edu.facitec.reutilizacion.botones;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.net.URL;
import java.awt.event.ActionEvent;

public class MiBoton extends JButton {
	private ImageIcon icono;

	public MiBoton() {
		setForeground(new Color(255, 255, 255));
		setBackground(new Color(0, 51, 51));
		super.setText("pulsa");
		setPreferredSize(new Dimension(100, 80));
		setMaximumSize(new Dimension(100, 80));
setHorizontalTextPosition(CENTER);
setVerticalTextPosition(BOTTOM);
	}

	@Override
	public void setText(String text) {
if (icono == null)
{setNombreIcono(text.toLowerCase());
}
		super.setText(text);
		
	}
	public void setNombreIcono(String nombreIcono) {
		try {
			URL url = MiBoton.class.getResource("/img/" + nombreIcono + ".png");
			icono = new ImageIcon(url);
			this.setIcon(icono);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

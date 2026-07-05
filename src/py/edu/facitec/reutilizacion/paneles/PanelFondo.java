package py.edu.facitec.reutilizacion.paneles;

import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class PanelFondo extends JPanel{
private Image fondo;

public PanelFondo() {
}
public void setFondo(String nombreFondo) {
try {
	URL url = PanelFondo.class.getResource("/img/" + nombreFondo);
	fondo = new ImageIcon(url).getImage();
	setOpaque(false);
	repaint();
} catch (Exception e) {
	e.printStackTrace();
}
}
@Override
	public void paint(Graphics g) {
g.drawImage(fondo,0,0,this.getWidth(),this.getHeight(),null); 
		super.paint(g);
	}
}

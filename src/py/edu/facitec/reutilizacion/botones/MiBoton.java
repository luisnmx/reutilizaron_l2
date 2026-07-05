package py.edu.facitec.reutilizacion.botones;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.net.URL;

public class MiBoton extends BotonRedondeado {

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
        if (icono == null) {
            setNombreIcono(text.toLowerCase());
        }
        super.setText(text);
    }

    public void setNombreIcono(String nombreIcono) {
        try {
            URL url = MiBoton.class.getResource("/img/" + nombreIcono + ".png");
            ImageIcon iconoOriginal = new ImageIcon(url);

            // ESCALA LA IMAGEN A 40x40 antes de asignarla
            Image imagenEscalada = iconoOriginal.getImage()
                                    .getScaledInstance(40, 40, Image.SCALE_SMOOTH);
            icono = new ImageIcon(imagenEscalada);
            this.setIcon(icono);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
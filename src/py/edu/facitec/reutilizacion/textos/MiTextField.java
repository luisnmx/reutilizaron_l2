package py.edu.facitec.reutilizacion.textos;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class MiTextField extends JTextField {

    private int arc = 20;

    public MiTextField() {
        setOpaque(false);
        setBorder(new EmptyBorder(5, 10, 5, 10)); // padding interno
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();

        // Antialiasing para suavizar bordes
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        // Fondo del campo
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), arc, arc);

        super.paintComponent(g);
        g2.dispose();
    }

    @Override
    protected void paintBorder(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setColor(Color.GRAY);
        g2.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, arc, arc);
        g2.dispose();
    }
}
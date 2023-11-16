import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Buscaminas extends JFrame {

    String[][] piezas = new String[9][9];

    public Buscaminas() {

        iniciar_componenetes();

    }

    public void iniciar_componenetes() {

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 400);
        setTitle("Buscaminas");
        setLocationRelativeTo(null);
        setResizable(true);

        JPanel contenedor = new JPanel();
        contenedor.setBackground(Color.WHITE);
        contenedor.setLayout(new GridBagLayout());
        add(contenedor);

        GridBagConstraints restricciones = new GridBagConstraints();

        JLabel etq_espacio_negro_1 = new JLabel();
        etq_espacio_negro_1.setText("020");
        etq_espacio_negro_1.setFont(new Font("Arial", Font.BOLD, 20));
        etq_espacio_negro_1.setForeground(Color.RED);
        etq_espacio_negro_1.setBackground(Color.BLACK);
        etq_espacio_negro_1.setHorizontalAlignment(JLabel.CENTER);
        etq_espacio_negro_1.setOpaque(true);
        restricciones.gridx = 0;
        restricciones.gridy = 0;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 1;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(etq_espacio_negro_1, restricciones);

        JLabel etq_espacio_negro_2 = new JLabel();
        etq_espacio_negro_2.setText("000");
        etq_espacio_negro_2.setFont(new Font("Arial", Font.BOLD, 20));
        etq_espacio_negro_2.setForeground(Color.RED);
        etq_espacio_negro_2.setBackground(Color.BLACK);
        etq_espacio_negro_2.setHorizontalAlignment(JLabel.CENTER);
        etq_espacio_negro_2.setOpaque(true);
        restricciones.gridx = 2;
        restricciones.gridy = 0;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 1;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(etq_espacio_negro_2, restricciones);

        ImageIcon icono = new ImageIcon("img/img_emoji.png");
        Image imagen = icono.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        JButton btn_reiniciar = new JButton(new ImageIcon(imagen));
        restricciones.gridx = 1;
        restricciones.gridy = 0;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 1;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(btn_reiniciar, restricciones);

        JLabel tablero = new JLabel();
        tablero.setLayout(new GridBagLayout());
        restricciones.gridx = 0;
        restricciones.gridy = 1;
        restricciones.gridwidth = 3;
        restricciones.gridheight = 1;
        restricciones.weightx = 1;
        restricciones.weighty = 100;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(tablero, restricciones);

        for (int i = 0; i < piezas.length; i++) {

            for (int j = 0; j < piezas[i].length; j++) {

                JButton btn_tablero = new JButton();
                restricciones.gridx = i;
                restricciones.gridy = j;
                restricciones.gridwidth = 1;
                restricciones.gridheight = 1;
                restricciones.weightx = 1;
                restricciones.weighty = 1;
                tablero.add(btn_tablero, restricciones);

            }

        }

        revalidate();
        setVisible(true);

    }

}

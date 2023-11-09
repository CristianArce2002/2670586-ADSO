import javax.swing.*;
import java.awt.*;

public class Principal {
    public static void main (String[] args){

        JFrame ventana_01 = new JFrame();
        Dimension tamaño = new Dimension(500, 500);

        ventana_01.setTitle("Primera ventana");

        ventana_01.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        
        ventana_01.setSize(tamaño);
        
        ventana_01.setResizable(false);
        
        ventana_01.setLocationRelativeTo(null);

        ventana_01.setVisible(true);

        JPanel contenedor = new JPanel();

        contenedor.setBackground( Color.WHITE );

        JLabel titulo = new JLabel();
        titulo.setText("TITULO XD");
        titulo.setFont( new Font("Snap ITC", Font.BOLD, 30));
        titulo.setBackground(Color.ORANGE);
        titulo.setOpaque(true);
        
        JLabel cedula = new JLabel();
        cedula.setText("Cedula: ");

        JLabel nombre = new JLabel();
        nombre.setText("Nombre: ");

        JLabel apellido = new JLabel();
        apellido.setText("Apellido: ");

        JTextField campo_cedula = new JTextField();
        campo_cedula.setColumns(10);
        
        JTextField campo_nombre = new JTextField();
        campo_nombre.setColumns(10);

        JTextField campo_apellido = new JTextField();
        campo_apellido.setColumns(10);

        JButton boton = new JButton();
        boton.setText("Enviar");
        boton.setBackground(Color.cyan);
        
        contenedor.add( titulo );
        contenedor.add( cedula );
        contenedor.add( campo_cedula );
        contenedor.add( nombre );
        contenedor.add( campo_nombre );
        contenedor.add( apellido );
        contenedor.add( campo_apellido );
        contenedor.add( boton );
        ventana_01.add( contenedor );

        ventana_01.revalidate();
        
        // ventana_01.repaint();
        
        // ventana_01.pack();
        
    }
}
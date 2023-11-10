import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Factura extends JFrame {

    public Factura() {

        iniciarComponentes();

    }

    public void iniciarComponentes() {

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(700, 900);
        setTitle("Factura");
        setLocationRelativeTo(null);
        setResizable(false);
        setIconImage(getToolkit().createImage( ClassLoader.getSystemResource("imagenes/icono_factura.png") ));

        JPanel contenedor = new JPanel();
        contenedor.setBackground(Color.WHITE);
        contenedor.setLayout(new GridBagLayout());
        contenedor.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        GridBagConstraints restricciones = new GridBagConstraints();

        JLabel titulo_cedula = new JLabel();
        titulo_cedula.setText("DATOS CLIENTE:");
        titulo_cedula.setFont(new Font("Arial", Font.BOLD, 20));
        titulo_cedula.setHorizontalAlignment(JLabel.LEFT);
        restricciones.gridx = 0;
        restricciones.gridy = 0;
        restricciones.gridwidth = 4;
        restricciones.gridheight = 1;
        restricciones.weightx = 100;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(titulo_cedula, restricciones);

        JLabel etq_cedula = new JLabel();
        etq_cedula.setText("CEDULA:");
        etq_cedula.setFont(new Font("Arial", Font.BOLD, 15));
        etq_cedula.setHorizontalAlignment(JLabel.LEFT);
        restricciones.gridx = 0;
        restricciones.gridy = 1;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 10;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(etq_cedula, restricciones);

        JTextField campo_cedula = new JTextField();
        setBackground(Color.BLUE);
        campo_cedula.setColumns(10);
        restricciones.gridx = 1;
        restricciones.gridy = 1;
        restricciones.gridwidth = 2;
        restricciones.gridheight = 1;
        restricciones.weightx = 70;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(campo_cedula, restricciones);

        JButton btn_buscar = new JButton();
        btn_buscar.setText("Buscar");
        btn_buscar.setBackground(Color.BLUE);
        btn_buscar.setForeground(Color.WHITE);
        restricciones.gridx = 3;
        restricciones.gridy = 1;
        restricciones.gridwidth = 4;
        restricciones.gridheight = 1;
        restricciones.weightx = 20;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.NONE;
        contenedor.add(btn_buscar, restricciones);

        JLabel etq_nombres = new JLabel();
        etq_nombres.setText("NOMBRES:");
        etq_nombres.setFont(new Font("Arial", Font.BOLD, 15));
        etq_nombres.setHorizontalAlignment(JLabel.LEFT);
        restricciones.gridx = 0;
        restricciones.gridy = 2;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 10;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(etq_nombres, restricciones);

        JLabel etq_direccion = new JLabel();
        etq_direccion.setText("DIRECCION:");
        etq_direccion.setFont(new Font("Arial", Font.BOLD, 15));
        etq_direccion.setHorizontalAlignment(JLabel.LEFT);
        restricciones.gridx = 0;
        restricciones.gridy = 3;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 10;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(etq_direccion, restricciones);

        JLabel titulo_datos = new JLabel();
        titulo_datos.setText("DATOS DEL VENDEDOR:");
        titulo_datos.setFont(new Font("Arial", Font.BOLD, 20));
        titulo_datos.setHorizontalAlignment(JLabel.LEFT);
        restricciones.gridx = 0;
        restricciones.gridy = 4;
        restricciones.gridwidth = 4;
        restricciones.gridheight = 1;
        restricciones.weightx = 100;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(titulo_datos, restricciones);

        JLabel etq_vendedor_cedula = new JLabel();
        etq_vendedor_cedula.setText("CEDULA:");
        etq_vendedor_cedula.setFont(new Font("Arial", Font.BOLD, 15));
        etq_vendedor_cedula.setHorizontalAlignment(JLabel.LEFT);
        restricciones.gridx = 0;
        restricciones.gridy = 5;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 10;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(etq_vendedor_cedula, restricciones);

        JTextField campo_vendedor_cedula = new JTextField();
        setBackground(Color.BLUE);
        campo_vendedor_cedula.setColumns(10);
        restricciones.gridx = 1;
        restricciones.gridy = 5;
        restricciones.gridwidth = 2;
        restricciones.gridheight = 1;
        restricciones.weightx = 70;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(campo_vendedor_cedula, restricciones);

        JButton btn_vendedor_buscar = new JButton();
        btn_vendedor_buscar.setText("Buscar");
        btn_vendedor_buscar.setBackground(Color.BLUE);
        btn_vendedor_buscar.setForeground(Color.WHITE);
        restricciones.gridx = 3;
        restricciones.gridy = 5;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 20;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.NONE;
        contenedor.add(btn_vendedor_buscar, restricciones);

        JLabel etq_vendedor_nombres = new JLabel();
        etq_vendedor_nombres.setText("NOMBRES:");
        etq_vendedor_nombres.setFont(new Font("Arial", Font.BOLD, 15));
        etq_vendedor_nombres.setHorizontalAlignment(JLabel.LEFT);
        restricciones.gridx = 0;
        restricciones.gridy = 6;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 10;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(etq_vendedor_nombres, restricciones);

        JLabel titulo_produtos = new JLabel();
        titulo_produtos.setText("LISTA PRODUCTOS FACTURADOS:");
        titulo_produtos.setFont(new Font("Arial", Font.BOLD, 20));
        titulo_produtos.setHorizontalAlignment(JLabel.LEFT);
        restricciones.gridx = 0;
        restricciones.gridy = 7;
        restricciones.gridwidth = 4;
        restricciones.gridheight = 1;
        restricciones.weightx = 100;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(titulo_produtos, restricciones);

        JLabel etq_id = new JLabel();
        etq_id.setText("ID");
        etq_id.setFont(new Font("Arial", Font.BOLD, 15));
        etq_id.setHorizontalAlignment(JLabel.CENTER);
        restricciones.gridx = 0;
        restricciones.gridy = 8;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 25;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(etq_id, restricciones);

        JLabel etq_name = new JLabel();
        etq_name.setText("NOMBRE");
        etq_name.setFont(new Font("Arial", Font.BOLD, 15));
        etq_name.setHorizontalAlignment(JLabel.CENTER);
        restricciones.gridx = 1;
        restricciones.gridy = 8;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 25;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(etq_name, restricciones);

        JLabel etq_cant = new JLabel();
        etq_cant.setText("CANT.");
        etq_cant.setFont(new Font("Arial", Font.BOLD, 15));
        etq_cant.setHorizontalAlignment(JLabel.CENTER);
        restricciones.gridx = 2;
        restricciones.gridy = 8;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 25;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(etq_cant, restricciones);

        JLabel etq_vacio = new JLabel();
        etq_vacio.setText("                    ");
        etq_vacio.setHorizontalAlignment(JLabel.CENTER);
        restricciones.gridx = 3;
        restricciones.gridy = 8;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 25;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(etq_vacio, restricciones);

        JLabel etq_vacio_2 = new JLabel();
        etq_vacio_2.setText("                    ");
        etq_vacio_2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        etq_vacio_2.setHorizontalAlignment(JLabel.CENTER);
        restricciones.gridx = 0;
        restricciones.gridy = 9;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 25;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(etq_vacio_2, restricciones);

        JLabel etq_vacio_3 = new JLabel();
        etq_vacio_3.setText("                    ");
        etq_vacio_3.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        etq_vacio_3.setHorizontalAlignment(JLabel.CENTER);
        restricciones.gridx = 1;
        restricciones.gridy = 9;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 25;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(etq_vacio_3, restricciones);

        JLabel etq_vacio_4 = new JLabel();
        etq_vacio_4.setText("                    ");
        etq_vacio_4.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        etq_vacio_4.setHorizontalAlignment(JLabel.CENTER);
        restricciones.gridx = 2;
        restricciones.gridy = 9;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 25;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(etq_vacio_4, restricciones);

        JButton btn_add = new JButton();
        btn_add.setText("ADD");
        btn_add.setBackground(Color.BLUE);
        btn_add.setForeground(Color.WHITE);
        restricciones.gridx = 3;
        restricciones.gridy = 9;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 25;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.NONE;
        contenedor.add(btn_add, restricciones);

        JLabel etq_scroll = new JLabel();
        etq_scroll.setFont(new Font("Arial", Font.BOLD, 15));
        etq_scroll.setHorizontalAlignment(JLabel.CENTER);
        JScrollPane scroll = new JScrollPane(etq_scroll);
        restricciones.gridx = 0;
        restricciones.gridy = 10;
        restricciones.gridwidth = 4;
        restricciones.gridheight = 1;
        restricciones.weightx = 100;
        restricciones.weighty = 90;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(scroll, restricciones);

        JLabel etq_total = new JLabel();
        etq_total.setText("TOTAL: $0");
        etq_total.setFont(new Font("Arial", Font.BOLD, 20));
        etq_total.setHorizontalAlignment(JLabel.RIGHT);
        restricciones.gridx = 2;
        restricciones.gridy = 11;
        restricciones.gridwidth = 4;
        restricciones.gridheight = 1;
        restricciones.weightx = 25;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(etq_total, restricciones);

        JLabel temporal = new JLabel();
        restricciones.gridx = 0;
        restricciones.gridy = 20;
        restricciones.gridwidth = 4;
        restricciones.gridheight = 1;
        restricciones.weightx = 100;
        restricciones.weighty = 50;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(temporal, restricciones);

        add(contenedor);
        setVisible(true);

    }

}
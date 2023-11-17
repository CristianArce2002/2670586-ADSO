import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class Calculador extends JFrame {

    private JLabel lista_jlabel[];
	private JPanel contenedorItems;
    private Materia lista_notas[];
    private int contador = 0;
    private double total_ponderado = 0.0;
    private JTextField campo_materia;
    private JTextField campo_creditos;
    private JTextField campo_nota;
    JLabel etq_nota;
    JLabel etq_total;

    public Calculador() {

        iniciar_componentes();

    }

    public void iniciar_componentes() {

        this.lista_jlabel = new JLabel[50];
        this.lista_notas = new Materia[50];

        setTitle("Pomedio Ponderado");
        setSize(600, 600);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setIconImage(getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icono_promedio.png")));

        JPanel contenedor_principal = new JPanel();
        contenedor_principal.setLayout(new GridBagLayout());
        contenedor_principal.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        add(contenedor_principal);

        GridBagConstraints restriccion = new GridBagConstraints();

        JLabel etq_titulo_principal = new JLabel();
        etq_titulo_principal.setText("CALCULAR PROMEDIO");
        etq_titulo_principal.setFont(new Font("Arial", Font.BOLD, 30));
        etq_titulo_principal.setHorizontalAlignment(JLabel.CENTER);
        restriccion.gridx = 0;
        restriccion.gridy = 0;
        restriccion.gridwidth = 4;
        restriccion.gridheight = 1;
        restriccion.weightx = 100;
        restriccion.weighty = 1;
        restriccion.fill = GridBagConstraints.BOTH;
        contenedor_principal.add(etq_titulo_principal, restriccion);

        JPanel contenedor_registro = new JPanel();
        contenedor_registro.setLayout(new GridBagLayout());
        contenedor_registro.setBackground(Color.LIGHT_GRAY);
        contenedor_registro.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        restriccion.gridx = 0;
        restriccion.gridy = 1;
        restriccion.gridwidth = 4;
        restriccion.gridheight = 1;
        restriccion.weightx = 100;
        restriccion.weighty = 1;
        restriccion.fill = GridBagConstraints.BOTH;
        contenedor_principal.add(contenedor_registro, restriccion);

        JLabel etq_materia = new JLabel("Materia:");
        etq_materia.setFont(new Font("Calibri", Font.BOLD, 20));
        restriccion.gridx = 0;
        restriccion.gridy = 0;
        restriccion.gridwidth = 1;
        restriccion.gridheight = 1;
        restriccion.weightx = 10;
        restriccion.weighty = 1;
        restriccion.fill = GridBagConstraints.BOTH;
        contenedor_registro.add(etq_materia, restriccion);

        campo_materia = new JTextField();
        restriccion.gridx = 1;
        restriccion.gridy = 0;
        restriccion.gridwidth = 1;
        restriccion.gridheight = 1;
        restriccion.weightx = 40;
        restriccion.weighty = 1;
        restriccion.fill = GridBagConstraints.BOTH;
        contenedor_registro.add(campo_materia, restriccion);

        JLabel etq_creditos = new JLabel("Creditos:");
        etq_creditos.setFont(new Font("Calibri", Font.BOLD, 20));
        etq_creditos.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 0));
        restriccion.gridx = 2;
        restriccion.gridy = 0;
        restriccion.gridwidth = 1;
        restriccion.gridheight = 1;
        restriccion.weightx = 10;
        restriccion.weighty = 1;
        restriccion.fill = GridBagConstraints.BOTH;
        contenedor_registro.add(etq_creditos, restriccion);

        campo_creditos = new JTextField();
        restriccion.gridx = 3;
        restriccion.gridy = 0;
        restriccion.gridwidth = 1;
        restriccion.gridheight = 1;
        restriccion.weightx = 40;
        restriccion.weighty = 1;
        restriccion.fill = GridBagConstraints.BOTH;
        contenedor_registro.add(campo_creditos, restriccion);

        etq_nota = new JLabel("Nota:");
        etq_nota.setFont(new Font("Calibri", Font.BOLD, 20));
        restriccion.gridx = 0;
        restriccion.gridy = 1;
        restriccion.gridwidth = 1;
        restriccion.gridheight = 1;
        restriccion.weightx = 10;
        restriccion.weighty = 1;
        restriccion.fill = GridBagConstraints.BOTH;
        contenedor_registro.add(etq_nota, restriccion);

        campo_nota = new JTextField();
        restriccion.gridx = 1;
        restriccion.gridy = 1;
        restriccion.gridwidth = 1;
        restriccion.gridheight = 1;
        restriccion.weightx = 40;
        restriccion.weighty = 1;
        restriccion.fill = GridBagConstraints.BOTH;
        contenedor_registro.add(campo_nota, restriccion);

        JButton btn_registrar = new JButton("REGISTRAR");
        btn_registrar.setBackground(Color.BLUE);
        btn_registrar.setForeground(Color.WHITE);
        btn_registrar.setFocusable(false);
        restriccion.gridx = 2;
        restriccion.gridy = 1;
        restriccion.gridwidth = 2;
        restriccion.gridheight = 1;
        restriccion.weighty = 1;
        restriccion.weightx = 1;
        restriccion.fill = GridBagConstraints.CENTER;
        contenedor_registro.add(btn_registrar, restriccion);

        JLabel etq_titulo_resumen = new JLabel("RESUMEN");
        etq_titulo_resumen.setFont(new Font("Arial", Font.BOLD, 25));
        etq_titulo_resumen.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));
        restriccion.gridx = 0;
        restriccion.gridy = 2;
        restriccion.gridwidth = 1;
        restriccion.gridheight = 1;
        restriccion.weightx = 1;
        restriccion.weighty = 1;
        restriccion.fill = GridBagConstraints.CENTER;
        contenedor_principal.add(etq_titulo_resumen, restriccion);

        JPanel contenedor_objetos = new JPanel();
        contenedor_objetos.setLayout(new GridBagLayout());
        contenedor_objetos.setBackground(Color.WHITE);

        JScrollPane panel_scroll = new JScrollPane(contenedor_objetos);
        panel_scroll.setBorder(null);
        restriccion.gridx = 0;
        restriccion.gridy = 3;
        restriccion.gridwidth = 1;
        restriccion.gridheight = 1;
        restriccion.weightx = 1;
        restriccion.weighty = 80;
        restriccion.fill = GridBagConstraints.BOTH;
        contenedor_principal.add(panel_scroll, restriccion);

        GridBagConstraints contenedor_filas = new GridBagConstraints();

        Border borderColor = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.decode("#D5D5D5"));
        Border borderPadding = new EmptyBorder(3, 10, 3, 10);
        Border borderGris = new CompoundBorder(borderColor, borderPadding);

        for (int i = 0; i < this.lista_jlabel.length; i++) {
            JLabel etq_temporal = new JLabel("  ");
            etq_temporal.setHorizontalAlignment(JLabel.RIGHT);
            etq_temporal.setFont(new Font("Arial", Font.PLAIN, 18));
            etq_temporal.setOpaque(true);
            etq_temporal.setBackground(Color.white);
            etq_temporal.setBorder(borderColor);
            this.lista_jlabel[i] = etq_temporal;
            contenedor_filas.gridy = i;
            contenedor_filas.gridx = 0;
            contenedor_filas.gridheight = 1;
            contenedor_filas.gridwidth = 1;
            contenedor_filas.weighty = 1;
            contenedor_filas.weightx = 1;
            contenedor_filas.fill = GridBagConstraints.CENTER;
            contenedor_filas.anchor = GridBagConstraints.NORTH;
            contenedor_filas.insets = new Insets(0, 0, 0, 0);
            contenedor_objetos.add(this.lista_jlabel[i], contenedor_filas);
        }

        etq_total = new JLabel("Total: " + total_ponderado);
        etq_total.setFont(new Font("Calibri", Font.BOLD, 25));
        etq_total.setBorder(BorderFactory.createEmptyBorder(20, 0, 10, 0));
        restriccion.gridx = 0;
        restriccion.gridy = 4;
        restriccion.gridwidth = 1;
        restriccion.gridheight = 1;
        restriccion.weightx = 1;
        restriccion.weighty = 1;
        restriccion.fill = GridBagConstraints.CENTER;
        contenedor_principal.add(etq_total, restriccion);

        JButton btn_limpiar = new JButton("LIMPIAR");
        btn_limpiar.setBackground(Color.RED);
        btn_limpiar.setForeground(Color.WHITE);
        btn_limpiar.setFocusable(false);
        restriccion.gridx = 0;
        restriccion.gridy = 5;
        restriccion.gridwidth = 1;
        restriccion.gridheight = 1;
        restriccion.weighty = 1;
        restriccion.weightx = 1;
        restriccion.fill = GridBagConstraints.CENTER;
        contenedor_principal.add(btn_limpiar, restriccion);

        ActionListener evento_registrar_nota = new ActionListener(){
			public void actionPerformed(ActionEvent event){
				registrar_nota();
			}
		};

        btn_registrar.addActionListener(evento_registrar_nota);

        setVisible(true);
        revalidate();

    }

    public void registrar_nota(){

        String materia = campo_materia.getText();

        
        double creditos = Double.parseDouble(campo_creditos.getText());
        double nota = Double.parseDouble(campo_nota.getText());
        Materia nota_temporal = new Materia(materia, creditos, nota);
        lista_jlabel[contador].setText(materia + "->" + creditos + "->" + nota);
        lista_notas[contador] = nota_temporal;
        contador++;
        calcular_promedio_ponderado();
    }

    public void calcular_promedio_ponderado() {

        DecimalFormat df = new DecimalFormat("#.#");

        int total_creditos = 0;
        double resultado = 0.0;
        int cantidad_creditos = 0;
    
        for (int i = 0; i < lista_notas.length; i++) {
            if (lista_notas[i] != null) {
                cantidad_creditos += lista_notas[i].getCreditos();
                resultado += lista_notas[i].getNota() * lista_notas[i].getCreditos();
            }
        }
    
        resultado = resultado / cantidad_creditos;

        etq_total.setText("Total: " + df.format(resultado));
    
    }

}

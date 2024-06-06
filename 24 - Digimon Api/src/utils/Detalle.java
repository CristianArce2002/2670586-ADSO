package utils;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.URL;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EtchedBorder;
import javax.swing.table.DefaultTableModel;

public class Detalle extends javax.swing.JFrame {

    Digimon digi;
    String tipo;
    String nivel;
    ArrayList<String> atributos = new ArrayList<>();
    ArrayList<String> campos = new ArrayList<>();

    public Detalle(Digimon digi, JFrame ventanaDigidex) {
        this.digi = digi;
        initComponents();
        initAlter();
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                ventanaDigidex.setVisible(true);
            }
        });
    }

    public void initAlter() {
        setTitle(digi.getName());
        setVisible(true);

        // Consumir api
        ConsumoAPI consumo = new ConsumoAPI();
        String api = digi.getHref();
        String data = consumo.consumoGET(api);

        // Obtener resultados
        JsonObject dataJson = JsonParser.parseString(data).getAsJsonObject();

        JsonArray levels = dataJson.getAsJsonArray("levels");
        JsonObject level = levels.get(0).getAsJsonObject();
        nivel = level.get("level").getAsString();

        JsonArray types = dataJson.getAsJsonArray("types");
        JsonObject type = types.get(0).getAsJsonObject();
        tipo = type.get("type").getAsString();

        JsonArray attributes = dataJson.getAsJsonArray("attributes");
        for (JsonElement attribute : attributes) {
            JsonObject attributeObject = attribute.getAsJsonObject();
            atributos.add(attributeObject.get("attribute").getAsString());
        }

        JsonArray fields = dataJson.getAsJsonArray("fields");
        for (JsonElement field : fields) {
            JsonObject fieldObject = field.getAsJsonObject();
            campos.add(fieldObject.get("image").getAsString());
        }

        etqNombre.setText(digi.getName());

        String url = digi.getImage();
        URL imgURL;
        try {
            imgURL = new URL(url);
            ImageIcon icon = new ImageIcon(imgURL);
            Image img = icon.getImage();
            Image escalado = img.getScaledInstance(300, 300, java.awt.Image.SCALE_SMOOTH);
            icon = new ImageIcon(escalado);
            etqImagen.setIcon(icon);
            etqNombre.setText(digi.getName());
        } catch (Exception e) {
            System.out.println("Error al obtener imagen");;
        }

        tablaNivel();
        tablaAtributos();
        tablaTipo();
        generarCampos();
    }

    public void tablaNivel() {
        String[][] datos = {{nivel}};
        String[] th = {"Nivel"};
        DefaultTableModel model = new DefaultTableModel(datos, th) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        JTable nivel = new JTable(model);
        JScrollPane scroll = new JScrollPane(nivel);
        panelNivel.add(scroll);
    }

    public void tablaAtributos() {
        String[][] datos = new String[atributos.size()][1];

        for (int i = 0; i < atributos.size(); i++) {
            datos[i][0] = atributos.get(i);
        }
        String[] th = {"Atributos"};
        DefaultTableModel model = new DefaultTableModel(datos, th) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        JTable atributos = new JTable(model);
        JScrollPane scroll = new JScrollPane(atributos);
        panelAtributos.add(scroll);
    }

    public void tablaTipo() {
        String[][] datos = {{tipo}};
        String[] th = {"Tipo"};
        DefaultTableModel model = new DefaultTableModel(datos, th) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        JTable tipo = new JTable(model);
        JScrollPane scroll = new JScrollPane(tipo);
        panelTipo.add(scroll);
    }

    public void generarCampos() {
        panelCampos.setLayout(new GridLayout(1, 0));
        for (String campo : campos) {
            JPanel panelCampo = new JPanel();
            JLabel etqImagen = new JLabel();
            String url = campo;
            URL imgURL;
            try {
                imgURL = new URL(url);
                ImageIcon icon = new ImageIcon(imgURL);
                Image img = icon.getImage();
                int ancho;
                int alto;
                if (campos.size() > 4) {
                    ancho = 70;
                    alto = 70;
                } else {
                    ancho = 85;
                    alto = 85;
                }
                Image escalado = img.getScaledInstance(ancho, alto, java.awt.Image.SCALE_SMOOTH);
                icon = new ImageIcon(escalado);
                etqImagen.setIcon(icon);
            } catch (Exception e) {
                System.out.println("Error al obtener imagen");;
            }
            panelCampo.add(etqImagen);
            panelCampos.add(panelCampo);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        etqNombre = new javax.swing.JLabel();
        etqImagen = new javax.swing.JLabel();
        panelNivel = new javax.swing.JPanel();
        panelAtributos = new javax.swing.JPanel();
        panelTipo = new javax.swing.JPanel();
        scrollCampos = new javax.swing.JScrollPane();
        panelCampos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etqNombre.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        etqNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(etqNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 50));
        jPanel1.add(etqImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 300, 300));

        panelNivel.setLayout(new java.awt.GridLayout());
        jPanel1.add(panelNivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 120, 120));

        panelAtributos.setLayout(new java.awt.GridLayout());
        jPanel1.add(panelAtributos, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, 120, 120));

        panelTipo.setLayout(new java.awt.GridLayout());
        jPanel1.add(panelTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 390, 120, 120));

        panelCampos.setPreferredSize(null);
        scrollCampos.setViewportView(panelCampos);

        jPanel1.add(scrollCampos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 570, 440, 100));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CAMPOS DE BATALLA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 500, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel etqImagen;
    private javax.swing.JLabel etqNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelAtributos;
    private javax.swing.JPanel panelCampos;
    private javax.swing.JPanel panelNivel;
    private javax.swing.JPanel panelTipo;
    private javax.swing.JScrollPane scrollCampos;
    // End of variables declaration//GEN-END:variables
}

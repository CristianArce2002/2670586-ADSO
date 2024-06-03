package utils;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.JFrame;

public class Detalle extends javax.swing.JFrame {

    Digimon digi;
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
        System.out.println(level.get("level"));

        JsonArray types = dataJson.getAsJsonArray("types");
        JsonObject type = types.get(0).getAsJsonObject();
        System.out.println(type.get("type"));

        JsonArray attributes = dataJson.getAsJsonArray("attributes");
        for (JsonElement attribute : attributes) {
            JsonObject attributeObject = attribute.getAsJsonObject();
            atributos.add(attributeObject.get("attribute").getAsString());
        }
        
        JsonArray fields = dataJson.getAsJsonArray("fields");
        for (JsonElement field : fields) {
            JsonObject attributeObject = field.getAsJsonObject();
            campos.add(attributeObject.get("image").getAsString());
        }
        
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 51, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 521, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 366, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

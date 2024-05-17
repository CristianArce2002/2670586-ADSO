package principal;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import javax.swing.table.DefaultTableModel;
import util.ConsumoAPI;

public class Consultar extends javax.swing.JPanel {

    public Consultar() {
        initComponents();
        componentes();
    }

    public void componentes() {

        ConsumoAPI consumo = new ConsumoAPI();
        String respuesta01 = consumo.consumoGET("https://codetesthub.com/API/Obtener.php");

        JsonArray registros = JsonParser.parseString(respuesta01).getAsJsonArray();

        DefaultTableModel model = (DefaultTableModel) tabla_usuarios.getModel();
        model.setRowCount(0);

        for (int i = 0; i < registros.size(); i++) {
            JsonObject temp = registros.get(i).getAsJsonObject();
            String cedula = temp.get("cedula").getAsString();
            String nombres = temp.get("nombres").getAsString();
            String apellidos = temp.get("apellidos").getAsString();
            String telefono = temp.get("telefono").getAsString();
            String direccion = temp.get("direccion").getAsString();
            String email = temp.get("email").getAsString();
            System.out.println(nombres + " " + apellidos);

            model.addRow(new Object[]{
                cedula,
                nombres,
                apellidos,
                telefono,
                direccion,
                email
            });

        }

    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_usuarios = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        tabla_usuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cedula", "Nombres", "Apellidos", "Telefono", "Direccion", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_usuarios.setOpaque(false);
        jScrollPane1.setViewportView(tabla_usuarios);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 810, 600));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("USUARIOS");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_usuarios;
    // End of variables declaration//GEN-END:variables
}

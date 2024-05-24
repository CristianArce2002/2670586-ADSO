package principal;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import util.ConsumoAPI;

public class Pokedex extends javax.swing.JFrame {

    int contador = 1;
    int limite_paginador = 9;
    int limite = 20;
    int pagina = 0;
    int pagina_actual = 0;
    String url = "https://pokeapi.co/api/v2/pokemon/1/";
    int cantidad_paginas = 0;
    int cantidad_pokemon = 0;
    int ultima_pagina = 0;

    public Pokedex() {
        initComponents();
        initAlterComponents();
    }

    public void initAlterComponents() {

        setTitle("Pokedex");
        setLocationRelativeTo(null);

        contenedor_botones.setLayout(new GridLayout(0, 1));
        paginador_botones.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));

        generar_paginador();
        generar_botones();
        mostrar();
        datos_tabla();

        btn_paginador_adelante.setBackground(Color.WHITE);
        btn_paginador_atras.setBackground(Color.WHITE);
        btn_paginador_final.setBackground(Color.WHITE);
        btn_paginador_inicio.setBackground(Color.WHITE);

        setVisible(true);

    }

    public void generar_paginador() {

        paginador_botones.removeAll();

        for (int i = contador; i < contador + limite_paginador; i++) {
            int pocicion = i;

            JButton boton = new JButton(Integer.toString(pocicion));
            boton.setPreferredSize(new Dimension(80, 50));
            boton.setBorder(btn_paginador_atras.getBorder());
            boton.setBackground(Color.WHITE);
            boton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    pagina = pocicion - 1;
                    generar_botones();
                }
            });
            paginador_botones.add(boton);
            if (pocicion == cantidad_paginas) {
                break;
            }

        }

        revalidate();
        repaint();

    }

    public void generar_botones() {

        contenedor_botones.removeAll();

        ConsumoAPI consumo = new ConsumoAPI();
        pagina_actual = pagina * limite;
        System.out.println(pagina_actual);
        String respuesta = consumo.consumoGET("https://pokeapi.co/api/v2/pokemon/?limit=" + limite + "&offset=" + pagina_actual);

        if (respuesta != null) {

            JsonArray pokemones = JsonParser.parseString(respuesta).getAsJsonObject().getAsJsonArray("results");
            JsonObject jsonObject = JsonParser.parseString(respuesta).getAsJsonObject();
            cantidad_pokemon = jsonObject.get("count").getAsInt();
            cantidad_paginas = (int) Math.ceil((double) cantidad_pokemon / limite);
            ultima_pagina = cantidad_pokemon / limite;

            System.out.println(cantidad_pokemon + " + " + cantidad_paginas);

            for (int i = 0; i < pokemones.size(); i++) {
                JsonObject pokemon = pokemones.get(i).getAsJsonObject();
                String nombre = pokemon.get("name").getAsString();

                JButton button = new JButton();
                button.setPreferredSize(new Dimension(100, 40));
                button.setBackground(Color.WHITE);
                button.setBorder(btn_paginador_atras.getBorder());
                button.setForeground(Color.BLACK);
                button.setBorder(BorderFactory.createLineBorder(Color.GRAY));
                button.setFont(new Font("Arial", Font.BOLD, 14));
                button.setText(nombre);
                button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        url = pokemon.get("url").getAsString();
                        mostrar();
                        datos_tabla();
                    }
                });
                contenedor_botones.add(button);

            }
        } else {
            System.out.println("Error al consumir la API");
        }

        revalidate();
        repaint();
    }

    public void datos_tabla() {
        ConsumoAPI consumo2 = new ConsumoAPI();
        String resultado2 = consumo2.consumoGET(url);

        JsonObject jsonObject = JsonParser.parseString(resultado2).getAsJsonObject();
        String id = jsonObject.get("id").getAsString();

        JsonArray abilitiesArray = jsonObject.getAsJsonArray("abilities");
        StringBuilder habilidades = new StringBuilder();
        abilitiesArray.forEach(element -> habilidades.append(element.getAsJsonObject().getAsJsonObject("ability").get("name").getAsString()).append(", "));
        if (habilidades.length() > 2) {
            habilidades.setLength(habilidades.length() - 2);
        }

        DefaultTableModel model = new DefaultTableModel(new Object[][]{{id, habilidades.toString(), url}}, new String[]{"Numero", "Habilidad", "Url"});
        tabla_pokemon.setModel(model);
        tabla_pokemon.setRowHeight(40);
    }

    public void mostrar() {

        ConsumoAPI consumo2 = new ConsumoAPI();
        String resultado2 = consumo2.consumoGET(url);

        JsonObject json_img = JsonParser.parseString(resultado2).getAsJsonObject();
        JsonObject sprites = json_img.getAsJsonObject("sprites");
        String officialArtworkUrl = sprites.get("other").getAsJsonObject().get("official-artwork").getAsJsonObject().get("front_default").getAsString();

        try {
            URL imagen = new URL(officialArtworkUrl);
            Image image = ImageIO.read(imagen);
            int width = img_pokemon.getWidth();
            int height = img_pokemon.getHeight();
            Image scaledImage = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);
            ImageIcon icon = new ImageIcon(scaledImage);
            img_pokemon.setIcon(icon);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        paginador = new javax.swing.JPanel();
        btn_paginador_atras = new javax.swing.JButton();
        btn_paginador_final = new javax.swing.JButton();
        btn_paginador_adelante = new javax.swing.JButton();
        paginador_botones = new javax.swing.JPanel();
        btn_paginador_inicio = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_pokemon = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        img_pokemon = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lista_pokemon = new javax.swing.JScrollPane();
        contenedor_botones = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(51, 255, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        paginador.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_paginador_atras.setText("<");
        btn_paginador_atras.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_paginador_atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_paginador_atrasActionPerformed(evt);
            }
        });
        paginador.add(btn_paginador_atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 80, 50));

        btn_paginador_final.setText(">>");
        btn_paginador_final.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_paginador_final.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_paginador_finalActionPerformed(evt);
            }
        });
        paginador.add(btn_paginador_final, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 0, 80, 50));

        btn_paginador_adelante.setText(">");
        btn_paginador_adelante.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_paginador_adelante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_paginador_adelanteActionPerformed(evt);
            }
        });
        paginador.add(btn_paginador_adelante, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 0, 80, 50));

        paginador_botones.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout paginador_botonesLayout = new javax.swing.GroupLayout(paginador_botones);
        paginador_botones.setLayout(paginador_botonesLayout);
        paginador_botonesLayout.setHorizontalGroup(
            paginador_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );
        paginador_botonesLayout.setVerticalGroup(
            paginador_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        paginador.add(paginador_botones, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 720, 50));

        btn_paginador_inicio.setText("<<");
        btn_paginador_inicio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_paginador_inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_paginador_inicioActionPerformed(evt);
            }
        });
        paginador.add(btn_paginador_inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 50));

        jPanel2.add(paginador, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 650, 1040, 50));

        tabla_pokemon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Numero", "Habilidad", "Url"
            }
        ));
        jScrollPane1.setViewportView(tabla_pokemon);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 820, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 530, 820, 100));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel5.add(img_pokemon, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 460, 460));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 820, 460));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("POKEDEX");
        jLabel1.setToolTipText("");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 820, 50));

        contenedor_botones.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contenedor_botonesLayout = new javax.swing.GroupLayout(contenedor_botones);
        contenedor_botones.setLayout(contenedor_botonesLayout);
        contenedor_botonesLayout.setHorizontalGroup(
            contenedor_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 198, Short.MAX_VALUE)
        );
        contenedor_botonesLayout.setVerticalGroup(
            contenedor_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 608, Short.MAX_VALUE)
        );

        lista_pokemon.setViewportView(contenedor_botones);

        jPanel2.add(lista_pokemon, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 200, 610));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1080, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_paginador_adelanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_paginador_adelanteActionPerformed

        if (contador <= cantidad_paginas) {
            generar_paginador();
            contador += limite_paginador;
        }
        
        System.out.println(pagina_actual);

    }//GEN-LAST:event_btn_paginador_adelanteActionPerformed

    private void btn_paginador_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_paginador_atrasActionPerformed

        contador -= limite_paginador;
        
        if (contador < 1) {
            contador = 1;
        } else {
            generar_paginador();
        }
        
    }//GEN-LAST:event_btn_paginador_atrasActionPerformed

    private void btn_paginador_inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_paginador_inicioActionPerformed
        pagina = 0;
        contador = 1;
        generar_botones();
        generar_paginador();
        mostrar();
    }//GEN-LAST:event_btn_paginador_inicioActionPerformed

    private void btn_paginador_finalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_paginador_finalActionPerformed
        contador = ultima_pagina;
        generar_botones();
        generar_paginador();
        mostrar();
    }//GEN-LAST:event_btn_paginador_finalActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_paginador_adelante;
    private javax.swing.JButton btn_paginador_atras;
    private javax.swing.JButton btn_paginador_final;
    private javax.swing.JButton btn_paginador_inicio;
    private javax.swing.JPanel contenedor_botones;
    private javax.swing.JLabel img_pokemon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane lista_pokemon;
    private javax.swing.JPanel paginador;
    private javax.swing.JPanel paginador_botones;
    private javax.swing.JTable tabla_pokemon;
    // End of variables declaration//GEN-END:variables

}

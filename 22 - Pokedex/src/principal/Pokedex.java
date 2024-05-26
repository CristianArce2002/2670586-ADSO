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
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
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

    int limitePaginador = 9;
    int limiteConsulta = 20;
    int contadorPagina = 1;
    int paginaActual = 0;
    JsonArray pokemons = new JsonArray();
    int cantidad_paginas = 0;
    int cantidad_pokemon = 0;
    int ultima_pagina = 0;
    String[] imagenes = new String[4];
    int indiceImagen = 0;
    String url = "";
    ConsumoAPI consumo = new ConsumoAPI();

    public Pokedex() {
        initComponents();
        initAlterComponents();
    }

    public void initAlterComponents() {

        setTitle("Pokedex");
        setLocationRelativeTo(null);

        contenedorBotones.setLayout(new GridLayout(0, 1));
        paginador_botones.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));

        obtenerPokemons();
        obtenerUrl(0);
        generarBotones();
        mostrarImagen();
        datosTabla();
        generarPaginador();

        btn_paginador_adelante.setBackground(Color.WHITE);
        btn_paginador_atras.setBackground(Color.WHITE);
        btn_paginador_final.setBackground(Color.WHITE);
        btn_paginador_inicio.setBackground(Color.WHITE);

        icono_izquierda.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (indiceImagen > 0) {
                    indiceImagen--;
                }
                generarImagen();
            }
        });

        icono_derecha.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (indiceImagen < (imagenes.length - 1)) {
                    indiceImagen++;
                }
                generarImagen();
            }
        });

        setVisible(true);

    }

    public void obtenerUrl(int indice) {
        url = pokemons.get(indice).getAsJsonObject().get("url").getAsString();
    }

    public void generarPaginador() {
        paginador_botones.removeAll();
        for (int i = contadorPagina; i < contadorPagina + limitePaginador; i++) {
            int pocicion = i;
            JButton boton = new JButton(Integer.toString(pocicion));
            boton.setPreferredSize(new Dimension(80, 50));
            boton.setBorder(btn_paginador_atras.getBorder());
            boton.setBackground(Color.WHITE);
            boton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    indiceImagen = 0;
                    paginaActual = (pocicion - 1) * 20;
                    obtenerPokemons();
                    obtenerUrl(0);
                    generarBotones();
                    mostrarImagen();
                    datosTabla();
                }
            });
            if (i > cantidad_paginas) {
                break;
            } else {
                paginador_botones.add(boton);
                revalidate();
                repaint();
            }
        }
    }

    public void obtenerPokemons() {
        String respuesta = consumo.consumoGET("https://pokeapi.co/api/v2/pokemon/?limit=" + limiteConsulta + "&offset=" + paginaActual);

        if (respuesta != null) {
            pokemons = new JsonArray();
            JsonObject objeto = JsonParser.parseString(respuesta).getAsJsonObject();
            JsonArray resultado = objeto.getAsJsonArray("results");
            cantidad_pokemon = objeto.get("count").getAsInt();
            cantidad_paginas = (cantidad_pokemon + limiteConsulta - 1) / limiteConsulta;

            for (int i = 0; i < resultado.size(); i++) {
                pokemons.add(resultado.get(i));
            }

        } else {
            System.out.println("Error al consumir la API");
        }
    }

    public void generarBotones() {
        contenedorBotones.removeAll();
        for (int i = 0; i < pokemons.size(); i++) {

            JsonObject objeto = pokemons.get(i).getAsJsonObject();
            String nombre = objeto.get("name").getAsString();
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
                    url = objeto.get("url").getAsString();
                    indiceImagen = 0;
                    mostrarImagen();
                    datosTabla();
                }
            });
            contenedorBotones.add(button);
            repaint();
            revalidate();
        }
    }

    public void datosTabla() {
        String resultado = consumo.consumoGET(url);
        JsonObject respuesta = JsonParser.parseString(resultado).getAsJsonObject();
        String nombrePokemon = respuesta.get("name").getAsString();
        JsonArray habilidades = respuesta.getAsJsonArray("abilities");

        Object[][] data = new Object[habilidades.size()][3];
        for (int i = 0; i < habilidades.size(); i++) {
            JsonObject habilidadPk = habilidades.get(i).getAsJsonObject().getAsJsonObject("ability");
            data[i][0] = i + 1;
            data[i][1] = habilidadPk.get("name").getAsString();
            data[i][2] = habilidadPk.get("url").getAsString();
        }

        tablaHabilidades.setModel(new DefaultTableModel(data, new String[]{"Numero", "Habilidad", "Url"}));
        tablaHabilidades.setRowHeight(20);
        etqNombre.setText(nombrePokemon);
    }

    public void mostrarImagen() {

        ConsumoAPI consumo = new ConsumoAPI();
        String resultado = consumo.consumoGET(url);

        JsonObject pokemon = JsonParser.parseString(resultado).getAsJsonObject();
        JsonObject sprites = pokemon.getAsJsonObject("sprites");
        JsonObject other = sprites.getAsJsonObject("other");
        JsonObject dreamWorld = other.getAsJsonObject("dream_world");
        JsonObject officialArtwork = other.getAsJsonObject("official-artwork");

        String imagen1 = "";
        String imagen2 = "";
        String imagen3 = "";
        String imagen4 = "";

        try {
            imagen1 = officialArtwork.get("front_default").getAsString();
            imagen2 = officialArtwork.get("front_shiny").getAsString();
            imagen3 = sprites.get("front_default").getAsString();
            imagen4 = sprites.get("front_shiny").getAsString();
        } catch (Exception e) {
            // Manejo de excepciones para todas las variables
        }

        imagenes[0] = imagen1;
        imagenes[1] = imagen2;
        imagenes[2] = imagen3;
        imagenes[3] = imagen4;

        generarImagen();
    }

    public void generarImagen() {
        try {
            ImageIcon icon = new ImageIcon(new URL(imagenes[indiceImagen]));
            Image image = icon.getImage();
            int width = img_pokemon.getWidth();
            int height = img_pokemon.getHeight();
            Image scaledImage = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);
            img_pokemon.setIcon(new ImageIcon(scaledImage));

        } catch (IOException e) {
            img_pokemon.setIcon(new ImageIcon("img/error.png"));
        }
        revalidate();
        repaint();
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
        tablaHabilidades = new javax.swing.JTable();
        panel_principal = new javax.swing.JPanel();
        img_pokemon = new javax.swing.JLabel();
        etqNombre = new javax.swing.JLabel();
        icono_izquierda = new javax.swing.JLabel();
        icono_derecha = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lista_pokemon = new javax.swing.JScrollPane();
        contenedorBotones = new javax.swing.JPanel();

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

        tablaHabilidades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Numero", "Habilidad", "Url"
            }
        ));
        jScrollPane1.setViewportView(tablaHabilidades);

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

        panel_principal.setBackground(new java.awt.Color(255, 255, 255));
        panel_principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panel_principal.add(img_pokemon, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 400, 400));

        etqNombre.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        etqNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqNombre.setText("Pokemon");
        panel_principal.add(etqNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 820, -1));

        icono_izquierda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/flecha_izquierda.png"))); // NOI18N
        icono_izquierda.setText("jLabel2");
        panel_principal.add(icono_izquierda, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 96, 96));

        icono_derecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/flecha_derechapng.png"))); // NOI18N
        icono_derecha.setText("jLabel2");
        panel_principal.add(icono_derecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 210, 96, 96));

        jPanel2.add(panel_principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 820, 460));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("POKEDEX");
        jLabel1.setToolTipText("");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 820, 50));

        contenedorBotones.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contenedorBotonesLayout = new javax.swing.GroupLayout(contenedorBotones);
        contenedorBotones.setLayout(contenedorBotonesLayout);
        contenedorBotonesLayout.setHorizontalGroup(
            contenedorBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 198, Short.MAX_VALUE)
        );
        contenedorBotonesLayout.setVerticalGroup(
            contenedorBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 608, Short.MAX_VALUE)
        );

        lista_pokemon.setViewportView(contenedorBotones);

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
        if (contadorPagina <= cantidad_paginas) {
            contadorPagina += limitePaginador;
            generarPaginador();
        }
        generarPaginador();
    }//GEN-LAST:event_btn_paginador_adelanteActionPerformed

    private void btn_paginador_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_paginador_atrasActionPerformed
        if (contadorPagina > limitePaginador) {
            contadorPagina -= limitePaginador;
            generarPaginador();
        }
    }//GEN-LAST:event_btn_paginador_atrasActionPerformed

    private void btn_paginador_inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_paginador_inicioActionPerformed
        contadorPagina = 1;
        generarPaginador();
    }//GEN-LAST:event_btn_paginador_inicioActionPerformed

    private void btn_paginador_finalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_paginador_finalActionPerformed
        contadorPagina = cantidad_pokemon / limiteConsulta - 1;
        generarPaginador();
    }//GEN-LAST:event_btn_paginador_finalActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_paginador_adelante;
    private javax.swing.JButton btn_paginador_atras;
    private javax.swing.JButton btn_paginador_final;
    private javax.swing.JButton btn_paginador_inicio;
    private javax.swing.JPanel contenedorBotones;
    private javax.swing.JLabel etqNombre;
    private javax.swing.JLabel icono_derecha;
    private javax.swing.JLabel icono_izquierda;
    private javax.swing.JLabel img_pokemon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane lista_pokemon;
    private javax.swing.JPanel paginador;
    private javax.swing.JPanel paginador_botones;
    private javax.swing.JPanel panel_principal;
    private javax.swing.JTable tablaHabilidades;
    // End of variables declaration//GEN-END:variables

}

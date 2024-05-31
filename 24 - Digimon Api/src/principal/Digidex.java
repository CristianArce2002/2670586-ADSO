package principal;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import utils.Card;
import utils.ConsumoAPI;
import utils.Digimon;

public class Digidex extends javax.swing.JFrame {

    ArrayList<Digimon> misDigimons = new ArrayList<>();
    ConsumoAPI consumo;
    int pagina = 0;
    int contadorPagina = 1;
    int totalPaginas = 0;

    public Digidex() {
        initComponents();
        initAlterComponents();
    }

    public void initAlterComponents() {

        setVisible(true);

        //logo principal digimon
        ImageIcon icon = new ImageIcon(getClass().getResource("../img/digimonLogo.png"));
        Image img = icon.getImage();
        Image escalado = img.getScaledInstance(etqLogo.getWidth(), etqLogo.getHeight(), java.awt.Image.SCALE_SMOOTH);
        icon = new ImageIcon(escalado);
        etqLogo.setIcon(icon);
        obtenerDigimons();
        añadirCards();
        generarPaginador();

    }

    public void obtenerDigimons() {
        //consumir api
        consumo = new ConsumoAPI();
        String api = "https://digi-api.com/api/v1/digimon?page=" + pagina;
        String data = consumo.consumoGET(api);
        JsonObject dataJson = JsonParser.parseString(data).getAsJsonObject();
        JsonArray digimons = dataJson.getAsJsonArray("content");
        JsonObject pageable = dataJson.getAsJsonObject("pageable");
        totalPaginas = pageable.get("totalPages").getAsInt();

        //añadir resultados a la lista
        for (JsonElement digimon : digimons) {
            JsonObject digimonObj = digimon.getAsJsonObject();
            String id = digimonObj.get("id").getAsString();
            String name = digimonObj.get("name").getAsString();
            String href = digimonObj.get("href").getAsString();
            String image = digimonObj.get("image").getAsString();
            Digimon miDigimon = new Digimon(id, name, href, image);
            misDigimons.add(miDigimon);
        }
    }

    public void añadirCards() {
        for (int i = 0; i < misDigimons.size(); i++) {
            Card hola = new Card(misDigimons.get(i));
            contenedorDigimons.add(hola);
        }
        contenedorDigimons.setLayout(new GridLayout(0, 3));
        revalidate();
        repaint();
    }

    public void generarPaginador() {
        panelPaginador.removeAll();
        panelPaginador.add(Box.createHorizontalGlue());

        JButton inicio = new JButton("<<");
        inicio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pagina = 0;
                añadirCards();
                generarPaginador();
            }
        });

        JButton moverIzquierda = new JButton("<");
        moverIzquierda.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (pagina > 0) {
                    pagina--;
                    añadirCards();
                    generarPaginador();
                }
            }
        });

        panelPaginador.add(inicio);
        panelPaginador.add(moverIzquierda);

        int inicioContador = contadorPagina * 7 + 1;
        int finContador = inicioContador + 6;

        if (pagina < inicioContador || pagina > finContador) {
            contadorPagina = pagina / 7;
            inicioContador = contadorPagina * 7 + 1;
            finContador = inicioContador + 6;
        } else if (pagina % 7 == 0 && pagina != 0) {
            contadorPagina++;
            inicioContador = contadorPagina * 7 + 1;
            finContador = inicioContador + 6;
        }

        for (int i = inicioContador; i <= finContador && i <= totalPaginas; i++) {
            int pagina_boton = i - 1;
            JButton boton = new JButton(String.valueOf(i));
            boton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    pagina = pagina_boton;
                    añadirCards();
                    generarPaginador();
                }
            });

            if (pagina_boton == pagina) {
                boton.setBackground(Color.BLUE);
                boton.setForeground(Color.WHITE);
            }

            panelPaginador.add(boton);
        }

        JButton moverDerecha = new JButton(">");
        moverDerecha.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (pagina < totalPaginas - 1) {
                    pagina++;
                    añadirCards();
                    generarPaginador();
                }
            }
        });

        JButton ultimo = new JButton(">>");
        ultimo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pagina = totalPaginas - 1;
                añadirCards();
                generarPaginador();
            }
        });

        panelPaginador.add(moverDerecha);
        panelPaginador.add(ultimo);
        panelPaginador.setAlignmentX(Component.CENTER_ALIGNMENT);
        revalidate();
        repaint();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        etqLogo = new javax.swing.JLabel();
        panelPaginador = new javax.swing.JPanel();
        contenedorDigimons = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(etqLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 409, 60));

        javax.swing.GroupLayout panelPaginadorLayout = new javax.swing.GroupLayout(panelPaginador);
        panelPaginador.setLayout(panelPaginadorLayout);
        panelPaginadorLayout.setHorizontalGroup(
            panelPaginadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
        );
        panelPaginadorLayout.setVerticalGroup(
            panelPaginadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel1.add(panelPaginador, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 600, 760, -1));

        javax.swing.GroupLayout contenedorDigimonsLayout = new javax.swing.GroupLayout(contenedorDigimons);
        contenedorDigimons.setLayout(contenedorDigimonsLayout);
        contenedorDigimonsLayout.setHorizontalGroup(
            contenedorDigimonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
        );
        contenedorDigimonsLayout.setVerticalGroup(
            contenedorDigimonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );

        jPanel1.add(contenedorDigimons, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 760, 470));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contenedorDigimons;
    private javax.swing.JLabel etqLogo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelPaginador;
    // End of variables declaration//GEN-END:variables
}

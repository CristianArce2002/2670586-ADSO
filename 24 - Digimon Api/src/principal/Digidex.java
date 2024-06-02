package principal;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import utils.Card;
import utils.ConsumoAPI;
import utils.Digimon;

public class Digidex extends javax.swing.JFrame {

    ArrayList<Digimon> misDigimons = new ArrayList<>();
    int pagina = 0;
    int totalPaginas = 0;
    int rango = 0;

    public Digidex() {
        initComponents();
        initAlterComponents();
    }

    public void initAlterComponents() {

        setVisible(true);

        // Logo principal digimon
        ImageIcon icon = new ImageIcon(getClass().getResource("../img/digimonLogo.png"));
        Image img = icon.getImage();
        Image escalado = img.getScaledInstance(etqLogo.getWidth(), etqLogo.getHeight(), java.awt.Image.SCALE_SMOOTH);
        icon = new ImageIcon(escalado);
        etqLogo.setIcon(icon);

        cargarElementos();

    }

    public void cargarElementos() {
        obtenerDigimons();
        añadirCards();
        generarPaginador();
    }

    public void obtenerDigimons() {
        misDigimons.clear();
        
        // Consumir api
        ConsumoAPI consumo = new ConsumoAPI();
        String api = "https://digi-api.com/api/v1/digimon?page=" + pagina;
        String data = consumo.consumoGET(api);
        
        // Obtener resultados
        JsonObject dataJson = JsonParser.parseString(data).getAsJsonObject();
        JsonArray digimons = dataJson.getAsJsonArray("content");
        JsonObject pageable = dataJson.getAsJsonObject("pageable");
        totalPaginas = pageable.get("totalPages").getAsInt();

        // Agregar resultados a la lista
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
        contenedorDigimons.removeAll();
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

        // Ajustar el rango del paginador
        if (pagina >= rango + 7) {
            rango += 7;
        } else if (pagina < rango) {
            rango -= 7;
        }

        // Mover a la primera página
        JButton inicio = new JButton("<<");
        inicio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rango = 0;
                pagina = 0;
                cargarElementos();
            }
        });

        // Mover a la pagina anterior
        JButton izquierda = new JButton("<");
        izquierda.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (pagina > 0) {
                    pagina--;
                    cargarElementos();
                }
            }
        });

        panelPaginador.add(inicio);
        panelPaginador.add(izquierda);

        // Generar botones intermedios
        for (int i = rango; i < rango + 7; i++) {
            int numeroPagina = i;
            JButton btnPaginador = new JButton(String.valueOf(numeroPagina + 1));
            btnPaginador.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    pagina = numeroPagina;
                    cargarElementos();
                }
            });

            // Cambiar color al boton seleccionado
            if (numeroPagina == pagina) {
                btnPaginador.setBackground(Color.BLUE);
                btnPaginador.setForeground(Color.WHITE);
            }
            panelPaginador.add(btnPaginador);
        }

        // Mover a la pagina siguiente
        JButton derecha = new JButton(">");
        derecha.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (pagina < totalPaginas - 1) {
                    pagina++;
                    cargarElementos();
                }
            }
        });

        // Mover a la ultima pagina
        JButton ultimo = new JButton(">>");
        ultimo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rango = totalPaginas;
                pagina = totalPaginas - 7;
                cargarElementos();
            }
        });

        panelPaginador.add(derecha);
        panelPaginador.add(ultimo);
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
        jPanel1.add(etqLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 320, 60));

        panelPaginador.setLayout(new java.awt.GridLayout());
        jPanel1.add(panelPaginador, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 600, 760, 50));

        contenedorDigimons.setLayout(new javax.swing.BoxLayout(contenedorDigimons, javax.swing.BoxLayout.LINE_AXIS));
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

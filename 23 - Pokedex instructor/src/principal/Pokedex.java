package principal;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import utils.ConsumoAPI;

public class Pokedex extends javax.swing.JFrame {

    ConsumoAPI consumo;
    int pagina;
    int[] listaNumeros = {1, 2, 3, 4, 5, 6, 7};
    int paginaActual = 0;
    int cantidadPokemon;
    int cantidadPaginas;
    int paginaContador = 1;

    public Pokedex() {
        this.consumo = new ConsumoAPI();
        this.pagina = 1;

        initComponents();
        initAlternComponents();
        cargarPokemones();
        cargarPaginador();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentPrincipal = new javax.swing.JPanel();
        etqTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        panelBotones = new javax.swing.JPanel();
        panelDetalle = new javax.swing.JPanel();
        panelPaginador = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        contentPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        etqTitulo.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        etqTitulo.setForeground(new java.awt.Color(204, 0, 0));
        etqTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqTitulo.setText("POKEMON");

        panelBotones.setLayout(new javax.swing.BoxLayout(panelBotones, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(panelBotones);

        javax.swing.GroupLayout panelDetalleLayout = new javax.swing.GroupLayout(panelDetalle);
        panelDetalle.setLayout(panelDetalleLayout);
        panelDetalleLayout.setHorizontalGroup(
            panelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 618, Short.MAX_VALUE)
        );
        panelDetalleLayout.setVerticalGroup(
            panelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        panelPaginador.setLayout(new javax.swing.BoxLayout(panelPaginador, javax.swing.BoxLayout.X_AXIS));

        javax.swing.GroupLayout contentPrincipalLayout = new javax.swing.GroupLayout(contentPrincipal);
        contentPrincipal.setLayout(contentPrincipalLayout);
        contentPrincipalLayout.setHorizontalGroup(
            contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etqTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(contentPrincipalLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelPaginador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(contentPrincipalLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        contentPrincipalLayout.setVerticalGroup(
            contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPrincipalLayout.createSequentialGroup()
                .addComponent(etqTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
                    .addComponent(panelDetalle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelPaginador, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void initAlternComponents() {
        setTitle("POKEDEX");
        setIconImage(getToolkit().createImage(ClassLoader.getSystemResource("imagenes/pokeball.png")));
        setLocationRelativeTo(null);
        setVisible(true);

    }

    public void cargarPokemones() {
        panelBotones.removeAll();
        int offset = (paginaActual * 20);
        String endpoint = "https://pokeapi.co/api/v2/pokemon?offset=" + offset + "&limit=20";
        String data = this.consumo.consumoGET(endpoint);
        JsonObject dataJson = JsonParser.parseString(data).getAsJsonObject();
        JsonArray results = dataJson.getAsJsonArray("results");
        cantidadPokemon = dataJson.get("count").getAsInt();
        cantidadPaginas = (cantidadPokemon / 20) + ((cantidadPokemon % 20 > 0) ? 1 : 0);

        for (int i = 0; i < results.size(); i++) {
            JsonObject temp = results.get(i).getAsJsonObject();
            JButton btn = new JButton(temp.get("name").getAsString());
            panelBotones.add(btn);
            btn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("Nombre: " + temp.get("name").getAsString());
                    System.out.println("Url: " + temp.get("url").getAsString());
                    panelDetalle.removeAll();
                    DetallePokemon detalle = new DetallePokemon(temp);
                    detalle.setSize(panelDetalle.getSize());
                    detalle.setPreferredSize(panelDetalle.getPreferredSize());
                    panelDetalle.add(detalle);
                    revalidate();
                    repaint();
                }
            });
        }

        panelDetalle.removeAll();
        DetallePokemon detalle = new DetallePokemon(results.get(0).getAsJsonObject());
        detalle.setSize(panelDetalle.getSize());
        detalle.setPreferredSize(panelDetalle.getPreferredSize());
        panelDetalle.add(detalle);
        revalidate();
        repaint();
    }

    public void cargarPaginador() {
        panelPaginador.removeAll();
        panelPaginador.add(Box.createHorizontalGlue());

        JButton inicio = new JButton("<<");
        inicio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                paginaActual = 0;
                cargarPokemones();
                cargarPaginador();
            }
        });

        JButton moverIzquierda = new JButton("<");
        moverIzquierda.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (paginaActual > 0) {
                    paginaActual--;
                    cargarPokemones();
                    cargarPaginador();
                }
            }
        });

        panelPaginador.add(inicio);
        panelPaginador.add(moverIzquierda);

        int inicioContador = paginaContador * 7 + 1;
        int finContador = inicioContador + 6;

        if (paginaActual < inicioContador || paginaActual > finContador) {
            paginaContador = paginaActual / 7;
            inicioContador = paginaContador * 7 + 1;
            finContador = inicioContador + 6;
        } else if (paginaActual % 7 == 0 && paginaActual != 0) {
            paginaContador++;
            inicioContador = paginaContador * 7 + 1;
            finContador = inicioContador + 6;
        }

        for (int i = inicioContador; i <= finContador && i <= cantidadPaginas; i++) {
            int pagina_boton = i - 1;
            JButton boton = new JButton(String.valueOf(i));
            boton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    paginaActual = pagina_boton;
                    cargarPokemones();
                    cargarPaginador();
                }
            });

            if (pagina_boton == paginaActual) {
                boton.setBackground(Color.BLUE);
                boton.setForeground(Color.WHITE);
            }

            panelPaginador.add(boton);
        }

        JButton moverDerecha = new JButton(">");
        moverDerecha.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (paginaActual < cantidadPaginas - 1) {
                    paginaActual++;
                    cargarPokemones();
                    cargarPaginador();
                }
            }
        });

        JButton ultimo = new JButton(">>");
        ultimo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                paginaActual = cantidadPaginas - 1;
                cargarPokemones();
                cargarPaginador();
            }
        });

        panelPaginador.add(moverDerecha);
        panelPaginador.add(ultimo);
        panelPaginador.setAlignmentX(Component.CENTER_ALIGNMENT);
        panelPaginador.revalidate();
        panelPaginador.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contentPrincipal;
    private javax.swing.JLabel etqTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JPanel panelDetalle;
    private javax.swing.JPanel panelPaginador;
    // End of variables declaration//GEN-END:variables
}

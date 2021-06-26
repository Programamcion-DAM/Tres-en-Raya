
package ventanas;

import java.awt.Cursor;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;


public class VentanaJuego extends javax.swing.JFrame {

    private Tablero tablero = new Tablero();
    private int victoriasMaquina=0;
    private int empate=0;
    private int victoriasJugador=0;
    
    public VentanaJuego() {
        initComponents();
        setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        panel = new javax.swing.JPanel();
        boton00 = new javax.swing.JButton();
        boton01 = new javax.swing.JButton();
        boton02 = new javax.swing.JButton();
        boton10 = new javax.swing.JButton();
        boton11 = new javax.swing.JButton();
        boton12 = new javax.swing.JButton();
        boton20 = new javax.swing.JButton();
        boton21 = new javax.swing.JButton();
        boton22 = new javax.swing.JButton();
        barraMenu = new javax.swing.JMenuBar();
        menuJuego = new javax.swing.JMenu();
        menuItemReinciarPartida = new javax.swing.JMenuItem();
        menuItemMostrarEstadisticas = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menuItemSalir = new javax.swing.JMenuItem();
        menuAyuda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Partida ");
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setResizable(false);

        panel.setBackground(new java.awt.Color(0, 153, 153));
        panel.setMinimumSize(new java.awt.Dimension(800, 760));
        panel.setLayout(new java.awt.GridBagLayout());

        boton00.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imagenEnBlanco 250px.png"))); // NOI18N
        boton00.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        boton00.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton00ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panel.add(boton00, gridBagConstraints);

        boton01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imagenEnBlanco 250px.png"))); // NOI18N
        boton01.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        boton01.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton01ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panel.add(boton01, gridBagConstraints);

        boton02.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imagenEnBlanco 250px.png"))); // NOI18N
        boton02.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        boton02.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton02ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panel.add(boton02, gridBagConstraints);

        boton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imagenEnBlanco 250px.png"))); // NOI18N
        boton10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        boton10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton10ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panel.add(boton10, gridBagConstraints);

        boton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imagenEnBlanco 250px.png"))); // NOI18N
        boton11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        boton11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton11ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panel.add(boton11, gridBagConstraints);

        boton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imagenEnBlanco 250px.png"))); // NOI18N
        boton12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        boton12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton12ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panel.add(boton12, gridBagConstraints);

        boton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imagenEnBlanco 250px.png"))); // NOI18N
        boton20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        boton20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton20ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panel.add(boton20, gridBagConstraints);

        boton21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imagenEnBlanco 250px.png"))); // NOI18N
        boton21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        boton21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton21ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panel.add(boton21, gridBagConstraints);

        boton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imagenEnBlanco 250px.png"))); // NOI18N
        boton22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        boton22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton22ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panel.add(boton22, gridBagConstraints);

        barraMenu.setBackground(new java.awt.Color(248, 248, 248));
        barraMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        barraMenu.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N

        menuJuego.setText("Juego");
        menuJuego.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        menuItemReinciarPartida.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        menuItemReinciarPartida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imagenReiniciar(sin convertir).png"))); // NOI18N
        menuItemReinciarPartida.setText("Reinciar Partida");
        menuItemReinciarPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemReinciarPartidaActionPerformed(evt);
            }
        });
        menuJuego.add(menuItemReinciarPartida);

        menuItemMostrarEstadisticas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        menuItemMostrarEstadisticas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imagenVerTablero(sin convertir).png"))); // NOI18N
        menuItemMostrarEstadisticas.setText("Mostrar Estadisticas");
        menuItemMostrarEstadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemMostrarEstadisticasActionPerformed(evt);
            }
        });
        menuJuego.add(menuItemMostrarEstadisticas);
        menuJuego.add(jSeparator1);

        menuItemSalir.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        menuItemSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imagenMenuSalir(sin convertir).png"))); // NOI18N
        menuItemSalir.setText("Salir");
        menuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSalirActionPerformed(evt);
            }
        });
        menuJuego.add(menuItemSalir);

        barraMenu.add(menuJuego);

        menuAyuda.setText("Ayuda");
        menuAyuda.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        menuAyuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuAyudaMouseClicked(evt);
            }
        });
        barraMenu.add(menuAyuda);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 802, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 760, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuItemSalirActionPerformed

    private void boton02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton02ActionPerformed
        if(tablero.getFicha(0, 2).equals("")){
            boton02.setIcon(new ImageIcon(getClass().getResource("/imagenes/imagenCruzRoja 250px.jpg")));
            tablero.setFicha(0, 2, "x");
            boton02.setCursor(new Cursor(0));
            turnoOtro();
        } 
    }//GEN-LAST:event_boton02ActionPerformed

    private void boton00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton00ActionPerformed
        if(tablero.getFicha(0, 0).equals("")){
            boton00.setIcon(new ImageIcon(getClass().getResource("/imagenes/imagenCruzRoja 250px.jpg")));
            tablero.setFicha(0, 0, "x");
            boton00.setCursor(new Cursor(0));
            turnoOtro();
        }  
    }//GEN-LAST:event_boton00ActionPerformed

    private void boton01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton01ActionPerformed
        if(tablero.getFicha(0, 1).equals("")){
            boton01.setIcon(new ImageIcon(getClass().getResource("/imagenes/imagenCruzRoja 250px.jpg")));
            tablero.setFicha(0, 1, "x");
            boton01.setCursor(new Cursor(0));
            turnoOtro();
        } 
    }//GEN-LAST:event_boton01ActionPerformed

    private void boton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton10ActionPerformed
        if(tablero.getFicha(1, 0).equals("")){
            boton10.setIcon(new ImageIcon(getClass().getResource("/imagenes/imagenCruzRoja 250px.jpg")));
            tablero.setFicha(1, 0, "x");
            boton10.setCursor(new Cursor(0));
            turnoOtro();
        } 
    }//GEN-LAST:event_boton10ActionPerformed

    private void boton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton11ActionPerformed
        if(tablero.getFicha(1, 1).equals("")){
            boton11.setIcon(new ImageIcon(getClass().getResource("/imagenes/imagenCruzRoja 250px.jpg")));
            tablero.setFicha(1, 1, "x");
            boton11.setCursor(new Cursor(0));
            turnoOtro();
        } 
    }//GEN-LAST:event_boton11ActionPerformed

    private void boton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton12ActionPerformed
        if(tablero.getFicha(1, 2).equals("")){
            boton12.setIcon(new ImageIcon(getClass().getResource("/imagenes/imagenCruzRoja 250px.jpg")));
            tablero.setFicha(1, 2, "x");
            boton12.setCursor(new Cursor(0));
            turnoOtro();
        } 
    }//GEN-LAST:event_boton12ActionPerformed

    private void boton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton20ActionPerformed
        if(tablero.getFicha(2, 0).equals("")){
            boton20.setIcon(new ImageIcon(getClass().getResource("/imagenes/imagenCruzRoja 250px.jpg")));
            tablero.setFicha(2, 0, "x");
            boton20.setCursor(new Cursor(0));
            turnoOtro();
        } 
    }//GEN-LAST:event_boton20ActionPerformed

    private void boton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton21ActionPerformed
        if(tablero.getFicha(2, 1).equals("")){
            boton21.setIcon(new ImageIcon(getClass().getResource("/imagenes/imagenCruzRoja 250px.jpg")));
            tablero.setFicha(2, 1, "x");
            boton21.setCursor(new Cursor(0));
            turnoOtro();
        } 
    }//GEN-LAST:event_boton21ActionPerformed

    private void boton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton22ActionPerformed
        if(tablero.getFicha(2, 2).equals("")){
            boton22.setIcon(new ImageIcon(getClass().getResource("/imagenes/imagenCruzRoja 250px.jpg")));
            tablero.setFicha(2, 2, "x");
            boton22.setCursor(new Cursor(0));
            turnoOtro();
        } 
    }//GEN-LAST:event_boton22ActionPerformed

    private void menuItemReinciarPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemReinciarPartidaActionPerformed
        VentanaJuego ventana = new VentanaJuego();
        ventana.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuItemReinciarPartidaActionPerformed

    private void menuItemMostrarEstadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemMostrarEstadisticasActionPerformed
        VentanaTabla ventanaT = new VentanaTabla(this,true,victoriasJugador,victoriasMaquina,empate);
        ventanaT.setVisible(true);
    }//GEN-LAST:event_menuItemMostrarEstadisticasActionPerformed

    private void menuAyudaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuAyudaMouseClicked
        try {
            try {
                Desktop.getDesktop().browse(new URI("https://es.wikipedia.org/wiki/Tres_en_l%C3%ADnea"));
            } catch (IOException ex) {
                Logger.getLogger(VentanaJuego.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (URISyntaxException ex) {
            Logger.getLogger(VentanaJuego.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_menuAyudaMouseClicked
        
    private void reiniciarPartida(){
        tablero.reiniciarTablero();
        reiniciarBotones();  
    }
    
    private void reiniciarBotones(){
        reiniciarBoton(boton00);
        reiniciarBoton(boton01);
        reiniciarBoton(boton02);
        reiniciarBoton(boton10);
        reiniciarBoton(boton11);
        reiniciarBoton(boton12);
        reiniciarBoton(boton20);
        reiniciarBoton(boton21);
        reiniciarBoton(boton22);
    }
    
    private void reiniciarBoton(JButton boton){
        boton.setIcon(new ImageIcon(getClass().getResource("/imagenes/imagenEnBlanco 250px.png")));
        boton.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }
    
    private void turnoOtro(){
        if(comprobarGanador() == false){
            turnoMaquinaDificil();
        }
        else{
            insertarGanador();
        }    
    }
    
    
    private void turnoMaquinaDificil(){
        turnoMaquina();
        if(comprobarGanador()){
            insertarGanador();
        }
    }
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaJuego().setVisible(true);
            }
        });
    }
    
    private void insertarGanador(){
        if(tablero.comprobarTresEnRaya().equals("empate")){
            VentanaEmpateJuego ventanaEJ = new VentanaEmpateJuego(this,true);
            ventanaEJ.setVisible(true);
            reiniciarPartida();
            empate++;
        }
        else{
           ventanaGanaMaquina ventanaGM = new ventanaGanaMaquina(this,true);
           ventanaGM.setVisible(true);
           reiniciarPartida();
           victoriasMaquina++;
        }
    }
    
   private boolean comprobarGanador(){
       if(tablero.comprobarTresEnRaya().equals("x")){           
           return true;          
       }
       else if(tablero.comprobarTresEnRaya().equals("o")){           
           return true;
           
       }       
       else if(tablero.comprobarTresEnRaya().equals("empate")){
           return true;
       }
       return false;
   }
   
   private void turnoMaquina(){
       char fila = tablero.insertarFichaO().charAt(0);
       char columna = tablero.insertarFichaO().charAt(1);
       
       int numeroFila = Character.getNumericValue(fila);
       int numeroColumna = Character.getNumericValue(columna);
       
       insertarFichaO(numeroFila,numeroColumna);
       
   }
   
   private void insertarFichaO(int x , int y){
       if(x == 0 && y == 0){
           boton00.setIcon(new ImageIcon(getClass().getResource("/imagenes/imagenCirculoAzul 250px.jpg")));
           boton00.setCursor(new Cursor(0));
       }
       else if(x == 0 && y == 1){
           boton01.setIcon(new ImageIcon(getClass().getResource("/imagenes/imagenCirculoAzul 250px.jpg")));
           boton01.setCursor(new Cursor(0));
       }
       else if(x == 0 && y == 2){
           boton02.setIcon(new ImageIcon(getClass().getResource("/imagenes/imagenCirculoAzul 250px.jpg")));
           boton02.setCursor(new Cursor(0));
       }
       else if(x == 1 && y == 0){
           boton10.setIcon(new ImageIcon(getClass().getResource("/imagenes/imagenCirculoAzul 250px.jpg")));
           boton10.setCursor(new Cursor(0));
       }
       else if(x == 1 && y == 1){
           boton11.setIcon(new ImageIcon(getClass().getResource("/imagenes/imagenCirculoAzul 250px.jpg")));
           boton11.setCursor(new Cursor(0));
       }
       else if(x == 1 && y == 2){
           boton12.setIcon(new ImageIcon(getClass().getResource("/imagenes/imagenCirculoAzul 250px.jpg")));
           boton12.setCursor(new Cursor(0));
       }
       else if(x == 2 && y == 0){
           boton20.setIcon(new ImageIcon(getClass().getResource("/imagenes/imagenCirculoAzul 250px.jpg")));
           boton20.setCursor(new Cursor(0));
           
       }
       else if(x == 2 && y == 1){
           boton21.setIcon(new ImageIcon(getClass().getResource("/imagenes/imagenCirculoAzul 250px.jpg")));
           boton21.setCursor(new Cursor(0));
       }
       else  if(x == 2 && y == 2){
           boton22.setIcon(new ImageIcon(getClass().getResource("/imagenes/imagenCirculoAzul 250px.jpg")));
           boton22.setCursor(new Cursor(0));
       }
       tablero.setFicha(x, y, "o");
   }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JButton boton00;
    private javax.swing.JButton boton01;
    private javax.swing.JButton boton02;
    private javax.swing.JButton boton10;
    private javax.swing.JButton boton11;
    private javax.swing.JButton boton12;
    private javax.swing.JButton boton20;
    private javax.swing.JButton boton21;
    private javax.swing.JButton boton22;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu menuAyuda;
    private javax.swing.JMenuItem menuItemMostrarEstadisticas;
    private javax.swing.JMenuItem menuItemReinciarPartida;
    private javax.swing.JMenuItem menuItemSalir;
    private javax.swing.JMenu menuJuego;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}

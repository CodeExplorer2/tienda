/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventana;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author usuario
 */
public class listaCompra extends javax.swing.JFrame {
       FondoPanel fondo=new FondoPanel();
       
    DefaultListModel tienda1=new DefaultListModel();
    DefaultListModel tienda2=new DefaultListModel();

   
    public listaCompra() {
         this.setContentPane(fondo);
        initComponents();
        
         Coches.setModel(tienda1);
         añadidos.setModel(tienda2);
         
         tienda1.add(0, "tesla Model Y");
         tienda1.add(0, "tesla Model 3");
         tienda1.add(0, "tesla Model S");
         tienda1.add(0, "tesla Model X");
         tienda1.add(0, "Tesla Model Cybertruck");
         tienda1.add(0, "Tesla Model Roadster");
       
           Pedido.setModel(tienda2);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JTabbedPane();
        fondo1 = new FondoPanel
        ();
        jScrollPane1 = new javax.swing.JScrollPane();
        Coches = new javax.swing.JList<>();
        añadir = new javax.swing.JButton();
        pedido = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        añadidos = new javax.swing.JList<>();
        Eliminar = new javax.swing.JButton();
        jPanel2 = new FondoPanel();
        salir = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        Pedido = new javax.swing.JList<>();
        Pagar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(new java.awt.Color(255, 255, 255));
        panel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        Coches.setBackground(new java.awt.Color(238, 101, 101));
        Coches.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Coches.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Tesla Model Y", "Tesla Model 3", "Tesla Model S", "Tesla Model X", "Tesla Model Cybertruck", "Tesla Model Roadster", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        Coches.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(Coches);

        añadir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        añadir.setText("Añadir");
        añadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirActionPerformed(evt);
            }
        });

        pedido.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        pedido.setText("Hacer Pedido");
        pedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pedidoActionPerformed(evt);
            }
        });

        añadidos.setBackground(new java.awt.Color(238, 101, 101));
        añadidos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jScrollPane2.setViewportView(añadidos);

        Eliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout fondo1Layout = new javax.swing.GroupLayout(fondo1);
        fondo1.setLayout(fondo1Layout);
        fondo1Layout.setHorizontalGroup(
            fondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondo1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114)
                .addComponent(añadir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondo1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118))
            .addGroup(fondo1Layout.createSequentialGroup()
                .addGap(383, 383, 383)
                .addComponent(pedido, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        fondo1Layout.setVerticalGroup(
            fondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondo1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(fondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondo1Layout.createSequentialGroup()
                        .addComponent(añadir, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pedido, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))
                    .addGroup(fondo1Layout.createSequentialGroup()
                        .addGroup(fondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                            .addComponent(jScrollPane2))
                        .addGap(33, 33, 33)
                        .addComponent(Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(94, Short.MAX_VALUE))))
        );

        panel.addTab("Tienda", fondo1);

        salir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        salir.setText("Cancelar Pedido");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        Pedido.setBackground(new java.awt.Color(238, 101, 101));
        Pedido.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jScrollPane4.setViewportView(Pedido);

        Pagar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Pagar.setText("Confirmar Pedido");
        Pagar.setSelected(true);
        Pagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PagarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(299, 299, 299)
                .addComponent(salir)
                .addGap(206, 206, 206))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(Pagar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(salir)))
                .addGap(45, 45, 45)
                .addComponent(Pagar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        panel.addTab("Mi Carrito", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pedidoActionPerformed
        
        panel.setSelectedIndex(1);
       /* for (int i=0; i<tienda2.getSize();i++){
            Pedido.setModel(tienda2);
        }
        */
       
    }//GEN-LAST:event_pedidoActionPerformed

    private void añadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirActionPerformed
     
        String a = Coches.getSelectedValue();
        tienda2.addElement(a);
        
        
    }//GEN-LAST:event_añadirActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        
        int  texto= añadidos.getSelectedIndex();
        if( texto >-1){
            tienda2.remove(texto);
        }
       
        
    }//GEN-LAST:event_EliminarActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
       
        tienda2.clear();
        
         panel.setSelectedIndex(-1);
         
         JOptionPane.showMessageDialog(this, "Compra sin exito, Revise su pedido");
        
    }//GEN-LAST:event_salirActionPerformed

    private void PagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PagarActionPerformed
        JOptionPane.showMessageDialog(this, "Compra con Exito");
        
        
    }//GEN-LAST:event_PagarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(listaCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(listaCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(listaCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(listaCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new listaCompra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> Coches;
    private javax.swing.JButton Eliminar;
    private javax.swing.JButton Pagar;
    private javax.swing.JList<String> Pedido;
    private javax.swing.JList<String> añadidos;
    private javax.swing.JButton añadir;
    private javax.swing.JPanel fondo1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane panel;
    private javax.swing.JButton pedido;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}

class FondoPanel extends JPanel{
    private Image imagen;
    
   @Override
   public void paint (Graphics g){
       
       imagen=new ImageIcon(getClass().getResource("/imagenes/tesla.jpg")).getImage();
       g.drawImage(imagen, 0, 0, getWidth(),getHeight(),this);
       setOpaque(false);
       super.paint(g);
       
       
   }
}
package vistas;

import tp6.Directorio;


public class menuVista extends javax.swing.JFrame {
private Directorio directorio=new Directorio();

    
    public menuVista() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        Salir = new javax.swing.JMenuBar();
        buscar = new javax.swing.JMenu();
        jmBuscar = new javax.swing.JRadioButtonMenuItem();
        jmEditar = new javax.swing.JMenu();
        jmAgregar = new javax.swing.JRadioButtonMenuItem();
        jmBorrar = new javax.swing.JRadioButtonMenuItem();
        jmSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1034, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 713, Short.MAX_VALUE)
        );

        buscar.setText("Buscar");

        jmBuscar.setSelected(true);
        jmBuscar.setText("Buscar Cliente");
        jmBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmBuscarActionPerformed(evt);
            }
        });
        buscar.add(jmBuscar);

        Salir.add(buscar);

        jmEditar.setText("Editar");
        jmEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmEditarActionPerformed(evt);
            }
        });

        jmAgregar.setSelected(true);
        jmAgregar.setText("Agregar Cliente");
        jmAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmAgregarActionPerformed(evt);
            }
        });
        jmEditar.add(jmAgregar);

        jmBorrar.setSelected(true);
        jmBorrar.setText("Borrar Cliente");
        jmBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmBorrarActionPerformed(evt);
            }
        });
        jmEditar.add(jmBorrar);

        Salir.add(jmEditar);

        jmSalir.setText("Salir");
        jmSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmSalirActionPerformed(evt);
            }
        });
        Salir.add(jmSalir);

        setJMenuBar(Salir);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmSalirActionPerformed
       dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_jmSalirActionPerformed

    private void jmEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmEditarActionPerformed

    private void jmAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmAgregarActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        formularioVista Bv = new formularioVista(directorio);
        Bv.setVisible(true);
        escritorio.add(Bv);
        escritorio.moveToFront(Bv);
    }//GEN-LAST:event_jmAgregarActionPerformed

    private void jmBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmBorrarActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        borrarVista Bv = new borrarVista();
        Bv.setVisible(true);
        escritorio.add(Bv);
        escritorio.moveToFront(Bv);//para mandar ventana al frente
    }//GEN-LAST:event_jmBorrarActionPerformed

    private void jmBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmBuscarActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        busquedaVista bv = new busquedaVista();
        bv.setVisible(true);
        escritorio.add(bv);
        escritorio.moveToFront(bv);//para mandar ventana al frente
    }//GEN-LAST:event_jmBuscarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(menuVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuVista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar Salir;
    private javax.swing.JMenu buscar;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JRadioButtonMenuItem jmAgregar;
    private javax.swing.JRadioButtonMenuItem jmBorrar;
    private javax.swing.JRadioButtonMenuItem jmBuscar;
    private javax.swing.JMenu jmEditar;
    private javax.swing.JMenu jmSalir;
    // End of variables declaration//GEN-END:variables
}

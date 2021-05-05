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
        jmBuscar = new javax.swing.JMenu();
        jRadioButtonMenuItem3 = new javax.swing.JRadioButtonMenuItem();
        jmEditar = new javax.swing.JMenu();
        jrbmAgregar = new javax.swing.JRadioButtonMenuItem();
        jrbmBorrar = new javax.swing.JRadioButtonMenuItem();
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

        jmBuscar.setText("Buscar");

        jRadioButtonMenuItem3.setSelected(true);
        jRadioButtonMenuItem3.setText("Buscar Cliente");
        jRadioButtonMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem3ActionPerformed(evt);
            }
        });
        jmBuscar.add(jRadioButtonMenuItem3);

        Salir.add(jmBuscar);

        jmEditar.setText("Editar");
        jmEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmEditarActionPerformed(evt);
            }
        });

        jrbmAgregar.setSelected(true);
        jrbmAgregar.setText("Agregar Cliente");
        jrbmAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbmAgregarActionPerformed(evt);
            }
        });
        jmEditar.add(jrbmAgregar);

        jrbmBorrar.setSelected(true);
        jrbmBorrar.setText("Borrar Cliente");
        jrbmBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbmBorrarActionPerformed(evt);
            }
        });
        jmEditar.add(jrbmBorrar);

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

    private void jrbmBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbmBorrarActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        borrarVista Bv = new borrarVista();
        Bv.setVisible(true);
        escritorio.add(Bv);
        escritorio.moveToFront(Bv);//para mandar ventana al frente
    }//GEN-LAST:event_jrbmBorrarActionPerformed

    private void jRadioButtonMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem3ActionPerformed
       escritorio.removeAll();
        escritorio.repaint();
        busquedaVista bv = new busquedaVista();
        bv.setVisible(true);
        escritorio.add(bv);
        escritorio.moveToFront(bv);//para mandar ventana al frente
    }//GEN-LAST:event_jRadioButtonMenuItem3ActionPerformed

    private void jrbmAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbmAgregarActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        formularioVista fv = new formularioVista(directorio);
        fv.setVisible(true);
        escritorio.add(fv);
        escritorio.moveToFront(fv);//para mandar ventana al frente
    }//GEN-LAST:event_jrbmAgregarActionPerformed

    private void jmSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmSalirActionPerformed
       dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_jmSalirActionPerformed

    private void jmEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmEditarActionPerformed

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
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem3;
    private javax.swing.JMenu jmBuscar;
    private javax.swing.JMenu jmEditar;
    private javax.swing.JMenu jmSalir;
    private javax.swing.JRadioButtonMenuItem jrbmAgregar;
    private javax.swing.JRadioButtonMenuItem jrbmBorrar;
    // End of variables declaration//GEN-END:variables
}

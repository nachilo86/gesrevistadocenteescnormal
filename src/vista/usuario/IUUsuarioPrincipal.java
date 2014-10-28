/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.usuario;

import javax.swing.UIManager;

/**
 *
 * @author ILS
 */
public class IUUsuarioPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form IUPrincipal
     */
    public IUUsuarioPrincipal() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel9 = new javax.swing.JPanel();
        jPanel45 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablaUs = new javax.swing.JTable();
        jBotonActGrillaUs = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jBotonRegUs = new javax.swing.JButton();
        jBotonModUs = new javax.swing.JButton();
        jBotonElimUs = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(840, 640));

        jPanel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel45.setBorder(javax.swing.BorderFactory.createTitledBorder("Listado de Usuarios"));

        jTablaUs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Usuario", "Cargo", "Ultima fecha de Ingreso", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTablaUs);

        jBotonActGrillaUs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/16x16/arrow_refresh.png"))); // NOI18N
        jBotonActGrillaUs.setText("Actualizar Grilla");
        jBotonActGrillaUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonActGrillaUsActionPerformed(evt);
            }
        });

        jLabel1.setText("NOTA:");

        jBotonRegUs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/16x16/lock_add.png"))); // NOI18N
        jBotonRegUs.setText("Registrar");
        jBotonRegUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonRegUsActionPerformed(evt);
            }
        });

        jBotonModUs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/16x16/lock_edit.png"))); // NOI18N
        jBotonModUs.setText("Modificar");
        jBotonModUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonModUsActionPerformed(evt);
            }
        });

        jBotonElimUs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/16x16/lock_delete.png"))); // NOI18N
        jBotonElimUs.setText("Eliminar");
        jBotonElimUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonElimUsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel45Layout = new javax.swing.GroupLayout(jPanel45);
        jPanel45.setLayout(jPanel45Layout);
        jPanel45Layout.setHorizontalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 893, Short.MAX_VALUE)
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel45Layout.createSequentialGroup()
                        .addComponent(jBotonRegUs)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBotonModUs)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBotonElimUs))
                    .addGroup(jPanel45Layout.createSequentialGroup()
                        .addComponent(jBotonActGrillaUs, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel45Layout.setVerticalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel45Layout.createSequentialGroup()
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBotonRegUs, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBotonModUs, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBotonElimUs, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBotonActGrillaUs, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBotonElimUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonElimUsActionPerformed
        IUUsuarioEliminar miEliminarUsuario = new IUUsuarioEliminar();
        miEliminarUsuario.setVisible(true);
        
        //miEliminarDocente.setVisible(true);    }//GEN-LAST:event_jBotonElimUsActionPerformed
    }
    
    private void jBotonRegUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonRegUsActionPerformed
        IUUsuarioRegistrar miRegistrarUsuario = new IUUsuarioRegistrar();
        miRegistrarUsuario.setVisible(true);

    }//GEN-LAST:event_jBotonRegUsActionPerformed

    private void jBotonModUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonModUsActionPerformed
        IUUsuarioModificar miModificarUsuario = new IUUsuarioModificar();
        miModificarUsuario.setVisible(true);
    }//GEN-LAST:event_jBotonModUsActionPerformed

    private void jBotonActGrillaUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonActGrillaUsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBotonActGrillaUsActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try{
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(IUUsuarioPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IUUsuarioPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IUUsuarioPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IUUsuarioPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IUUsuarioPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBotonActGrillaUs;
    private javax.swing.JButton jBotonElimUs;
    private javax.swing.JButton jBotonModUs;
    private javax.swing.JButton jBotonRegUs;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablaUs;
    // End of variables declaration//GEN-END:variables
}

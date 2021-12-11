
package view;

import java.awt.BorderLayout;

public class PanelPrincipal extends javax.swing.JFrame {

    public PanelPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu4 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        contenido = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mCliente = new javax.swing.JMenu();
        iRegistrarCliente = new javax.swing.JMenuItem();
        iListarCliente = new javax.swing.JMenuItem();
        mRepuesto = new javax.swing.JMenu();
        iRegistrarRepuesto = new javax.swing.JMenuItem();
        iListaRepuesto = new javax.swing.JMenuItem();
        mFacturacion = new javax.swing.JMenu();
        iRegistrarVenta = new javax.swing.JMenuItem();
        iListaVentas = new javax.swing.JMenuItem();
        mReporte = new javax.swing.JMenu();
        mProveedor = new javax.swing.JMenu();
        iRegistrarProveedor = new javax.swing.JMenuItem();
        iListaProveedores = new javax.swing.JMenuItem();

        jMenu4.setText("jMenu4");

        jMenu5.setText("File");
        jMenuBar2.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar2.add(jMenu6);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        contenido.setPreferredSize(new java.awt.Dimension(1200, 580));

        javax.swing.GroupLayout contenidoLayout = new javax.swing.GroupLayout(contenido);
        contenido.setLayout(contenidoLayout);
        contenidoLayout.setHorizontalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1250, Short.MAX_VALUE)
        );
        contenidoLayout.setVerticalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );

        mCliente.setText("Cliente");

        iRegistrarCliente.setText("Registrar cliente");
        iRegistrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iRegistrarClienteActionPerformed(evt);
            }
        });
        mCliente.add(iRegistrarCliente);

        iListarCliente.setText("Lista de clientes");
        iListarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iListarClienteActionPerformed(evt);
            }
        });
        mCliente.add(iListarCliente);

        jMenuBar1.add(mCliente);

        mRepuesto.setText("Repuesto");

        iRegistrarRepuesto.setText("Registrar repuesto");
        iRegistrarRepuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iRegistrarRepuestoActionPerformed(evt);
            }
        });
        mRepuesto.add(iRegistrarRepuesto);

        iListaRepuesto.setText("Lista de repuestos");
        iListaRepuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iListaRepuestoActionPerformed(evt);
            }
        });
        mRepuesto.add(iListaRepuesto);

        jMenuBar1.add(mRepuesto);

        mFacturacion.setText("Facturacion");

        iRegistrarVenta.setText("Registrar venta");
        iRegistrarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iRegistrarVentaActionPerformed(evt);
            }
        });
        mFacturacion.add(iRegistrarVenta);

        iListaVentas.setText("Lista de ventas");
        iListaVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iListaVentasActionPerformed(evt);
            }
        });
        mFacturacion.add(iListaVentas);

        jMenuBar1.add(mFacturacion);

        mReporte.setText("Reporte");
        jMenuBar1.add(mReporte);

        mProveedor.setText("Proveedor");

        iRegistrarProveedor.setText("Registrar proveedor");
        iRegistrarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iRegistrarProveedorActionPerformed(evt);
            }
        });
        mProveedor.add(iRegistrarProveedor);

        iListaProveedores.setText("Lista de proveedores");
        iListaProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iListaProveedoresActionPerformed(evt);
            }
        });
        mProveedor.add(iListaProveedores);

        jMenuBar1.add(mProveedor);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenido, javax.swing.GroupLayout.PREFERRED_SIZE, 1250, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(contenido, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iRegistrarRepuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iRegistrarRepuestoActionPerformed

    }//GEN-LAST:event_iRegistrarRepuestoActionPerformed

    private void iRegistrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iRegistrarClienteActionPerformed

    }//GEN-LAST:event_iRegistrarClienteActionPerformed

    private void iListarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iListarClienteActionPerformed

    }//GEN-LAST:event_iListarClienteActionPerformed

    private void iListaRepuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iListaRepuestoActionPerformed

    }//GEN-LAST:event_iListaRepuestoActionPerformed

    private void iRegistrarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iRegistrarVentaActionPerformed

    }//GEN-LAST:event_iRegistrarVentaActionPerformed

    private void iListaVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iListaVentasActionPerformed

    }//GEN-LAST:event_iListaVentasActionPerformed

    private void iRegistrarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iRegistrarProveedorActionPerformed
  
    }//GEN-LAST:event_iRegistrarProveedorActionPerformed

    private void iListaProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iListaProveedoresActionPerformed

    }//GEN-LAST:event_iListaProveedoresActionPerformed

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
            java.util.logging.Logger.getLogger(PanelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel contenido;
    public javax.swing.JMenuItem iListaProveedores;
    public javax.swing.JMenuItem iListaRepuesto;
    public javax.swing.JMenuItem iListaVentas;
    public javax.swing.JMenuItem iListarCliente;
    public javax.swing.JMenuItem iRegistrarCliente;
    public javax.swing.JMenuItem iRegistrarProveedor;
    public javax.swing.JMenuItem iRegistrarRepuesto;
    public javax.swing.JMenuItem iRegistrarVenta;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenu mCliente;
    private javax.swing.JMenu mFacturacion;
    private javax.swing.JMenu mProveedor;
    private javax.swing.JMenu mReporte;
    private javax.swing.JMenu mRepuesto;
    // End of variables declaration//GEN-END:variables

}

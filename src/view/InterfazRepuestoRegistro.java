/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author fer
 */
public class InterfazRepuestoRegistro extends javax.swing.JPanel {

    /**
     * Creates new form InterfazRepuestoRegistro
     */
    public InterfazRepuestoRegistro() {
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

        btnClienteRegistroEiminar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtClienteRegistroEmail = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtClienteRegistroTelefono = new javax.swing.JTextField();
        txtClienteRegistroDireccion = new javax.swing.JTextField();
        txtClienteRegistroTipoDocumento = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        btnClienteRegistroBuscar = new javax.swing.JButton();
        btnClienteRegistroGuardar = new javax.swing.JButton();
        btnClienteRegistroRegresar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        txtClienteRegistroNombre = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnRepuestoRegitroEliminar = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtRepuestoRegitroMarca = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtRepuestoRegitroUnidad = new javax.swing.JTextField();
        txtRepuestoRegitroProveedor = new javax.swing.JTextField();
        txtRepuestoRegitroCodigo = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        btnRepuestoRegitroBuscar = new javax.swing.JButton();
        btnRepuestoRegitroGuardar = new javax.swing.JButton();
        btnRepuestoRegistro = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        txtRepuestoRegitroNombre = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbRepuestoRegitroDescripcion = new javax.swing.JTable();
        txtRepuestoRegitroCostoUnitario = new javax.swing.JTextField();
        txtRepuestoRegitroCantidad = new javax.swing.JTextField();

        btnClienteRegistroEiminar.setText("Eliminar");

        jLabel10.setText("Nombres y apellidos//Nombre empresa");

        jButton1.setText("DNI/RUT");

        jLabel11.setText("Email");

        txtClienteRegistroEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteRegistroEmailActionPerformed(evt);
            }
        });

        jLabel12.setText("Tel??fono");

        txtClienteRegistroTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteRegistroTelefonoActionPerformed(evt);
            }
        });

        txtClienteRegistroDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteRegistroDireccionActionPerformed(evt);
            }
        });

        jLabel13.setText("Direcci??n");

        btnClienteRegistroBuscar.setText("Buscar");

        btnClienteRegistroGuardar.setText("Guardar");
        btnClienteRegistroGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteRegistroGuardarActionPerformed(evt);
            }
        });

        btnClienteRegistroRegresar.setText("Regresar");

        txtClienteRegistroNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteRegistroNombreActionPerformed(evt);
            }
        });

        jLabel8.setText("Cantidad");

        jLabel5.setText("C??digo");

        jLabel4.setText("Costo unitario");

        btnRepuestoRegitroEliminar.setText("Eliminar");

        jLabel14.setText("Nombre del repuesto");

        jLabel15.setText("Marca");

        txtRepuestoRegitroMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRepuestoRegitroMarcaActionPerformed(evt);
            }
        });

        jLabel16.setText("Unidad");

        txtRepuestoRegitroUnidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRepuestoRegitroUnidadActionPerformed(evt);
            }
        });

        txtRepuestoRegitroProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRepuestoRegitroProveedorActionPerformed(evt);
            }
        });

        jLabel17.setText("Proveedor");

        btnRepuestoRegitroBuscar.setText("Buscar");

        btnRepuestoRegitroGuardar.setText("Guardar");
        btnRepuestoRegitroGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRepuestoRegitroGuardarActionPerformed(evt);
            }
        });

        btnRepuestoRegistro.setText("Regresar");

        txtRepuestoRegitroNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRepuestoRegitroNombreActionPerformed(evt);
            }
        });

        tbRepuestoRegitroDescripcion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Descripcion"
            }
        ));
        jScrollPane2.setViewportView(tbRepuestoRegitroDescripcion);

        txtRepuestoRegitroCostoUnitario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRepuestoRegitroCostoUnitarioActionPerformed(evt);
            }
        });

        txtRepuestoRegitroCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRepuestoRegitroCantidadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(313, 313, 313)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtRepuestoRegitroUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnRepuestoRegitroBuscar)
                        .addComponent(jSeparator3)
                        .addComponent(jLabel15)
                        .addComponent(jLabel14)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(90, 90, 90)
                            .addComponent(txtRepuestoRegitroCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtRepuestoRegitroNombre)
                        .addComponent(txtRepuestoRegitroMarca)
                        .addComponent(jLabel16)
                        .addComponent(jLabel17)
                        .addComponent(btnRepuestoRegitroEliminar)
                        .addComponent(txtRepuestoRegitroProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnRepuestoRegitroGuardar)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtRepuestoRegitroCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRepuestoRegitroCostoUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(btnRepuestoRegistro)))
                .addGap(321, 321, 321))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRepuestoRegitroBuscar)
                    .addComponent(btnRepuestoRegistro))
                .addGap(48, 48, 48)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRepuestoRegitroCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8)
                    .addComponent(txtRepuestoRegitroCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRepuestoRegitroNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRepuestoRegitroCostoUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRepuestoRegitroMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRepuestoRegitroUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRepuestoRegitroProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRepuestoRegitroGuardar)
                    .addComponent(btnRepuestoRegitroEliminar))
                .addContainerGap(79, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtClienteRegistroEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteRegistroEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienteRegistroEmailActionPerformed

    private void txtClienteRegistroTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteRegistroTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienteRegistroTelefonoActionPerformed

    private void txtClienteRegistroDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteRegistroDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienteRegistroDireccionActionPerformed

    private void btnClienteRegistroGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteRegistroGuardarActionPerformed

    }//GEN-LAST:event_btnClienteRegistroGuardarActionPerformed

    private void txtClienteRegistroNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteRegistroNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienteRegistroNombreActionPerformed

    private void txtRepuestoRegitroMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRepuestoRegitroMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRepuestoRegitroMarcaActionPerformed

    private void txtRepuestoRegitroUnidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRepuestoRegitroUnidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRepuestoRegitroUnidadActionPerformed

    private void txtRepuestoRegitroProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRepuestoRegitroProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRepuestoRegitroProveedorActionPerformed

    private void btnRepuestoRegitroGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRepuestoRegitroGuardarActionPerformed

    }//GEN-LAST:event_btnRepuestoRegitroGuardarActionPerformed

    private void txtRepuestoRegitroNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRepuestoRegitroNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRepuestoRegitroNombreActionPerformed

    private void txtRepuestoRegitroCostoUnitarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRepuestoRegitroCostoUnitarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRepuestoRegitroCostoUnitarioActionPerformed

    private void txtRepuestoRegitroCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRepuestoRegitroCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRepuestoRegitroCantidadActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnClienteRegistroBuscar;
    public javax.swing.JButton btnClienteRegistroEiminar;
    public javax.swing.JButton btnClienteRegistroGuardar;
    public javax.swing.JButton btnClienteRegistroRegresar;
    public javax.swing.JButton btnRepuestoRegistro;
    public javax.swing.JButton btnRepuestoRegitroBuscar;
    public javax.swing.JButton btnRepuestoRegitroEliminar;
    public javax.swing.JButton btnRepuestoRegitroGuardar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    public javax.swing.JTable tbRepuestoRegitroDescripcion;
    public javax.swing.JTextField txtClienteRegistroDireccion;
    public javax.swing.JTextField txtClienteRegistroEmail;
    public javax.swing.JTextField txtClienteRegistroNombre;
    public javax.swing.JTextField txtClienteRegistroTelefono;
    public javax.swing.JTextField txtClienteRegistroTipoDocumento;
    public javax.swing.JTextField txtRepuestoRegitroCantidad;
    public javax.swing.JTextField txtRepuestoRegitroCodigo;
    public javax.swing.JTextField txtRepuestoRegitroCostoUnitario;
    public javax.swing.JTextField txtRepuestoRegitroMarca;
    public javax.swing.JTextField txtRepuestoRegitroNombre;
    public javax.swing.JTextField txtRepuestoRegitroProveedor;
    public javax.swing.JTextField txtRepuestoRegitroUnidad;
    // End of variables declaration//GEN-END:variables
}

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
public class InterfazProveedorRegistro extends javax.swing.JPanel {

    /**
     * Creates new form InterfazProveedorRegistro
     */
    public InterfazProveedorRegistro() {
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

        jLabel3 = new javax.swing.JLabel();
        txtProveedorRegistroTelefono = new javax.swing.JTextField();
        txtProveedorRegistroDireccion = new javax.swing.JTextField();
        btnProveedorRegistroRut = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnProveedorRegistroBuscar = new javax.swing.JButton();
        btnProveedorRegistroGuardar = new javax.swing.JButton();
        btnProveedorRegistroRegresar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        txtProveedorRegistroNombre = new javax.swing.JTextField();
        btnProveedorRegistroEliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtProveedorRegistroEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbProveedorRegistroDescripcion = new javax.swing.JTable();

        jLabel3.setText("Teléfono");

        txtProveedorRegistroTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProveedorRegistroTelefonoActionPerformed(evt);
            }
        });

        txtProveedorRegistroDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProveedorRegistroDireccionActionPerformed(evt);
            }
        });

        jLabel4.setText("Dirección");

        btnProveedorRegistroBuscar.setText("Buscar");

        btnProveedorRegistroGuardar.setText("Guardar");
        btnProveedorRegistroGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProveedorRegistroGuardarActionPerformed(evt);
            }
        });

        btnProveedorRegistroRegresar.setText("Regresar");

        txtProveedorRegistroNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProveedorRegistroNombreActionPerformed(evt);
            }
        });

        btnProveedorRegistroEliminar.setText("Eliminar");

        jLabel1.setText("Nombre empresa");

        jLabel2.setText("Email");

        txtProveedorRegistroEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProveedorRegistroEmailActionPerformed(evt);
            }
        });

        jLabel5.setText("RUT");

        jLabel6.setText("Lista de repuestos");

        tbProveedorRegistroDescripcion.setModel(new javax.swing.table.DefaultTableModel(
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
                "Repuesto"
            }
        ));
        jScrollPane1.setViewportView(tbProveedorRegistroDescripcion);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(313, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnProveedorRegistroRegresar)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtProveedorRegistroTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnProveedorRegistroBuscar)
                                .addComponent(jSeparator1)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(103, 103, 103)
                                    .addComponent(btnProveedorRegistroRut, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtProveedorRegistroNombre)
                                .addComponent(txtProveedorRegistroEmail)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(btnProveedorRegistroEliminar)
                                .addComponent(txtProveedorRegistroDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addComponent(btnProveedorRegistroGuardar))
                .addGap(257, 257, 257))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProveedorRegistroBuscar)
                    .addComponent(btnProveedorRegistroRegresar))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnProveedorRegistroRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(37, 37, 37)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtProveedorRegistroNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtProveedorRegistroEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtProveedorRegistroTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtProveedorRegistroDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProveedorRegistroGuardar)
                    .addComponent(btnProveedorRegistroEliminar))
                .addContainerGap(126, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtProveedorRegistroTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProveedorRegistroTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProveedorRegistroTelefonoActionPerformed

    private void txtProveedorRegistroDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProveedorRegistroDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProveedorRegistroDireccionActionPerformed

    private void btnProveedorRegistroGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedorRegistroGuardarActionPerformed

    }//GEN-LAST:event_btnProveedorRegistroGuardarActionPerformed

    private void txtProveedorRegistroNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProveedorRegistroNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProveedorRegistroNombreActionPerformed

    private void txtProveedorRegistroEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProveedorRegistroEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProveedorRegistroEmailActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnProveedorRegistroBuscar;
    public javax.swing.JButton btnProveedorRegistroEliminar;
    public javax.swing.JButton btnProveedorRegistroGuardar;
    public javax.swing.JButton btnProveedorRegistroRegresar;
    public javax.swing.JTextField btnProveedorRegistroRut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JTable tbProveedorRegistroDescripcion;
    public javax.swing.JTextField txtProveedorRegistroDireccion;
    public javax.swing.JTextField txtProveedorRegistroEmail;
    public javax.swing.JTextField txtProveedorRegistroNombre;
    public javax.swing.JTextField txtProveedorRegistroTelefono;
    // End of variables declaration//GEN-END:variables
}
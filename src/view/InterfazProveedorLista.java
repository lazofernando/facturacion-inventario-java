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
public class InterfazProveedorLista extends javax.swing.JPanel {

    /**
     * Creates new form InterfazProveedorLista
     */
    public InterfazProveedorLista() {
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

        btnProveedorListaActualizar = new javax.swing.JButton();
        btnProveedorListaRegresar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbProveedorLista = new javax.swing.JTable();
        txtProveedorListaBuscar = new javax.swing.JTextField();
        btnProveedorListaBuscar = new javax.swing.JButton();

        btnProveedorListaActualizar.setText("Actualizar Item seleccionado");

        btnProveedorListaRegresar.setText("Regresar");

        tbProveedorLista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbProveedorLista);

        btnProveedorListaBuscar.setText("Buscar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtProveedorListaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnProveedorListaBuscar)
                        .addGap(774, 774, 774)
                        .addComponent(btnProveedorListaRegresar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnProveedorListaActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1061, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(73, 73, 73))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProveedorListaRegresar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtProveedorListaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnProveedorListaBuscar)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnProveedorListaActualizar)
                .addContainerGap(61, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnProveedorListaActualizar;
    public javax.swing.JButton btnProveedorListaBuscar;
    public javax.swing.JButton btnProveedorListaRegresar;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tbProveedorLista;
    public javax.swing.JTextField txtProveedorListaBuscar;
    // End of variables declaration//GEN-END:variables
}

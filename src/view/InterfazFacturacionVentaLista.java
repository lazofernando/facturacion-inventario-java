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
public class InterfazFacturacionVentaLista extends javax.swing.JPanel {

    /**
     * Creates new form InterfazFacturacionVentaLista
     */
    public InterfazFacturacionVentaLista() {
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

        txtFacturacionVentaListaBuscar = new javax.swing.JTextField();
        btnFacturacionVentaListaBuscar = new javax.swing.JButton();
        btnFacturacionVentaListaActualizar = new javax.swing.JButton();
        btnFacturacionVentaListaRegresar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbFacturacionVentaListaLista = new javax.swing.JTable();

        btnFacturacionVentaListaBuscar.setText("Buscar");

        btnFacturacionVentaListaActualizar.setText("Actualizar Item seleccionado");

        btnFacturacionVentaListaRegresar.setText("Regresar");

        tbFacturacionVentaListaLista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código de venta", "DNI/RUT", "Cliente/Empresa", "Email", "Telefono", "Direccion", "Código del repuesto", "Repuesto", "Descripcion", "Calificacion1", "Calificaciónl2", "Marca", "Unidad", "Costo unitario", "Proveedor", "Cantidad"
            }
        ));
        jScrollPane1.setViewportView(tbFacturacionVentaListaLista);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnFacturacionVentaListaActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txtFacturacionVentaListaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnFacturacionVentaListaBuscar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnFacturacionVentaListaRegresar))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1071, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnFacturacionVentaListaBuscar)
                            .addComponent(txtFacturacionVentaListaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btnFacturacionVentaListaRegresar)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(btnFacturacionVentaListaActualizar)
                .addGap(46, 46, 46))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnFacturacionVentaListaActualizar;
    public javax.swing.JButton btnFacturacionVentaListaBuscar;
    public javax.swing.JButton btnFacturacionVentaListaRegresar;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tbFacturacionVentaListaLista;
    public javax.swing.JTextField txtFacturacionVentaListaBuscar;
    // End of variables declaration//GEN-END:variables
}

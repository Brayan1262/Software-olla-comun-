/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Pantallas;

import DAO.Registrarcliente;
import javax.swing.table.DefaultTableModel;
import Entidades.Cliente;
import Entidades.Administrador1;
import conexion.ConexionBDDS;
public class Administrador extends javax.swing.JFrame {
 Cliente c = new Cliente("","",0,0);
 ConexionBDDS con1 = new ConexionBDDS();
 Administrador1 ad = new Administrador1(0,0);
 DefaultTableModel dtm = new DefaultTableModel();
 Registrarcliente consulta = new Registrarcliente();
    public Administrador() {
    initComponents();
    String [] titulo = new String [] {"Nombre","Apellido","DNI","Monto pagado","Precio","Vuelto"};
    dtm.setColumnIdentifiers(titulo);
    tblDatos.setModel(dtm);
    }
void agregar() {
    String nombre = jtxtNombre.getText();
    c.setNombre(nombre);
    String apellido = jtxtApellido.getText();
    c.setApellido(apellido);
    double montopago,precio;
    int DNI;
    nombre = jtxtNombre.getText();
    apellido = jtxtApellido.getText();
    try {
        DNI = Integer.parseInt(jtxtDNI.getText());
        c.setDNI(DNI);
        montopago = Double.parseDouble(jtxtMonto.getText());
        c.setMontopago(montopago);
        precio = Double.parseDouble(jtxtPrecio.getText());
        ad.setPrecio(precio);
        Object[] fila = {c.getNombre(), c.getApellido(), c.getDNI(), c.getMontopago(),ad.getPrecio(),ad.getVuelto()};
        dtm.addRow(fila);
    } catch (NumberFormatException e) {
        System.err.println("Error: Ingrese valores numéricos para DNI y Montopago");
    }
}
void eliminar ()
{
    int fila = tblDatos.getSelectedRow();
    dtm.removeRow(fila);
}
void limpiar ()
{
    int filas = dtm.getRowCount();
    for (int i=0;i<filas;i++){
       dtm.setRowCount(0);
    }
}
void actualizar()
{
    int fila = tblDatos.getSelectedRow();
    dtm.setValueAt(jtxtNombre.getText(),fila, 0);
    dtm.setValueAt(jtxtApellido.getText(),fila, 1);
    dtm.setValueAt(jtxtDNI.getText(),fila, 2);
    dtm.setValueAt(jtxtMonto.getText(),fila, 3);
    dtm.setValueAt(jtxtPrecio.getText(),fila, 4);
}
public double calcular() {
        double precio;
        double vuelto;
        double monto;
        try {
            monto = Double.parseDouble(jtxtMonto.getText());
            c.setMontopago(monto);
            precio = Double.parseDouble(jtxtPrecio.getText());
            ad.setPrecio(precio);
            vuelto = monto - precio;
            ad.setVuelto(vuelto);
            jtxtVuelto.setText(String.valueOf(vuelto));
        } catch (NumberFormatException e) {
            // Manejar la excepción si la entrada no es un número válido
            jtxtVuelto.setText("Error");
        }
     return 0;
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jtxtDNI = new javax.swing.JTextField();
        jtxtNombre = new javax.swing.JTextField();
        jtxtMonto = new javax.swing.JTextField();
        BtnGuardar = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        BtnLimpiar = new javax.swing.JButton();
        BtnActualizar1 = new javax.swing.JButton();
        jtxtPrecio = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatos = new javax.swing.JTable();
        BtnCalcular = new javax.swing.JButton();
        jtxtVuelto = new javax.swing.JTextField();
        jtxtApellido = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtxtDNI.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DNI", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        jtxtNombre.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombre", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        jtxtMonto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Monto pago", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        BtnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnGuardar.setText("Guardar");
        BtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarActionPerformed(evt);
            }
        });

        BtnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnEliminar.setText("Eliminar");
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });

        BtnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnLimpiar.setText("Limpiar");
        BtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimpiarActionPerformed(evt);
            }
        });

        BtnActualizar1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnActualizar1.setText("Actualizar");
        BtnActualizar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnActualizar1ActionPerformed(evt);
            }
        });

        jtxtPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Precio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        tblDatos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tblDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        jScrollPane1.setViewportView(tblDatos);

        BtnCalcular.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnCalcular.setText("Calcular");
        BtnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCalcularActionPerformed(evt);
            }
        });

        jtxtVuelto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Vuelto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        jtxtApellido.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Apellido", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jtxtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtxtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jtxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtxtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnActualizar1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnLimpiar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jtxtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtxtVuelto, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(127, 127, 127)
                        .addComponent(BtnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnActualizar1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtxtVuelto, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtxtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BtnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarActionPerformed
    agregar();
    consulta.Registrar(c, ad);
    }//GEN-LAST:event_BtnGuardarActionPerformed

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
    eliminar();
    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void BtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimpiarActionPerformed
    limpiar();
    }//GEN-LAST:event_BtnLimpiarActionPerformed

    private void BtnActualizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnActualizar1ActionPerformed
    actualizar();
    }//GEN-LAST:event_BtnActualizar1ActionPerformed

    private void BtnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCalcularActionPerformed
    calcular();     
    }//GEN-LAST:event_BtnCalcularActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnActualizar1;
    private javax.swing.JButton BtnCalcular;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JButton BtnLimpiar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jtxtApellido;
    private javax.swing.JTextField jtxtDNI;
    private javax.swing.JTextField jtxtMonto;
    private javax.swing.JTextField jtxtNombre;
    private javax.swing.JTextField jtxtPrecio;
    private javax.swing.JTextField jtxtVuelto;
    private javax.swing.JTable tblDatos;
    // End of variables declaration//GEN-END:variables
}


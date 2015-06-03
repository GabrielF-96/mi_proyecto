package vista;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import uml.*;



public class Form2 extends javax.swing.JFrame {

    Employee emp= new Employee();
    DAOemployee dao= new DAOemployee();
    String[] columnas ={"COD","ID DEPARTAMENT","FIRST NAME","LAST NAME"};
    DefaultTableModel modelo = new DefaultTableModel(columnas,0);
    ArrayList<Object[]>datos = new ArrayList<>();
    

    public Form2() {
        initComponents();
        cargar();
        
    }
    
    private void cargar(){
        datos = dao.listar();
        modelo.setRowCount(0);
        for (Object[] dato: datos){
          modelo.addRow(dato);
        }
        tblEmploy.setModel(modelo);
    }
    private void filtrar(){
        //String campo = (String);
        datos = dao.filtrar(txtcriterio.getText(),cbxfiltro.getSelectedItem().toString());
        modelo.setRowCount(0);
        for (Object[] dato: datos){
          modelo.addRow(dato);  
        }
        tblEmploy.setModel(modelo);
    }
    
    public void setiar(){
        emp.setCodemployee(txtCod.getText());
        emp.setIddepartament(Integer.parseInt(txtId.getText()));
        emp.setFirtsname(txtFirts.getText());
        emp.setLastname(txtLast.getText());
    }
    public void limpiar(){
        txtId.setText(null);
        txtCod.setText(null);
        txtcriterio.setText(null);
        txtFirts.setText(null);
        txtLast.setText(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnInsertar2 = new javax.swing.JButton();
        btnBuscar2 = new javax.swing.JButton();
        txtCod = new javax.swing.JTextField();
        txtFirts = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        txtLast = new javax.swing.JTextField();
        btnEliminar2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmploy = new javax.swing.JTable();
        btnModificar2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        cbxfiltro = new javax.swing.JComboBox();
        txtcriterio = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("CodEmployeet:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("IdDepartament:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Firts Name:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Last Name:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Buscar por:");

        btnInsertar2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnInsertar2.setText("Insertar");
        btnInsertar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInsertar2MouseClicked(evt);
            }
        });

        btnBuscar2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBuscar2.setText("Buscar");
        btnBuscar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscar2MouseClicked(evt);
            }
        });

        btnEliminar2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnEliminar2.setText("Eliminar");
        btnEliminar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminar2MouseClicked(evt);
            }
        });

        tblEmploy.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblEmploy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEmployMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEmploy);

        btnModificar2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnModificar2.setText("Modificar");
        btnModificar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModificar2MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("EMPLOYEE");

        cbxfiltro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "codemployee", "iddepartament", "firtsname", "lastname" }));

        btnLimpiar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(btnInsertar2)
                                            .addGap(18, 18, 18)
                                            .addComponent(btnModificar2)
                                            .addGap(30, 30, 30)
                                            .addComponent(btnEliminar2))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(cbxfiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(204, 204, 204)
                                            .addComponent(btnBuscar2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtcriterio, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel2))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtFirts)
                                            .addComponent(txtLast, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(169, 169, 169))
                                .addComponent(btnLimpiar))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(292, 292, 292)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtFirts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLast, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsertar2)
                    .addComponent(btnEliminar2)
                    .addComponent(btnModificar2)
                    .addComponent(btnLimpiar))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxfiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcriterio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar2))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInsertar2MouseClicked

       setiar();
       dao.insertar(emp);
       cargar();
       limpiar();
    }//GEN-LAST:event_btnInsertar2MouseClicked

    private void btnModificar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificar2MouseClicked
       setiar();
       dao.modificar(emp);
       cargar();
       limpiar();
    }//GEN-LAST:event_btnModificar2MouseClicked

    private void btnEliminar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminar2MouseClicked
        setiar();
       dao.eliminar(emp);
       cargar();
       limpiar();
    }//GEN-LAST:event_btnEliminar2MouseClicked

    private void btnBuscar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscar2MouseClicked
        filtrar();
        limpiar();
    }//GEN-LAST:event_btnBuscar2MouseClicked

    private void tblEmployMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmployMouseClicked
        txtCod.setText(tblEmploy.getValueAt(tblEmploy.getSelectedRow(),0).toString());
        txtId.setText(tblEmploy.getValueAt(tblEmploy.getSelectedRow(),1).toString());
        txtFirts.setText(tblEmploy.getValueAt(tblEmploy.getSelectedRow(),2).toString());
        txtLast.setText(tblEmploy.getValueAt(tblEmploy.getSelectedRow(),3).toString());
    }//GEN-LAST:event_tblEmployMouseClicked

    private void btnLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseClicked
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_btnLimpiarMouseClicked

   
    public static void main(String args[]) {
       
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
            java.util.logging.Logger.getLogger(Form2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar2;
    private javax.swing.JButton btnEliminar2;
    private javax.swing.JButton btnInsertar2;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar2;
    private javax.swing.JComboBox cbxfiltro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEmploy;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtFirts;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtLast;
    private javax.swing.JTextField txtcriterio;
    // End of variables declaration//GEN-END:variables
}

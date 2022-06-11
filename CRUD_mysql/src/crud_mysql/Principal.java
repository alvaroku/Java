 
package crud_mysql;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

public class Principal extends javax.swing.JFrame {
    public static Usuario us;
 
    private Statement st = new Conexion("localhost:3306","bdcuentos","root","2305").Conectar();
    private DefaultTableModel modelo;
    //variable para verificar s esat editando, en caso de que sea verdadera, el boton 
    //agregar permanecerá bloqueado
    boolean editando = false;
    //variables para comprobar que todos los datos sean correctos
    boolean idUs=false,tipoUs=false,nombre=false,apellido=false,correo=false,contra=false,telefono=false; 
    
    public Principal() {
        initComponents();
        lblUser.setText("Hola "+us.getNombre()+" "+us.getApellido()+" "+us.getCorreo());
        PrepararTabla();
        setDatos(Read());
        us.getApellido();
        
        
       
         
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        txtidUs = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtBuscador = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        lblUser = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JTextField();
        txtTipoUs = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnCleanTXT = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio");
        setPreferredSize(new java.awt.Dimension(1000, 276));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "TipoUs", "Nombre", "Apellido", "Correo", "Contraseña", "Teléfono"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(20);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(20);
        }

        btnAgregar.setText("Agregar");
        btnAgregar.setEnabled(false);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        txtidUs.setEnabled(false);

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        lblUser.setText("Bienvenido");

        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoKeyTyped(evt);
            }
        });

        txtCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCorreoKeyTyped(evt);
            }
        });

        txtContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContraseñaKeyTyped(evt);
            }
        });

        txtTipoUs.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTipoUsKeyTyped(evt);
            }
        });

        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.setEnabled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.setEnabled(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnReset.setText("Reiniciar");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnCleanTXT.setText("Limpiar campos");
        btnCleanTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCleanTXTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblUser)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtidUs, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtTipoUs, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnCleanTXT))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEliminar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtContraseña)
                                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnGuardar))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscar)))
                        .addGap(12, 12, 12)
                        .addComponent(btnReset))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtidUs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar)
                    .addComponent(txtBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTipoUs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar)
                    .addComponent(btnReset)
                    .addComponent(btnCleanTXT))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        PrepararTabla();
        if(txtBuscador.getText().equals("")){
            setDatos(Read());
        }else{
            setDatos(Search(Integer.parseInt(txtBuscador.getText())));
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        btnGuardar.setEnabled(true);
        btnEliminar.setEnabled(true);
        
        editando=true;
        int fila = jTable1.getSelectedRow();//obtener la fila seleccionada
        int idUs = (int)jTable1.getValueAt(fila, 0);//obtener el dato de la fila seleccionada en la columna 0(idUs)
        
        ResultSet rs = Search(idUs);
        try {
            while (rs.next()) { 
                txtidUs.setText(rs.getInt("idUs")+"");
                txtTipoUs.setText(rs.getString("tipoUs"));
                txtNombre.setText(rs.getString("nombre"));
                txtApellido.setText(rs.getString("apellido"));
                txtCorreo.setText(rs.getString("correo"));
                txtContraseña.setText(rs.getString("contra"));
                txtTelefono.setText(rs.getString("telefono"));
            }
        } catch (Exception e) {
        }
        
      
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        PrepararTabla();
        setDatos(Read());
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnCleanTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCleanTXTActionPerformed
        // TODO add your handling code here:
        resetTXT();
        btnGuardar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnAgregar.setEnabled(false);
        editando=false;
    }//GEN-LAST:event_btnCleanTXTActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        // TODO add your handling code here:
        if (!editando) {
            nombre=checkNoVacio(txtNombre.getText() + evt.getKeyChar());
            if (tipoUs && nombre && apellido && correo && contra && telefono) {
                btnAgregar.setEnabled(true);
            } else {
                btnAgregar.setEnabled(false);
            }
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtCorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoKeyTyped
        // TODO add your handling code here:
        // TODO add your handling code here:
        if (!editando) {
            correo=checkNoVacio(txtCorreo.getText() + evt.getKeyChar());
            if (tipoUs && nombre && apellido && correo && contra && telefono) {
                btnAgregar.setEnabled(true);
            } else {
                btnAgregar.setEnabled(false);
            }
        }
     
    }//GEN-LAST:event_txtCorreoKeyTyped

    private void txtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyTyped
        // TODO add your handling code here:
        // TODO add your handling code here:
        if (!editando) {
            apellido=checkNoVacio(txtApellido.getText() + evt.getKeyChar());
            if (tipoUs && nombre && apellido && correo && contra && telefono) {
                btnAgregar.setEnabled(true);
            } else {
                btnAgregar.setEnabled(false);
            }
        }
         
    }//GEN-LAST:event_txtApellidoKeyTyped

    private void txtContraseñaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContraseñaKeyTyped
        // TODO add your handling code here:
        // TODO add your handling code here:
        if (!editando) {
            contra=checkNoVacio(txtContraseña.getText() + evt.getKeyChar());
            if (tipoUs && nombre && apellido && correo && contra && telefono) {
                btnAgregar.setEnabled(true);
            } else {
                btnAgregar.setEnabled(false);
            }
        }
        
    }//GEN-LAST:event_txtContraseñaKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        // TODO add your handling code here:// TODO add your handling code here:
        if (!editando) {
            telefono=checkNoVacio(txtTelefono.getText() + evt.getKeyChar());
            if (tipoUs && nombre && apellido && correo && contra && telefono) {
                btnAgregar.setEnabled(true);
            } else {
                btnAgregar.setEnabled(false);
            }
        }   
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtTipoUsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTipoUsKeyTyped
        // TODO add your handling code here:
        // TODO add your handling code here:
        if (!editando) {
            tipoUs=checkNoVacio(txtTipoUs.getText() + evt.getKeyChar());
            if (tipoUs && nombre && apellido && correo && contra && telefono) {
                btnAgregar.setEnabled(true);
            } else {
                btnAgregar.setEnabled(false);
            }
        }
    }//GEN-LAST:event_txtTipoUsKeyTyped

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        Object[]fila=new Object[7];
        fila[1] = Integer.parseInt(txtTipoUs.getText());
        fila[2] = txtNombre.getText();
        fila[3] = txtApellido.getText();
        fila[4] = txtCorreo.getText();
        fila[5] = txtContraseña.getText();
        fila[6] = txtTelefono.getText();
        
        if (Create(fila)) {
            fila[0]=getId(fila[4].toString(), fila[5].toString());
            modelo.addRow(fila);
            resetBoleans();
            resetTXT();
            btnAgregar.setEnabled(false);
            
        }
       
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        Object[]fila=new Object[7];
        fila[0] = Integer.parseInt(txtidUs.getText());
        fila[1] = Integer.parseInt(txtTipoUs.getText());
        fila[2] = txtNombre.getText();
        fila[3] = txtApellido.getText();
        fila[4] = txtCorreo.getText();
        fila[5] = txtContraseña.getText();
        fila[6] = txtTelefono.getText();
        if (Update(fila)) {
            for (int i = 0; i < modelo.getColumnCount(); i++) {
                modelo.setValueAt(fila[i], jTable1.getSelectedRow(),i);
            }
            btnEliminar.setEnabled(false);
            btnGuardar.setEnabled(false);
            resetTXT();
            resetBoleans();
        }
       
       
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        int idBuscado = Integer.parseInt(txtidUs.getText());
        if (Delete(idBuscado)) {
            modelo.removeRow(jTable1.getSelectedRow());
            resetBoleans();
            resetTXT();
            btnGuardar.setEnabled(false);
            btnEliminar.setEnabled(false);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    public void PrepararTabla(){
        modelo = new DefaultTableModel();
        jTable1.setModel(modelo);
        modelo.addColumn("idUs");
        modelo.addColumn("TipoUs");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Correo");
        modelo.addColumn("Contraeña");
        modelo.addColumn("Telefono");
     
        int[] anchos = {40,60,80,80,270,150,150};
     
        for (int i = 0; i < jTable1.getModel().getColumnCount(); i++) {
            jTable1.getColumnModel().getColumn(i).setMaxWidth(anchos[i]);
            
        }
        
    }
    public boolean Create(Object[]fila){
         boolean agregado = false;
        try {
            String sql="insert into usuarios(tipoUs,nombre,apellido,correo,contra,telefono)";
            sql+=" values("+fila[1]+",'"+fila[2]+"','"+fila[3]+"','"+ fila[4]+"','"+fila[5]+"',"
                    + "'"+fila[6]+"')";
            st.execute(sql); 
            agregado=true;
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
        return agregado; 
    }
    public ResultSet Read(){
        ResultSet rs = null;
        try {
            //obtener datos de la bd
            rs=st.executeQuery("select*from usuarios;");            
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
        return rs; 
    }
    public boolean Update(Object[]fila){
         boolean actualizado = false;
        try {
            String sql="update usuarios set tipoUs="+fila[1]+", nombre='"+fila[2]+"',"
                    +"apellido='"+fila[3]+"',correo='"+fila[4]+"',contra='"+fila[5]+"',"
                    +"telefono='"+fila[6]+"' where idUs="+fila[0];
            st.executeUpdate(sql); 
            actualizado=true;
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
        return actualizado; 
    }
    public boolean Delete(int ID){
         boolean eliminado = false;
        try {
            String sql="delete from usuarios where idUs="+ID;
            st.execute(sql); 
            eliminado=true;
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
        return eliminado; 
    }
    public ResultSet Search(int ID){
        ResultSet rs = null;
        try {
            //obtener datos de la bd
            rs=st.executeQuery("select*from usuarios where idUs="+ID);
            
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
        return rs; 
    }
    
    public Object getId(String correo,String contra){
        Object id = 0;
        try {
            String sql = "select idUs from usuarios where correo='"+
                correo+"' and contra='"+contra+"'";
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
               id=rs.getObject(1);
            }else{
                System.out.println("Correo o contraseña incorrectos");
            }
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
        return id;
    }
    public void setDatos(ResultSet rs){
        try {
            //obtener numero de columnas
            int cols = rs.getMetaData().getColumnCount();
            
            //mientras el resultado tenga mas filas
            while(rs.next()){
                //agregar los datos a las filas
                Object[] fila = new Object[cols];
                //recorrer las columnas
                for (int i = 0; i < cols; i++) {
                    fila[i] = rs.getObject(i+1);
                }
                modelo.addRow(fila);
            }//rs.getString("nombre")//rs.getInt(1)
        } catch (Exception e) {
            System.out.println("Error "+e.getMessage());
        }
    }
    public void resetTXT(){
        txtApellido.setText("");
        txtContraseña.setText("");
        txtCorreo.setText("");
        txtNombre.setText("");
        txtTelefono.setText("");
        txtTipoUs.setText("");
        txtidUs.setText("");
        
    }
    public void resetBoleans(){
        editando = false;
        idUs=false;
        tipoUs=false;
        nombre=false;
        apellido=false;
        correo=false;
        contra=false;
        telefono=false; 
    }
    public boolean checkNoVacio(String dato){
        boolean bien=false;
        dato = dato.trim();
        if (!dato.equals("")) {
            bien=true;
        }
        return bien;
    }
  
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCleanTXT;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnReset;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblUser;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtBuscador;
    private javax.swing.JTextField txtContraseña;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTipoUs;
    private javax.swing.JTextField txtidUs;
    // End of variables declaration//GEN-END:variables
}


package com.mycompany.userlogin.igu;

import com.mycompany.userlogin.logica.control;
import com.mycompany.userlogin.logica.Usuario;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dialog;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class verUsuario extends javax.swing.JFrame {
    control cont = null;
    int xMouse, yMouse;
    public verUsuario() {
        cont = new control ();
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        imgbase = new javax.swing.JLabel();
        imguser = new javax.swing.JLabel();
        imglogo = new javax.swing.JLabel();
        panelBarra = new javax.swing.JPanel();
        btnExit = new javax.swing.JPanel();
        txtExit = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbUsuario = new javax.swing.JTable();
        btnEliminar = new javax.swing.JPanel();
        txtEliminar = new javax.swing.JLabel();
        InciarSesion = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnPrincipal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnEditar = new javax.swing.JPanel();
        txtEditar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgbase.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgbase.setIcon(new javax.swing.ImageIcon("D:\\CARPETAS D\\Steeven Rodriguez\\Programacion\\Java Tocode\\UserLogin\\src\\main\\java\\imagenes\\informacion.png")); // NOI18N
        jPanel1.add(imgbase, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 0, 220, 210));

        imguser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imguser.setIcon(new javax.swing.ImageIcon("D:\\CARPETAS D\\Steeven Rodriguez\\Programacion\\Java Tocode\\UserLogin\\src\\main\\java\\imagenes\\acceso.png")); // NOI18N
        jPanel1.add(imguser, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 310, 220, 190));

        imglogo.setIcon(new javax.swing.ImageIcon("D:\\CARPETAS D\\Steeven Rodriguez\\Programacion\\Java Tocode\\UserLogin\\src\\main\\java\\imagenes\\city.png")); // NOI18N
        jPanel1.add(imglogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 0, 220, 500));

        panelBarra.setBackground(new java.awt.Color(255, 255, 255));
        panelBarra.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelBarraMouseDragged(evt);
            }
        });
        panelBarra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelBarraMousePressed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(255, 255, 255));

        txtExit.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txtExit.setForeground(new java.awt.Color(0, 0, 0));
        txtExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtExit.setText("X");
        txtExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtExitMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnExitLayout = new javax.swing.GroupLayout(btnExit);
        btnExit.setLayout(btnExitLayout);
        btnExitLayout.setHorizontalGroup(
            btnExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtExit, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
        );
        btnExitLayout.setVerticalGroup(
            btnExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnExitLayout.createSequentialGroup()
                .addComponent(txtExit, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelBarraLayout = new javax.swing.GroupLayout(panelBarra);
        panelBarra.setLayout(panelBarraLayout);
        panelBarraLayout.setHorizontalGroup(
            panelBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBarraLayout.createSequentialGroup()
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 847, Short.MAX_VALUE))
        );
        panelBarraLayout.setVerticalGroup(
            panelBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBarraLayout.createSequentialGroup()
                .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(panelBarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 50));

        tbUsuario.setBackground(new java.awt.Color(255, 255, 255));
        tbUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tbUsuario);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 760, 300));

        btnEliminar.setBackground(new java.awt.Color(0, 134, 190));
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarMouseExited(evt);
            }
        });

        txtEliminar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtEliminar.setForeground(new java.awt.Color(255, 255, 255));
        txtEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtEliminar.setIcon(new javax.swing.ImageIcon("D:\\CARPETAS D\\Steeven Rodriguez\\Programacion\\Java Tocode\\UserLogin\\src\\main\\java\\imagenes\\eleminar.png")); // NOI18N
        txtEliminar.setText("ELEMINAR");
        txtEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout btnEliminarLayout = new javax.swing.GroupLayout(btnEliminar);
        btnEliminar.setLayout(btnEliminarLayout);
        btnEliminarLayout.setHorizontalGroup(
            btnEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnEliminarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        btnEliminarLayout.setVerticalGroup(
            btnEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnEliminarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 440, -1, -1));

        InciarSesion.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        InciarSesion.setForeground(new java.awt.Color(0, 0, 0));
        InciarSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        InciarSesion.setIcon(new javax.swing.ImageIcon("D:\\CARPETAS D\\Steeven Rodriguez\\Programacion\\Java Tocode\\UserLogin\\src\\main\\java\\imagenes\\logAdmi.png")); // NOI18N
        InciarSesion.setText("BASE DE DATOS");
        jPanel1.add(InciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 350, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 340, -1));

        btnPrincipal.setBackground(new java.awt.Color(0, 134, 190));
        btnPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPrincipalMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPrincipalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPrincipalMouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\CARPETAS D\\Steeven Rodriguez\\Programacion\\Java Tocode\\UserLogin\\src\\main\\java\\imagenes\\salirPrincipal.png")); // NOI18N
        jLabel1.setText("PRINCIPAL");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout btnPrincipalLayout = new javax.swing.GroupLayout(btnPrincipal);
        btnPrincipal.setLayout(btnPrincipalLayout);
        btnPrincipalLayout.setHorizontalGroup(
            btnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );
        btnPrincipalLayout.setVerticalGroup(
            btnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(btnPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 440, -1, -1));

        btnEditar.setBackground(new java.awt.Color(0, 134, 190));
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEditarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEditarMouseExited(evt);
            }
        });

        txtEditar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtEditar.setForeground(new java.awt.Color(255, 255, 255));
        txtEditar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtEditar.setIcon(new javax.swing.ImageIcon("D:\\CARPETAS D\\Steeven Rodriguez\\Programacion\\Java Tocode\\UserLogin\\src\\main\\java\\imagenes\\editarUser.png")); // NOI18N
        txtEditar.setText("EDITAR");

        javax.swing.GroupLayout btnEditarLayout = new javax.swing.GroupLayout(btnEditar);
        btnEditar.setLayout(btnEditarLayout);
        btnEditarLayout.setHorizontalGroup(
            btnEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtEditar, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );
        btnEditarLayout.setVerticalGroup(
            btnEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtEditar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panelBarraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBarraMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_panelBarraMousePressed

    private void panelBarraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBarraMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_panelBarraMouseDragged

    private void txtExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_txtExitMouseClicked

    private void txtExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtExitMouseEntered
        btnExit.setBackground(Color.red);
        txtExit.setForeground(Color.white);
    }//GEN-LAST:event_txtExitMouseEntered

    private void txtExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtExitMouseExited
        btnExit.setBackground(Color.white);
        txtExit.setForeground(Color.black);
    }//GEN-LAST:event_txtExitMouseExited

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargartabla();
    }//GEN-LAST:event_formWindowOpened

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        if(tbUsuario.getRowCount()>0){
            if(tbUsuario.getSelectedRow()!=-1){
                int num_usuario = Integer.parseInt(String.valueOf(tbUsuario.getValueAt(tbUsuario.getSelectedRow(), 0)));
                cont.eliminarUsuario(num_usuario);
                mostrarMensaje("Usuario Eliminado", "Error", "Eliminado");
                cargartabla();
            } else{
            mostrarMensaje("Seleccione un Usuario", "Error", "Error");
            }
        }
            
        
    }//GEN-LAST:event_btnEliminarMouseClicked

    private void btnEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseEntered
        btnEliminar.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_btnEliminarMouseEntered

    private void btnEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseExited
       btnEliminar.setBackground(new Color(0, 134, 190)); 
    }//GEN-LAST:event_btnEliminarMouseExited

    private void btnPrincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrincipalMouseClicked
        this.dispose();
        principalAdmin principal = new principalAdmin();
        principal.setVisible(true);
        principal.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_btnPrincipalMouseClicked

    private void btnPrincipalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrincipalMouseEntered
        btnPrincipal.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_btnPrincipalMouseEntered

    private void btnPrincipalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrincipalMouseExited
        btnPrincipal.setBackground(new Color(0, 134, 190));
    }//GEN-LAST:event_btnPrincipalMouseExited

    private void btnEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseClicked
        if (tbUsuario.getRowCount()>0){
            if(tbUsuario.getSelectedColumn()!=-1){
                int num_editar = Integer.parseInt(String.valueOf(tbUsuario.getValueAt(tbUsuario.getSelectedRow(),0)));
                this.dispose();
                modUsuario modusu = new modUsuario(num_editar);
                modusu.setVisible(true);
                modusu.setLocationRelativeTo(null);
            }
        }
        
        
        
    }//GEN-LAST:event_btnEditarMouseClicked

    private void btnEditarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseEntered
        btnEditar.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_btnEditarMouseEntered

    private void btnEditarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseExited
        btnEditar.setBackground(new Color(0, 134, 190));
    }//GEN-LAST:event_btnEditarMouseExited

    
    public void mostrarMensaje(String mensaje,String tipo,String titulo){
        JOptionPane panel = new JOptionPane(mensaje);
        panel.setBackground(new Color(0, 134, 190));
        panel.setCursor(new Cursor(Cursor.HAND_CURSOR));
        if(tipo.equals("Info")){
            panel.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        }else if (tipo.equals("Error")){
            panel.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        Dialog dialogo = panel.createDialog(titulo);
        dialogo.setBackground(new Color(0, 134, 190));
        dialogo.setVisible(true);
        dialogo.setLocationRelativeTo(null);
    }
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel InciarSesion;
    private javax.swing.JPanel btnEditar;
    private javax.swing.JPanel btnEliminar;
    private javax.swing.JPanel btnExit;
    private javax.swing.JPanel btnPrincipal;
    private javax.swing.JLabel imgbase;
    private javax.swing.JLabel imglogo;
    private javax.swing.JLabel imguser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel panelBarra;
    private javax.swing.JTable tbUsuario;
    private javax.swing.JLabel txtEditar;
    private javax.swing.JLabel txtEliminar;
    private javax.swing.JLabel txtExit;
    // End of variables declaration//GEN-END:variables

    private void cargartabla() {
        DefaultTableModel modeltable = new DefaultTableModel(){
         @Override
         public boolean isCellEditable(int row, int column) {
                return false;
            }   
        };
        
        String tabla [] ={"Id","Usuario","Contraseña","  Permisos"};
        modeltable.setColumnIdentifiers(tabla);
        List <Usuario> tablaUsuario = cont.verTabla();
        if(tablaUsuario!= null){
            for(Usuario usu:tablaUsuario){
                Object objecto [] = {usu.getId(),usu.getUsuario(),usu.getContraseña(),usu.getPermisos()};
                modeltable.addRow(objecto);
                
            }
        }
        tbUsuario.setModel(modeltable);
    }
}

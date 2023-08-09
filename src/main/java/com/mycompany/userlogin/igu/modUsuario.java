/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.userlogin.igu;

import com.mycompany.userlogin.logica.control;
import com.mycompany.userlogin.logica.Usuario;
import java.awt.Color;
import java.awt.Dialog;
import javax.swing.JOptionPane;

public class modUsuario extends javax.swing.JFrame {
    int num_editar;
    Usuario usu;
    control cont = null;
    int xMouse, yMouse;
    public modUsuario(int num_editar) {
        cont = new control ();
        initComponents();
        cargarEditar(num_editar);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        imgbase = new javax.swing.JLabel();
        imglogo = new javax.swing.JLabel();
        Contraseña = new javax.swing.JLabel();
        InciarSesion = new javax.swing.JLabel();
        Usuario1 = new javax.swing.JLabel();
        inputUsu = new javax.swing.JTextField();
        inputContr = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btnGuardar = new javax.swing.JPanel();
        txtGuardar = new javax.swing.JLabel();
        panelBarra = new javax.swing.JPanel();
        btnExit = new javax.swing.JPanel();
        txtExit = new javax.swing.JLabel();
        cboPermisos = new javax.swing.JComboBox<>();
        btnPrincipal = new javax.swing.JPanel();
        txtPrincipal = new javax.swing.JLabel();

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

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\CARPETAS D\\Steeven Rodriguez\\Programacion\\Java Tocode\\UserLogin\\src\\main\\java\\imagenes\\customer_person_people_man_user_client_1629.png")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 330, 270, 150));

        imgbase.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgbase.setIcon(new javax.swing.ImageIcon("D:\\CARPETAS D\\Steeven Rodriguez\\Programacion\\Java Tocode\\UserLogin\\src\\main\\java\\imagenes\\informacion.png")); // NOI18N
        jPanel1.add(imgbase, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, 270, 210));

        imglogo.setIcon(new javax.swing.ImageIcon("D:\\CARPETAS D\\Steeven Rodriguez\\Programacion\\Java Tocode\\UserLogin\\src\\main\\java\\imagenes\\city.png")); // NOI18N
        jPanel1.add(imglogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 270, 500));

        Contraseña.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        Contraseña.setForeground(new java.awt.Color(0, 0, 0));
        Contraseña.setText("CONTRASEÑA:");
        jPanel1.add(Contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

        InciarSesion.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        InciarSesion.setForeground(new java.awt.Color(0, 0, 0));
        InciarSesion.setIcon(new javax.swing.ImageIcon("D:\\CARPETAS D\\Steeven Rodriguez\\Programacion\\Java Tocode\\UserLogin\\src\\main\\java\\imagenes\\editarUser.png")); // NOI18N
        InciarSesion.setText("MODIFICAR USUARIO");
        jPanel1.add(InciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, -1, -1));

        Usuario1.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        Usuario1.setForeground(new java.awt.Color(0, 0, 0));
        Usuario1.setText("USUARIO:");
        jPanel1.add(Usuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        inputUsu.setBackground(new java.awt.Color(255, 255, 255));
        inputUsu.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        inputUsu.setForeground(new java.awt.Color(0, 0, 0));
        inputUsu.setText("Ingrese el Usuario");
        inputUsu.setBorder(null);
        inputUsu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inputUsuMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                inputUsuMousePressed(evt);
            }
        });
        inputUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputUsuActionPerformed(evt);
            }
        });
        jPanel1.add(inputUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 280, 30));

        inputContr.setBackground(new java.awt.Color(255, 255, 255));
        inputContr.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        inputContr.setText("********************");
        inputContr.setToolTipText("");
        inputContr.setBorder(null);
        inputContr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                inputContrMousePressed(evt);
            }
        });
        jPanel1.add(inputContr, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 280, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 300, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 300, 10));

        btnGuardar.setBackground(new java.awt.Color(0, 134, 190));
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGuardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGuardarMouseExited(evt);
            }
        });

        txtGuardar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtGuardar.setForeground(new java.awt.Color(255, 255, 255));
        txtGuardar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtGuardar.setIcon(new javax.swing.ImageIcon("D:\\CARPETAS D\\Steeven Rodriguez\\Programacion\\Java Tocode\\UserLogin\\src\\main\\java\\imagenes\\guardarUser.png")); // NOI18N
        txtGuardar.setText("GUARDAR");
        txtGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtGuardarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnGuardarLayout = new javax.swing.GroupLayout(btnGuardar);
        btnGuardar.setLayout(btnGuardarLayout);
        btnGuardarLayout.setHorizontalGroup(
            btnGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnGuardarLayout.createSequentialGroup()
                .addComponent(txtGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        btnGuardarLayout.setVerticalGroup(
            btnGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnGuardarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 170, 40));

        panelBarra.setBackground(new java.awt.Color(255, 255, 255));
        panelBarra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        cboPermisos.setBackground(new java.awt.Color(0, 134, 190));
        cboPermisos.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        cboPermisos.setForeground(new java.awt.Color(0, 0, 0));
        cboPermisos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "------------------------------", "Administrador", "Empleado" }));
        cboPermisos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cboPermisos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboPermisosActionPerformed(evt);
            }
        });
        jPanel1.add(cboPermisos, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, 180, 30));

        btnPrincipal.setBackground(new java.awt.Color(0, 134, 190));
        btnPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        txtPrincipal.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        txtPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPrincipal.setIcon(new javax.swing.ImageIcon("D:\\CARPETAS D\\Steeven Rodriguez\\Programacion\\Java Tocode\\UserLogin\\src\\main\\java\\imagenes\\salirPrincipal.png")); // NOI18N
        txtPrincipal.setText("PRINCIPAL");
        txtPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout btnPrincipalLayout = new javax.swing.GroupLayout(btnPrincipal);
        btnPrincipal.setLayout(btnPrincipalLayout);
        btnPrincipalLayout.setHorizontalGroup(
            btnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );
        btnPrincipalLayout.setVerticalGroup(
            btnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(btnPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 420, -1, -1));

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

    private void inputUsuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inputUsuMousePressed
        inputUsu.setText("");
        inputUsu.setForeground(Color.black);
    }//GEN-LAST:event_inputUsuMousePressed

    private void inputUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputUsuActionPerformed
        // TODO add our handling code here:
    }//GEN-LAST:event_inputUsuActionPerformed

    private void inputContrMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inputContrMousePressed
        inputContr.setText("");
        inputContr.setForeground(Color.black);
    }//GEN-LAST:event_inputContrMousePressed

    private void btnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseClicked
      
    }//GEN-LAST:event_btnGuardarMouseClicked

    private void btnGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseEntered
        btnGuardar.setBackground(new Color(0,156,223));
    }//GEN-LAST:event_btnGuardarMouseEntered

    private void btnGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseExited
        btnGuardar.setBackground(new Color(0,134,190));
    }//GEN-LAST:event_btnGuardarMouseExited

    private void txtGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtGuardarMouseClicked
     String user = inputUsu.getText();
     String contra = inputContr.getText();
     String permiso = (String) cboPermisos.getSelectedItem();
     cont.modUsua(usu,num_editar,user,contra,permiso);
        mostrarMensja("Cambio con Exito", "Info", "Guardar");
     this.dispose();
     verUsuario ver =new verUsuario();
     ver.setVisible(true);
     ver.setLocationRelativeTo(null);
    }//GEN-LAST:event_txtGuardarMouseClicked

    private void cboPermisosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboPermisosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboPermisosActionPerformed

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

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
    }//GEN-LAST:event_formWindowOpened

    private void inputUsuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inputUsuMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_inputUsuMouseClicked

    public void mostrarMensja(String mensaje,String tipo, String titulo){
    JOptionPane panel = new JOptionPane(mensaje);
    if(tipo.equals("Info")){
        panel.setMessageType(JOptionPane.INFORMATION_MESSAGE);
    }else if(tipo.equals("Error")){
        panel.setMessageType(JOptionPane.ERROR_MESSAGE);
    }
    Dialog dialogo = panel.createDialog(titulo);
    dialogo.setVisible(true);
    dialogo.setLocationRelativeTo(null);
}
    
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Contraseña;
    private javax.swing.JLabel InciarSesion;
    private javax.swing.JLabel Usuario1;
    private javax.swing.JPanel btnExit;
    private javax.swing.JPanel btnGuardar;
    private javax.swing.JPanel btnPrincipal;
    private javax.swing.JComboBox<String> cboPermisos;
    private javax.swing.JLabel imgbase;
    private javax.swing.JLabel imglogo;
    private javax.swing.JPasswordField inputContr;
    private javax.swing.JTextField inputUsu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel panelBarra;
    private javax.swing.JLabel txtExit;
    private javax.swing.JLabel txtGuardar;
    private javax.swing.JLabel txtPrincipal;
    // End of variables declaration//GEN-END:variables

    private void cargarEditar(int num_editar) {
        this.usu = cont.traerUsuar(num_editar);
        
        inputUsu.setText(usu.getUsuario());
        inputContr.setText(usu.getContraseña());
        if(null == usu.getPermisos()){
            cboPermisos.setSelectedIndex(0);
        }else switch (usu.getPermisos()) {
            case "Administrador":
                cboPermisos.setSelectedIndex(1);
                break;
            case "Empleado":
                cboPermisos.setSelectedIndex(2);
                break;
            default:
                break;
        }
        
        
    }
}

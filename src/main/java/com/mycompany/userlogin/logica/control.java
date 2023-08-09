package com.mycompany.userlogin.logica;

import com.mycompany.userlogin.igu.loginuser;
import com.mycompany.userlogin.igu.principalAdmin;
import com.mycompany.userlogin.igu.verUsuario;
import com.mycompany.userlogin.persistencia.controladoraPersistencia;
import java.awt.Dialog;
import java.util.List;
import javax.swing.JOptionPane;

public class control {

    controladoraPersistencia userJpa = new controladoraPersistencia();

    public void guardarUsuario(String usuario, String contr, String permisos) {
        Usuario user = new Usuario();

        user.setUsuario(usuario);
        user.setContraseña(contr);
        user.setPermisos(permisos);
        userJpa.guardarUsuario(user);
    }

    public List<Usuario> traerUsuario() {
        return userJpa.traerUsuario();
    }

    public List<Usuario> verTabla() {
        return userJpa.verUsuario();
    }

    public void eliminarUsuario(int num_usuario) {
        userJpa.eliminarUsu(num_usuario);
    }

    public Usuario traerUsuar(int num_editar) {
        return userJpa.traerUser(num_editar);
    }

    public void modUsua(Usuario usu, int num_editar, String user, String contra, String permiso) {
        usu.setUsuario(user);
        usu.setContraseña(contra);
        usu.setPermisos(permiso);
        userJpa.modificar(usu);
    }

    public String validarLogin(String usuario, String contrasenia) {

        String mensajeok = "";
        
        List<Usuario> usuar = userJpa.traerlosUsuarios();
        for (Usuario usu : usuar) {
            if (usu.getUsuario().equals(usuario)) {
                System.out.println("usuario");
                if (usu.getContraseña().equals(contrasenia)) {
                    System.out.println("contra");
                    if (usu.getPermisos().equals("Administrador")) {
                        System.out.println("OK");
                        
                        principalAdmin admin = new principalAdmin();
                        admin.setVisible(true);
                        admin.setLocationRelativeTo(null);
                        mensajeok = "Bienvenido Administrador";
                        return mensajeok;

                    }
                } else {
                    mensajeok = "Clave incorrecta";
                    return mensajeok;
                }

            } else {
                mensajeok = "Usuario Incorrecto";
                
            }
            
        }return mensajeok;
        
    }

    public void mostrarMensaje(String mensaje, String tipo, String titulo) {
        JOptionPane panel = new JOptionPane(mensaje);
        if (tipo.equals("Info")) {
            panel.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        } else if (tipo.equals("Error")) {
            panel.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        Dialog dialogo = panel.createDialog(titulo);
        dialogo.setVisible(true);
        dialogo.setLocationRelativeTo(null);
    }
}


package com.mycompany.userlogin.persistencia;

import com.mycompany.userlogin.igu.verUsuario;
import com.mycompany.userlogin.logica.Usuario;
import com.mycompany.userlogin.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class controladoraPersistencia {
    usuarioLogJpaController controlPersis = new usuarioLogJpaController();

    public void guardarUsuario(Usuario user) {
        controlPersis.create(user);
    }

    public List<Usuario> traerUsuario() {
        return controlPersis.findusuarioLogEntities();
    }

    public List<Usuario> verUsuario() {
        return controlPersis.findusuarioLogEntities();
    }

    public void eliminarUsu(int num_usuario) {
        try {
            controlPersis.destroy(num_usuario);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(controladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Usuario traerUser(int num_editar) {
        return controlPersis.findusuarioLog(num_editar);
    }

    public void modificar(Usuario usu) {
        try {
            controlPersis.edit(usu);
        } catch (Exception ex) {
            Logger.getLogger(controladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Usuario> traerUsuarios() {
        return controlPersis.findusuarioLogEntities();
    }

    public List<Usuario> traerlosUsuarios() {
        return controlPersis.findusuarioLogEntities();
    }

 



    }


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author alvar
 */
public class Usuario {
    
    private String email;
    private String pass;
    private int IDUsuario;

    private static Usuario instance;
    
    /*
    public Usuario(int idusuario, String usuario, String nombreapellido, String identificacion, String idtipous ){
        this.IDUsuario = idusuario;
        this.Usuario = usuario;
        this.NombreApellidos = nombreapellido;
        this.Identificacion = identificacion;
        this.IdTipoUsuario = idtipous;
    }*/
    
    private Usuario(){
        
    }

    public int getIDUsuario() {
        return IDUsuario;
    }

    public void setIDUsuario(int IDUsuario) {
        this.IDUsuario = IDUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }  
    
    public static Usuario getInstance() {
        if (instance == null)
            instance = new Usuario();
        return instance;
    }
}

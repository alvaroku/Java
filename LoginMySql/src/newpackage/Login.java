/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;


import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author alvar
 */
public class Login {
    Usuario usuarioactual;
    
    public boolean login(String email, String password)throws SQLException {
     try {
         Conexion conexion = new Conexion().obtener();
         
         ResultSet resultado = conexion.consultar("SELECT id, email, password FROM usuarios WHERE email = '" + email + "' and password = '" + password + "'" );
         resultado.last();
         if (resultado.getRow() > 0){
             // usuarioactual = new Usuario(resultado.getInt("idusuario"),usuario,resultado.getString("titular"),resultado.getString("identificacion"),resultado.getString("tipo_usuario"));
             usuarioactual = Usuario.getInstance();
              usuarioactual.setIDUsuario(resultado.getInt("id"));
              usuarioactual.setEmail(resultado.getString("email"));
              usuarioactual.setPass(resultado.getString("password"));
                                         
             return true;
        }
   } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
      return false;
   }
}
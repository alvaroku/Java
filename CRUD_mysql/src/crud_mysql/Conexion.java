 
package crud_mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conexion {
    private String host,bd,us,pass;
    
    public Conexion(String host,String bd,String us,String pass){
        this.host = host;
        this.bd = bd;
        this.us = us;
        this.pass = pass;
    }
    public Statement Conectar(){
        Statement stmt = null;
         try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://"+host+"/"+bd,us,pass);
            stmt=con.createStatement();  
            System.out.println("Connected");  
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return stmt;
    }
}

 
package crud_mysql;

public class Usuario {
    private int idUs;
   private String nombre,apellido,correo;

    public Usuario(int idUs, String nombre, String apellido, String correo) {
        this.idUs = idUs;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
    }

    public int getIdUs() {
        return idUs;
    }

    public void setIdUs(int idUs) {
        this.idUs = idUs;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
   
}

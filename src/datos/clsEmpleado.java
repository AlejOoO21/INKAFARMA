
package datos;


public class clsEmpleado {
    private int dni;
    private String apellido;
    private String nombre;
    private String tipo;
    private String contraseña;
    private String estado;

    public clsEmpleado(int dni, String apellido, String nombre, String tipo, String contraseña, String estado) {
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.tipo = tipo;
        this.contraseña = contraseña;
        this.estado = estado;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}

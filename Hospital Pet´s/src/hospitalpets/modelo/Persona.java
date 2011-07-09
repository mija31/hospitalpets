/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalpets.modelo;

/**
 *
 * @author EDU
 */
public class Persona {

    protected String cedula;
    protected String nombre;
    protected String apellido;

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

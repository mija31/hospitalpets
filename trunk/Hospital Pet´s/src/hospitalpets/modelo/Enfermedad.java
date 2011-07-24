/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalpets.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author EDU
 */
public class Enfermedad {
    private int idEnfermedad;
    private String nombre;
    private String tratamiento;
    private String descripcion;
    private String foto;
    private List<Sintoma> sintomas;

    public List<Sintoma> getSintomas() {
        return sintomas;
    }

    public void setSintomas(List<Sintoma> sintomas) {
        this.sintomas = sintomas;
    }


    public Enfermedad(){
        sintomas=new ArrayList<Sintoma>();
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
    public int getIdEnfermedad() {
        return idEnfermedad;
    }

    public void setIdEnfermedad(int idEnfermedad) {
        this.idEnfermedad = idEnfermedad;
    }


}

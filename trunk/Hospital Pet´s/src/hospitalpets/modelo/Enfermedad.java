/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalpets.modelo;

import java.util.ArrayList;

/**
 *
 * @author EDU
 */
public class Enfermedad {
    private int idEnfermedad;

    public int getIdEnfermedad() {
        return idEnfermedad;
    }

    public void setIdEnfermedad(int idEnfermedad) {
        this.idEnfermedad = idEnfermedad;
    }
    private String nombre;
    private String tratamiento;
    private String diagnostico;
    private ArrayList<Sintoma> sintomas;

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Sintoma> getSintomas() {
        return sintomas;
    }

    public void setSintomas(ArrayList<Sintoma> sintomas) {
        this.sintomas = sintomas;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }


}

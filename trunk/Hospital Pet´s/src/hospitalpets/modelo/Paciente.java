/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hospitalpets.modelo;

import java.util.Date;

/**
 *
 * @author EDU
 */
public class Paciente {

    private String procedencia;
    private String barrio;
    private String parroquia;
    private RAZAS raza;
    private int sexo;
    private Date fechaNacim;
    private double peso;
    private String paciente;
    private Propietario propietario;
    private Medico medico;

    public final static int MACHO=0;
    public final static int HEMBRA=1;
    public enum RAZAS{BOXER,CHIHAUHAU};

    @Override
    public String toString(){
        String str="";
        str+=getPaciente()+" ("+getRaza()+")";
        return str;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public Date getFechaNacim() {
        return fechaNacim;
    }

    public void setFechaNacim(Date fechaNacim) {
        this.fechaNacim = fechaNacim;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public String getParroquia() {
        return parroquia;
    }

    public void setParroquia(String parroquia) {
        this.parroquia = parroquia;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public RAZAS getRaza() {
        return raza;
    }

    public void setRaza(RAZAS raza) {
        this.raza = raza;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }


}

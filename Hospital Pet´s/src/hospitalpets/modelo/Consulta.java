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
public class Consulta {

    private int numConsulta;
    private Date fecha;
    private Paciente paciente;
    private Enfermedad enfermedad;

    public Enfermedad getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(Enfermedad enfermedad) {
        this.enfermedad = enfermedad;
    }


    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getNumConsulta() {
        return numConsulta;
    }

    public void setNumConsulta(int numConsulta) {
        this.numConsulta = numConsulta;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
}

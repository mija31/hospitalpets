/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalpets.control.admin;

import hospitalpets.modelo.Propietario;
import hospitalpets.control.dao.OperacionDAO;
import hospitalpets.modelo.Medico;
import hospitalpets.modelo.Paciente;
import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;

/**
 *
 * @author EDU
 */
public class ControlAdministraPaciente {

    private static Paciente p;
    private static OperacionDAO ope = new OperacionDAO();

    /** Creates a new instance of ControlerAdministraCliente */
    public ControlAdministraPaciente() {
    }

    public static boolean crearPaciente(String paciente, Paciente.RAZAS raza,
            Date fechNacimento, Medico medico, Propietario propietario,
            String procedencia, String parroquia, String barrio, double peso, int sexo) {
        p = new Paciente();
        p.setRaza(raza);
        p.setFechaNacim(fechNacimento);
        p.setMedico(medico);
        p.setPaciente(paciente);
        p.setParroquia(parroquia);
        p.setPeso(peso);
        p.setProcedencia(procedencia);
        p.setPropietario(propietario);
        p.setSexo(sexo);
        p.setBarrio(barrio);
        return ope.mt_guardar(p);
    }

    public static ArrayList<Paciente> cargarPacientes(String cedula) {
        return (ArrayList<Paciente>) ope.cargarPacientes(new Paciente(), "paciente","propietario",cedula);
    }

    public static boolean  elimminarPaciente(Paciente c) {
        return ope.mt_eliminar(c);
    }

    public static boolean  modificarPaciente(Paciente c) {
        return ope.mt_modificar(c);
    }
}

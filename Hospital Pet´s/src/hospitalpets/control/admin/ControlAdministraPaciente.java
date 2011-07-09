/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hospitalpets.control.admin;
import hospitalpets.modelo.Propietario;
import hospitalpets.control.dao.OperacionDAO;
import hospitalpets.modelo.Medico;
import hospitalpets.modelo.Paciente;
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

    public void crearPaciente(String paciente,Paciente.RAZAS raza,Date fechNacimento,Medico medico
            ,Propietario propietario,String procedencia,String parroquia,String barrio
            ,double peso, int sexo) {
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
        ope.mt_guardar(p);
    }

    public Vector<Paciente> cargarPacientes() {
        return (Vector<Paciente>)ope.cargar(new Paciente(), "paciente");
    }

    public void elimminarPaciente(Paciente c) {
        ope.mt_eliminar(c);
    }

    public void modificarPaciente(Paciente c) {
        ope.mt_modificar(c);
    }
}

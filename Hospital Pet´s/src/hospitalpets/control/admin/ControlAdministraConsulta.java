/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalpets.control.admin;

import hospitalpets.control.dao.OperacionDAO;
import hospitalpets.modelo.Consulta;
import hospitalpets.modelo.Paciente;
import java.util.Date;
import java.util.Vector;

/**
 *
 * @author EDU
 */
public class ControlAdministraConsulta {

    private static Consulta c;
    private static OperacionDAO ope = new OperacionDAO();

    /** Creates a new instance of ControlerAdministraCliente */
    public ControlAdministraConsulta() {
    }

    public void crearConsulta(Date fecha, int numConsul, Paciente paciente) {
        c = new Consulta();
        c.setFecha(fecha);
        c.setNumConsulta(numConsul);
        c.setPaciente(paciente);
        ope.mt_guardar(c);
    }

    public Vector<Consulta> cargarConsultas() {
        return (Vector<Consulta>)ope.cargar(new Consulta(), "consulta");
    }

    public void elimminarConsulta(Consulta c) {
        ope.mt_eliminar(c);
    }

    public void modificarConsulta(Consulta c) {
        ope.mt_modificar(c);
    }

    //    public Vector buscar(String criterio, String busca, int id){
//        return ope.cargarCriterio(new Propietario(), "consulta","*",criterio,id, busca);
//    }
//    public void borrar(Date fecha, int numConsul, Paciente paciente) {
//        Consulta ee = new Consulta();
//        ee.setFecha(fecha);
//        ee.setNumConsulta(numConsul);
//        ee.setPaciente(paciente);
//        ope.mt_eliminar(ee);
//    }
}

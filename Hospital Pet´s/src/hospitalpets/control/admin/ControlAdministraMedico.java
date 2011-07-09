/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hospitalpets.control.admin;
import hospitalpets.control.dao.OperacionDAO;
import hospitalpets.modelo.Medico;
import java.util.Vector;
/**
 *
 * @author EDU
 */
public class ControlAdministraMedico {
    private static Medico m;
    private static OperacionDAO ope = new OperacionDAO();

    /** Creates a new instance of ControlerAdministraCliente */
    public ControlAdministraMedico() {
    }

    public static boolean crearMedico(String clave,String cedula,String apellido,String nombre) {
        m = new Medico();
        m.setApellido(apellido);
        m.setCedula(cedula);
        m.setClave(clave);
        m.setNombre(nombre);
        return ope.mt_guardar(m);
    }

    public static Vector<Medico> cargarMedicos() {
        return (Vector<Medico>)ope.cargar(new Medico(), "medico");
    }

    public static boolean elimminarMedico(Medico c) {
        return ope.mt_eliminar(c);
    }

    public static boolean  modificarMedico(Medico c) {
        return ope.mt_modificar(c);
    }

    public static Medico cargarMedico(String id){
        return (Medico) ope.cargarObjeto(new Medico(),"medico","clave",id);
    }

}

package hospitalpets.control.admin;

import hospitalpets.modelo.Propietario;
import hospitalpets.control.dao.OperacionDAO;
import java.util.Vector;

/**
 *
 * @author EDU
 */
public class ControlAdministraPropietario {

    private static Propietario p;
    private static OperacionDAO ope = new OperacionDAO();

    /** Creates a new instance of ControlerAdministraCliente */
    public ControlAdministraPropietario() {
    }

    public static boolean crearPropietario(String nombre, String apellido, String cedula, String telefono, String direccion) {
        p = new Propietario();
        p.setNombre(nombre);
        p.setApellido(apellido);
        p.setCedula(cedula);
        p.setTelefono(telefono);
        p.setDireccion(direccion);
        return ope.mt_guardar(p);
    }

    public static Vector<Propietario> cargarPropietarios() {
        return (Vector<Propietario>) ope.cargar(new Propietario(), "propietario");
    }
//    public Vector buscar(String criterio, String busca, int id){
//        return ope.cargarCriterio(new Propietario(), "propietario","*",criterio,id, busca);
//    }

    public static boolean elimminarPropietario(Propietario c) {
        return ope.mt_eliminar(c);
    }
//     public void borrar(String nombre, String qq,String id){
//        Propietario ee=new Propietario();
//        ee.setCedula(id);
//        ee.setNombre(nombre);
//        ee.setApellido(qq);
//        ope.mt_eliminar(ee);
//     }

    public static boolean modificarPropietario(Propietario c) {
        return ope.mt_modificar(c);
    }

        public static Propietario cargarPropietario(String id){
        return (Propietario) ope.cargarObjeto(new Propietario(),"propietario","cedula",id);
    }
}

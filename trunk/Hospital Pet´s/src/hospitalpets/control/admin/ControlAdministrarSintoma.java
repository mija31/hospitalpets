/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalpets.control.admin;

import hospitalpets.control.dao.OperacionDAO;
import hospitalpets.modelo.Sintoma;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author EDU
 */
public class ControlAdministrarSintoma {

    private static Sintoma m;
    private static OperacionDAO ope = new OperacionDAO();

    /** Creates a new instance of ControlerAdministraCliente */
    public ControlAdministrarSintoma() {
    }

    public static boolean crearSintoma(String nombre) {
        m = new Sintoma();
        m.setNombre(nombre);
        return ope.mt_guardar(m);
    }

    public static List<Sintoma> cargarSintoma() {
        ArrayList<Sintoma> e = new ArrayList<Sintoma>(ope.cargar(new Sintoma(), "sintoma"));
        return e;
    }
}

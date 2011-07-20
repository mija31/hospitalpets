/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hospitalpets.control.admin;

import hospitalpets.control.dao.OperacionDAO;
import hospitalpets.modelo.Enfermedad;

/**
 *
 * @author EDU
 */
public class ControlAdministrarEnfermedad {
    private static Enfermedad m;
    private static OperacionDAO ope = new OperacionDAO();

    /** Creates a new instance of ControlerAdministraCliente */
    public ControlAdministrarEnfermedad() {
    }

    public static boolean crearMedico() {
        m = new Enfermedad();
        m.setDiagnostico(null);

        m.setNombre(null);
        m.setSintomas(null);
        return ope.mt_guardar(ope);
    }


}

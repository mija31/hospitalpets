/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalpets;

import hospitalpets.control.admin.ControlAdministrarEnfermedad;
import hospitalpets.control.admin.ControlAdministrarSintoma;
import hospitalpets.modelo.Sintoma;
import hospitalpets.vista.VtnPrincipal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author EDÚ
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        List<Sintoma> ss = new ArrayList<Sintoma>();
        Sintoma sintoma = new Sintoma();
        sintoma.setNombre("Tos no productiva");
        ss.add(sintoma);
        sintoma = new Sintoma();
        sintoma.setNombre("Reflejo tusígeno positivo");
        ss.add(sintoma);
        sintoma = new Sintoma();
        sintoma.setNombre("Sonidos afónicos");
        ss.add(sintoma);
        ControlAdministrarEnfermedad.crearEnfermedad("Faringitis", ss, "dtfghj", "Butorfanol\t0,5 mg/kg V.O c/6-12 h\nAmoxilina mas acido clabulanico\t12,5 mg/kg V.O c/12h\nHistamil\t1mg/kg c/12h");

        ss = new ArrayList<Sintoma>();
        sintoma = new Sintoma();
        sintoma.setNombre("Tos paroxística");
        ss.add(sintoma);
        sintoma = new Sintoma();
        sintoma.setNombre("Tos no productiva y productiva");
        ss.add(sintoma);
        sintoma = new Sintoma();
        sintoma.setNombre("Reflejo tusígeno positivo");
        ss.add(sintoma);
        sintoma = new Sintoma();
        sintoma.setNombre("Sonidos afónicos");
        ss.add(sintoma);
        sintoma = new Sintoma();
        sintoma.setNombre("Secreción nasal");
        ss.add(sintoma);
        sintoma = new Sintoma();
        sintoma.setNombre("Secreción ocular");
        ss.add(sintoma);
        sintoma = new Sintoma();
        sintoma.setNombre("Rara secreción mucopurolenta");
        ss.add(sintoma);
        ControlAdministrarEnfermedad.crearEnfermedad("Traqueo bronquitis", ss, "dtfghj", "Amoxilina mas acido clabulanico\t12,5 mg/kg V.O c/12h\nPrednifin\t1mg/kg c/12h\nButorfanol\t0,5 mg/kg V.O c/6-12 h");



        new VtnPrincipal().setVisible(true);

    }
}

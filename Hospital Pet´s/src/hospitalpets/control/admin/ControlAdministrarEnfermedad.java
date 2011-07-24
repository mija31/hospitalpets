/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hospitalpets.control.admin;

import hospitalpets.control.dao.OperacionDAO;
import hospitalpets.modelo.Enfermedad;
import hospitalpets.modelo.Sintoma;
import java.util.ArrayList;
import java.util.List;

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

    public static boolean crearEnfermedad(int Codigo,String nombre,List<Sintoma> sintoma,String descripcion,String tratamiento,String foto) {
        m = new Enfermedad();
        m.setDescripcion(descripcion);
        m.setTratamiento(tratamiento);
        m.setNombre(nombre);
        m.setSintomas(sintoma);
        m.setFoto(foto);
        m.setIdEnfermedad(Codigo);
        return ope.mt_guardar(m);
    }

    public static Enfermedad cargarEnfermedad(int id){
        return (Enfermedad) ope.cargarObjeto(new Enfermedad(),"enfermedad","idEnfermedad",""+id);
    }



}

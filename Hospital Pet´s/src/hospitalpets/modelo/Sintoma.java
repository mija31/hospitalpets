package hospitalpets.modelo;

import java.util.ArrayList;

/**
 *
 * @author EDU
 */
public class Sintoma {

    private String nombre;
    private String idSintoma;
    //Constantes tipos de TOS
    public static final int TOS_NO_PRODUCTIVA = -1;
    public static final int TOS_PAROXÍSTICA = -2;
    public static final int TOS_PRODUCTIVA = -3;
    public static final int TOS_AUSENTE = -4;
    //contatantes sisntomas de enfermedades positivas
    public static final boolean[] FARINGITIS = {true, true, true, false, false, false, false, false, false, false, false, false};
    public static final boolean[] TRAQUEO_BRONQUITIS = {true, true, true, true, true, true, true, false, false, false, false, false};
    public static final boolean[] BRONCONEUMONIA = {false, false, false, true, false, true, true, true, false, false, false, false};
    public static final boolean[] NEUMONIA = {true, false, false, false, true, true, true, true, true, true, false, false};
    public static final boolean[] LARINGITIS = {true, true, true, false, false, false, false, false, false, true, false, false};
    public static final boolean[] SINUSITIS = {true, true, true, false, false, false, false, false, false, false, false, false};
    public static ArrayList<boolean[]> sistemaRespiratorio;
    public static final String[] enfermedadRespiratoria = {"Faringitis", "Traqueo bronquitis", "Bronconeumonía", "Neumonía", "Laringitis", "Sinusitis"};

    public static String sistemaRespiratorio(int tos, boolean reflejoTusígenoPositivo, boolean sonidosAfónicos,
            boolean secreciónNasal, boolean secreciónOcular, boolean distressRespiratorio,
            boolean crepitaciones, boolean anorexia, boolean disneaRespiratoria, boolean pirexiaFiebre) {
        boolean tosProductiva = false, tosNoProductiva = false, tosParoxistica = false;
        switch (tos) {
            case -1:
                tosProductiva = false;
                tosNoProductiva = true;
                tosParoxistica = false;
                break;
            case -2:
                tosProductiva = false;
                tosNoProductiva = false;
                tosParoxistica = true;
                break;
            case -3:
                tosProductiva = true;
                tosNoProductiva = false;
                tosParoxistica = false;
                break;
            case -4:
                tosProductiva = false;
                tosNoProductiva = false;
                tosParoxistica = false;
            default:
        }

        boolean[] sistom = {tosNoProductiva, reflejoTusígenoPositivo, sonidosAfónicos, tosParoxistica,
            tosProductiva, secreciónNasal, secreciónOcular, distressRespiratorio, crepitaciones,
            anorexia, disneaRespiratoria, pirexiaFiebre};

        sistemaRespiratorio = new ArrayList<boolean[]>();
        sistemaRespiratorio.add(FARINGITIS);
        sistemaRespiratorio.add(TRAQUEO_BRONQUITIS);
        sistemaRespiratorio.add(BRONCONEUMONIA);
        sistemaRespiratorio.add(NEUMONIA);
        sistemaRespiratorio.add(LARINGITIS);
        sistemaRespiratorio.add(SINUSITIS);

        int deteccion = 0;
        int conAct = 0;
        int cont = 0;
        for (int i = 0; i < sistemaRespiratorio.size(); i++) {
            for (int j = 0; j < sistom.length; j++) {
                if (sistom[j] == sistemaRespiratorio.get(i)[j]) {
                    cont++;
                }
            }
            if (conAct < cont) {
                conAct = cont;
                deteccion = i;
                cont=0;
            }
        }

        return enfermedadRespiratoria[deteccion];
    }

    public String getIdSintoma() {
        return idSintoma;
    }

    public void setIdSintoma(String idSintoma) {
        this.idSintoma = idSintoma;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

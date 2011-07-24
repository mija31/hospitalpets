package hospitalpets.modelo;

import java.util.ArrayList;

/**
 *
 * @author EDU
 */
public class Sintoma {

    private String nombre;
    private String idSintoma;

    //contatantes sintomas de enfermedades Sistema respiratoria positivas
    public static final boolean[] FARINGITIS = {true, true, true, false, false, false, false, false, false, false};
    public static final boolean[] TRAQUEO_BRONQUITIS = {true, true, true, true, true, false, false, false, false, false};
    public static final boolean[] BRONCONEUMONIA = {false, false, false, true, true, true, false, false, false, false};
    public static final boolean[] NEUMONIA = {true, false, false, true, true, true, true, true, false, false};
    public static final boolean[] LARINGITIS = {true, true, true, false, false, false, false, true, false, false};
    public static final boolean[] SINUSITIS = {false, false, false, true, false, false, false, false, true, true};


    //contatantes sintomas de enfermedades sistema digestivo positivas
    public static final boolean[] OBSTRUCCION = {true, true, true, false, false, false, false, false, false, false, false, false};
    public static final boolean[] GASTROENTERITIS_ALIMENTARIA = {true,false, true, true, true, true, false, false, false, false, false, false};
    public static final boolean[] GASTROENTERITIS_PARASITARIA = {true, false, true, true, true,false, true, false, false, false, false, false};
    public static final boolean[] HEPATOPATIA_HIGADO = {true, false, true, false, false, false, false, true, true, false, false, false};
    public static final boolean[] OBSTRUCCION_CUERPO_EXTRAÑO = {true, true, true, false, true, true, false, false, false, false, false, false};
    public static final boolean[] ABORTOS = {false, false, false, false, false, false, false, false, false, true, true, true};

    public static ArrayList<boolean[]> enfermedades;
    public static final String[] enfermedadRespiratoria = {"Faringitis", "Traqueo bronquitis", "Bronconeumonía", "Neumonía", "Laringitis", "Sinusitis"};
    public static final String[] enfermedadDigestiva = {"Obstrucción por cuerpo extraño y esófago","Gastroenteritis alimentaria",
    "Gastroenteritis parasitaria","Hepatopatía (hígado)","Obstrucción por cuerpo extraño","Abortos"};

    public static String sistemaRespiratorio(boolean tos, boolean reflejoTusígenoPositivo, boolean sonidosAfónicos,
            boolean secreciónNasal, boolean secreciónOcular, boolean distressRespiratorio,
            boolean crepitaciones, boolean anorexia, boolean disneaRespiratoria, boolean pirexiaFiebre) {
        boolean[] sistom = {tos, reflejoTusígenoPositivo, sonidosAfónicos,
            secreciónNasal, secreciónOcular, distressRespiratorio, crepitaciones,
            anorexia, disneaRespiratoria, pirexiaFiebre};

        enfermedades = new ArrayList<boolean[]>();
        enfermedades.add(FARINGITIS);
        enfermedades.add(TRAQUEO_BRONQUITIS);
        enfermedades.add(BRONCONEUMONIA);
        enfermedades.add(NEUMONIA);
        enfermedades.add(LARINGITIS);
        enfermedades.add(SINUSITIS);

        int deteccion = 0;
        int conAct = 0;
        int cont = 0;
        for (int i = 0; i < enfermedades.size(); i++) {
            for (int j = 0; j < sistom.length; j++) {
                if (sistom[j] == enfermedades.get(i)[j]) {
                    cont++;
                }
            }
            if (conAct < cont) {
                conAct = cont;
                deteccion = i;
            }
            cont = 0;
        }
        return enfermedadRespiratoria[deteccion];
    }


        public static String sistemaDigestivo(boolean vomito, boolean regurgitacion, boolean anorexiaa,
            boolean diarrea, boolean deshidratacion, boolean dolorAbdominal,
            boolean huevosParasitos, boolean hepatomegalia,boolean hepatodinia, boolean secresionVerdosaVulva,
            boolean demoraPeriodoParto,boolean ausenciaContraccionesUterinas) {
        boolean[] sistom = {vomito, regurgitacion, anorexiaa,
            diarrea, deshidratacion, dolorAbdominal, huevosParasitos,
            hepatomegalia,hepatodinia, secresionVerdosaVulva, demoraPeriodoParto,ausenciaContraccionesUterinas};

        enfermedades = new ArrayList<boolean[]>();
        enfermedades.add(OBSTRUCCION);
        enfermedades.add(GASTROENTERITIS_ALIMENTARIA);
        enfermedades.add(GASTROENTERITIS_PARASITARIA);
        enfermedades.add(HEPATOPATIA_HIGADO);
        enfermedades.add(OBSTRUCCION_CUERPO_EXTRAÑO);
        enfermedades.add(ABORTOS);

        int deteccion = 0;
        int conAct = 0;
        int cont = 0;
        for (int i = 0; i < enfermedades.size(); i++) {
            for (int j = 0; j < sistom.length; j++) {
                if (sistom[j] == enfermedades.get(i)[j]) {
                    cont++;
                }
            }
            if (conAct < cont) {
                conAct = cont;
                deteccion = i;
            }
            cont = 0;
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

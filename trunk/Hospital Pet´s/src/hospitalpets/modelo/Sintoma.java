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
    public static final boolean[] GASTROENTERITIS_ALIMENTARIA = {true, false, true, true, true, true, false, false, false, false, false, false};
    public static final boolean[] GASTROENTERITIS_PARASITARIA = {true, false, true, true, true, false, true, false, false, false, false, false};
    public static final boolean[] HEPATOPATIA_HIGADO = {true, false, true, false, false, false, false, true, true, false, false, false};
    public static final boolean[] OBSTRUCCION_CUERPO_EXTRAÑO = {true, true, true, false, true, true, false, false, false, false, false, false};
    public static final boolean[] ABORTOS = {false, false, false, false, false, false, false, false, false, true, true, true};
    //contatantes sintomas de enfermedades dermatologia positivas
    public static final boolean[] ALERGIA_PICADURA_PULGA = {true, true, false, false, false, false, false, false};
    public static final boolean[] PIODERMA = {true, false, true, true, true, true, false, false};
    public static final boolean[] DERMATITIS_BACTERIANA = {true, true, false, true, false, false, true, true};
    //contatantes sintomas de enfermedades sistema cardiovascular positivas
    public static final boolean[] INSUFICIENCIA_CARDIACA_CONGESTIVA = {true, true, true, true, true, true, true, true, true, true, true, true, false, false, false, false};
    public static final boolean[] ARRITMIAS_CARDIACAS = {false, false, false, false, false, true, true, false, false, false, true, false, true, false, false, false,};
    public static final boolean[] DEGENERACION_VASCULAR_MIXOMATOSA = {false, true, false, true, false, false, false, false, false, false, false, false, false, true, true, false};
    public static final boolean[] HERNIA_DIAFRAGMATICA = {false, false, false, false, true, false, false, false, false, false, false, true, false, true, false, true};
    public static ArrayList<boolean[]> enfermedades;
    public static final int[] enfermedadRespiratoria = {1, 2, 3, 4, 5, 6};
    public static final int[] enfermedadDigestiva = {7, 8, 9, 10, 11, 12};
    public static final int[] enfermedadDermatologica = {13, 14, 15};
    public static final int[] enfermedadCardiovascular = {16, 17, 18, 19};

    public static int sistemaRespiratorio(boolean tos, boolean reflejoTusígenoPositivo, boolean sonidosAfónicos,
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

    public static int sistemaDigestivo(boolean vomito, boolean regurgitacion, boolean anorexiaa,
            boolean diarrea, boolean deshidratacion, boolean dolorAbdominal,
            boolean huevosParasitos, boolean hepatomegalia, boolean hepatodinia, boolean secresionVerdosaVulva,
            boolean demoraPeriodoParto, boolean ausenciaContraccionesUterinas) {
        boolean[] sistom = {vomito, regurgitacion, anorexiaa,
            diarrea, deshidratacion, dolorAbdominal, huevosParasitos,
            hepatomegalia, hepatodinia, secresionVerdosaVulva, demoraPeriodoParto, ausenciaContraccionesUterinas};

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
        return enfermedadDigestiva[deteccion];
    }

    public static int sistemaDermatologico(boolean eritema, boolean prurito, boolean ulceras,
            boolean seborrea, boolean malOlorPelaje, boolean secrecionPurulenta,
            boolean costras, boolean cambioColoracionPelaje) {
        boolean[] sistom = {eritema, prurito, ulceras,
            seborrea, malOlorPelaje, secrecionPurulenta, costras,
            cambioColoracionPelaje};

        enfermedades = new ArrayList<boolean[]>();
        enfermedades.add(ALERGIA_PICADURA_PULGA);
        enfermedades.add(PIODERMA);
        enfermedades.add(DERMATITIS_BACTERIANA);
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
        return enfermedadDermatologica[deteccion];
    }

    public static int    sistemaCardiovascular(boolean ascitis, boolean edemaPulmonar, boolean edemaPeriferico,
            boolean reflejoTusigenoPositivo, boolean tos, boolean resistenciaEjercicio,
            boolean desmayos, boolean mucosasCianoticas, boolean presionArterialDisminuida, boolean presenciaSoploCardiaco,
            boolean taquicardia, boolean distresRespiratorio, boolean bradicardias,
            boolean cianosis, boolean soploMitral, boolean derramePeural) {
        boolean[] sistom = {ascitis, edemaPulmonar, edemaPeriferico,
            reflejoTusigenoPositivo, tos, resistenciaEjercicio, desmayos,
            mucosasCianoticas, presionArterialDisminuida, presenciaSoploCardiaco,
            taquicardia, distresRespiratorio, bradicardias, cianosis, soploMitral, derramePeural};

        enfermedades = new ArrayList<boolean[]>();
        enfermedades.add(INSUFICIENCIA_CARDIACA_CONGESTIVA);
        enfermedades.add(ARRITMIAS_CARDIACAS);
        enfermedades.add(DEGENERACION_VASCULAR_MIXOMATOSA);
        enfermedades.add(HERNIA_DIAFRAGMATICA);

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
        return enfermedadCardiovascular[deteccion];
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

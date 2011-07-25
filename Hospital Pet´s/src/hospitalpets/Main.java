/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalpets;

import hospitalpets.control.admin.ControlAdministrarEnfermedad;
import hospitalpets.modelo.Sintoma;
import java.util.ArrayList;
import java.util.List;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author EDÚ
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnsupportedLookAndFeelException {
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
        ControlAdministrarEnfermedad.crearEnfermedad(1, "Faringitis", ss, "Se  puede definir como la inflamación de la mucosa y producirle dolor de garganta."
                + "bien luego de un baño, dormir a la intemperie. Algunos agentes infecciosos pueden también provocar faringitis.", "Butorfanol\t0,5 mg/kg V.O c/6-12 h"
                + "\nAmoxilina mas acido clabulanico\t12,5 mg/kg V.O c/12h\nHistamil\t1mg/kg c/12h", "foto");

        ss = new ArrayList<Sintoma>();
        sintoma = new Sintoma();
        sintoma.setNombre("Tos no productiva");
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

        ControlAdministrarEnfermedad.crearEnfermedad(2, "Traqueo Bronquitis", ss, "Conocida como tos de las perreras,afecta al tracto respiratorio, es una tos "
                + "seca y persistente. Es altamente contagiosa ya que se transmite vía aerosol", "Butorfanol\t0,5 mg/kg V.O c/6-12 h"
                + "\nAmoxilina mas acido clabulanico\t12,5 mg/kg V.O c/12h\nPrednifon\t1mg/kg c/12h\nButorfanol\t0,5mg/kg V.O c/6-12h", "foto");

        ss = new ArrayList<Sintoma>();
        sintoma = new Sintoma();
        sintoma.setNombre("Secreción nasal");
        ss.add(sintoma);
        sintoma = new Sintoma();
        sintoma.setNombre("Secreción ocular");
        ss.add(sintoma);
        sintoma = new Sintoma();
        sintoma.setNombre("Distress respiratorio");
        ss.add(sintoma);

        ControlAdministrarEnfermedad.crearEnfermedad(3, "Bronconeumonía", ss, "Proceso inflamatorio que afecta a los pulmones, bronquios y alveolos."
                + "  Es más frecuente la bronconeumonía en países y zonas con temperaturas bajas que con climas cálidos.", "Shotapen\t1 ml/10kg c/24h"
                + "\nVetalgina\t28 mg/kg c/24h\nCortiprex\t1mg/kg c/12h\nNebulizaciones \t 2 veces al dia", "foto");

        ss = new ArrayList<Sintoma>();
        sintoma = new Sintoma();
        sintoma.setNombre("Tos no productiva");
        ss.add(sintoma);
        sintoma.setNombre("Secreción nasal");
        ss.add(sintoma);
        sintoma = new Sintoma();
        sintoma.setNombre("Secreción ocular");
        ss.add(sintoma);
        sintoma = new Sintoma();
        sintoma.setNombre("Distress respiratorio");
        ss.add(sintoma);
        sintoma = new Sintoma();
        sintoma.setNombre("Crepitaciones");
        ss.add(sintoma);
        sintoma = new Sintoma();
        sintoma.setNombre("Anorexia");
        ss.add(sintoma);

        ControlAdministrarEnfermedad.crearEnfermedad(4, "Neumonía", ss, "Causada por infecciones bacterianas."
                + "Algunas causas principales son la inmunosupresión de las drogas, discinesia, reducción"
                + " de la eliminación de los desechos, la desnutrición.", "Vetalgina\t28 mg/kg c/24 h"
                + "\nBenzapen\t1 ml/10kg c/24h", "foto");

        ss = new ArrayList<Sintoma>();
        sintoma = new Sintoma();
        sintoma.setNombre("Tos no productiva");
        ss.add(sintoma);
        sintoma.setNombre("Relejo tusígeno positivo");
        ss.add(sintoma);
        sintoma = new Sintoma();
        sintoma.setNombre("Sonidos afónicos");
        ss.add(sintoma);
        sintoma = new Sintoma();
        sintoma.setNombre("Anorexia");
        ss.add(sintoma);

        ControlAdministrarEnfermedad.crearEnfermedad(5, "Laringitis", ss, "Inflamación de la garganta.La causa puede ser provocada"
                + " por alguna infección, vomito, tos crónica, tumores o patologías odontológicas avanzadas.", "Penisilina\t1 ml/10 kg c/24 h"
                + "\nPrednisolona\t1 mg/kg c/12h", "foto");

        ss = new ArrayList<Sintoma>();
        sintoma = new Sintoma();
        sintoma.setNombre("Secreción nasal");
        ss.add(sintoma);
        sintoma.setNombre("Disnea respiratoria");
        ss.add(sintoma);
        sintoma = new Sintoma();
        sintoma.setNombre("Pirexia o fiebre");
        ss.add(sintoma);

        ControlAdministrarEnfermedad.crearEnfermedad(6, "Sinusitis", ss, "Es la inflamación de la mucosa de la cavidad nasal.",
                "Fenobarbital\nLanmedor nasal crema topica\t2 veces al dia\nElabinex suspension", "foto");

        ss = new ArrayList<Sintoma>();
        sintoma = new Sintoma();
        sintoma.setNombre("Vómitos");
        ss.add(sintoma);
        sintoma.setNombre("Regurgitación");
        ss.add(sintoma);
        sintoma = new Sintoma();
        sintoma.setNombre("Anorexia");
        ss.add(sintoma);

        ControlAdministrarEnfermedad.crearEnfermedad(7, "Obstrucción por cuerpo extraño y esófago", ss, "Las obstrucciones del esófago pueden estar causadas"
                + " por masa tumorales, cuerpos extraños (huesos, anzuelos, agujas, palos, juguetes…).","Mesulit gotas\t5 gotas/animal\nEnrofloxacina \t5 mg/kg c/12h\nIntervencion quirurgica de extraccion", "foto");

        ss = new ArrayList<Sintoma>();
        sintoma = new Sintoma();
        sintoma.setNombre("Vómitos");
        ss.add(sintoma);
        sintoma = new Sintoma();
        sintoma.setNombre("Anorexia");
        ss.add(sintoma);
        sintoma = new Sintoma();
        sintoma.setNombre("Diarrea");
        ss.add(sintoma);
        sintoma = new Sintoma();
        sintoma.setNombre("Deshidratación");
        ss.add(sintoma);
        sintoma = new Sintoma();
        sintoma.setNombre("Dolor abdominal");
        ss.add(sintoma);

        ControlAdministrarEnfermedad.crearEnfermedad(8, "Gastroenteritis alimentaria", ss, "es un proceso inflamatorio del sistema gastrointestinal, donde se ve afectada"
                + " el estómago y el intestino","Metoclopramida\t0,2 mg/kg c/6-8h\nFloratil\tsi no "
                + "hay vomito 1/2 sobre cada 12h\nFluidoterapia \tCINa\nAminovit \t2 ml/kg cada 12h\nMaxin \t5 ml/animal/24h\nAcromaxfenicol \t50 mg/kg c/6-8h"
                , "foto");

        ss = new ArrayList<Sintoma>();
        sintoma = new Sintoma();
        sintoma.setNombre("Vómitos");
        ss.add(sintoma);
        sintoma = new Sintoma();
        sintoma.setNombre("Anorexia");
        ss.add(sintoma);
        sintoma = new Sintoma();
        sintoma.setNombre("Diarrea");
        ss.add(sintoma);
        sintoma = new Sintoma();
        sintoma.setNombre("Deshidratación");
        ss.add(sintoma);
        sintoma = new Sintoma();
        sintoma.setNombre("Huevos de parásitos");
        ss.add(sintoma);

        ControlAdministrarEnfermedad.crearEnfermedad(9, "Gastroenteritis parasitaria", ss, "es un proceso inflamatorio que afectada el intestino por "
                + "(parásitos internos como coccidios, ancylostomiasis, giardias,"
                + " ascaridiasis,  o tenias)","Sulfa-trimetropin\t12,5 mg/kg c/12h\nMetronidazol\t10 mg/kg c/12h\nAminoacidos \t2 ml/kg cada 12h\nRanitidina"
                + " \t2 mg/kg c/8h\nVetlagina \t28 mg/kg c/24h\nMetroclopramida \t0,2 mg/kg c/6-8h\nNetecan \t1 ml/5kg", "foto");

        ss = new ArrayList<Sintoma>();
        sintoma = new Sintoma();
        sintoma.setNombre("Vómitos");
        ss.add(sintoma);
        sintoma = new Sintoma();
        sintoma.setNombre("Anorexia");
        ss.add(sintoma);
        sintoma = new Sintoma();
        sintoma.setNombre("Hepatomegalia");
        ss.add(sintoma);
        sintoma = new Sintoma();
        sintoma.setNombre("Hepatodinia");
        ss.add(sintoma);

        ControlAdministrarEnfermedad.crearEnfermedad(10, "Hepatopatía", ss, "se aplica a muchas enfermedades y trastornos que pueden hacer que el hígado sufra"
                + " una disminución de sus funciones."
                ,"Ranitidina \t2 mg/kg c/8h\nMetoclopramida \t0,2 mg/kg c/6-8h\nMaxin \t5 ml/animal/24h\nAminoacidos \t2 mg/kg c/12h\nCefalexina \tcefalexina "
                + "30 mg/kg c/12h", "foto");

        ss = new ArrayList<Sintoma>();
        sintoma = new Sintoma();
        sintoma.setNombre("Vómitos");
        ss.add(sintoma);
        sintoma = new Sintoma();
        sintoma.setNombre("Regurgitación");
        ss.add(sintoma);
        sintoma = new Sintoma();
        sintoma.setNombre("Anorexia");
        ss.add(sintoma);
        sintoma = new Sintoma();
        sintoma.setNombre("Deshidratación");
        ss.add(sintoma);
        sintoma = new Sintoma();
        sintoma.setNombre("Dolor abdominal");
        ss.add(sintoma);

        ControlAdministrarEnfermedad.crearEnfermedad(11, "Obstrucción por cuerpo extraño", ss, "Las obstrucciones del esófago pueden estar causadas por masa"
                + " tumorales, cuerpos extraños (huesos, anzuelos, agujas, palos, juguetes)."
                ,"Mesulit gotas \t5 gotas/animal\nAcromaxfenicol \t50 mg/kg c/6-8h\nIntervencion quirurgica de extraccion\nTramal \t2 mg/kg c/12h\nFluidoterapia"
                + " \tCINa\nMetroclopramida \t0,2 mg/kg c/6-8h\nRanitidina \t2 mg/kg c/8h", "foto");

        ss = new ArrayList<Sintoma>();
        sintoma = new Sintoma();
        sintoma.setNombre("Secreción verdosa a nivel de vulva");
        ss.add(sintoma);
        sintoma = new Sintoma();
        sintoma.setNombre("Demora en el periodo de parto");
        ss.add(sintoma);
        sintoma = new Sintoma();
        sintoma.setNombre("Ausencia de contracciones uterinas");
        ss.add(sintoma);

        ControlAdministrarEnfermedad.crearEnfermedad(12, "Abortos", ss, "El aborto se considera como tal si tu perrita expulsa (pierde) a sus cachorros antes del"
                + " periodo completo de gestación."
                ,"Enrofloxacina \t5 mg/kg c/12h\nOvarihisterectomia\nTramal\nTramal \t2 mg/kg c/12h\nMeloxican \t0,2 mg/kg c/24h", "foto");

        ss = new ArrayList<Sintoma>();
        sintoma = new Sintoma();
        sintoma.setNombre("Eritema");
        ss.add(sintoma);
        sintoma = new Sintoma();
        sintoma.setNombre("Prurito");
        ss.add(sintoma);

        ControlAdministrarEnfermedad.crearEnfermedad(13, "Alergia por picadura de pulga", ss, "Es una reacción de hipersensibilidad a uno o más componentes de la"
                + " saliva de la pulga, se adquiere principalmente en el verano."
                ,"Cefadin 1g\tcefalexina 30 mg/kg c/12h\nFipronyl spray según peso del animal\nEquilibrium Ages \tsegún tamaño del animal\nLevacan/clorexidina \tbaños"
                + " 1-2 veces semanales\nPresnisolona \t1 mg/kg c/12h", "foto");

        ss = new ArrayList<Sintoma>();
        sintoma = new Sintoma();
        sintoma.setNombre("Eritema");
        ss.add(sintoma);
        sintoma = new Sintoma();
        sintoma.setNombre("Ulceras");
        ss.add(sintoma);
        sintoma = new Sintoma();
        sintoma.setNombre("Seborrea");
        ss.add(sintoma);
        sintoma = new Sintoma();
        sintoma.setNombre("Mal olor del pelaje");
        ss.add(sintoma);
        sintoma = new Sintoma();
        sintoma.setNombre("Secreción purulenta");
        ss.add(sintoma);

        ControlAdministrarEnfermedad.crearEnfermedad(14, "Pioderma", ss, "Es una infección bacteriana ocasionada por el exceso de humedad, inmunosupresión,"
                + " automutilación, etcétera."
                ,"Cefalexina \t30 mg/kg c/12h\nPrednisolona \t1 mg/kg c/12h\nEquilibrium \tSegún tamaño del animal\nLevacan/clorexidina\tbaños 1-2 veces semanales"
                + "\nPeroxido de Benzoilo \tbaños 1-2 veces semanales"
                , "foto");

        ss = new ArrayList<Sintoma>();
        sintoma = new Sintoma();
        sintoma.setNombre("Eritema");
        ss.add(sintoma);
        sintoma = new Sintoma();
        sintoma.setNombre("Prurito");
        ss.add(sintoma);
        sintoma = new Sintoma();
        sintoma.setNombre("Seborrea");
        ss.add(sintoma);
        sintoma = new Sintoma();
        sintoma.setNombre("Costras");
        ss.add(sintoma);
        sintoma = new Sintoma();
        sintoma.setNombre("Cambio en la coloración del pelaje");
        ss.add(sintoma);

        ControlAdministrarEnfermedad.crearEnfermedad(15, "Dermatitis bacteriana", ss, "Se refiere a una inflamación de la piel o dermis. Los síntomas son enrojecimiento,"
                + " dolor y exudación de la zona cutánea afectada."
                ,"Cefalexina \t30 mg/kg c/12h\nCrema alfa (6A)\t2-3 aplicaciones diarias\nLevacan/clorexidina \tbaños 1-2 veces semanales", "foto");

        ss = new ArrayList<Sintoma>();
        sintoma = new Sintoma();
        sintoma.setNombre("Ascitis");
        ss.add(sintoma);
        sintoma = new Sintoma();
        sintoma.setNombre("Edema pulmonar");
        ss.add(sintoma);
        sintoma = new Sintoma();
        sintoma.setNombre("Edema periférico");
        ss.add(sintoma);
        sintoma = new Sintoma();
        sintoma.setNombre("Relejo tusígeno positivo");
        ss.add(sintoma);
        sintoma = new Sintoma();
        sintoma.setNombre("Resistencia al ejercicio");
        ss.add(sintoma);
        sintoma = new Sintoma();
        sintoma.setNombre("Desmayos");
        ss.add(sintoma);
        sintoma = new Sintoma();
        sintoma.setNombre("Mucosas cianóticas");
        ss.add(sintoma);
        sintoma = new Sintoma();
        sintoma.setNombre("Presión arterial disminuida");
        ss.add(sintoma);
        sintoma = new Sintoma();
        sintoma.setNombre("Presencia o no de un splo cardiaco");
        ss.add(sintoma);
        sintoma = new Sintoma();
        sintoma.setNombre("Taquicardia");
        ss.add(sintoma);
        sintoma = new Sintoma();
        sintoma.setNombre("Distres respiratorio");
        ss.add(sintoma);

        ControlAdministrarEnfermedad.crearEnfermedad(16, "Insuficiencia Cardiaca Congestiva", ss, "Una insuficiencia cardiaca es la incapacidad del corazón para bombear"
                + " sangre suficiente para satisfacer las necesidades de los tejidos y órganos."
                ,"Furosemida \t4 mg/kg c/12h\nSilimarina 14\t2 cap/c/12h\nI-Carnitina \t1 cap/c/12h\nEnalapril \t0,5 mg/kg c/12h\nAtenolol \t50 mg/kg c/8h\nDieta baja en SAL"
                , "foto");

        ss = new ArrayList<Sintoma>();
        sintoma = new Sintoma();
        sintoma.setNombre("Resistencia al ejercicio");
        ss.add(sintoma);
        sintoma = new Sintoma();
        sintoma.setNombre("Desmayos");
        sintoma = new Sintoma();
        sintoma.setNombre("Taquicardia");
        ss.add(sintoma);
        sintoma = new Sintoma();
        sintoma.setNombre("Bradicardias");
        ss.add(sintoma);

        ControlAdministrarEnfermedad.crearEnfermedad(17, "Arritmias Cardiacas", ss, "Toda irregularidad en el ritmo natural del corazón se denomina «arritmia»."
                ,"Atenolol \t1 mg/kg c/8h"
                , "foto");

        ss = new ArrayList<Sintoma>();
        sintoma = new Sintoma();
        sintoma.setNombre("Edema Pulmonar");
        ss.add(sintoma);
        sintoma = new Sintoma();
        sintoma.setNombre("Reflejo tusígeno positivo");
        sintoma = new Sintoma();
        sintoma.setNombre("Cianosis");
        ss.add(sintoma);
        sintoma = new Sintoma();
        sintoma.setNombre("Soplo mitral");
        ss.add(sintoma);

        ControlAdministrarEnfermedad.crearEnfermedad(18, "Degeneración vascular mixomatosa", ss, "Enfermedad infecciosa, de origen vírico y contagiosa."
                ,"Furosemida \t4 mg/kg c/12h\nEnalapril \t0,5 mg/kg c/12h\nDieta baja en SAL"
                , "foto");

        ss = new ArrayList<Sintoma>();
        sintoma = new Sintoma();
        sintoma.setNombre("Reflejo tusígeno positivo");
        sintoma = new Sintoma();
        sintoma.setNombre("Distres respiratorio");
        ss.add(sintoma);
        sintoma = new Sintoma();
        sintoma.setNombre("Cianosis");
        ss.add(sintoma);
        sintoma = new Sintoma();
        sintoma.setNombre("Derrame pleural");
        ss.add(sintoma);

        ControlAdministrarEnfermedad.crearEnfermedad(19, "Hernia diafragmática", ss, "Es una anomalía congénita en la cual hay una abertura anormal en el diafragma,"
                + " el músculo que le ayuda a uno a respirar."
                ,"Correccion quirurgica", "foto");

    }
}

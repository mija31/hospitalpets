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
        ControlAdministrarEnfermedad.crearEnfermedad(1, "Faringitis", ss, "Los perros como las personas pueden padecer faringitis, la cual se la puede definir como la inflamación de la mucosa y producirle dolor de garganta. "
                + "Las causas que puede provocar la faringitis canina son cambios bruscos de temperatura, beber o comer alimentos muy fríos, enfriamiento por echarse en superficies frías, permanecer mojado por no secarlo "
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

        ControlAdministrarEnfermedad.crearEnfermedad(2, "Traqueo Bronquitis", ss, "También conocida como tos de las perreras, es similar a la gripe humana afecta al tracto respiratorio, entre sus síntomas destacamos una tos "
                + "seca y persistente. Es altamente contagiosa ya que se transmite vía aerosol a través de la tos y estornudos o por contacto directo (nariz contra nariz). Es muy común entre los perros que conviven en lugares"
                + " donde hay una gran población perruna como residencias caninas, exposiciones e incluso parques urbanos. Además una bacteria involucrada se puede transmitir a los seres humanos sobre todo a personas con el"
                + " sistema inmunológico bajo como por ejemplo las afectadas por el SIDA.", "Butorfanol\t0,5 mg/kg V.O c/6-12 h"
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

        ControlAdministrarEnfermedad.crearEnfermedad(3, "Bronconeumonía", ss, "Se la puede definir como un proceso inflamatorio que afecta a los pulmones, bronquios y alveolos."
                + "  Es más frecuente la bronconeumonía en países y zonas con temperaturas bajas que con climas cálidos.Se produce por la inhalación de ciertos elementos como polvo,"
                + " gases y presencia de bacterias así como parásitos que favorecen la inflamación de las vías respiratorias. Hay ciertas condiciones que aumentan la predisposición"
                + " a contraerla como hacinamiento, enfriamiento,  lugares con mucha humedad y falta de limpieza. Ventilar los espacios es importante para renovar el aire."
                + " Es bastante frecuente en criaderos y refugios con gran cantidad de perros por las condiciones sanitarias del ambiente.", "Shotapen\t1 ml/10kg c/24h"
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

        ControlAdministrarEnfermedad.crearEnfermedad(4, "Neumonía", ss, "La neumonía es causada por infecciones bacterianas, virales, hongos o parásitos."
                + " En el caso de los perros, la neumonía es principalmente debido a la infección bacteriana. La inhalación suele ser una vía de transmisión"
                + " de la infección. Algunas de las causas principales de la neumonía del perro son la inmunosupresión de las drogas, discinesia, reducción"
                + " de la eliminación de los desechos se inhala en los pulmones, la desnutrición, la aspiración de material ingestal o contenido gástrico o"
                + " de contenido gástrico, la infección viral y fúngica o infección parasitaria. Algunas razas de perros como perros de caza, deportivas"
                + " perros, perros de trabajo y algunas razas mezcladas son más vulnerables a la neumonía. Los perros de 2 meses a 15 años de edad son más"
                + " propensos a contraer la infección por neumonía. ", "Vetalgina\t28 mg/kg c/24 h"
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

        ControlAdministrarEnfermedad.crearEnfermedad(5, "Laringitis", ss, "Los perros igual que los humanos, poseen amígdalas, estas están ubicadas en ambos"
                + " lados laterales de su garganta, cuando estas se inflaman se denomina amigdalitis o tonsilitis.La causa de la inflamación puede ser provocada"
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

        ControlAdministrarEnfermedad.crearEnfermedad(6, "Sinusitis", ss, "Es la inflamación de la mucosa de la cavidad nasal. Sinusitis describe aquellas"
                + " condiciones en las que existe una reacción inflamatoria de la cavidad nasal que cursa con estornudos, secreción e incomodidad nasal."
                + "Pueden verse implicados los senos nasales rinitis/sinusitis. Si existen cambios hiperplásicos crónicos rinitis crónicas.",
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
                + " por masa tumorales, cuerpos extraños (huesos, anzuelos, agujas, palos, juguetes…).Los síntomas resultantes si el objeto ingerido dependen"
                + " del tamaño del cuerpo y de la duración de la obstrucción correspondiéndose generalmente con: Regurgitación de comida y agua (vómito de"
                + " alimentos sin digerir).","Mesulit gotas\t5 gotas/animal\nEnrofloxacina \t5 mg/kg c/12h\nIntervencion quirurgica de extraccion", "foto");

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

        ControlAdministrarEnfermedad.crearEnfermedad(8, "Gastroenteritis alimentaria", ss, "es un proceso inflamatorio del sistema gastrointestinal; en general"
                + " se denomina de esta manera los cuadros donde se ve afectada el estómago y el intestino","Metoclopramida\t0,2 mg/kg c/6-8h\nFloratil\tsi no "
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

        ControlAdministrarEnfermedad.crearEnfermedad(9, "Gastroenteritis parasitaria", ss, "es un proceso inflamatorio del sistema gastrointestinal; en general"
                + " se denomina de esta manera los cuadros donde se ve afectada el intestino por (parásitos internos como coccidios, ancylostomiasis, giardias,"
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
                + " una disminución de sus funcione. Esto sucede especialmente por los factores tóxicos que se liberan de enfermedades del tracto gastrointestinal."
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
                + " periodo completo de gestación, para esto obviamente deberá estar confirmada previamente la gestación ya que algunos propietarios se confunden"
                + " y creen que su perrita aborto y se comió a los fetos cuando en realidad superrita presentaba un pseudo embarazo y nunca estuvo gestante."
                ,"Enrofloxacina \t5 mg/kg c/12h\nOvarihisterectomia\nTramal\nTramal \t2 mg/kg c/12h\nMeloxican \t0,2 mg/kg c/24h", "foto");

        ss = new ArrayList<Sintoma>();
        sintoma = new Sintoma();
        sintoma.setNombre("Eritema");
        ss.add(sintoma);
        sintoma = new Sintoma();
        sintoma.setNombre("Prurito");
        ss.add(sintoma);

        ControlAdministrarEnfermedad.crearEnfermedad(13, "Alergia por picadura de pulga", ss, "Es una reacción de hipersensibilidad a uno o más componentes de la"
                + " saliva de la pulga, se adquiere principalmente en el verano. Es un problema muy frecuente y desesperante para ti y, sobre todo, para tu perro."
                + "\nSignos clínicos que notarás\n \t Zonas sin pelo en la grupa y en la base de la cola.\n \tTu perro se rascará y se lamerá desesperadamente hasta"
                + " lesionarse de gravedad por sí mismo.\n \tZonas enrojecidas, sangrantes o con costras."
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
                + " automutilación, etcétera.\nSignos clínicos que notarás\n \tZonas sin pelo inflamadas y enrojecidas.\n \tPresencia de secreciones malolientes"
                + " con o sin sangre.\n \tDolor.\n \tPresencia de escamas."
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
                + " dolor y exudación de la zona cutánea afectada. En los casos de larga duración es característica la formación de costras, y la sequedad y descamación"
                + " de la piel. El término dermatitis se utiliza indistintamente con el de eccema, que se refiere de una forma más específica a ciertas enfermedades no"
                + " contagiosas de la piel. La inflamación puede deberse a parásitos o irritantes físicos o químicos. Las infecciones cutáneas por Streptococcus o"
                + " Staphyloccus son ejemplos de dermatitis bacterianas. Las quemaduras solares son un ejemplo frecuente de dermatitis debida a la acción de la radiación"
                + " solar sobre la piel."
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
                + " sangre suficiente para satisfacer las necesidades de los tejidos y órganos. Esto puede ser causado por válvulas defectuosas, enfermedades miocárdicas"
                + " (del músculo del corazón), infestación parasitaria u otras alteraciones cardiacas que afectan tanto a perros como a gatos.La insuficiencia cardíaca"
                + " es una enfermedad severa, con elevados índices de mortalidad a pocos años de su evolución."
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

        ControlAdministrarEnfermedad.crearEnfermedad(17, "Arritmias Cardiacas", ss, "Toda irregularidad en el ritmo natural del corazón se denomina «arritmia». Cualquiera"
                + " puede sentir latidos irregulares o palpitaciones en algún momento de su vida, y estas palpitaciones leves e infrecuentes son inofensivas."
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

        ControlAdministrarEnfermedad.crearEnfermedad(18, "Degeneración vascular mixomatosa", ss, "Enfermedad infecciosa, de origen vírico y contagiosa, de los"
                + " conejos, se caracteriza por tumefacciones en la piel, adelgazamiento rápido y, en poco tiempo, la muerte del animal."
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
                + " el músculo que le ayuda a uno a respirar. Esta abertura permite que parte de los órganos abdominales (estómago, bazo, hígado e intestinos) se"
                + " suban hasta la cavidad torácica cerca de los pulmones."
                ,"Correccion quirurgica", "foto");

    }
}

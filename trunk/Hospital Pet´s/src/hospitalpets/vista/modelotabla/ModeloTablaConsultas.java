/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalpets.vista.modelotabla;

import hospitalpets.control.admin.ControlAdministraConsulta;
import hospitalpets.control.admin.ControlAdministraMedico;
import hospitalpets.control.admin.ControlAdministraPaciente;
import hospitalpets.control.admin.ControlAdministraPropietario;
import hospitalpets.modelo.Consulta;
import hospitalpets.modelo.Paciente;
import java.util.Vector;

/**
 *
 * @author EDU
 */
public class ModeloTablaConsultas extends javax.swing.table.AbstractTableModel {

    Vector<Consulta> consultas = ControlAdministraConsulta.cargarConsultas();
    String titulos[] = {"Numero", "Medico", "Propietario", "Paciente", "Fecha"};

    public ModeloTablaConsultas() {
    }

    public ModeloTablaConsultas(String Cedula) {
        Vector<Consulta> consult = new Vector<Consulta>();
        for (Consulta con : consultas) {
            Paciente past = ControlAdministraPaciente.cargarPacient(con.getPaciente().getIdPaciente());
            if (past.getPropietario().getCedula().equals(Cedula)) {
                consult.add(con);
            }
        }
        consultas = consult;
    }

    public ModeloTablaConsultas(String password, int nada) {
        Vector<Consulta> consult = new Vector<Consulta>();
        for (Consulta con : consultas) {
            Paciente past = ControlAdministraPaciente.cargarPacient(con.getPaciente().getIdPaciente());
            if (past.getMedico().getClave().equals(password)) {
                consult.add(con);
            }
        }
        consultas = consult;
    }

    public Vector<Consulta> getConsulta() {
        return consultas;
    }

    @Override
    public String getColumnName(int column) {
        return titulos[column];
    }

    public int getRowCount() {
        return consultas.size();
    }

    public int getColumnCount() {
        return titulos.length;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        Paciente pasient = ControlAdministraPaciente.cargarPacient(ControlAdministraConsulta.cargarConsultas().get(rowIndex).getPaciente().getIdPaciente());

        switch (columnIndex) {
            case 0:
                return consultas.get(rowIndex).getNumConsulta();
            case 1:
                return ControlAdministraMedico.cargarMedico(pasient.getMedico().getClave());
            case 2:
                return ControlAdministraPropietario.cargarPropietario(pasient.getPropietario().getCedula());
            case 3:
                return pasient;
            case 4:
                return consultas.get(rowIndex).getFecha();
        }
        return null;
    }
}

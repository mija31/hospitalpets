/*
 * HibernateDAO.java
 *
 * Created on 5 de marzo de 2006, 02:04 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
package hospitalpets.control.dao;

import hospitalpets.control.Configuracion;
import java.util.List;
import java.util.Vector;
import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class OperacionDAO {

    Configuracion config = new Configuracion();

    public OperacionDAO() {
    }

    public boolean mt_guardar(Object object) {
        Session session = config.currentSession();
        Transaction tx = session.beginTransaction();
        try {
            if (!tx.isActive()) {
                tx.begin();
            }
            session.save(object);
            tx.commit();
            Configuracion.closeSession();
        } catch (HibernateException he) {
            he.printStackTrace();
            return false;
        }
        return true;
    }

    /**
     * 
     * @param object 
     * @return 
     */
    public boolean mt_eliminar(Object object) {
        try {
            Session session = config.currentSession();
            Transaction tx = session.beginTransaction();
            if (!tx.isActive()) {
                tx.begin();
            }
            session.delete(object);
            tx.commit();
            Configuracion.closeSession();
        } catch (HibernateException he) {
            return false;
        }
        return true;
    }

    /**
     * 
     * @param object 
     * @return 
     */
    public boolean mt_modificar(Object object) {
        try {
            Session session = config.currentSession();
            Transaction tx = session.beginTransaction();
            if (!tx.isActive()) {
                tx.begin();
            }
            session.update(object);
            tx.commit();
            Configuracion.closeSession();
        } catch (HibernateException he) {
            return false;
        }
        return true;
    }

    public int mt_generarCodigo(String tabla, String id) {
        Session session = config.currentSession();
        Transaction tx = session.beginTransaction();
        int max = 0;
        System.out.println("este primero" + max);
        if (session.createSQLQuery("select max(" + tabla + "." + id + ")as maxWeight from " + tabla + "").addScalar("maxWeight", Hibernate.INTEGER).uniqueResult() == null) {
            max++;
        } else {
            max = (Integer) session.createSQLQuery("select max(" + tabla + "." + id + ")as maxWeight from " + tabla + "").addScalar("maxWeight", Hibernate.INTEGER).uniqueResult() + 1;
        }
        System.out.println(tabla + "este es max" + max);
        Configuracion.closeSession();
        return max;
    }

    public Vector cargar(Object object, String tabla) {
        Vector esp = new Vector();

        List especi;
        Session session = config.currentSession();
        Transaction tx = session.beginTransaction();
        System.err.println("me mori");
        try {
            if (!tx.isActive()) {
                tx.begin();
            }
            especi = session.createSQLQuery("select * from " + tabla + "").addEntity(tabla, object.getClass()).setMaxResults(100).list();
            //System.err.println(especi.get(0));
            tx.commit();
            Configuracion.closeSession();
        } catch (HibernateException he) {
            System.err.println("es fatal");
            return null;
        }
        for (int i = 0; i < especi.size(); i++) {
            esp.add(especi.get(i));
        }
        return esp;
    }

    public Vector cargarPorId(String consul, String consul2, String tabla, int id) {
        Vector esp = new Vector();

        List especi;
        Session session = config.currentSession();
        Transaction tx = session.beginTransaction();
        System.err.println("me mori");
        try {
            if (!tx.isActive()) {
                tx.begin();
            }
            especi = session.createSQLQuery("select " + consul + " from " + tabla + " where " + consul2 + "=" + id).setMaxResults(100).list();

            tx.commit();
            Configuracion.closeSession();
        } catch (HibernateException he) {
            System.err.println("es fatal x id");
            return null;
        }
        for (int i = 0; i < especi.size(); i++) {
            esp.add(especi.get(i));
        }
        return esp;
    }

    public Vector cargarCriterio(Object object, String tabla, String consul, String consul2, int id, String busca) {
        Vector esp = new Vector();
        System.out.println("Tabla: " + tabla + " Consul: " + consul + " Consul2: " + consul2 + " id: " + id + " busca: " + busca);
        List especi = null;
        Session session = config.currentSession();
        Transaction tx = session.beginTransaction();
        System.err.println("me mori");
        try {
            if (!tx.isActive()) {
                tx.begin();
            }
            if (id != 0) {
                especi = session.createSQLQuery("select " + consul + " from " + tabla + " where " + consul2 + "=" + id).addEntity(tabla, object.getClass()).setMaxResults(100).list();
            } else if (id == 0) {
                especi = session.createSQLQuery("select " + consul + " from " + tabla + " where " + consul2 + "='" + busca + "'").addEntity(tabla, object.getClass()).setMaxResults(100).list();
            }

            //System.err.println(especi.get(0));
            tx.commit();
            Configuracion.closeSession();
        } catch (HibernateException he) {
            System.err.println("es fatal");
            return null;
        }
        for (int i = 0; i < especi.size(); i++) {
            esp.add(especi.get(i));
        }
        return esp;
    }

    public Vector cargarCriterios(Object object, String tabla, String consul, String consul2, int id, String busca) {
        Vector esp = new Vector();
        System.out.println("Tabla: " + tabla + " Consul: " + consul + " Consul2: " + consul2 + " id: " + id + " busca: " + busca);
        List especi = null;
        Session session = config.currentSession();
        Transaction tx = session.beginTransaction();
        System.err.println("me mori");
        try {
            if (!tx.isActive()) {
                tx.begin();
            }
            if (id != 0) {
                especi = session.createSQLQuery("select " + consul + " from " + tabla + " where " + consul2 + " = " + id + " " + busca).addEntity(tabla, object.getClass()).setMaxResults(100).list();
            }

            //System.err.println(especi.get(0));
            tx.commit();
            Configuracion.closeSession();
        } catch (HibernateException he) {
            System.err.println("es fatal");
            return null;
        }
        for (int i = 0; i < especi.size(); i++) {
            esp.add(especi.get(i));
        }
        return esp;
    }

    public Object cargarObjeto(Object object, String tabla, String columna, String id) {
        Object esp = new Object();

        Session session = config.currentSession();
        Transaction tx = session.beginTransaction();
        try {
            if (!tx.isActive()) {
                tx.begin();
            }
            esp = session.createSQLQuery("select * from " + tabla + " where " + columna + " = '" + id + "'").addEntity(tabla, object.getClass()).uniqueResult();

            tx.commit();
            Configuracion.closeSession();
        } catch (HibernateException he) {
            System.err.println("es fatal x id");
            return null;
        }
        return esp;
    }
}

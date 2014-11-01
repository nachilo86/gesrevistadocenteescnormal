/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dao.implementacion;

import dao.DocenteDAO;
import hibernate.config.HibernateUtil;
import hibernate.mapping.Docente;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;


/** @author IgnacioSaravia <ILSSoftware2014>  */
public class DocenteDAOImpl implements DocenteDAO {
public void registrarDocente(Docente miDocente)
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(miDocente);
        session.getTransaction().commit();
        session.close();
    }
    
    public List<Docente> consultarTodo() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Criteria criteria= session.createCriteria(Docente.class);
        List <Docente> list = criteria.list();
        session.close();
        return(list);
    }
    
    public Docente consultarDocente(int coddocente) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Criteria criteria= session.createCriteria(Docente.class);
        criteria.add(Restrictions.eq("coddocente",coddocente));
        
        Docente miDocente=(Docente) criteria.list().get(0);
        session.close();
        return(miDocente);
    }

    public void modificarDocente(Docente miDocente){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(miDocente);
        session.getTransaction().commit();
        session.close();
    }
    
    public void eliminarDocente(Docente miDocente) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(miDocente);
        session.getTransaction().commit();
        session.close();
    }
    

}

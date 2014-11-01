/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dao.implementacion;

import dao.MateriaDAO;
import hibernate.config.HibernateUtil;
import hibernate.mapping.Materia;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/** @author IgnacioSaravia <ILSSoftware2014>  */
public class MateriaDAOImpl implements MateriaDAO{
    
    public void registrarMateria(Materia materia)
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(materia);
        session.getTransaction().commit();
        session.close();
    }
    
    public List<Materia> consultarTodo() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Criteria criteria= session.createCriteria(Materia.class);
        List <Materia> list = criteria.list();
        session.close();
        return(list);
    }
    
    public Materia consultarMateria(int codmateria) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Criteria criteria= session.createCriteria(Materia.class);
        criteria.add(Restrictions.eq("codmateria",codmateria));
        
        Materia miMateria=(Materia) criteria.list().get(0);
        session.close();
        return(miMateria);
    }

    public void modificarMateria(Materia miMateria){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(miMateria);
        session.getTransaction().commit();
        session.close();
    }
    
    public void eliminarMateria(Materia miMateria) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(miMateria);
        session.getTransaction().commit();
        session.close();
    }

}

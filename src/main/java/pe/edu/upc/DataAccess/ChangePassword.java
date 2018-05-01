/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upc.DataAccess;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import pe.edu.upc.entities.Usuarios;

/**
 *
 * @author Andre Puente
 */
public class ChangePassword implements IChangePassword{

    @Override
    public Usuarios GetUsuario(String correo) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Usuarios.class);
        criteria.add(Restrictions.eq("correoElectronico", correo));
        Usuarios usuario = (Usuarios) criteria.uniqueResult();
        session.close();
        return usuario;
    }

    @Override
    public Usuarios GetPassword(String password) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Usuarios.class);
        criteria.add(Restrictions.eq("password", password));
        Usuarios usuario = (Usuarios) criteria.uniqueResult();
          session.close();
        return usuario;
    }
    
}

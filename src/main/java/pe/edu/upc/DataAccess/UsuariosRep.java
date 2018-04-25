/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upc.DataAccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import pe.edu.upc.entities.Usuarios;

public class UsuariosRep implements IUsuariosRep {

    @Override
    public void InsertUsuario(Usuarios usuario) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(usuario);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public Usuarios GetUsuarioById(int usuarioId) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            Usuarios usuario = (Usuarios) session.get(Usuarios.class, usuarioId);
              session.close();
            return usuario;
        } catch (Exception e) {
              session.close();
            return null;
        }

    }

    @Override
    public boolean UsuarioExists(String correo) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Usuarios.class);
        criteria.add(Restrictions.eq("correoElectronico", correo));
        Usuarios usuarios = (Usuarios) criteria.uniqueResult();
          session.close();
        return usuarios != null;
    }

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
    public String UpdateUSer(Usuarios objUser) {
       String errorMessage=""; 
    try
        {
            
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(objUser);
        session.getTransaction().commit();
        session.close();
        }
    catch (Exception e)
        {
          System.err.println("Got an exception!");
          System.err.println(e.getMessage());
          errorMessage=e.getMessage();
          
        }
    return errorMessage;
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

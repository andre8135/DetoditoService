/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upc.DataAccess;

import org.hibernate.Session;
import pe.edu.upc.entities.Proveedores;

public class ProveedoresRep implements IProveedoresRep {

    @Override
    public void InsertProveedor(Proveedores proveedor) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(proveedor);
        session.getTransaction().commit();
        session.close();
    }

}

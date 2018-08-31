/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import Modelo.Usuario;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
/**
 *
 * @author jorge
 */
public class Operaciones {
    
    public void altaUsuario(Usuario user){
        
        SessionFactory Misesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = Misesion.openSession();
        Transaction tx= session.beginTransaction();
        session.save(user);
        tx.commit();;
        session.close();
        JOptionPane.showMessageDialog(null, "El formulario fue guardado correctamente");
        
    }
    public void bajaUsuario(Usuario user){
        
        SessionFactory Misesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = Misesion.openSession();
        Transaction tx= session.beginTransaction();
        session.delete(user);
        tx.commit();;
        session.close();
        JOptionPane.showMessageDialog(null, "El Campo fue eliminado correctamente");
        
     }
     
}
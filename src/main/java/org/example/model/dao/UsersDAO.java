package org.example.model.dao;

import org.example.model.connection.HibernateSession;
import org.example.model.entites.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class UsersDAO {
    private SessionFactory sessionFactory;

    public UsersDAO() {
        sessionFactory = HibernateSession.getInstance().getSessionFactory();
    }

    public List<User> getAll() {
        return (List<User>) sessionFactory.openSession().createQuery("FROM User u ORDER BY u.id").list();
    }

    public User getById(int id) {
        return sessionFactory.openSession().get(User.class, id);
    }

    public void addNew(User user){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(user);

        transaction.commit();
        session.close();
    }

    public void updateById(User user){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.update(user);

        transaction.commit();
        session.close();
    }

    public void deleteById(User user){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.delete(user);

        transaction.commit();
        session.close();
    }


}

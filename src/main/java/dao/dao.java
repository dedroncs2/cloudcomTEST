package dao;
import models.table;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateSessionFactoryUtil;

import javax.management.Query;
import java.util.List;

public class dao {
    public table findByssoid(String id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(table.class, id);
    }

    public List<table> findAllActive() {
        List<table> users = (List<table>)  HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("from table where subtype!='send'").list();
        return users;
    }

    public void save(table table) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(table);
        tx1.commit();
        session.close();
    }

    public void update(table table) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(table);
        tx1.commit();
        session.close();
    }

    public void delete(table table) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(table);
        tx1.commit();
        session.close();
    }

    public List<table> findAll() {
        List<table> users = (List<table>)  HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("From table").list();
        return users;
    }
}

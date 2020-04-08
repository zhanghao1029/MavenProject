package com.zh.dao;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.zh.entity.User;

@Repository
public class UserDao
{
    @Autowired
    private SessionFactory sessionFactory;

    public void save(User user)
    {
        Session session = sessionFactory.openSession();
        sessionFactory.getCurrentSession().save(user);
        session.close();
    }

    public User find(int id)
    {
        Session session = sessionFactory.openSession();
        SQLQuery query = session.createSQLQuery("select * from t_user where id =" + id).addEntity(User.class);
        @SuppressWarnings("unchecked")
        List<User> uuList = query.list();
        User user = new User();
        for (int i = 0; i < uuList.size(); i++)
        {
            user = uuList.get(i);
        }
        return user;
    }

    public void del(int id)
    {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        User user = find(id);
        session.delete(user);
        tx.commit();
        session.close();
    }

    public User update(User user)
    {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.update(user);
        tx.commit();
        session.close();
        return user;
    }

    public List<User> getAll()
    {
        Session session = sessionFactory.openSession();
        SQLQuery query = session.createSQLQuery("select * from t_user").addEntity(User.class);
        @SuppressWarnings("unchecked")
        List<User> uuList = query.list();
        return uuList;
    }
}

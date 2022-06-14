package com.tpe.repository;

import com.tpe.domain.Question;
import com.tpe.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class QuestionRepository {

    public void saveQuestion(Question question) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        session.save(question);

        tx.commit();
        session.close();
    }


    public Question findQuestionById(Integer id) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        Question foundQuestion = session.get(Question.class, id);

        tx.commit();
        session.close();

        return foundQuestion;

    }

    public void removeQuestion(Question question) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        session.remove(question);

        tx.commit();
        session.close();
    }


    public void updateQuestion(Question question) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        session.update(question);

        tx.commit();
        session.close();
    }

}

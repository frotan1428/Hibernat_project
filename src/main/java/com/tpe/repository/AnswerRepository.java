package com.tpe.repository;

import com.tpe.domain.Answer;
import com.tpe.domain.Question;
import com.tpe.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class AnswerRepository {

        public void saveAnswer(Answer answer) {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            Session session = sessionFactory.openSession();
            Transaction tx = session.beginTransaction();

            session.save(answer);

            tx.commit();
            session.close();
        }


        public Answer findAnswerById(Integer id) {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            Session session = sessionFactory.openSession();
            Transaction tx = session.beginTransaction();

            Answer foundAnswer = session.get(Answer.class, id);

            tx.commit();
            session.close();

            return foundAnswer;

        }

        public void removeAnswer (Answer answer) {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            Session session = sessionFactory.openSession();
            Transaction tx = session.beginTransaction();

            session.remove(answer);

            tx.commit();
            session.close();
        }


        public void updateAnswer(Answer answer) {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            Session session = sessionFactory.openSession();
            Transaction tx = session.beginTransaction();

            session.update(answer);

            tx.commit();
            session.close();
        }

    }


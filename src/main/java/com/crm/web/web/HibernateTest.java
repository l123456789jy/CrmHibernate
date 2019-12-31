package com.crm.web.web;

import com.crm.web.web.doman.CstCustomerEntity;
import com.crm.web.web.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class HibernateTest {

    public static void main(String[] args) {
        String hql = "FROM CstCustomerEntity";
        Session session = HibernateUtil.openSession();
        Transaction transaction = session.beginTransaction();
        Query query = session.createQuery(hql);
        List<CstCustomerEntity> results = query.list();
        for (CstCustomerEntity result : results) {
            System.out.println(result.getCustName());
        }
        transaction.commit();
        session.close();
    }

}

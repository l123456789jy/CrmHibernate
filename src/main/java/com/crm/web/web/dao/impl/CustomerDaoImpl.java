package com.crm.web.web.dao.impl;

import com.crm.web.web.dao.CustomerDao;
import com.crm.web.web.doman.CstCustomerEntity;
import com.crm.web.web.util.HibernateUtil;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Projections;

import java.util.List;

public class CustomerDaoImpl implements CustomerDao {

	@Override
	public void insert(CstCustomerEntity customer) {
		Session session = HibernateUtil.openSession();
		try {
			//开启事务
			session.beginTransaction();
			//保存
			session.save(customer);
			//提交事务
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			//回滚事务
			session.getTransaction().rollback();
		}finally{
			session.close();
		}
	}
	
//	@Override
//	public void insert(CstCustomer cstCustomer) {
//		Session session = HibernateUtil.getCurrentSession();
//		// 保存
//		session.save(cstCustomer);
//	}

	@Override
	public void delete(Long custId) {
		Session session = HibernateUtil.getCurrentSession();
		CstCustomerEntity cstCustomer = new CstCustomerEntity();
		cstCustomer.setCustId(custId);
		session.delete(cstCustomer);
		
	}

	@Override
	public void update(CstCustomerEntity cstCustomer) {
		Session session = HibernateUtil.getCurrentSession();
		session.update(cstCustomer);
		
	}

	@Override
	public CstCustomerEntity findCustomerById(Long custId) {
		Session session = HibernateUtil.openSession();
		return session.get(CstCustomerEntity.class, custId);
	}

	@Override
	public List<CstCustomerEntity> findCustomerList(CstCustomerEntity cstCustomer, int firstResult, int maxResults) {
		Session session = HibernateUtil.openSession();
		Criteria criteria = session.createCriteria(CstCustomerEntity.class);
		criteria.setFirstResult(firstResult);
		criteria.setMaxResults(maxResults);
		List list = criteria.list();
		return list;
	}

	@Override
	public Long findCustomerCount(CstCustomerEntity cstCustomer) {
		Session session = HibernateUtil.openSession();
		Criteria criteria = session.createCriteria(CstCustomerEntity.class);
		criteria.setProjection(Projections.rowCount());
		//查询总数
		Long total = (Long) criteria.uniqueResult();
		return total;
	}
	@Override
	public Long findCustomerCount(DetachedCriteria detachedCriteria){
		Session session = HibernateUtil.openSession();
		//离线criteria与session绑定生成可执行criteria
		Criteria criteria = detachedCriteria.getExecutableCriteria(session);
		criteria.setProjection(Projections.rowCount());
		//查询总数
		Long total = (Long) criteria.uniqueResult();
		return total;
	}
	@Override
	public List<CstCustomerEntity> findCustomerList(DetachedCriteria detachedCriteria, int firstResult, int maxResults){
		Session session = HibernateUtil.openSession();
		//离线criteria与session绑定生成可执行criteria
		Criteria criteria = detachedCriteria.getExecutableCriteria(session);
		criteria.setFirstResult(firstResult);
		criteria.setMaxResults(maxResults);
		List list = criteria.list();
		return list;
	}


}

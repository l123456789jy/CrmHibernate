package com.crm.web.web.dao.impl;


import com.crm.web.web.dao.SaleVisitDao;
import com.crm.web.web.doman.SaleVisitEntity;
import com.crm.web.web.util.HibernateUtil;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Projections;

import java.util.List;

public class SaleVisitDaoImpl implements SaleVisitDao {

	@Override
	public void insertSaleVisit(SaleVisitEntity saleVisit) {
		Session session = HibernateUtil.getCurrentSession();
		session.save(saleVisit);
		
	}

	@Override
	public long findSaleVisitCount(DetachedCriteria detachedCriteria) {
		Session session = HibernateUtil.openSession();
		//离线criteria与session绑定生成可执行criteria
		Criteria criteria = detachedCriteria.getExecutableCriteria(session);
		criteria.setProjection(Projections.rowCount());
		//查询总数
		Long total = (Long) criteria.uniqueResult();
		//关闭session
		session.close();
		return total;
	}

	@Override
	public List<SaleVisitEntity> findSaleVisitList(DetachedCriteria detachedCriteria, int firstResult, int maxResults) {
		Session session = HibernateUtil.openSession();
		//离线criteria与session绑定生成可执行criteria
		Criteria criteria = detachedCriteria.getExecutableCriteria(session);
		criteria.setFirstResult(firstResult);
		criteria.setMaxResults(maxResults);
		List<SaleVisitEntity> list = criteria.list();
//		for(SaleVisit saleVisit:list){
//			//通过对象导航加载属性
//			saleVisit.getSysUser().getUserName();
//		}
		//关闭session
		session.close();
		return list;
	}
	
	

}

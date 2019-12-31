package com.crm.web.web.dao.impl;


import com.crm.web.web.dao.CustomerDetailDao;
import com.crm.web.web.doman.CstCustomerDetailEntity;
import com.crm.web.web.util.HibernateUtil;
import org.hibernate.Session;

public class CustomerDetailDaoImpl implements CustomerDetailDao {

	@Override
	public void insert(CstCustomerDetailEntity cstCustomerDetail) {
		Session session = HibernateUtil.getCurrentSession();
		// 保存
		session.save(cstCustomerDetail);
	}
	// 删除客户详细信息
	@Override
	public void delete(Long custId){
		Session session = HibernateUtil.getCurrentSession();
		CstCustomerDetailEntity cstCustomerDetail = new CstCustomerDetailEntity();
		cstCustomerDetail.setCustId(custId);
		session.delete(cstCustomerDetail);
	}

	// 更新客户详细信息
	@Override
	public void update(CstCustomerDetailEntity cstCustomerDetail){
		Session session = HibernateUtil.getCurrentSession();
		session.update(cstCustomerDetail);
	}
	//根据主键查询客户详细信息
	@Override
	public CstCustomerDetailEntity findCustomerDetailById(Long custId){
		Session session = HibernateUtil.openSession();
		return session.get(CstCustomerDetailEntity.class, custId);
	}
	

}

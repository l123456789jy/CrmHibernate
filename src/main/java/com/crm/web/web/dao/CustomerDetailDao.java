package com.crm.web.web.dao;


import com.crm.web.web.doman.CstCustomerDetailEntity;

public interface CustomerDetailDao {

	// 添加客户详细信息
	public void insert(CstCustomerDetailEntity customerDetail);
	// 删除客户
	public void delete(Long custId);

	// 更新客户
	public void update(CstCustomerDetailEntity cstCustomerDetail);
	//查询客户详细信息
	public CstCustomerDetailEntity findCustomerDetailById(Long custId);

	
}

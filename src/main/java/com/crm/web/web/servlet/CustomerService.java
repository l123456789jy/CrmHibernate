package com.crm.web.web.servlet;

import com.crm.web.web.doman.CstCustomerDetailEntity;
import com.crm.web.web.doman.CstCustomerEntity;

import java.util.List;

public interface CustomerService {

	// 添加客户
	public void insertCustomer(CstCustomerEntity cstCustomer);

	// 添加客户同时添加客户详细信息
	public void insertCustomer(CstCustomerEntity cstCustomer, CstCustomerDetailEntity cstCustomerDetail) ;

	/**
	 *
	 * <p>Title: updateCustomer</p>
	 * <p>Description:更新客户 </p>
	 * @param custId 客户id
	 * @param cstCustomer 客户基本信息
	 * @param cstCustomerDetail 客户详细信息
	 */
	public void updateCustomer(Long custId, CstCustomerEntity cstCustomer, CstCustomerDetailEntity cstCustomerDetail);
	
	/**
	 * 
	 * <p>Title: deleteCustomer</p>
	 * <p>Description:删除客户 </p>
	 * @param custId 客户id
	 */
	public void deleteCustomer(Long custId);
	
	//根据主键查询客户
	public CstCustomerEntity findCustomerById(Long custId);
	
	//根据主键查询客户详细信息
	public CstCustomerDetailEntity findCstCustomerDetailById(Long custId);
	
	// 查询客户列表总记录数
	public long findCustomerCount(CstCustomerEntity cstCustomer);

	// 查询客户列表
	public List<CstCustomerEntity> findCustomerList(CstCustomerEntity cstCustomer, int firstResult, int maxResults);
}

package com.crm.web.web.dao;


import com.crm.web.web.doman.CstCustomerEntity;
import org.hibernate.criterion.DetachedCriteria;

import java.util.List;

public interface CustomerDao {

	// 添加客户
	public void insert(CstCustomerEntity customer);

	// 删除客户
	public void delete(Long custId);

	// 更新客户
	public void update(CstCustomerEntity customer);

	// 根据id查找客户
	public CstCustomerEntity findCustomerById(Long custId);

	// 自定义条件查询客户列表
	public List<CstCustomerEntity> findCustomerList(CstCustomerEntity customer, int firstResult, int maxResults);
	public List<CstCustomerEntity> findCustomerList(DetachedCriteria detachedCriteria, int firstResult, int maxResults);

	// 自定义查询客户列表总记录数
	public Long findCustomerCount(CstCustomerEntity cstCustomer);
	public Long findCustomerCount(DetachedCriteria detachedCriteria);
}

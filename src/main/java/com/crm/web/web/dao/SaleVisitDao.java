package com.crm.web.web.dao;

import com.crm.web.web.doman.SaleVisitEntity;
import org.hibernate.criterion.DetachedCriteria;

import java.util.List;

/**

 */
public interface SaleVisitDao {

	// 添加客户拜访
	public void insertSaleVisit(SaleVisitEntity saleVisit);

	// 客户拜访列表总数
	public long findSaleVisitCount(DetachedCriteria detachedCriteria);
	// 客户拜访列表
	public List<SaleVisitEntity> findSaleVisitList(DetachedCriteria detachedCriteria, int firstResult, int maxResults);

}

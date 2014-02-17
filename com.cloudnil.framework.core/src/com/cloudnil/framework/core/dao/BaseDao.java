package com.cloudnil.framework.core.dao;

import java.util.List;

import com.cloudnil.framework.model.PO;
/**
 * <p>ClassName: BaseDao</p>
 * <p>Description: Core Bundle Dao层基础接口类</p>
 * @author 史绍虎
 * <p>Date: 2012-5-16 下午7:43:08</p>
 */
@SuppressWarnings("rawtypes")
public interface BaseDao {
	public void save(PO po);
	public PO get(Class entityClass,String id);
	public List<PO> findList();
}

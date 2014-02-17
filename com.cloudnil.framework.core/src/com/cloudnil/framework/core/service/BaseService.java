package com.cloudnil.framework.core.service;

import java.util.List;

import com.cloudnil.framework.model.PO;
/**
 * <p>ClassName: BaseService</p>
 * <p>Description: Core Bundle Service层基础实现类</p>
 * @author 史绍虎
 * <p>Date: 2012-5-16 下午7:44:06</p>
 */
@SuppressWarnings("rawtypes")
public interface BaseService {
	public void save(PO po);
	public PO get(Class entityClass,String id);
	public List<PO> findList();
}

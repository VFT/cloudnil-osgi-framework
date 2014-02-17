package com.cloudnil.framework.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cloudnil.framework.core.dao.BaseDao;
import com.cloudnil.framework.core.service.BaseService;
import com.cloudnil.framework.model.PO;
/**
 * <p>ClassName: BaseServiceImpl</p>
 * <p>Description: Core Bundle Service层基础实现类</p>
 * @author 史绍虎
 * <p>Date: 2012-5-16 下午7:43:40</p>
 */
@SuppressWarnings("rawtypes")
@Service("baseService")
@Transactional
public class BaseServiceImpl implements BaseService {
	@Autowired
	private BaseDao dao;

	public void save(PO po) {
		dao.save(po);
	}

	public PO get(Class entityClass, String id) {
		return dao.get(entityClass, id);
	}

	public List<PO> findList() {
		return dao.findList();
	}

}

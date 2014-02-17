package com.cloudnil.framework.core.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.cloudnil.framework.core.dao.BaseDao;
import com.cloudnil.framework.model.PO;
/**
 * <p>ClassName: BaseDaoImpl</p>
 * <p>Description: Core Bundle Dao层基础实现类</p>
 * @author 史绍虎
 * <p>Date: 2012-5-16 下午7:42:25</p>
 */
@SuppressWarnings({"rawtypes","unchecked"})
@Repository("baseDao")
public class BaseDaoImpl extends HibernateDaoSupport implements BaseDao {
	@Autowired
	public void init(SessionFactory sessionFactory){
		super.setSessionFactory(sessionFactory);
	}
	public void save(PO po) {
		getHibernateTemplate().save(po);
	}
	public PO get(Class entityClass,String id) {
		return getHibernateTemplate().get(entityClass, id);
	}
	
	public List<PO> findList(){
		return getHibernateTemplate().find("from Contact");
	}

}

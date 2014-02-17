package com.cloudnil.app.contact.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cloudnil.app.contact.service.ContactService;
import com.cloudnil.framework.core.dao.BaseDao;
import com.cloudnil.framework.core.service.BaseService;
import com.cloudnil.framework.model.Contact;
@Service("contactService")
public class ContactServiceImpl implements ContactService {
	@Autowired
	private BaseService baseService;
	@Autowired
	private BaseDao baseDao;
	
	public void saveContact(Contact contact){
		baseDao.save(contact);
	}
	
	public Contact getContact(String id){
		return (Contact)baseService.get(Contact.class, id);
	}
}

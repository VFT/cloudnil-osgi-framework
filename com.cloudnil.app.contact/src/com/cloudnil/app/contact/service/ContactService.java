package com.cloudnil.app.contact.service;

import com.cloudnil.framework.model.Contact;

public interface ContactService {
	public void saveContact(Contact contact);
	
	public Contact getContact(String id);
}

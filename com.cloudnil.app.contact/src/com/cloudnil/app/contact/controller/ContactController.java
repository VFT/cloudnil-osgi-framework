package com.cloudnil.app.contact.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cloudnil.app.contact.service.ContactService;
import com.cloudnil.framework.model.Contact;

@Controller
@RequestMapping(value="contact")
//@SessionAttributes("custom")
public class ContactController {
	@Autowired
	private ContactService service;
	
	@RequestMapping(value="addContact.do")
	public String addContact(Model model){
		model.addAttribute(new Contact());
		return "contactEdit";
	}
	@RequestMapping(value="saveContact.do")
	public String saveContact(Contact contact,BindingResult result,Model model){
		contact.setName("XXXX");
		contact.setAge((short)26);
		contact.setComment("Hello！");
		contact.setTel("010-27364237");
		service.saveContact(contact);
		model.addAttribute(contact);
		return "contactList";
	}
	@RequestMapping(value="getContact.do")
	public String getContact(Model model){
		String id="40288059443dd5f401443dd6ec210003";
		Contact c=service.getContact(id);
		model.addAttribute(c);
		return "contactList";
	}
	
}

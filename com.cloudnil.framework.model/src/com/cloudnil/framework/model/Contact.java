package com.cloudnil.framework.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
/**
 * <p>ClassName: Contact</p>
 * <p>Description: Contact实体类</p>
 * @author 史绍虎
 * <p>Date: 2012-4-17 下午3:40:34</p>
 */
@Entity
@Table(name = "CONTACT")
public class Contact extends PO{
	
	private static final long serialVersionUID = -6349201305666395480L;
	@Column(name="AGE")
	private short age;
	@Column(name="COMMENT")
	private String comment;
	@Column(name="NAME")
	private String name;
	@Column(name="SEX")
	private short sex;
	@Column(name="TEL")
	private String tel;
	
	public Contact() {
		super();
	}

	public short getAge() {
		return this.age;
	}

	public void setAge(short age) {
		this.age = age;
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public short getSex() {
		return this.sex;
	}

	public void setSex(short sex) {
		this.sex = sex;
	}

	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

}
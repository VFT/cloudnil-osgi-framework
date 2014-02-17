package com.cloudnil.framework.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.GenericGenerator;
/**
 * <p>ClassName: PO</p>
 * <p>Description: PO实体基类，提供32位uuid生成</p>
 * @author 史绍虎
 * <p>Date: 2012-4-17 下午1:40:55</p>
 */
@MappedSuperclass
public class PO implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="ID")
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy ="uuid")
	private String id;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
}

package com.robsonkades.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Author extends BaseEntity {
	
	@Column
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

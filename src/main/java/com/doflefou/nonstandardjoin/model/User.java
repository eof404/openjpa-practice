package com.doflefou.nonstandardjoin.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USER_TBL", schema="TEST")

public class User {

	@Id
	private Long id;
	private String userName;
	
	
	private String status;
	@Column(name = "PERSON_ID")
	private Long personId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Long getPersonId() {
		return personId;
	}

	public void setPersonId(Long personId) {
		this.personId = personId;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", status="
				+ status + ", personId=" + personId + "]";
	}

}

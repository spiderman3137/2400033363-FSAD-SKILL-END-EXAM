package com.klef.fsad.exam;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="accounts")
public class CustomerAccount {
	@Id
	private long id;
	private String name;
	private String status;
	public long getId() {
		return id;
	}
	public CustomerAccount() {
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "CustomerAccount [id=" + id + ", name=" + name + ", status=" + status + "]";
	}
	public CustomerAccount(long id, String name, String status) {
		super();
		this.id = id;
		this.name = name;
		this.status = status;
	}
	
	
}

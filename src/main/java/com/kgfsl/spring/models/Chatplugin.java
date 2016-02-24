package com.kgfsl.spring.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="plugin")
public class Chatplugin {
	
	@Id
	private int id;
	private String name;
	private String version;
	private short installed;
	private short enabled2;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public short getInstalled() {
		return installed;
	}
	public void setInstalled(short installed) {
		this.installed = installed;
	}
	public short getEnabled() {
		return enabled2;
	}
	public void setEnabled(short enabled2) {
		this.enabled2 = enabled2;
	}

}

package com.kgfsl.spring.models;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="doe_weather_cities_data_fauvorite")
public class DataFavorite {

	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	/*@Column(name="city")
	private int cityId;*/	
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="city")
	private Cities city;
	
	@Column(name="type")
	private String type;
	
	@Column(name="db")
	private BigDecimal db;
	
	@Column(name="dp")
	private BigDecimal dp;
	
	@Column(name="wb")
	private BigDecimal wb;
	
	@Column(name="rh")
	private BigDecimal rh;
	
	@Column(name="h")
	private BigDecimal h;
	
	@Column(name="w")
	private BigDecimal w;
	
	@Column(name="userid")
	private int userId;
	
	@Column(name="enteredts")
	private Timestamp createdDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Cities getCityId() {
		return city;
	}

	public void setCityId(Cities city) {
		this.city = city;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public BigDecimal getDb() {
		return db;
	}

	public void setDb(BigDecimal db) {
		this.db = db;
	}

	public BigDecimal getDp() {
		return dp;
	}

	public void setDp(BigDecimal dp) {
		this.dp = dp;
	}

	public BigDecimal getWb() {
		return wb;
	}

	public void setWb(BigDecimal wb) {
		this.wb = wb;
	}

	public BigDecimal getRh() {
		return rh;
	}

	public void setRh(BigDecimal rh) {
		this.rh = rh;
	}

	public BigDecimal getH() {
		return h;
	}

	public void setH(BigDecimal h) {
		this.h = h;
	}

	public BigDecimal getW() {
		return w;
	}

	public void setW(BigDecimal w) {
		this.w = w;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public Timestamp getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	@Override
	public String toString() {
		return "DataFavorite [id=" + id + ", cityId=" + city + ", type=" + type + ", db=" + db + ", dp=" + dp
				+ ", wb=" + wb + ", rh=" + rh + ", h=" + h + ", w=" + w + ", userId=" + userId + ", createdDate="
				+ createdDate + "]";
	}
	
}

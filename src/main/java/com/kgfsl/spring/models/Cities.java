package com.kgfsl.spring.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="doe_weather_cities")
public class Cities {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private Integer country;
	private String city;
	private String station_id;
	private Double Elevation;
	private Double wmono;
	private Integer userid;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getCountry() {
		return country;
	}
	public void setCountry(Integer country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStation_id() {
		return station_id;
	}
	public void setStation_id(String station_id) {
		this.station_id = station_id;
	}
	public Double getElevation() {
		return Elevation;
	}
	public void setElevation(Double elevation) {
		Elevation = elevation;
	}
	public Double getWmono() {
		return wmono;
	}
	public void setWmono(Double wmono) {
		this.wmono = wmono;
	}
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	@Override
	public String toString() {
		return "Cities [id=" + id + ", country=" + country + ", city=" + city + ", station_id=" + station_id
				+ ", Elevation=" + Elevation + ", wmono=" + wmono + ", userid=" + userid + "]";
	}
	
}

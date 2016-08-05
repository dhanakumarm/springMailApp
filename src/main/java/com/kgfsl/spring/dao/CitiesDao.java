package com.kgfsl.spring.dao;

import java.util.List;

import com.kgfsl.spring.models.Cities;

public interface CitiesDao {

	public List<Cities> listCities();
	public void addCities(Cities cities);
	public void updateCities(Cities cities);
	public Cities getCityById(int id);
}

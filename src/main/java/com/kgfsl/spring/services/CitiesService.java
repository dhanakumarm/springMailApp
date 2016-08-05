package com.kgfsl.spring.services;

import java.util.List;

import com.kgfsl.spring.models.Cities;

public interface CitiesService {

	public List<Cities> listCities();
	public void addCities(Cities cities);
	public void updateCities(Cities cities);
	public Cities getCityById(int id);
}

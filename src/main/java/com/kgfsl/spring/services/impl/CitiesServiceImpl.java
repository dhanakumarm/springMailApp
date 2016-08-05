package com.kgfsl.spring.services.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kgfsl.spring.dao.CitiesDao;
import com.kgfsl.spring.dao.impl.CitiesDaoImpl;
import com.kgfsl.spring.models.Cities;
import com.kgfsl.spring.services.CitiesService;

@Service("citiesService")
@Transactional
public class CitiesServiceImpl implements CitiesService {

	@Autowired
	private CitiesDao citiesDao;
	
	@Override
	public List<Cities> listCities() {
		// TODO Auto-generated method stub
		return citiesDao.listCities();
	}

	@Override
	public void addCities(Cities cities) {
		// TODO Auto-generated method stub
		citiesDao.addCities(cities);
		
	}

	@Override
	public void updateCities(Cities cities) {
		// TODO Auto-generated method stub
		citiesDao.updateCities(cities);
		
	}

	@Override
	public Cities getCityById(int id) {
		// TODO Auto-generated method stub
		return citiesDao.getCityById(id);
	}

}

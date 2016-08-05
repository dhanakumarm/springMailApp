package com.kgfsl.spring.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kgfsl.spring.dao.CitiesDao;
import com.kgfsl.spring.models.Cities;
@Repository
public class CitiesDaoImpl implements CitiesDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	private static final Logger logger = LoggerFactory.getLogger(CitiesDaoImpl.class);
	
	@Override
	public List<Cities> listCities() {
		// TODO Auto-generated method stub		
		return sessionFactory.getCurrentSession().createQuery("from Cities").list();
	}

	@Override
	public void addCities(Cities cities) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(cities);
	}

	@Override
	public void updateCities(Cities cities) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(cities);
		logger.info("Cities updated successfully, Cities Details="+cities);
		
	}

	@Override
	public Cities getCityById(int id) {
		Cities team = (Cities) sessionFactory.getCurrentSession().get(Cities.class, id);
		// TODO Auto-generated method stub
		return team;
	}

}

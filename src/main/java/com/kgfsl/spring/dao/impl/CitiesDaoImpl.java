package com.kgfsl.spring.dao.impl;

import java.math.BigDecimal;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kgfsl.spring.dao.CitiesDao;
import com.kgfsl.spring.models.Cities;
import com.kgfsl.spring.models.DataFavorite;
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
		Cities city = new Cities();
		DataFavorite dataFav = new DataFavorite();
		city.setCountry(1);
		city.setCity("1");
		city.setStation_id("2");
		city.setElevation(10.00);
		city.setWmono(20.00);
		city.setUserid(1);
		dataFav.setUserId(1);
		dataFav.setType("DD");
		dataFav.setDb(BigDecimal.valueOf(1));
		dataFav.setCityId(city);
		 
		 Session session = sessionFactory.openSession(); //create the session object
	        session.beginTransaction();//create the transaction from the session object
	        
	        session.save(city); // save the vehicle entity to the database
	        session.save(dataFav); // save the user entity to the database
	        
	        session.getTransaction().commit(); //close the transaction
	        session.close(); //close the session
		 
//		sessionFactory.getCurrentSession().save(city);
//		sessionFactory.getCurrentSession().save(dataFav);
		//DataFavorite dataFav = new DataFavorite(); 
		//sessionFactory.getCurrentSession().save(cities);
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

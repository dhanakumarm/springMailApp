package com.kgfsl.spring.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.kgfsl.spring.dao.DataFavoriteDao;
import com.kgfsl.spring.models.DataFavorite;
@Repository
public class DataFavoriteDaoImpl implements DataFavoriteDao {
	
	private static final Logger logger = LoggerFactory.getLogger(DataFavoriteDaoImpl.class);
	
	@Autowired
	private SessionFactory sessionFactory;
		
	@Override
	public List<DataFavorite> listDataFav() {
		return sessionFactory.getCurrentSession().createQuery("from DataFavorite").list();		
	}

}

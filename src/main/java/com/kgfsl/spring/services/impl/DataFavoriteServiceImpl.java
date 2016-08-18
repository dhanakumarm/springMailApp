package com.kgfsl.spring.services.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kgfsl.spring.dao.DataFavoriteDao;
import com.kgfsl.spring.models.DataFavorite;
import com.kgfsl.spring.services.DataFavoriteService;

@Service("dataFavoriteService")
@Transactional
public class DataFavoriteServiceImpl implements DataFavoriteService {

	@Autowired
	private DataFavoriteDao dataFavDao;
	
	@Override
	public List<DataFavorite> listDataFavorite() {
		// TODO Auto-generated method stub
		return dataFavDao.listDataFav();
	}

}

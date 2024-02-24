package com.springlec.base.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springlec.base.dao.Movies_Dao;
import com.springlec.base.model.Movies_Dto;

@Service
public class Movies_Dao_ServiceImpl implements Movies_Dao_Service {
	
	@Autowired
	Movies_Dao dao;

	@Override
	public List<Movies_Dto> moviesList() throws Exception {
		return dao.moviesList();
	}

}

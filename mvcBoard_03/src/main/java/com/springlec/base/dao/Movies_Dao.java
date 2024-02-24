package com.springlec.base.dao;

import java.util.List;

import com.springlec.base.model.Movies_Dto;

public interface Movies_Dao {
	
	public List<Movies_Dto> moviesList() throws Exception;

}

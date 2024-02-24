package com.springlec.base.service;

import java.util.List;

import com.springlec.base.model.Board_Dto;

public interface Board_DaoService {
	
	// writeForm에서 입력을 누르면 DB에 insert되는 method
	public void insertDao(String bName, String bContent) throws Exception;
	
	// list에서 table을 보여주기 위해 DB에서 select하는 method
	public List<Board_Dto> listDao() throws Exception;
	
	// list에서 X키를 누르면 해당하는 row값을 DB에서 delete하는 method
	public void deleteDao(int bId) throws Exception;

}

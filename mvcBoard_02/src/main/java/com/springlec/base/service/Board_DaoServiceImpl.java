package com.springlec.base.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springlec.base.dao.Board_Dao;
import com.springlec.base.model.Board_Dto;

@Service
public class Board_DaoServiceImpl implements Board_DaoService {
	
	// Board_Dao와 연결
	@Autowired
	Board_Dao dao;

	// Board_Dao의 insertDao method를 bName과 bContent를 전송하고 실행
	@Override
	public void insertDao(String bName, String bContent) throws Exception {
		dao.insertDao(bName, bContent);
	}

	// Board_Dao의 listDao method를 return함
	@Override
	public List<Board_Dto> listDao() throws Exception {
		return dao.listDao();
	}

	// Board_Dao의 deleteDao method를 bId를 전송하고 실행
	@Override
	public void deleteDao(int bId) throws Exception {
		dao.deleteDao(bId);
	}

}

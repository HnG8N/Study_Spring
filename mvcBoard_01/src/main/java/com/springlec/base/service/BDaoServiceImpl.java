package com.springlec.base.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springlec.base.dao.BDao;
import com.springlec.base.model.BDto;

// 실질적으로 DB를 부름 (Controller가 이 class를 부름)
@Service
public class BDaoServiceImpl implements BDaoService{

	@Autowired
	BDao dao;
	
	@Override
	public List<BDto> listDao() throws Exception {
		return dao.listDao();
	}

	@Override
	public void writeDao(String bName, String bTitle, String bContent) throws Exception {
		dao.writeDao(bName, bTitle, bContent);
		System.out.println("INSERT 완료");
	}

	@Override
	public BDto contentDao(int bId) throws Exception {
		return dao.contentDao(bId);
	}

	@Override
	public void updateDao(int bId, String bName, String bTitle, String bContent) throws Exception {
		dao.updateDao(bId, bName, bTitle, bContent);
		System.out.println("UPDATE 완료");
	}

	@Override
	public void deleteDao(int bId) throws Exception {
		dao.deleteDao(bId);
		System.out.println("DELETE 완료");
	}
	
}

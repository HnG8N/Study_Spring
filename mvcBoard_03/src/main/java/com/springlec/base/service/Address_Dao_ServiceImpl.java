package com.springlec.base.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springlec.base.dao.Address_Dao;
import com.springlec.base.model.Address_Dto;

// 서비스라고 선언
@Service
public class Address_Dao_ServiceImpl implements Address_Dao_Service {
	
	// Address_Dao와 연결
	@Autowired
	Address_Dao dao;

	// addressListDao라는 method를 실행 후 값을 controller에 return
	@Override
	public List<Address_Dto> addressListDao() throws Exception {
		return dao.addressListDao();
	}

	// parameter를 받아서 addressInsertDao라는 method를 실행
	@Override
	public void addressInsertDao(String name, String telno, String address, String email, String relation)
			throws Exception {
		dao.addressInsertDao(name, telno, address, email, relation);
	}

	// seqno를 받아서 addressViewDao라는 method를 실행 후 값을 controller에 return
	@Override
	public Address_Dto addressViewDao(int seqno) throws Exception {
		return dao.addressViewDao(seqno);
	}

	// parameter를 받아서 addressViewUpdateDao라는 method를 실행
	@Override
	public void addressViewUpdateDao(int seqno, String name, String telno, String address, String email,
			String relation) throws Exception {
		dao.addressViewUpdateDao(seqno, name, telno, address, email, relation);
	}

	// seqno를 받아서 addressViewDeleteDao라는 method를 실행
	@Override
	public void addressViewDeleteDao(int seqno) throws Exception {
		dao.addressViewDeleteDao(seqno);
	}

	@Override
	public List<Address_Dto> listQuery(String query, String content) throws Exception {
		// query문에서 like를 쓰기 위해 content에 %를 붙여줌
		content = '%' + content + '%';
		return dao.listQuery(query, content);
	}

}

package com.springlec.base.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springlec.base.dao.TDao;

@Service
// Transaction을 해주기 위한 명령어 (class 내에서 에러가 걸리면 롤백함)
@Transactional(rollbackFor = Exception.class)
public class TDaoServiceImpl implements TDaoService {

	@Autowired
	TDao dao;
	
	@Override
	public void writeDaoTask(String id, String product) throws Exception {
		// 현재 Dao 두개가 한 Task임, 둘 중 하나라도 error가 발생하면 원위치 시켜야 함
		// 이 때 필요한게 transaction
		dao.writeDao(id, product);
		dao.writeDao2(id);
	}

//	@Override
//	public void writeDao2(String id) throws Exception {
//		dao.writeDao2(id);
//	}

}

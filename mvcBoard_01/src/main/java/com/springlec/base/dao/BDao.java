package com.springlec.base.dao;

import java.util.List;

import com.springlec.base.model.BDto;

public interface BDao {
	// Spring에서는 ArrayList 대신 List를 많이 씀(퍼포먼스가 더 좋음)
	// 이름(listDao) 중요!
	// DB에서 select해서 화면에 띄워주는 method
	public List<BDto> listDao() throws Exception;
	
	// DB에 insert하는 method
	public void writeDao(String bName, String bTitle, String bContent) throws Exception;
	
	//DB에서 클릭된 id값을 where문으로 찾아 화면에 띄워주는 method
	public BDto contentDao(int bId) throws Exception;
	
	//content_view에서 수정을 눌렀을 때 바뀐 값들을 update하는 method
	public void updateDao(int bId, String bName, String bTitle, String bContent) throws Exception;

	//content_view에서 삭제를 눌렀을 때 delete하는 method
	public void deleteDao(int bId) throws Exception;
}

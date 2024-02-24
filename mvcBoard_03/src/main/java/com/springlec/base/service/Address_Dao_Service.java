package com.springlec.base.service;

import java.util.List;

import com.springlec.base.model.Address_Dto;

public interface Address_Dao_Service {
	
	// DB에서 address data를 가져와서 addresslist.jsp에 보여주기 위한 method
	public List<Address_Dto> addressListDao() throws Exception;
	
	// addresswrite.jsp에서 form에 정보를 입력하고 입력버튼을 눌렀을 때 DB에 insert하기 위한 method
	public void addressInsertDao(String name, String telno, 
						String address, String email, String relation) throws Exception;
	// DB에서 address data를 조건문(seqno)로 가져와 addressview에 보여주기 위한 method
	public Address_Dto addressViewDao(int seqno) throws Exception;

	// addressview.jsp에서 form에 정보를 입력하고 수정버튼을 눌렀을 때 DB에 updqte하기 위한 method
	public void addressViewUpdateDao(int seqno, String name, 
										String telno, String address, 
										String email, String relation) throws Exception;
	// addressview.jsp에서 삭제버튼을 눌렀을 때 DB에서 delete하기 위한 method
	public void addressViewDeleteDao(int seqno) throws Exception;
	
	public List<Address_Dto> listQuery(String query, String content) throws Exception;

}

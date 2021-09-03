package com.subin.s4.notice;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class NoticeDAO {
	
	@Autowired
	private SqlSession sql;
	private final String NAMESPACE = "com.subin.s4.notice.NoticeDAO.";
	
	public List<NoticeDTO> getList() {
		return sql.selectList(NAMESPACE + "getList");
	}
	
	public int setInsert(NoticeDTO noticeDTO) {
		return sql.insert(NAMESPACE + "setInsert", noticeDTO);
	}
	
	public NoticeDTO getSelect(NoticeDTO noticeDTO) {
		return sql.selectOne(NAMESPACE + "getSelect", noticeDTO);
	}
}

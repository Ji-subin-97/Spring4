package com.subin.s4.notice;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.subin.s4.MyJunit;

public class Test1 extends MyJunit{
	
	@Autowired
	private NoticeDAO noticeDAO;
	
	//@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void getList() {
		List<NoticeDTO> ar = noticeDAO.getList();
		assertNotEquals(0, ar.size());
	}
}

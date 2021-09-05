package com.subin.s4.notice;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;
import java.util.Random;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.subin.s4.MyJunit;
import com.subin.s4.util.Pager;

public class Test1 extends MyJunit{
	
	@Autowired
	private NoticeDAO noticeDAO;
	
	//@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	//@Test
	public void getList(Pager pager) {
		List<NoticeDTO> ar = noticeDAO.getList(pager);
		assertNotEquals(0, ar.size());
	}
	
	@Test
	public void setInsertTest() throws Exception{
		
		Random random = new Random();
		for(int i=0; i<200; i++) {
			
			NoticeDTO noticeDTO = new NoticeDTO();
			
			noticeDTO.setTitle("제목" + i);
			int rate = random.nextInt(400);
			
			noticeDTO.setContents("어드민");
			noticeDTO.setWriter("관리자");
			int result = noticeDAO.setInsert(noticeDTO);
			
			if(i%10==0) {
				Thread.sleep(500);
			}
		}
		
		System.out.println("Finish=====================================");
	}
}

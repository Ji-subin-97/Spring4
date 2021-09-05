package com.subin.s4.notice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.subin.s4.util.Pager;

@Controller
@RequestMapping("/board/notice/*")
public class NoticeController {
	
	@Autowired
	private NoticeService noticeService;
	
	@RequestMapping("noticeList")
	public ModelAndView list(ModelAndView mv, Pager pager) {
		List<NoticeDTO> ar = noticeService.getList(pager);
		mv.addObject("pager", pager);
		mv.addObject("list", ar);
		mv.setViewName("board/notice/noticeList");
		
		return mv;
	}
	
	@RequestMapping("noticeInsert")
	public void insert() {}
	
	@RequestMapping(value = "noticeInsert", method = {RequestMethod.POST})
	public String insert(NoticeDTO noticeDTO) {
		int result = noticeService.setInsert(noticeDTO);
		
		return "redirect:./noticeList";
	}
	
	@RequestMapping("noticeSelect")
	public void select(NoticeDTO noticeDTO, Model model) {
		noticeDTO = noticeService.getSelect(noticeDTO);
		model.addAttribute("dtov", noticeDTO);
	}
	
	@RequestMapping("noticeUpdate")
	public void update(NoticeDTO noticeDTO, Model model) {
		noticeDTO = noticeService.getSelect(noticeDTO);
		model.addAttribute("dtov", noticeDTO);
	}
	
	@RequestMapping(value = "noticeUpdate", method = {RequestMethod.POST})
	public String update(NoticeDTO noticeDTO) {
		int result = noticeService.setUpdate(noticeDTO);
		
		return "redirect:./noticeList";
	}
}

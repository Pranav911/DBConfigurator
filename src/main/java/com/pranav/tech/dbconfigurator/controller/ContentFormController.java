package com.pranav.tech.dbconfigurator.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.pranav.tech.dbconfigurator.dao.ContentRepo;
import com.pranav.tech.dbconfigurator.model.Content;

@Controller
public class ContentFormController {

	@Autowired
	ContentRepo repo;
	
	@RequestMapping("/contentHome")
	public String content() {
		return "content";
	}

	@PostMapping("/addContent")
	public ModelAndView addContent(Content content) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("showContent");
		repo.save(content);
		mv.addObject("content", repo.findByData(content.getData()));
		return mv;
	}

	@GetMapping("/getContentById")
	public ModelAndView getContentById(@RequestParam("id") int id) {
		ModelAndView mv = new ModelAndView("showContent");
		Content content = repo.findById(id).orElse(new Content());
		mv.addObject(content);
		return mv;
	}
	@GetMapping("/getContentByData")
	public ModelAndView getContentByData(@RequestParam("data") String data) {
		ModelAndView mv = new ModelAndView("showContent");
		List<Content> content = repo.findByData(data);
		mv.addObject("content", content);
		return mv;
	}
	@GetMapping("/getAllContent")
	@ResponseBody
	public String getAllContent() {
		List<Content> content = (List<Content>) repo.findAll();
		return content.toString();
	}

	@GetMapping("/getContentByCategory")
	@ResponseBody
	public List<Content> getContentByData(@RequestParam("category") int category) {
		return repo.findByCategory(category);
	}
	
	@DeleteMapping("/deleteContentById")
	public String deleteContentById(@RequestParam("id") int id) {
		Content c = repo.getOne(id);
		repo.delete(c);
		return "deleted";
	}
	@DeleteMapping("/deleteContentByData")
	public String deleteContentByData(@RequestParam("data") String data) {
		List<Content> c = repo.findByData(data);
		repo.deleteAll(c);
		return "deleted";
	}	
}

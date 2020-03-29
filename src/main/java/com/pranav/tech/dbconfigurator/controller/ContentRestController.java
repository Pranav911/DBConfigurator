package com.pranav.tech.dbconfigurator.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pranav.tech.dbconfigurator.dao.ContentRepo;
import com.pranav.tech.dbconfigurator.model.Content;

@RestController
public class ContentRestController {
	
	@Autowired
	ContentRepo repo;

	@PostMapping("/content")
	public List<Content> addContent(@RequestBody Content content) {
		repo.save(content);
		return repo.findByData(content.getData());
	}

	@GetMapping("/contentById/{id}")
	public Optional<Content> getContentById(@PathVariable("id") int id) {
		return repo.findById(id);
	}
	@GetMapping("/contentByData/{data}")
	public List<Content> getContentByData(@PathVariable("data") String data) {
		return repo.findByData(data);
	}
	@GetMapping("/content")
	public List<Content> getContent() {
		return repo.findAll();
	}
	@GetMapping("/contentByCategory/{catagory}")
	public List<Content> getContentByData(@PathVariable("catagory") int category) {
		return repo.findByCategory(category);
	}
	
	@DeleteMapping("/contentById/{id}")
	public String deleteContentById(@PathVariable("id") int id) {
		Content c = repo.getOne(id);
		repo.delete(c);
		return "deleted";
	}
	@DeleteMapping("/contentByData/{data}")
	public String deleteContentByData(@PathVariable("data") String data) {
		List<Content> c = repo.findByData(data);
		repo.deleteAll(c);
		return "deleted";
	}

}

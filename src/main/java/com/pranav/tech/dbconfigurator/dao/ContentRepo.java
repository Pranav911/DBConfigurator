package com.pranav.tech.dbconfigurator.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.pranav.tech.dbconfigurator.model.Content;

public interface ContentRepo extends JpaRepository<Content, Integer>{

	List<Content> findByData(String data);
	
	List<Content> findByCategory(int category);

}

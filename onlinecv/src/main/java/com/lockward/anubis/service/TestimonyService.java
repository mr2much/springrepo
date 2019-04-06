package com.lockward.anubis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.lockward.anubis.model.Testimony;
import com.lockward.anubis.repository.TestimonyRepository;

@Service("testimonyService")
@Scope("prototype")
public class TestimonyService {
	@Autowired
	private TestimonyRepository testimonyRepository;
	
	public TestimonyService() {
		
	}
	
	public TestimonyService(TestimonyRepository testimonyRepository) {
		this.testimonyRepository = testimonyRepository;
	}
	
	public List<Testimony> findAll() {
		return testimonyRepository.findAll();
	}
	
	public Testimony findById(Long id) {
		return testimonyRepository.findById(id);
	}

}

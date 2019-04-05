package com.lockward.anubis.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.lockward.anubis.controller.TestimonyStub;
import com.lockward.anubis.model.Testimony;

@Repository
public class TestimonyRepository {
	public List<Testimony> findAll() {
		return TestimonyStub.findAll();
	}
	
	public Testimony findById(Long id) {
		return TestimonyStub.findById(id);
	}
}

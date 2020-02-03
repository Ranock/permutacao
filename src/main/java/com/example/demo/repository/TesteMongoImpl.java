package com.example.demo.repository;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Tester;

@Repository
public class TesteMongoImpl  {
	private final MongoTemplate mongot;

	@Autowired
	public TesteMongoImpl(MongoTemplate mongot) {
		this.mongot = mongot;
	
	}
	
	public List<Tester> retrieve(){
		Query query = new Query();
		query.addCriteria(Criteria.where("texto").in(Arrays.asList("AAAAA2")));
		return mongot.find(query, Tester.class);
	}
	
}

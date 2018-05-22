package com.robsonkades.resolver;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.robsonkades.entity.Author;
import com.robsonkades.service.AuthorService;

@Component
public class AuthorResolver implements GraphQLResolver<Author> {

	@Autowired
	private AuthorService service;
	
	public List<Author> getAuthors() {
		return service.findAll();
	}

}

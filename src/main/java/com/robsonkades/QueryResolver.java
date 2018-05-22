package com.robsonkades;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.robsonkades.bean.PageAuthor;
import com.robsonkades.entity.Author;
import com.robsonkades.entity.Post;
import com.robsonkades.service.AuthorService;

@Component
public class QueryResolver implements GraphQLQueryResolver {
	
	@Autowired
	private AuthorService service;
	
	public List<Author> getAuthors() {
		return service.findAll();
	}
	
	public PageAuthor pageAuthors(int pageSize) {
		return service.findAllAuthors(pageSize);
	}
	
	public List<Post> getPosts() {
		return new ArrayList<>();
	}
}

package com.robsonkades;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.robsonkades.entity.Author;
import com.robsonkades.entity.Post;
import com.robsonkades.service.AuthorService;

@Component
public class MutationResolver implements GraphQLMutationResolver {

	@Autowired
	private AuthorService service;
	
	public Author newAuthor(String name) {
		return service.newAuthor(name);
	}
	
	public Post newPost(String title, String content, String author) {
		newAuthor("Robson Kades");
		Post p = new Post();
		p.setTitle(title);
		p.setContent(content);
		p.setAuthor(newAuthor("Robson Kades"));
		return p;
	}
}

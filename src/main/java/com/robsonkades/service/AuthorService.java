package com.robsonkades.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;

import com.robsonkades.bean.PageAuthor;
import com.robsonkades.entity.Author;
import com.robsonkades.repository.AuthorRepository;

@Component
public class AuthorService {

	@Autowired
	private AuthorRepository repository;

	public Author newAuthor(String name) {
		Author author = new Author();
		author.setName(name);
		return repository.save(author);
	}
	
	public List<Author> findAll() {
		return repository.findAll();
	}
	
	public PageAuthor findAllAuthors(int pageSize) {
		Pageable pageable = paginationSettings(pageSize, 10, Direction.ASC, "id");
		Page<Author> page = repository.findAll(pageable);
		PageAuthor pageAuthor = new PageAuthor();
		pageAuthor.setAuthors(page.getContent());
		pageAuthor.setNumberElements(page.getNumberOfElements());
		pageAuthor.setNumberPages(page.getTotalPages());
		pageAuthor.setPageNumber(page.getNumber());
		pageAuthor.setTotalElements(page.getTotalElements());
		pageAuthor.setSort(Direction.ASC.name());
		return pageAuthor;
	}

	public PageRequest paginationSettings(int offet, int limit, Direction direction, String attribute) {
		return new PageRequest(offet, limit, direction, attribute);
	}
}

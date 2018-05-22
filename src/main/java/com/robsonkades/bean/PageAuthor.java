package com.robsonkades.bean;

import java.util.List;

import com.robsonkades.entity.Author;

public class PageAuthor {

	private List<Author> authors;
	private String sort;
	private int pageNumber;
	private int numberElements;
	private int numberPages;
	private long totalElements;
	
	public PageAuthor() {}
	
	public PageAuthor(List<Author> authors) {
		this.authors = authors;
	}

	public List<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	public int getNumberElements() {
		return numberElements;
	}

	public void setNumberElements(int numberElements) {
		this.numberElements = numberElements;
	}

	public int getNumberPages() {
		return numberPages;
	}

	public void setNumberPages(int numberPages) {
		this.numberPages = numberPages;
	}

	public long getTotalElements() {
		return totalElements;
	}

	public void setTotalElements(long totalElements) {
		this.totalElements = totalElements;
	}
	
	
}

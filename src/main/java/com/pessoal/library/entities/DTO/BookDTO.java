package com.pessoal.library.entities.DTO;

public class BookDTO {

	private Long id;
	private String title;
	private String author;
	private String genre;
	public Boolean available;
	
	public BookDTO() {
	}
	
	public BookDTO(Long id, String title, String author, String genre, Boolean available) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.available = available;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getGenre() {
		return genre;
	}
	
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public Boolean getAvailable() {
		return available;
	}
	
	public void setAvailable(Boolean available) {
		this.available = available;
	}
	
	
}

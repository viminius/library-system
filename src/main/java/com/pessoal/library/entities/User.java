package com.pessoal.library.entities;

import java.util.Objects;

import com.pessoal.library.enums.UserType;

import jakarta.persistence.Id;

public class User {

	@Id
	private Long id;
	private String name;
	private String email;
	private UserType type;
	
	public User() {
	}
	
	public User(Long id, String name, String email, UserType type) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.type = type;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public UserType getType() {
		return type;
	}

	public void setType(UserType type) {
		this.type = type;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(id, other.id);
	}
}

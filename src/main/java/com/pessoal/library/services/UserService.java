package com.pessoal.library.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pessoal.library.entities.User;
import com.pessoal.library.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public List<User> findAll() {
		return userRepository.findAll();
	}

	public User findById(Long id) {
		Optional<User> user = userRepository.findById(id);
		return user.orElseThrow(() -> new RuntimeException("Object not found"));
	}

	public User insert(User obj) {
		return userRepository.save(obj);
	}

	public void delete(Long id) {
		findById(id);
		userRepository.deleteById(id);
	}

	public User update(Long id, User userData) {
		User user = userRepository.findById(id).orElseThrow(() -> new RuntimeException("Object not found"));
		
		user.setName(userData.getName());
        user.setEmail(userData.getEmail());
        user.setType(userData.getType());
        return userRepository.save(user);
	}
}

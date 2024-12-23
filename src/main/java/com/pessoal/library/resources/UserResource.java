package com.pessoal.library.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pessoal.library.entities.User;
import com.pessoal.library.entities.DTO.UserDTO;
import com.pessoal.library.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@Autowired
	private UserService userService;
	
	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		List<User> list = userService.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id) {
		User userRequested = userService.findById(id);
		return ResponseEntity.ok().body(userRequested);
	}
	
	@PostMapping
	public ResponseEntity<UserDTO> insert(@RequestBody UserDTO userDTO) {
		User user = new User();
		user.setName(userDTO.getName());
		user.setEmail(userDTO.getEmail());
		user.setType(userDTO.getType());
		
		User savedUser = userService.insert(user);
		
		UserDTO responseDTO = new UserDTO(
			savedUser.getId(),
			savedUser.getName(),
			savedUser.getEmail(),
			savedUser.getType()
		);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(responseDTO);
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id) {
		userService.delete(id);
		return ResponseEntity.noContent().build();
	}
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<User> update(@RequestBody User userData, @PathVariable Long id){
		User updatedUser = userService.update(id, userData);
		return ResponseEntity.ok(updatedUser);
	}
}

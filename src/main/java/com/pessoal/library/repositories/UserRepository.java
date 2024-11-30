package com.pessoal.library.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pessoal.library.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}

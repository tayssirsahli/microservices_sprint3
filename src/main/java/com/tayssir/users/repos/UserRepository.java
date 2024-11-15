package com.tayssir.users.repos;



import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tayssir.users.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername(String username);
	Optional<User> findByEmail(String email);

}

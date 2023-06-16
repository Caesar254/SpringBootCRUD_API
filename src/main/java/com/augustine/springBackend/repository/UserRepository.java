package com.augustine.springBackend.repository;

import com.augustine.springBackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

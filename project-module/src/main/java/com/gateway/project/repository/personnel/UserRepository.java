package com.gateway.project.repository.personnel;

import com.gateway.project.domain.personnel.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {
    List<User> getByNameOrderByIdAsc(String name);
}

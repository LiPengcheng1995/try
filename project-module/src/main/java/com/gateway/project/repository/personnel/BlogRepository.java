package com.gateway.project.repository.personnel;

import com.gateway.project.domain.personnel.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BlogRepository extends JpaRepository<Blog, Integer> {

    List<Blog> getAllByUser_Name(String userName);
}

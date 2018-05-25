package com.tens.spring.blog.repository;

import com.tens.spring.blog.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Teten Nugraha on 25/05/2018.
 */
public interface UserRepository extends JpaRepository<User, Long> {
}

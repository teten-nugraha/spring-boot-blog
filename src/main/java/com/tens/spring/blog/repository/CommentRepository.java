package com.tens.spring.blog.repository;

import com.tens.spring.blog.model.Comment;
import com.tens.spring.blog.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

/**
 * Created by Teten Nugraha on 25/05/2018.
 */
public interface CommentRepository extends JpaRepository<Comment, Long> {

    Optional<User> findByEmail(@Param("email") String email);

    Optional<User> findByUsername(@Param("username") String username);

}

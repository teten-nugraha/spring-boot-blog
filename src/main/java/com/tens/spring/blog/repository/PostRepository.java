package com.tens.spring.blog.repository;

import com.tens.spring.blog.model.Post;
import com.tens.spring.blog.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Created by Teten Nugraha on 25/05/2018.
 */
public interface PostRepository extends JpaRepository<Post, Long>{

    Page<Post> findByUserOrderByCreateDateDesc(User user, Pageable pageable);

    Page<Post> findAllByOrderByCreateDateDesc(Pageable pageable);

    Optional<Post> findById(Long id);

}

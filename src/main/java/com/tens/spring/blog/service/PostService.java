package com.tens.spring.blog.service;

import com.tens.spring.blog.model.Post;
import com.tens.spring.blog.model.User;
import org.springframework.data.domain.Page;

import java.util.Optional;

/**
 * Created by Teten Nugraha on 25/05/2018.
 */
public interface PostService {

    Optional<Post> findForId(Long id);

    Post save(Post post);

    void delete(Post post);

    /**
     * FInds a {@link Page} of {@link Post} of provided user ordered by date
     */
    Page<Post> findByUserOrderedByDatePageable(User user, int page);

    /**
     * Finds a @{link Page} of all {@link Post} ordered by date
     */
    Page<Post> findAllOrderedByDatePageable(int page);

}

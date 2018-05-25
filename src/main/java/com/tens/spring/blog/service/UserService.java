package com.tens.spring.blog.service;

import com.tens.spring.blog.model.User;

import java.util.Optional;

/**
 * Created by Teten Nugraha on 25/05/2018.
 */
public interface UserService {

    Optional<User> findByUsername(String username);

    Optional<User> findByEmail(String email);

    User save(User user);

}

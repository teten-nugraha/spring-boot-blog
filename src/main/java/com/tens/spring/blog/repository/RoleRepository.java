package com.tens.spring.blog.repository;

import com.tens.spring.blog.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

/**
 * Created by Teten Nugraha on 25/05/2018.
 */
public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByRole(@Param("role") String role);

}

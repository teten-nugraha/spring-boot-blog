package com.tens.spring.blog.repository;

import com.tens.spring.blog.model.Kategori;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Teten Nugraha on 25/05/2018.
 */

public interface KategoriRepository extends JpaRepository<Kategori, Long> {
}

package com.tens.spring.blog.model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Teten Nugraha on 25/05/2018.
 */

@Entity
@Table(name = "kategori")
public class Kategori {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "kategori_id")
    private Long id;

    @Column(name = "name", unique = true, nullable = false)
    @NotEmpty(message = "*Please provide an name")
    private String name;

    @OneToMany(mappedBy = "kategori")
    private Collection<Post> posts;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Collection<Post> getPosts() {
        return posts;
    }

    public void setPosts(Collection<Post> posts) {
        this.posts = posts;
    }
}

package com.mrtn.blog.repositories;


import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mrtn.blog.domain.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, UUID>
{
    @Query("SELECT c FROM category c LEFT JOIN c.posts")
    List<Category> findAllWithPostCount();
}

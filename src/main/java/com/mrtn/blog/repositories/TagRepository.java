package com.mrtn.blog.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mrtn.blog.domain.entities.Tag;

@Repository
public interface TagRepository extends JpaRepository<Tag, UUID>
{
    
}

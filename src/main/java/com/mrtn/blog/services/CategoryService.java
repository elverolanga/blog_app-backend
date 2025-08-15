package com.mrtn.blog.services;

import java.util.List;

import com.mrtn.blog.domain.entities.Category;

@Service
public interface CategoryService {
    List<Category> listCategories();
}

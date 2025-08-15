package com.mrtn.blog.services;

import java.util.List;

import com.mrtn.blog.domain.entities.Category;

public interface CategoryService {
    List<Category> listCategories();
}

package com.mrtn.blog.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mrtn.blog.domain.entities.Category;
import com.mrtn.blog.repositories.CategoryRepository;
import com.mrtn.blog.services.CategoryService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService
{

    private final CategoryRepository categoryRepository;

    @Override
    public List<Category> listCategories() {
        return categoryRepository.findAllWithPostCount();
    }
    
}

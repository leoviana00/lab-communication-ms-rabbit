package io.viana.product_api.modules.category.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.viana.product_api.config.exception.ValidationException;
import io.viana.product_api.modules.category.dto.CategoryRequest;
import io.viana.product_api.modules.category.dto.CategoryResponse;
import io.viana.product_api.modules.category.model.Category;
import io.viana.product_api.modules.category.repository.CategoryRepository;

import static org.springframework.util.ObjectUtils.isEmpty;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;
    
    public CategoryResponse save(CategoryRequest request) {
        validateCategoryNameInformed(request);
        var category = categoryRepository.save(Category.of(request));
        return CategoryResponse.of(category);
    }
        
    private void validateCategoryNameInformed(CategoryRequest request) {
        if (isEmpty(request.getDescription())) {
            throw new ValidationException("The category description was not informed.");
        }
    }
}

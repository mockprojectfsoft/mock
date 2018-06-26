package edu.fa.mock.dao;

import java.util.List;

import edu.fa.mock.model.Category;

public interface CategoryDao {
	
	List<Category> getAllCategory();
	
	void addCategory(Category category);
	
	void deleteCategory(int categoryId);
	
}

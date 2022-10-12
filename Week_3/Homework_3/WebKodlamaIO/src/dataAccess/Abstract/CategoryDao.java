package dataAccess.Abstract;

import entities.Category;

import java.util.List;

public interface CategoryDao {
    List<Category> getAllCategories();
    Category getCategory(int id) throws Exception;
    void addCategory(Category category);
    void updateCategory(Category category);
    void deleteCategory(Category category);
}

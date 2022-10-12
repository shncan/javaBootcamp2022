package dataAccess.Concrete.jdbc;

import dataAccess.Abstract.CategoryDao;
import entities.Category;

import java.util.ArrayList;
import java.util.List;

public class JdbcCategoryDao implements CategoryDao {
    private List<Category> categories=new ArrayList<Category>();

    @Override
    public List<Category> getAllCategories() {
        System.out.println("JDBC ile Getirildi");
        return categories;
    }

    @Override
    public Category getCategory(int id) throws Exception {
        System.out.println("JDBC ile getirildi");
        for (Category category: categories) {
            if (category.getId() == id) {
                return category;
            }
        }
        throw new Exception("GEÇERSİZ DEĞER");
    }

    @Override
    public void addCategory(Category category) {
        System.out.println("JDBC ile kategori veritabanına eklendi.");
        this.categories.add(category);
    }

    @Override
    public void updateCategory(Category category) {
        System.out.println("JDBC ile kategori güncellendi");
    }

    @Override
    public void deleteCategory(Category category) {
        System.out.println("JDBC ile kategori güncellendi");

    }
}

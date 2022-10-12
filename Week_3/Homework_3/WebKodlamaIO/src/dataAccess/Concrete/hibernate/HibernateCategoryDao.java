package dataAccess.Concrete.hibernate;

import dataAccess.Abstract.CategoryDao;
import entities.Category;

import java.util.ArrayList;
import java.util.List;

public class HibernateCategoryDao implements CategoryDao {
    private List<Category> categories=new ArrayList<Category>();

    @Override
    public List<Category> getAllCategories() {
        System.out.println("Hibernate ile Getirildi");
        return categories;
    }

    @Override
    public Category getCategory(int id) throws Exception {
        System.out.println("Hibernate ile getirildi");
        for (Category category: categories) {
            if (category.getId() == id) {
                return category;
            }
        }
        throw new Exception("TANIMSIZ KATEGORİ");
    }

    @Override
    public void addCategory(Category category) {
        System.out.println("Hibernate ile Kategori eklendi.");
        this.categories.add(category);
    }

    @Override
    public void updateCategory(Category category) {
        System.out.println("Hibernate ile Kategori güncellendi");
    }

    @Override
    public void deleteCategory(Category category) {
        System.out.println("Hibernate ile Kategori silindi");

    }
}

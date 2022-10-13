package business;

import core.logging.Logger;
import dataAccess.Abstract.CategoryDao;
import entities.Category;

import java.util.List;

public class CategoryManager {
    private List<Logger> loggers;
    private CategoryDao categoryDao;

    public CategoryManager(List<Logger> loggers, CategoryDao categoryDao) {
        this.loggers = loggers;
        this.categoryDao = categoryDao;
    }

    public void add(Category category) throws Exception {
        List<Category> categories =categoryDao.getAllCategories();
        boolean isVar=false;
        for(Category category1:categories) {
            if(category.getCategoryName()==category1.getCategoryName()) {
                isVar=true;
                break;
            }
        }

        if(!isVar) {
            categoryDao.addCategory(category);
            for(Logger logger:loggers) {
                logger.log(category.getCategoryName()+ " İsimli Kategori Oluşturuldu.");
            }
        }
        else {
            throw new Exception("Kategori ismi tekrar edemez");
        }

    }

    public void update(Category category) {
        categoryDao.updateCategory(category);
        for(Logger logger:loggers) {
            logger.log(category.getCategoryName()+ " İsimli Kategori Güncellendi.");
        }
    }

    public void delete(Category category) {
        categoryDao.deleteCategory(category);
        for(Logger logger:loggers) {
            logger.log(category.getCategoryName()+ " İsimli Kategori Silindi.");
        }
    }
}

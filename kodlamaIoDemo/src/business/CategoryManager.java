package business;

import core.loging.Logger;
import dataAccess.CategoryDao;
import entities.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoryManager {
    CategoryDao categoryDao;
    List<Category> categories = new ArrayList<>();

    Logger[] loggers;

    public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
    }

    public void add(Category category) throws Exception {
        boolean status = true;
        for (Category category1 : categories){
            if (category1.getCategoryName().equals(category.getCategoryName())){
                status = false;
                break;
            }
        }
        if (!status){
            throw new Exception("Invalid CategoryName");
        }

        else{
            categories.add(category);
            categoryDao.add(category);
            for(Logger logger: loggers){
                logger.log(category.getCategoryName());
            }
        }
    }
}

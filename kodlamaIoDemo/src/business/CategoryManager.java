package business;

import core.loging.ILogger;
import dataAccess.ICategoryDao;
import entities.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoryManager {
    ICategoryDao categoryDao;
    List<Category> categories = new ArrayList<>();

    ILogger[] loggers;

    public CategoryManager(ICategoryDao categoryDao,ILogger[] loggers) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
    }

    public void add(Category category){
        boolean status = true;
        for (Category category1 : categories){
            if (category1.getCategoryName().equals(category.getCategoryName())){
                status = false;
                break;
            }
        }
        if (!status){System.out.println("Invalid Categoty Name");}

        else{
            categories.add(category);
            categoryDao.add(category);
            for(ILogger logger: loggers){
                logger.log(category.getCategoryName());
            }
        }
    }
}

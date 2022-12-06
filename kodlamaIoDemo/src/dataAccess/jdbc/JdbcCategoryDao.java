package dataAccess.jdbc;

import dataAccess.ICategoryDao;
import entities.Category;

public class JdbcCategoryDao implements ICategoryDao {
    @Override
    public void add(Category category) {
        System.out.println(category.getCategoryName() + " aded with Jdbc");
    }
}

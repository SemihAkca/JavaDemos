package dataAccess.jdbc;

import dataAccess.CategoryDao;
import entities.Category;

public class JdbcCategoryDao implements CategoryDao {
    @Override
    public void add(Category category) {
        System.out.println(category.getCategoryName() + " aded with Jdbc");
    }
}

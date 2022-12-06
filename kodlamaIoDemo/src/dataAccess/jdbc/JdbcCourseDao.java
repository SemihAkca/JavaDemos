package dataAccess.jdbc;

import dataAccess.ICourseDao;
import entities.Course;

public class JdbcCourseDao implements ICourseDao {
    @Override
    public void add(Course course) {
        System.out.println(course.getCourseName() + " aded with Jdbc");
    }
}

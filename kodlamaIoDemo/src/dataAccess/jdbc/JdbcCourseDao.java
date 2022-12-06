package dataAccess.jdbc;

import dataAccess.CourseDao;
import entities.Course;

public class JdbcCourseDao implements CourseDao {
    @Override
    public void add(Course course) {
        System.out.println(course.getCourseName() + " aded with Jdbc");
    }
}

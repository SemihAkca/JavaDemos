package dataAccess.hibernate;

import dataAccess.ICourseDao;
import entities.Course;

import java.util.List;

public class HibernateCourseDao implements ICourseDao {
    @Override
    public void add(Course course) {
        System.out.println(course.getCourseName() +" added with Hibernate");
    }
}

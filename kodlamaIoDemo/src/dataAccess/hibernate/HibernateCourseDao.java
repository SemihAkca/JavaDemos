package dataAccess.hibernate;

import dataAccess.CourseDao;
import entities.Course;

public class HibernateCourseDao implements CourseDao {
    @Override
    public void add(Course course) {
        System.out.println(course.getCourseName() +" added with Hibernate");
    }
}

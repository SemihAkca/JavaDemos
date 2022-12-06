package business;

import core.loging.Logger;
import dataAccess.CourseDao;
import entities.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseManager {
    CourseDao courseDao;
    List<Course> courses =  new ArrayList<>();
    Logger[] loggers;

    public CourseManager(CourseDao courseDao, Logger[] loggers) {
        this.courseDao = courseDao;
        this.loggers = loggers;
    }
    public void add(Course course){
        boolean status = true;
        for( Course course1 : courses){
            if (course1.getCourseName().equals(course.getCourseName()) || course.getPrice()<0){
                status = false;
                break;
            }
        }
        if (!status)
        {
            System.out.println("Invalid Course name");
        }
        else{
            courses.add(course);
            courseDao.add(course);
            for(Logger logger: loggers){
                logger.log(course.getCourseName());
            }
        }
    }
}

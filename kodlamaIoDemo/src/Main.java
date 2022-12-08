import business.CategoryManager;
import business.CourseManager;
import business.InstructorManager;
import core.loging.DataBaseLogger;
import core.loging.FileLogger;
import core.loging.Logger;
import dataAccess.hibernate.HibernateCourseDao;
import dataAccess.hibernate.HibernateInstructorDao;
import dataAccess.jdbc.JdbcCategoryDao;
import entities.Category;
import entities.Course;
import entities.Instructor;

public class Main {
    public static void main(String[] args) throws Exception {
        Logger[] loggers = {new DataBaseLogger(), new FileLogger()};

        Course course1 = new Course(1,"Yazılım Geliştirici Yetiştirme Kampı",400);
        CourseManager courseManager = new CourseManager(new HibernateCourseDao(),loggers);
        try {
            courseManager.add(course1);
            courseManager.add(course1);

        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("----------------");

        CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(),loggers);
        try {
            categoryManager.add(new Category(1,"Programlama"));
            categoryManager.add(new Category(1,"Programlama"));
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("----------------");

        Instructor instructor1 = new Instructor(1,"Engin","Demiroğ");
        InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(),loggers);
        instructorManager.add(instructor1);
    }
}
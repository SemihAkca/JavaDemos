package dataAccess.hibernate;

import dataAccess.IInstructorDao;
import entities.Instructor;

public class HibernateInstructorDao implements IInstructorDao {
    @Override
    public void add(Instructor instructor) {
        System.out.println(instructor.getFirstName() + " aded with Hibernate");
    }
}

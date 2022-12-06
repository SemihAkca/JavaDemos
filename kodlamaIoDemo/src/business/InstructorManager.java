package business;

import core.loging.Logger;
import dataAccess.InstructorDao;
import entities.Instructor;

public class InstructorManager {
    private InstructorDao instructorDao;
    Logger[] loggers;
    public InstructorManager(InstructorDao instructorDao, Logger[] loggers) {
        this.instructorDao = instructorDao;
        this.loggers = loggers;
    }

    public void add(Instructor instructor){
        instructorDao.add(instructor);
        for (Logger logger : loggers){
            logger.log(instructor.getFirstName());
        }
    }
}

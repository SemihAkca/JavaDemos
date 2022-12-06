package business;

import core.loging.ILogger;
import dataAccess.IInstructorDao;
import entities.Instructor;

import java.util.ArrayList;

public class InstructorManager {
    private IInstructorDao instructorDao;
    ILogger[] loggers;
    public InstructorManager(IInstructorDao instructorDao, ILogger[] loggers) {
        this.instructorDao = instructorDao;
        this.loggers = loggers;
    }

    public void add(Instructor instructor){
        instructorDao.add(instructor);
        for (ILogger logger : loggers){
            logger.log(instructor.getFirstName());
        }
    }
}

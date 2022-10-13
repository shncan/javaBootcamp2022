package business;

import core.logging.Logger;
import dataAccess.Abstract.CourseDao;
import entities.Course;

import java.util.List;

public class CourseManager {

    private List<Logger> loggers;
    private CourseDao courseDao;

    public CourseManager(List<Logger> loggers, CourseDao courseDao) {
        this.loggers = loggers;
        this.courseDao = courseDao;
    }

    public void add(Course course) throws Exception {

        List<Course> courses = courseDao.getAllCourses();
        boolean isVar = false;
        for(Course course1:courses) {
            if(course.getCourseName()==course1.getCourseName()) {
                isVar=true;
                break;
            }
        }
        if(course.getCoursePrice()<0) {
            throw new Exception("Kurs değeri 0'dan küçük girilemez");
        }
        else if(!isVar && !(course.getCoursePrice()<0)) {
            courseDao.addCourse(course);
            for(Logger logger:loggers) {
                logger.log(course.getCourseName() +" Kursu Eklendi");
            }
        }
        else {
            throw new Exception("HATALI KURS ISMI KULLANIMI");
        }
    }

    public void update(Course course) {
        courseDao.updateCourse(course);
        for(Logger logger:loggers) {
            logger.log(course.getCourseName() +" Kursu Güncellendi");
        }
    }

    public void delete(Course course) {
        courseDao.deleteCourse(course);
        for(Logger logger:loggers) {
            logger.log(course.getCourseName() +" Kursu Silindi");
        }
    }
}

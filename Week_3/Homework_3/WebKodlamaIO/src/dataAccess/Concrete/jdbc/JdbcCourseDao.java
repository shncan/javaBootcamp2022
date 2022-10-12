package dataAccess.Concrete.jdbc;

import dataAccess.Abstract.CourseDao;
import entities.Course;

import java.util.ArrayList;
import java.util.List;

public class JdbcCourseDao implements CourseDao {
    private List<Course> courses=new ArrayList<Course>();

    @Override
    public List<Course> getAllCourses() {
        System.out.println("JDBC ile getirildi");
        return courses;
    }

    @Override
    public Course getCourse(int id) throws Exception {
        System.out.println("JDBC ile getirildi");
        for (Course course: courses) {
            if (course.getId() == id) {
                return course;
            }
        }
        throw new Exception("GEÇERSİZ DEĞER");
    }

    @Override
    public void addCourse(Course course) {
        System.out.println("JDBC ile Kurs Eklendi.");
        this.courses.add(course);
    }

    @Override
    public void updateCourse(Course course) {
        System.out.println("JDBC ile Kurs Güncellendi.");

    }

    @Override
    public void deleteCourse(Course course) {
        System.out.println("JDBC ile Kurs Silindi.");

    }
}

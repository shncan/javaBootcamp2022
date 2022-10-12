package dataAccess.Concrete.hibernate;

import dataAccess.Abstract.CourseDao;
import entities.Course;

import java.util.ArrayList;
import java.util.List;

public class HibernateCourseDao implements CourseDao {

    private List<Course> courses=new ArrayList<Course>();

    @Override
    public List<Course> getAllCourses() {
        System.out.println("Hibernate ile getirildi");
        return courses;
    }

    @Override
    public Course getCourse(int id) throws Exception {
        System.out.println("Hibernate ile getirildi");
        for (Course course: courses) {
            if (course.getId() == id) {
                return course;
            }
        }
        throw new Exception("TANIMSIZ KURS");
    }

    @Override
    public void addCourse(Course course) {
        System.out.println("Hibernate ile Kurs Eklendi.");
        this.courses.add(course);
    }

    @Override
    public void updateCourse(Course course) {
        System.out.println("Hibernate ile Kurs Güncellendi.");

    }

    @Override
    public void deleteCourse(Course course) {
        System.out.println("Hibernate ile Kurs Silindi.");

    }
}

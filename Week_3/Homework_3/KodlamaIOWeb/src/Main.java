import business.CategoryManager;
import business.CourseManager;
import business.EducatorManager;
import core.logging.DatabaseLogger;
import core.logging.FileLogger;
import core.logging.Logger;
import core.logging.MailLogger;
import dataAccess.Concrete.hibernate.HibernateCourseDao;
import dataAccess.Concrete.hibernate.HibernateEducatorDao;
import dataAccess.Concrete.jdbc.JdbcCategoryDao;
import dataAccess.Concrete.jdbc.JdbcEducatorDao;
import entities.Category;
import entities.Course;
import entities.Educator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static ArrayList<Logger> loggers;

    public static void main(String[] args) throws Exception {
        Educator educator = new Educator(1, "Testİsim", "TestSoyisim" );
        Educator educator1 = new Educator(2, "Testİsim2", "TestSoyisim2" );

        Category category = new Category(1, "Javascript");
        Category category1 = new Category(2, "Java");



        Course course = new Course(1, "TestKurs", "Test", -100, "", category, educator);
        Course course2 = new Course(2, "TestKurs2", "Test2", 100, "", category1, educator1);


        EducatorManager educatorManager = new EducatorManager(new JdbcEducatorDao(), loggers);
        EducatorManager.add(educator);

        EducatorManager educatorManager1 = new EducatorManager(new HibernateEducatorDao(), loggers);
        educatorManager1.add(educator1);



        CourseManager courseManager = new CourseManager(loggers, new HibernateCourseDao());
        courseManager.add(course);
        courseManager.add(course2);


        CategoryManager categoryManager = new CategoryManager(loggers, new JdbcCategoryDao());
        categoryManager.add(category);
        categoryManager.add(category1);



        loggers = new ArrayList<Logger>();
        loggers.add(new MailLogger());
        loggers.add(new DatabaseLogger());
        loggers.add(new FileLogger());


    }
    }

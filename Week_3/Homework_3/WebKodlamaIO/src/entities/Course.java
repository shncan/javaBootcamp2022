package entities;

public class Course {


    private int id;
    private String courseName;

    private double coursePrice;


    public Course(int i, String testKurs2, String kamp, int i1, String s, Category category1, Educator educator1) {
        super();
    }

    public Course(int id, String courseName, int coursePrice) {
        super();
        this.id = id;
        this.courseName = courseName;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public double getCoursePrice() {
        return coursePrice;
    }

    public void setOursePrice(double coursePrice) {
        this.coursePrice = coursePrice;
    }
}
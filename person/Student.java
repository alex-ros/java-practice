package person;

public class Student extends Person {

    private int numCourses;
    private String[] courses;
    private int[] grades;
    private static final int MAX_NO_COURSES = 30;

    public Student(String name, String address) {
        super(name, address);
        numCourses = 0;
        courses = new String[MAX_NO_COURSES];
        grades = new int[MAX_NO_COURSES];
    }

    @Override
    public String toString() {
        return "Student: " + super.toString();
    }

    public void addCourseGrade(String course, int grade) {
        courses[numCourses]= course;
        grades[numCourses]= grade;
        ++numCourses;
    }

    public void printGrades() {
        System.out.println(this);
        for(int loop= 0; loop < numCourses; ++loop) {
            System.out.println(" " + courses[loop] + ":" + grades[loop]);
        }
    }
    public double getAverageGrade() {
        int sum= 0;
        for(int loop= 0; loop< numCourses; ++loop) {
            sum+= grades[loop];
        }
        return (double)sum/numCourses;
    }
}

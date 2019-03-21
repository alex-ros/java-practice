package person;

public class Teacher extends Person {
    private int numCourses;
    private String[] courses;
    private static final int MAX_NO_COURSES = 5;

    public Teacher(String name, String address) {
        super(name, address);
        numCourses = 0;
        courses = new String[MAX_NO_COURSES];
    }

    @Override
    public String toString() {
        return "Teacher: " + super.toString();
    }

//        Return false if the course already exists
    public boolean addCourse(String course) {
//        Check if the course is already in the course list
        for (int loop = 0; loop < numCourses; loop++) {
            if (courses[loop].equals(course)) return false;
        }
        courses[numCourses] = course;
        numCourses++;
        return true;
    }
//        Return false if the course can not be found in the course list
    public boolean removeCourse(String course) {
        boolean found = false;
//        Look for course index
        int courseIndex = -1;
        for (int index = 0; index < numCourses; index++) {
            if (courses[index].equals(course)) {
                courseIndex = index;
                found = true;
                break;
            }
        }
        if (found) {
//            Remove the course and re-arrange the courses array
            for (int index = courseIndex; index < numCourses - 1; index++) {
                courses[index] = courses[index + 1];
            }
            numCourses--;
            return true;
        } else {
            return false;
        }

    }
}

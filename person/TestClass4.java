package person;

public class TestClass4 {
    public static void main(String[] args) {
//        Test Student class
        Student s1 = new Student("Fuck Face", "Shit Street");
        s1.addCourseGrade("IM101", 97);
        s1.addCourseGrade("IM102", 68);
        s1.printGrades();
        System.out.println("Average grade is: " + s1.getAverageGrade());

        System.out.println();
        System.out.println();

//        Test Teacher class
        Teacher t1 = new Teacher("Hot Teacher", "69 Ave");
        System.out.println(t1);
        String[] courses = {"IM101", "IM102", "IM101"};

        for (String course: courses) {
            if(t1.addCourse(course)) {
                System.out.println(course + " added!");
            }else {
                System.out.println(course + " can not be added!");
            }
        }
        for (String course: courses) {
            if(t1.removeCourse(course)) {
                System.out.println(course + " removed!");
            }else {
                System.out.println(course + " can not be removed");
            }
        }
    }
}

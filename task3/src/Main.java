import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Person> persons = new ArrayList<>();

        Student s1 = new Student("James");
        s1.addCourse("Math");
        s1.addCourse("History");

        Student s2 = new Student("Bob");
        s2.addCourse("PE");
        s2.addCourse("Chemistry");

        persons.add(s1);
        persons.add(s2);

        Teacher t1 = new Teacher("Lis");
        t1.addCanTeach("Danish");
        t1.addCanTeach("History");


        Teacher t2 = new Teacher("Karsten");
        t2.addCanTeach("Math");
        t2.addCanTeach("Music");

        persons.add(t1);
        persons.add(t2);


        for (Person person : persons) {
            System.out.println("Name: " + person.getName());

            if (person instanceof Teacher) {
                System.out.println("can teach Courses: " + person.getCanTeach());
            } else if (person instanceof Student) {
                System.out.println("Current Courses: " + ((Student) person).getCurrentCourses());
                System.out.println("Passed Courses: " + person.getPassedCourses());
            }
            System.out.println();
        }
    }

}
import java.util.ArrayList;

public class Student extends Person{
        ArrayList<String> passedCourses=new ArrayList<>();
        ArrayList<String> currentCourses= new ArrayList<>();

    public Student(String name){
        super(name);
    }

    @Override
    public boolean addCourse(String course){
        if(!passedCourses.contains(course)){
            currentCourses.add(course);
            return true;
        }else{
            return false;
        }
    }

    public ArrayList<String> getCurrentCourses() {
        return currentCourses;
    }
}


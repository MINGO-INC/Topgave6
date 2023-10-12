import java.util.ArrayList;
public class Teacher extends Person {
    ArrayList<String> canTeach = new ArrayList<>();
    ArrayList<String> currentCourses = new ArrayList<>();


    public Teacher(String name) {
        super(name);

    }

    @Override
    public boolean addCourse(String course) {
        if (canTeach.contains(course)) {
            currentCourses.add(course);
            return true;
        } else {
            return false;
        }
    }

    public boolean addCanTeach(String course){
        if(!canTeach.contains(course)){
            canTeach.add(course);
            return true;
        }else{
            return false;
        }
    }
    @Override
    public ArrayList<String> getCanTeach(){
        return canTeach;
    }

}

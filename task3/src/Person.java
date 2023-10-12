import java.util.ArrayList;

public class Person {

    private String name;
    private String course;

    public Person(String name){
      this.name = name;
    }
    public String getName(){
    return this.name;
    }
    public void setName(){

    }
    public boolean addCourse(String course){//vi bruger ikke den her metode.
        return true;
    }

    public String getPassedCourses() {
        return "";
    }

    public ArrayList<String> getCanTeach() {
        return null;
    }
}

package WritingObjectsToFile;

import java.io.Serializable;

public class Student implements Serializable{
    private String f_name;

    public String getF_name() {
        return f_name;
    }

    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    public String getL_name() {
        return l_name;
    }

    public void setL_name(String l_name) {
        this.l_name = l_name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String l_name;
    private int age;

    //Constructor
    public Student(String f_name,String l_name,int age){
        this.f_name=f_name;
        this.l_name=l_name;
        this.age = age;
    }

    public void displayinfo(){
        System.out.println(f_name+" "+l_name+" "+age);
    }

}

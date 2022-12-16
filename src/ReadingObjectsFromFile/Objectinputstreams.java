package ReadingObjectsFromFile;

import WritingObjectsToFile.Student;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Objectinputstreams {

    public static void main(String[] args) throws Exception{

        FileInputStream filein = new FileInputStream("data.ser");
        ObjectInputStream oinput = new ObjectInputStream(filein);

        Student o = (Student) oinput.readObject();

        System.out.println(o.getF_name()+" "+o.getL_name()+" "+o.getAge());

        filein.close();
        oinput.close();


    }
}

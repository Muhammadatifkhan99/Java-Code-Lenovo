package WritingObjectsToFile;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectExample {
    public static void main(String[] args) throws Exception {
        Student s = new Student("MUhammad","Atif",23);
        //Serialization is done using FileOutputStreams
        FileOutputStream file = new FileOutputStream("data.ser");
        //writing object to a file using streams
        ObjectOutputStream out = new ObjectOutputStream(file);
        out.writeObject(s);//this method takes the object of Student class which has implemented the Serializable class
        System.out.println("The operation was successful");
        //closing streams
        file.close();
        out.close();


    }
}

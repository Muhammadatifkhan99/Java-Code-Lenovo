package StringTokenizer;

import java.io.File;
import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) throws Exception{
        File a = new File("ScannerExample.txt");
        System.out.println("Does the file exists: "+a.exists());
        System.out.println("The size of the file: "+a.getTotalSpace()+"\n"+"length: "+a.length()+"\n"+"Path: "+a.getAbsolutePath());

        Scanner in = new Scanner(a);

//        System.out.println(in.nextLine());
//        System.out.println("\n");
//        System.out.println(in.nextLine());
//        System.out.println("\n");
//        System.out.println(in.nextLine());
//        System.out.println("\n");

        while(in.hasNextLine()){
            System.out.println(in.nextLine());
        }
    }
}

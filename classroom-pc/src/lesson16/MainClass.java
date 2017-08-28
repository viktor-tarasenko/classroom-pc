package lesson16;

import java.io.*;

public class MainClass {

    public static void main(String[] args) {
        File f = new File("/home/hillel/IdeaProjects/JavaElementary/src/com/hillel/javael/tarasenko/try.ser");
        NewClass writeClass = new NewClass(123,"123", 123);

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(f))){
            objectOutputStream.writeObject(writeClass);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(f))){
            NewClass readClass = (NewClass) objectInputStream.readObject();
            System.out.println(readClass.toString());
        } catch (Exception e){
            System.err.println(e);
        }
    }
}

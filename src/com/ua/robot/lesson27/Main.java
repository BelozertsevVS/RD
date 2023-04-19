package com.ua.robot.lesson27;

import jdk.internal.access.JavaIOFileDescriptorAccess;

import java.io.*;
import java.util.List;

public class Main {

    public static final String FILE_NAME = "test.txt";
    public static final String OBJECT_FILE_NAME = "student.txt";

    public static void main(String[] args) {

//        try (OutputStream os = new FileOutputStream(FILE_NAME);
//             OutputStreamWriter osw = new OutputStreamWriter(os)) {
//            String data = "Hello World";
//            // osw.write(data, 4, data.length() - 4);
//            osw.write(data);
//            osw.write(data);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }


//        try (InputStream is = new FileInputStream(FILE_NAME)) {
//            byte[] data = is.readAllBytes();
//            String dataString = new String(data);
//            System.out.println(dataString);
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        Student s1 = new Student("hjjhjhjh", 17, "kjkj");
        Student s2 = new Student("hjgjhj", 27, "kjkj");
        Student s3 = new Student("lklklkjk", 37, "kjk'[;j");
        Student s4 = new Student("kjk;l;l;", 47, "klkjkj");
        Student s5 = new Student("kjklklk", 67, "kjk;l;j");
        Student s6 = new Student("kjkljkjll;l", 57, "kj[;['kj");
        Student s7 = new Student("gfgfg", 75, "kjk';j");

        List<Student> l1 = List.of(s1, s2, s3, s4, s5, s6, s7);

        try (OutputStream os = new FileOutputStream(OBJECT_FILE_NAME); ObjectOutputStream oos = new ObjectOutputStream(os)) {
            oos.writeObject(l1);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (InputStream is = new FileInputStream(OBJECT_FILE_NAME); ObjectInputStream ois = new ObjectInputStream(is)){
            List<Student> s = (List<Student>) ois.readObject();
            System.out.println(s);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException | ClassNotFoundException e ) {
            throw new RuntimeException(e);
        }


    }

}


package com.nowcoder.chapter3.part39;

import java.io.*;

/**
 * 序列化的规则
 */
public class IODemo11 {

    public static void main(String[] args) {
//        testSerialize();
        testDeserialize();
    }

    public static void testSerialize() {
        try (
                ObjectOutputStream oos = new ObjectOutputStream(
                        new FileOutputStream("C:/javacode/stu.txt"));
        ) {
            Teacher t = new Teacher("gpw");
            Student s1 = new Student("zxm", t);
            Student s2 = new Student("cbx", t);
            oos.writeObject(t);
            oos.writeObject(s1);
            oos.writeObject(s2);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void testDeserialize() {
        try (
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:/javacode/stu.txt"));
        ) {
            Teacher t = (Teacher) ois.readObject();
            Student s1 = (Student) ois.readObject();
            Student s2 = (Student) ois.readObject();
            System.out.println(t);
            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s1.getTeacher() == s2.getTeacher());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class Teacher implements Serializable {

    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Student implements Serializable {

    private String name;
    private Teacher teacher;

    public Student(String name, Teacher teacher) {
        this.name = name;
        this.teacher = teacher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", teacher=" + teacher +
                '}';
    }
}
package lab7;

import java.util.*;

public class Lab7 {

    public static void main(String[] args) {
	// write your code here
        Course obj1 = new Course("Course 1");
        Course obj2 = new Course("Course 2");

        obj1.addStudent("Peter jones");
        obj1.addStudent("Kim Smith");
        obj1.addStudent("Anne Kennedy");

        obj2.addStudent("Peter Jones");
        obj2.addStudent("steve Smith");

        System.out.println("Number of Student in " + obj1.getCourseName() + ": " + obj1.getNumberStudent());
        ArrayList<String> courseStudents1 = obj1.getStudents();
        for(int i = 0; i < courseStudents1.size(); i++){
            if(i == courseStudents1.size() - 1){
                System.out.print(courseStudents1.get(i));
            }else
            System.out.print(courseStudents1.get(i) + ", ");
        }
        System.out.println("\n\nNumber of Student in " + obj2.getCourseName() + ": " + obj2.getNumberStudent());
        ArrayList<String> courseStudents2 = obj2.getStudents();
        for(int i = 0; i < courseStudents2.size(); i++){
            if(i == courseStudents2.size() - 1){
                System.out.print(courseStudents2.get(i));
            }else
            System.out.print(courseStudents2.get(i) + ", ");
        }
        System.out.println("\n\nDrop Student in " + obj1.getCourseName() + " : ");
        obj1.dropStudent("Peter jones");
        System.out.print("Number of Students in " + obj1.getCourseName() + " : " + obj1.getNumberStudent() + "\n");
        for(int i = 0; i < courseStudents1.size();i++){
            if(i == courseStudents1.size() - 1){
                System.out.println(courseStudents1.get(i));
            }else
                System.out.print(courseStudents1.get(i)+ ", ");
        }
    }
}


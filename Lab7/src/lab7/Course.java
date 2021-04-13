/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

/**
 *
 * @author LENOVO
 */
import java.util.ArrayList;

public class Course {
        private String courseName;
        private ArrayList<String> students = new ArrayList<>();
        private int numberOfStudents = 0;

        Course(String courseName){
            this.courseName = courseName;
        }

        public String getCourseName(){
            return courseName;
        }

        public void addStudent(String Student){
            students.add(Student);
            numberOfStudents++;
        }

        public void dropStudent(String student){
            for(int i = 0; i < numberOfStudents; i++ ){
                if(students.get(i).equals(student)){
                    students.remove(i);
                    numberOfStudents--;
                    break;
                }
            }
        }

    public ArrayList<String> getStudents() {
        return students;
    }

    public int getNumberStudent() {
        return numberOfStudents;
    }


}
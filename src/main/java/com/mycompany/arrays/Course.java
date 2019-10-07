/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.arrays;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Course {
    
    String courseName;
    ArrayList<String> students = new ArrayList<String>();
    
    public Course(String courseName){
        this.courseName = courseName; 
    }
    
    public void addStudent(String student){
        if(this.students.size() < 100 ){
            this.students.add(student);
        }
    }
    
    public int getNumberStudents(){
     return this.students.size();
    }
    
    public void showStudents(){
        for(int i = 0; i < this.students.size(); i++){
            System.out.println(this.students.get(i));
        }
    }
    
    public String getCourseName(){
       return this.courseName;
    }
    
    public void dropStudent(String student){
        this.students.remove(student);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Course course1 = new Course("MAC2311");
        while(true){
            int choices;
            System.out.println("Enter 1 to add a student:");
            System.out.println("Enter 2 to drop a student:");
            System.out.println("Enter 3 to view the students in the course:");
            System.out.println("Enter 4 to see the number of students in the course:");
            System.out.println("Enter 5 to quit the program.");
            choices = scanner.nextInt();
            
            switch (choices) {
                case 1:
                    {
                        System.out.println("Enter the name of the student:");
                        scanner.nextLine(); //necessary to read the name in properly
                        String stuName = scanner.nextLine();
                        course1.addStudent(stuName);
                        break;
                    }
                case 2:
                    {
                        System.out.println("Enter student to drop:");
                        scanner.nextLine(); //necessary to read the name in properly
                        String stuName = scanner.nextLine();
                        course1.dropStudent(stuName);
                        break;
                    }
                case 3:
                    course1.showStudents();
                    break; 
                case 4:
                    System.out.println(course1.getNumberStudents());
                    break;
                case 5: 
                    System.exit(0);
                default:
                    break;
            }
        }
    }
    
}

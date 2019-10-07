/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.arrays;
import java.util.Arrays;
import java.util.ArrayList;
/**
 *
 * @author mario
 */
public class Array {
    
}

class Main {
    
  public static void main(String[] args) {
    int size = 20;
    int counts[] = new int[4];
    double values[];
    
    values = new double[size];
    System.out.println("The 0 element in counts is -> " + counts[0]);
    
    counts[0] = 7;
    counts[1] = counts[0] * 2;
    counts[2]++;
    counts[3] -= 60;
    
    int i = 0;
    while(i < 4){
        System.out.println("This is in " + i + " index of counts-> " + counts[i]);
        i++;
    }
    
    for(int j = 0; j < counts.length; j++){
        System.out.println(counts[j]);
    }
    
    ArrayList<String> students = new ArrayList<>();
    students.add("Mario");
    students.add("Karen");
    students.add("Arthur");
    students.add("April");
    
      System.out.println(students);
      
      for(int p = 0; p < students.size(); p++){
          System.out.println(students.get(p));
      }
      
      System.out.println(students.size());
      System.out.println(students);
            

  }
  
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collection;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Devi - BOE
 */
public class student {
        public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> studentNames = new ArrayList();
        addstudents(studentNames);
        displaystudents(studentNames);
        //Collection.sort(studentNames);
        //displaystudents(studentNames);
                
    }
        static void displaystudents(ArrayList<String> studentNames){
            for(String student: studentNames)
                System.out.println("Student Name: "+student);
        }
        static void addstudents(ArrayList<String> studentNames){
            studentNames.add("Devi");
            studentNames.add("Vantie");
            studentNames.add("Fajar");
            
        }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.CourseCatalog.CourseCatalog;
import info5100.university.example.CourseSchedule.CourseLoad;
import info5100.university.example.CourseSchedule.CourseOffer;
import info5100.university.example.CourseSchedule.CourseSchedule;
import info5100.university.example.CourseSchedule.SeatAssignment;
import info5100.university.example.Degree.Degree;
import info5100.university.example.Department.Department;
import info5100.university.example.Persona.Faculty.FacultyDirectory;
import info5100.university.example.Persona.Faculty.FacultyProfile;
import info5100.university.example.Persona.Person;
import info5100.university.example.Persona.PersonDirectory;
import info5100.university.example.Persona.StudentDirectory;
import info5100.university.example.Persona.StudentProfile;

/**
 *
 * @author kal bugrara
 */
public class Info5001UniversityExample {

    /**
     * @param args the command line arguments
     */
    
    /* 1) Create Department make sure to pass the name of the department
       2) Use the person directory to create persons some will play students role, some will play faculty role, etc
       3) Use the Course Catalog to creat some courses
       4) Create a course schedule for a semester (ex: spring 2025
       5) Use the course schedule to create some classes (course offer)
       6) Search for a person by ssn and assign as faculty (faculty profile)
       7) Search for person and assign as student (student profile)
       8) Register student for scheduled classes
    
    
    
    */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Department department = new Department("Information Systems");
        CourseCatalog coursecatalog = department.getCourseCatalog();

// Step2: Add Courses (1 core & 6 electives) in the course catalog
        Course corecrs = coursecatalog.newCourse("Application Engineering and Development", "Info5100", 4); // Core
        Course e1crs = coursecatalog.newCourse("Object-oriented Design", "Csye6200", 3);
        Course e2crs = coursecatalog.newCourse("Cloud computing", "Csye6201", 3); 
        Course e3crs = coursecatalog.newCourse("Network Security", "Tele6255", 3); 
        Course e4crs = coursecatalog.newCourse("Machine Learning", "Info6210", 2);
        Course e5crs = coursecatalog.newCourse("Database Design", "Info6372", 2); 
        Course e6crs = coursecatalog.newCourse("Fintech and Cryptocurrency", "Info7215", 3); 
        Course e7crs = coursecatalog.newCourse("Adv Medical Application", "Info7200", 4); 
        Course e8crs = coursecatalog.newCourse("Introduce to Java", "Info7290", 3); 
        Course e9crs = coursecatalog.newCourse("Data structure and Algorithm", "Csye5780", 4); 
        Course e10crs = coursecatalog.newCourse("Web Design", "Tele5385", 4); 


        // Create Degree and assign courses to core/ electives category
        Degree degree = new Degree("Master in Information Systems");
        degree.addCoreCourse(corecrs);
        degree.addElectiveCourse(e1crs);
        degree.addElectiveCourse(e2crs);
        degree.addElectiveCourse(e3crs);
        degree.addElectiveCourse(e4crs);
        degree.addElectiveCourse(e5crs);
        degree.addElectiveCourse(e6crs);
        degree.addElectiveCourse(e7crs);
        degree.addElectiveCourse(e8crs);
        degree.addElectiveCourse(e9crs);
        degree.addElectiveCourse(e10crs);

// Step3: Browse Courses (1 core + 6 electives)
        ArrayList<Course> crslist = coursecatalog.getCourseList();
        System.out.println("Browse courses: ");
        for (Course course : crslist) {
            System.out.println(course);
        }

// Step4: Create course schedule
        CourseSchedule courseschedule = department.newCourseSchedule("Fall 2024");

    }
}


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

// Step5: Add course offers

        CourseOffer courseoffer = courseschedule.newCourseOffer("Info5100");
        CourseOffer e1courseoffer = courseschedule.newCourseOffer("Csye6200");
        CourseOffer e2courseoffer = courseschedule.newCourseOffer("Csye6201");
        CourseOffer e3courseoffer = courseschedule.newCourseOffer("Tele6255");
        CourseOffer e4courseoffer = courseschedule.newCourseOffer("Info6210");
        CourseOffer e5courseoffer = courseschedule.newCourseOffer("Info6372");
        CourseOffer e6courseoffer = courseschedule.newCourseOffer("Info7215");
        CourseOffer e7courseoffer = courseschedule.newCourseOffer("Info7200");
        CourseOffer e8courseoffer = courseschedule.newCourseOffer("Info7290");
        CourseOffer e9courseoffer = courseschedule.newCourseOffer("Csye5780");
        CourseOffer e10courseoffer = courseschedule.newCourseOffer("Tele5385");

        // Assign seats to Courses
        if(courseoffer == null) return;
        courseoffer.generatSeats(100);
        e1courseoffer.generatSeats(50);
        e2courseoffer.generatSeats(50);
        e3courseoffer.generatSeats(50);
        e4courseoffer.generatSeats(50);
        e5courseoffer.generatSeats(50);
        e6courseoffer.generatSeats(50);
        e7courseoffer.generatSeats(50);
        e8courseoffer.generatSeats(50);
        e9courseoffer.generatSeats(50);
        e10courseoffer.generatSeats(50); // allow for 50 open seats in the class


// Step6: Assign Professors to Courses
        PersonDirectory pd = department.getPersonDirectory();
        Person pro1 = pd.newPerson("20240101");
        Person pro2 = pd.newPerson("20240102");
        Person pro3 = pd.newPerson("20240103");
        Person pro4 = pd.newPerson("20240104");
        Person pro5 = pd.newPerson("20240105");
        Person pro6 = pd.newPerson("20240106");

        FacultyDirectory fd = department.getFacultyDirectory();
        FacultyProfile professor1 = fd.newFacultyProfile(pro1);
        FacultyProfile professor2 = fd.newFacultyProfile(pro2);
        FacultyProfile professor3 = fd.newFacultyProfile(pro3);
        FacultyProfile professor4 = fd.newFacultyProfile(pro4);
        FacultyProfile professor5 = fd.newFacultyProfile(pro5);
        FacultyProfile professor6 = fd.newFacultyProfile(pro6);
        courseoffer.AssignAsTeacher(professor1);
        e1courseoffer.AssignAsTeacher(professor2);
        e2courseoffer.AssignAsTeacher(professor2);
        e3courseoffer.AssignAsTeacher(professor3);
        e4courseoffer.AssignAsTeacher(professor3);
        e5courseoffer.AssignAsTeacher(professor4);
        e6courseoffer.AssignAsTeacher(professor4);
        e7courseoffer.AssignAsTeacher(professor5);
        e8courseoffer.AssignAsTeacher(professor5);
        e9courseoffer.AssignAsTeacher(professor6);
        e10courseoffer.AssignAsTeacher(professor6);

// Step7: Student register for courses

        Person std1 = pd.newPerson("20240001");
        Person std2 = pd.newPerson("20240002");
        Person std3 = pd.newPerson("20240003");
        Person std4 = pd.newPerson("20240004");
        Person std5 = pd.newPerson("20240005");
        Person std6 = pd.newPerson("20240006");
        Person std7 = pd.newPerson("20240007");
        Person std8 = pd.newPerson("20240008");
        Person std9 = pd.newPerson("20240009");
        Person std10 = pd.newPerson("20240010");

        StudentDirectory sd = department.getStudentDirectory();

        StudentProfile student1 = sd.newStudentProfile(std1);
        StudentProfile student2 = sd.newStudentProfile(std2);
        StudentProfile student3 = sd.newStudentProfile(std3);
        StudentProfile student4 = sd.newStudentProfile(std4);
        StudentProfile student5 = sd.newStudentProfile(std5);
        StudentProfile student6 = sd.newStudentProfile(std6);
        StudentProfile student7 = sd.newStudentProfile(std7);
        StudentProfile student8 = sd.newStudentProfile(std8);
        StudentProfile student9 = sd.newStudentProfile(std9);
        StudentProfile student10 = sd.newStudentProfile(std10);

        CourseLoad crsload1 = student1.newCourseLoad("Fall 2024");
        CourseLoad crsload2 = student2.newCourseLoad("Fall 2024");
        CourseLoad crsload3 = student3.newCourseLoad("Fall 2024");
        CourseLoad crsload4 = student4.newCourseLoad("Fall 2024");
        CourseLoad crsload5 = student5.newCourseLoad("Fall 2024");
        CourseLoad crsload6 = student6.newCourseLoad("Fall 2024");
        CourseLoad crsload7 = student7.newCourseLoad("Fall 2024");
        CourseLoad crsload8 = student8.newCourseLoad("Fall 2024");
        CourseLoad crsload9 = student9.newCourseLoad("Fall 2024");
        CourseLoad crsload10 = student10.newCourseLoad("Fall 2024");

        crsload1.registerStudentInClass(courseoffer); // register student1 in class Info 5100
        crsload1.registerStudentInClass(e1courseoffer); // same student signed up for the elective1 course
        crsload1.registerStudentInClass(e2courseoffer); // same student signed up for the elective2 course
        crsload1.registerStudentInClass(e3courseoffer); // same student signed up for the elective3 course
        crsload2.registerStudentInClass(courseoffer);
        crsload2.registerStudentInClass(e3courseoffer);
        crsload2.registerStudentInClass(e4courseoffer);
        crsload3.registerStudentInClass(e4courseoffer);
        crsload3.registerStudentInClass(e5courseoffer);
        crsload3.registerStudentInClass(e6courseoffer);
        crsload4.registerStudentInClass(e4courseoffer);
        crsload4.registerStudentInClass(e7courseoffer);
        crsload4.registerStudentInClass(e9courseoffer);
        crsload5.registerStudentInClass(e5courseoffer);
        crsload5.registerStudentInClass(e8courseoffer);
        crsload5.registerStudentInClass(e9courseoffer);
        crsload6.registerStudentInClass(e9courseoffer);
        crsload6.registerStudentInClass(e10courseoffer);
        crsload7.registerStudentInClass(e3courseoffer);
        crsload7.registerStudentInClass(e7courseoffer);
        crsload8.registerStudentInClass(e3courseoffer);
        crsload8.registerStudentInClass(e5courseoffer);
        crsload8.registerStudentInClass(e8courseoffer);
        crsload9.registerStudentInClass(e3courseoffer);
        crsload9.registerStudentInClass(e4courseoffer);
        crsload10.registerStudentInClass(e3courseoffer);
        crsload10.registerStudentInClass(courseoffer);
        crsload10.registerStudentInClass(e10courseoffer);

// Step8: Give grades to course
        Random random = new Random();
        for (SeatAssignment seatassign : crsload1.getSeatAssignments()) {
            float randomGPA = 0.0f + random.nextFloat() * (4.0f - 0.0f);
            seatassign.setGrade(randomGPA);
        }
        for (SeatAssignment seatassign : crsload2.getSeatAssignments()) {
            float randomGPA = 0.0f + random.nextFloat() * (4.0f - 0.0f);
            seatassign.setGrade(randomGPA);
        }
        for (SeatAssignment seatassign : crsload3.getSeatAssignments()) {
            float randomGPA = 0.0f + random.nextFloat() * (4.0f - 0.0f);
            seatassign.setGrade(randomGPA);
        }
        for (SeatAssignment seatassign : crsload4.getSeatAssignments()) {
            float randomGPA = 0.0f + random.nextFloat() * (4.0f - 0.0f);
            seatassign.setGrade(randomGPA);
        }
        for (SeatAssignment seatassign : crsload5.getSeatAssignments()) {
            float randomGPA = 0.0f + random.nextFloat() * (4.0f - 0.0f);
            seatassign.setGrade(randomGPA);
        }
        for (SeatAssignment seatassign : crsload6.getSeatAssignments()) {
            float randomGPA = 0.0f + random.nextFloat() * (4.0f - 0.0f);
            seatassign.setGrade(randomGPA);
        }
        for (SeatAssignment seatassign : crsload7.getSeatAssignments()) {
            float randomGPA = 0.0f + random.nextFloat() * (4.0f - 0.0f);
            seatassign.setGrade(randomGPA);
        }
        for (SeatAssignment seatassign : crsload8.getSeatAssignments()) {
            float randomGPA = 0.0f + random.nextFloat() * (4.0f - 0.0f);
            seatassign.setGrade(randomGPA);
        }
        for (SeatAssignment seatassign : crsload9.getSeatAssignments()) {
            float randomGPA = 0.0f + random.nextFloat() * (4.0f - 0.0f);
            seatassign.setGrade(randomGPA);
        }
        for (SeatAssignment seatassign : crsload10.getSeatAssignments()) {
            float randomGPA = 0.0f + random.nextFloat() * (4.0f - 0.0f);
            seatassign.setGrade(randomGPA);
        }

// Step9: Generate Report
        System.out.println("\nSemester Report: Fall 2024");
        System.out.println("=============================");

        printStudentReport(student1);
        printStudentReport(student2);
        printStudentReport(student3);
        printStudentReport(student4);
        printStudentReport(student5);
        printStudentReport(student6);
        printStudentReport(student7);
        printStudentReport(student8);
        printStudentReport(student9);
        printStudentReport(student10);

        System.out.println("Department Revenue for Fall 2024: $" + department.calculateRevenuesBySemester("Fall 2024") + "\n");  

    }

    public static void printStudentReport(StudentProfile std) {
        CourseLoad courseload = std.getCourseLoadBySemester("Fall 2024");
        if (courseload == null || courseload.getSeatAssignments().isEmpty()) return;

        Person person = std.getPerson();
        System.out.println("Student: " + person.getPersonId());
        System.out.println("Courses ");

        double totalGradePoints = 0.0;
        int totalCredits = 0;
        double tuition = 0;

        // Print courses
        for(SeatAssignment seatAssignment : courseload.getSeatAssignments()) {
            CourseOffer courseOffer = seatAssignment.getSeat().getCourseOffer();
            Course crs = courseOffer.getSubjectCourse();
            FacultyProfile professor = courseOffer.getFacultyProfile();

            double grade = seatAssignment.GetCourseStudentScore();
            int credits = crs.getCredits();

            totalGradePoints += grade;
            totalCredits += credits;
            tuition += crs.getCoursePrice();

            System.out.println("- " + crs.getCourseNumber() + ": " + crs.getCourseName());
            System.out.println("  Professor: " + (professor != null ? professor.getPerson().getPersonId() : "TBA"));
            System.out.println("  Grade: " + seatAssignment.getGrade());
            System.out.println("  Credits: " + credits);
            System.out.println("  Price: $" + crs.getCoursePrice());
        }

        double semesterGPA = totalCredits > 0 ? (totalGradePoints/totalCredits) : 0.0;
        String letterGPA;
        if (semesterGPA >= 4.0) {
            letterGPA = "A";
        }
        else if (semesterGPA <= 4.0 && semesterGPA >= 3.7) {
            letterGPA = "A-";
        }
        else if(semesterGPA <= 3.7 && semesterGPA >= 3.3) {
            letterGPA = "B+";
        }
        else
            letterGPA = "B";

        System.out.println("Summary");
        System.out.println("  Total Credits: " + totalCredits);
        System.out.println("  Total Tuition: $" + tuition);
        System.out.println("  Semester GPA: " + String.format("%.2f", semesterGPA) + " (" + letterGPA + ")");
        System.out.println("-----------------------------------");
    }
}
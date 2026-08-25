package task;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class task_improved {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		HashMap<Integer, Student> students = new HashMap();

		while (true) {

		    displayMenu();

		    int choice = scan.nextInt();

		    if (choice == 1) {
		        addStudent(students,scan);
		    }
		    else if (choice == 2) {
		        viewStudents(students);
		    }
		    else if (choice == 3) {
		        searchStudent(students, scan);
		    }
		    else if (choice == 4) {
		        updateStudent(students,scan);
		    }
		    else if (choice == 5) {
		        deleteStudent(students, scan);
		    }
		    else if (choice == 6) {
		        break;
		    }
		}
	}
	
	public static void displayMenu() {
		System.out.println("Enter the operation you want to perform");
		System.out.println("1. Add Student");
		System.out.println("2. View Student");
		System.out.println("3. Search Student");
		System.out.println("4. Update Student");
		System.out.println("5. Delete Student");
		System.out.println("6. End the program");
	}
	
	public static void addStudent(HashMap<Integer,Student> students,Scanner scan) {
		
		System.out.println("Enter the number of students you want to add:");
		int n=scan.nextInt();
		
		for(int i=0;i<n;i++) {
			
			Student s=new Student();
			
			
			System.out.println("Enter the id for student"+ (i+1));
			
			int id=scan.nextInt();
			if(students.containsKey(id)) {
				System.out.println("Student Already exist");
			}
			else {
				
				System.out.println("Enter the name for student"+ (i+1));
				scan.nextLine();
				String name=scan.nextLine();
				System.out.println("Enter the age for student"+ (i+1));
				int age=scan.nextInt();
				System.out.println("Enter the course for student"+ (i+1));
				scan.nextLine();
				String course=scan.nextLine();
				
				s.setId(id);
				s.setName(name);
				s.setAge(age);
				s.setCourse(course);
				
				
				students.put(id, s);
			}
		}
		
	}
	
	public static void viewStudents(HashMap<Integer,Student> students) {
		for(Map.Entry<Integer, Student> map:students.entrySet()) {
			System.out.println(map.getKey()+" "+map.getValue());
		}
	}
	
	public static void searchStudent(HashMap<Integer,Student> students,Scanner scan) {
		System.out.println("Enter the id");
		int stdid=scan.nextInt();
		if(students.containsKey(stdid)) {
			System.out.println(students.get(stdid));
		}
	}
	
	public static void deleteStudent(HashMap<Integer,Student> students,Scanner scan) {
		System.out.println("Enter the student id for deletion");
		int delid=scan.nextInt();
		
		if(students.containsKey(delid)) {
			students.remove(delid);
			System.out.println("Student removed");
		}
		
		else {
			System.out.println("Student not found");
		}
	}
	
	public static void updateStudent(HashMap<Integer,Student> students,Scanner scan) {
		System.out.println("Enter the id for student updating values");
		int updid=scan.nextInt();
		if(students.containsKey(updid)) {
			Student s=students.get(updid);
			scan.nextLine();
			System.out.println("Enter the updating name for " +updid);
			String updname=scan.nextLine();
			System.out.println("Enter the updating age for " +updid);
			int updage=scan.nextInt();
			scan.nextLine();
			System.out.println("Enter the updating course for " +updid);
			String updcourse=scan.nextLine();
			
			s.setId(updid);
			s.setName(updname);
			s.setAge(updage);
			s.setCourse(updcourse);
		}
		else {
			System.out.println("Student not found");
		}
	}

}

package task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class task {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the input");
		System.out.println("1. Add Students");
		System.out.println("2. View all Student");
		System.out.println("3. Delete the student");
		System.out.println("4. Update the student");
		int input=scan.nextInt();
		String[] ar=takeinput(scan);
		
		if(input==1) {
			HashMap<Integer, Student> liststudents=AddStudent(ar);
		}
		else if(input ==2) {
			HashMap<Integer, Student> liststudents=AddStudent(ar);
			for(Map.Entry<Integer, Student> s:liststudents.entrySet()) {
				System.out.println(s.getKey()+" "+s.getValue());
			}
		}
		else if(input==3) {
			HashMap<Integer, Student> liststudents=AddStudent(ar);
			System.out.println("Enter the id for deletion:");
			int delid=scan.nextInt();
			if(liststudents.containsKey(delid)) {
				liststudents.remove(liststudents.values());
				System.out.println("Student deleted");
			}
			else {
				System.out.println("Student not found:");
			}
		}
		
		else if(input==4) {
			HashMap<Integer, Student> liststudents=AddStudent(ar);
			
			System.out.println("Enter the student id towhom you want to update:");
			int updid=scan.nextInt();

			if(liststudents.containsKey(updid)) {
				Student s1=new Student();
				String newvalues=scan.nextLine();

				String [] newdetails=newvalues.split(",");

				int id=Integer.parseInt(newdetails[0]);
				String name=newdetails[1];
				int age=Integer.parseInt(newdetails[2]);
				String course=newdetails[3];


				s1.setName(name);
				s1.setAge(age);
				s1.setCourse(course);

				liststudents.put(id,s1);



			}
			System.out.println("Updated values:");
			for(Map.Entry<Integer,Student> map:liststudents.entrySet()) {
				
				System.out.println(map.getKey()+" "+map.getValue());
			}
		}
	
	}
	public static String[] takeinput(Scanner scan) {
		System.out.println("Enter the number of students with subjects");
		int noOfstds=scan.nextInt();
		scan.nextLine();
		String[] ar=new String[noOfstds];
		for(int i=0;i<ar.length;i++) {
			System.out.println("Enter the student details for "+(i+1));
			ar[i]=scan.nextLine();
		}
		
		return ar;
	}
	
	public static HashMap<Integer,Student> AddStudent(String[] ar) {
		HashMap<Integer,Student> map=new HashMap<>();
		for(int i=0;i<ar.length;i++) {
			String [] data=ar[i].split(",");
			
			int id=Integer.parseInt(data[0]);
			String name=data[1];
			int age=Integer.parseInt(data[2]);
			String course=data[3];
			
		
			
			Student s=new Student();
			s.setId(id);
			s.setName(name);
			s.setAge(age);
			s.setCourse(course);
			map.put(id, s);
			
		}
		
		
		return map;
		
		
	}
	
}

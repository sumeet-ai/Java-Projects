package StudentManagementProject;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		
		
		System.out.println("How many students want to enroll :");
		Scanner sc=new Scanner(System.in);
		int no_of_students=sc.nextInt();
		Student[] students=new Student[no_of_students];
		
		for(int i=0;i<no_of_students;i++) {
			students[i]=new Student();
			students[i].enroll();
			students[i].paytution();
			}
		for(int i=0;i<no_of_students;i++) {

		students[i].showInfo();
		}
	}

}

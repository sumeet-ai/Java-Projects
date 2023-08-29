package StudentManagementProject;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int grade;
	private String studentID; //grade + ID
	private String courses=null;
	private int balance=0;
	private  static int courseCost=600;
	private static int ID=100;
	
	public Student(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your first name ");
		this.firstName=sc.nextLine();
		
		System.out.println("Enter your last name ");
		this.lastName=sc.nextLine();
		
		System.out.println("1.Fresher 2.Senior");
		this.grade=sc.nextInt();
		
		setStudentID();
	}
	
	private String setStudentID() {
		ID++;	
		return studentID=grade+""+ID;
	}
	
	public void enroll() {
		System.out.println("Enter the courses (Press E to exit) ");
		do {
		Scanner sc=new Scanner(System.in);
		String c=sc.nextLine();
		
		if(!c.equals("E")) {
			courses=courses+" "+c;
			balance=+courseCost;
		}
		else {
			break;
		}
	}while(1!=0);
}
	public void getBalance() {
		System.out.println("The outstandning tution balance is :"+balance);
	}
	
	public void paytution() {
		System.out.println("Enter your payment : ");
		Scanner sc=new Scanner(System.in);
		int payment=sc.nextInt();
		balance=balance-payment;
		System.out.println("Thank you for payment of "+payment);
		getBalance();
	}
	
	public void showInfo() {
		System.out.println(firstName+" "+lastName);
		System.out.println("Grade :"+grade);
		System.out.println("Student ID :"+studentID);
		System.out.println("Enrolled Courses : "+courses);
		System.out.println("Outstanding Balance :"+balance);
	}
}

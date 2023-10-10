package com.shiva.client;

import java.util.List;
import java.util.Scanner;

import com.shiva.pojo.Student;
import com.shiva.service.impl.StudentDAOImpl;

public class StudentClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		StudentDAOImpl daoImpl = new StudentDAOImpl();
		while (true) {
			System.out.println("********************************************************");

			System.out.println("                     1)AddStudent                       ");
			System.out.println("                     2)ViewAllStudent                       ");
			System.out.println("                     3)ViewStudent                       ");
			System.out.println("                     4)DeleteStudent                       ");
			System.out.println("                     5)Exit                       ");
			System.out.println("********************************************************");
			System.out.println("Ente The Choice");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter Student Number ");
				int sno = sc.nextInt();
				System.out.println("Enter First Name");
				String fname = sc.next();
				System.out.println("Enter Last Name");
				String lname = sc.next();
				System.out.println("Enter Email");
				String email = sc.next();
				Student stu = new Student(sno, fname, lname, email);

				String message = daoImpl.addStudent(stu);
				System.out.println(message);
				break;
			case 2:
				List<Student> viewAllStudents = daoImpl.viewAllStudents();
				if (viewAllStudents != null) {
					for (Student st : viewAllStudents) {
						System.out.println(st.getSno() + "\t" + st.getFirstName() + "\t" + st.getLastName() + "\t"
								+ st.getEmail());
					}
				} else
					System.out.println("Records not Exist");
				break;
			case 3:
				System.out.println("Enter Student Number");
				Student st = daoImpl.viewStudent(sc.nextInt());
				if (st != null)
					System.out.println(
							st.getSno() + "\t" + st.getFirstName() + "\t" + st.getLastName() + "\t" + st.getEmail());
				else
					System.out.println("Student record is not Exist");
				break;
			case 4:
				System.out.println("Enter Student Number");
				daoImpl.deleteStudent(sc.nextInt());
				break;
			case 5:
				System.out.println("Thx for Using App");
				System.exit(0);
			default:
				System.out.println("Choose 1 to 5 Between");

			}// end of switch

		} // end of while
	}

}

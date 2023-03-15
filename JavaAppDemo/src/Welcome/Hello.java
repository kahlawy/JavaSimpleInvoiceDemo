package Welcome;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Hello {

	public static void main(String[] arges) {

		SquareArea();
		
		// System.out.println("Welcome to Java Programming");

		/*
		 * try { List<String> names = new ArrayList<>(); names.add(0, "Ahmed");
		 * names.add(1, "Hany"); names.add(2, "Adel"); for (String name : names) {
		 * System.out.println("Full Name: "+names.get(2)); } } catch (Exception e) { //
		 * TODO Auto-generated catch block e.printStackTrace(); }
		 */
//		

		// int fNumber =3 ; // 0011
		// int sNumber =5; // 0101

		// Scanner input = new Scanner(System.in);
		/*
		 * System.out.println("Java Simple Calc");
		 * System.out.print("Enter First Number: "); fNumber = input.nextInt();
		 * System.out.print("Enter Second Number: "); sNumber = input.nextInt();
		 * 
		 * //System.out.print("Enter Oprator : "); //String op = input.next();
		 * 
		 * //fNumber ++; int age=6;
		 * 
		 * 
		 * String Result = age >= 6 ?"Your age valid for register at the school"
		 * :"Sorry your  age Invalid for register at the school" ; // 0001 {
		 * System.out.print("Result =  " + Result ); }
		 * 
		 * 
		 * //int score=0;
		 * 
		 * System.out.print("Enter Day Number : "); int days= input.nextInt();
		 * 
		 * switch(days) { case 1: System.out.println("Sat"); break; case 2:
		 * System.out.println("Sun"); break; case 3: System.out.println("Mon"); break;
		 * case 4: System.out.println("Tues"); break; case 5: System.out.println("Wed");
		 * break; case 6: System.out.println("Thru"); break; case 7:
		 * System.out.println("Fri"); break; default:
		 * System.out.println("Out of Range"); break;
		 * 
		 * }
		 * 
		 * 
		 * /* if(score < 50) { System.out.println("راسب"); } else if (score >= 85) {
		 * System.out.println("ممتاز"); } else if (score >= 75) {
		 * System.out.println("جيد جداً"); } else if (score >= 65) {
		 * System.out.println("جيد"); } else if (score >= 50) {
		 * System.out.println("مقبول"); }
		 * 
		 * else { System.out.println("لا يوجد تقدير"); }
		 * 
		 * 
		 * // For loop System.out.println("Enter max loop number");
		 * 
		 * Scanner input = new Scanner(System.in);
		 * 
		 * int max = input.nextInt(); int sum=0;
		 * 
		 * for(int i=1; i<= max;i++) { System.out.println("Loop the message for " + i +
		 * " times"); sum++;
		 * 
		 * } System.out.println("Total messages is   " + sum + " ");
		 * 
		 * 
		 * 
		 * 
		 * int x=6,y=2;
		 * 
		 * try { System.out.println("Result = " + x/y); } catch (Exception ex) { //
		 * TODO: handle exception System.out.println("Error is " + ex.getMessage());
		 * }finally { System.out.println("Thanks for using our system"); }
		 * 
		 * 
		 * 
		 * // Arrays
		 * 
		 * int[] arr = new int[4]; arr[0] = 5; arr[1] = 6; arr[2] = 7; arr[3] = 8;
		 * 
		 * for(int i =0 ; i < arr.length; i++) { System.out.println("Array rray index "
		 * + i + " Vlaus is " + arr[i]); }
		 * 
		 * 
		 * }
		 * 
		 * // Arrays 2D
		 * 
		 * int[][] arr = new int[2][2]; arr[0][0] = 5; arr[0][1] = 6;
		 * 
		 * arr[1][0] = 7; arr[1][1] = 8;
		 * 
		 * for(int i =0 ; i < arr.length; i++) { System.out.println("Array rray index "
		 * + i + " Vlaus is " + arr[i][i]); }
		 * 
		 * 
		 * // Methods
		 * 
		 * //msg("Kahlawy"); //System.out.println("Result = " + sum(5,10)); Employee emp
		 * = new Employee(); emp.setid(1); emp.setName("Kahlawy"); emp.setSalary(25000);
		 * 
		 * //System.out.println("Employee ID: " + emp.getID() + "\nEmployee Name: " +
		 * emp.getName() + "\nEmployee Salary: " + emp.getSalary());
		 * 
		 * //emp.print(); //System.out.println("Employee ID: " + emp.toString());
		 * 
		 * /* Employee emp1 = new Employee(); emp.id=2; emp.name = "Hany";
		 * emp.salary=27000;
		 * 
		 * Employee emp2 = new Employee(); emp.id=3; emp.name = "Khaled";
		 * emp.salary=29000;
		 * 
		 */

		// person p = new person();

		// admin ad = new admin();

		// ad.name= "Mohamed";

		// System.out.println("Adminstrator : " + ad.name);

		// Sysout and press CTRL + Space + Enter
		// System.out.println();

	}

	public static void SquareArea() {
		Square sq = new Square();
		sq.setHeight(12);
		sq.setWidth(12);
		var sqrArea = sq.SquareArea();
		System.out.println("Square Area = " + sqrArea + " cm");
	}

	static void msg(String name) {
		System.out.println("Wecome " + name);
	}

	static int sum(int x, int y) {

		return x + y;

	}

}

interface login {
	public static String user = "";
	public static String pass = "";

	void log();
}

class auth implements login {

	@Override
	public void log() {
		// TODO Auto-generated method stub

	}

}

abstract class person {
	int id;
	String name;
	String address;
	int phone;
}

class admin extends person {

}

class Employee {
	private int id;
	private String name;
	private int salary;

	// Get ID
	// public int getID(){
	// return this.id;
	// }
	// Set ID
	// public void setid(int id) {
	// this.id = id;
	// }

	public int getID() {
		return id;
	}

	public void setid(int id) {
		this.id = id;
	}

	// Get Name
	public String getName() {
		return this.name;
	}

	// Set Name
	public void setName(String name) {
		this.name = name;
	}

	// Get Salary
	public int getSalary() {
		return this.salary;
	}

	// Set Salary
	public void setSalary(int salary) {
		this.salary = salary;
	}
	/*
	 * public Employee(int id,String name, int salary) {
	 * 
	 * this.id = id; this.name = name; this.salary = salary; }
	 * 
	 * void print() { System.out.println("Employee ID: " + this.id +
	 * "\nEmployee Name: " + this.name + "\nEmployee Salary: " + this.salary); }
	 */
}

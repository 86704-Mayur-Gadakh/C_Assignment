import java.util.*;

 class Employee{


String firstName;
String lastName;
double salary;

void emp_init(String firstName,String lastName,double salary){

    this.firstName=firstName;
    this.lastName=lastName;
    this.salary=salary;

}

void raised_Salary(){

double increment_Salary=salary* 10/100+salary;
System.out.print("The Incresed Salary is :"+increment_Salary);

}

void emp_display(){

    System.out.print("First name of employee :"+firstName);
    System.out.print("Last name of employee :"+lastName);
    System.out.print("Salary of employee is :"+salary);


}

    public static void main(String [] args){


Scanner sc=new Scanner (System.in);

System.out.print("Enter the First Name of Employee :");
String firstName=sc.nextLine();

System.out.print("Enter the Last Name of Employee :");
String lastName=sc.nextLine();

System.out.print("Enter the Salary of Employee :");
double salary=sc.nextDouble();


Employee emp=new Employee();

emp.emp_init(firstName,lastName,salary);
emp.emp_display();
emp.raised_Salary();


    }
}
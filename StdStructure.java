import java.util.*;

class StdStructure{

String StudentName,rollNumber;
int marks;


    void acceptInfo(){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the name of Student :");
        StudentName=sc.nextLine();

        System.out.print("Enter the Roll number of student :");
        rollNumber=sc.nextLine();

        System.out.print("Enter the marks of student :");
        marks=sc.nextInt();

    }

    void displayInfo(){
        System.out.println("The name of student is :"+StudentName);
        System.out.println("The Roll Number of student is :"+rollNumber);
        System.out.println("The marks of the student is :"+marks);
    }

    public static void main(String args[]){

        StdStructure std=new StdStructure();
        std.acceptInfo();
        std.displayInfo();
        
    }
}
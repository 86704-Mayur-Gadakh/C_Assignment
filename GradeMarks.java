import java.util.*;

class GradeMarks{

    public static void main(String []args){

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter your marks :");

        int totalMarks=sc.nextInt();

        if(totalMarks >=90){
            System.out.println("Your grade is EX");
        }else if(totalMarks >=80 && totalMarks<90){
            System.out.print("Your grade is A");

        }else if(totalMarks >=70 && totalMarks<80){
            System.out.print("Your grade is B");
        }
        else if(totalMarks>=60 && totalMarks <70){
            System.out.print("Your grade is C");
        }
        else{
            System.out.print("Your grade is F");
        }

    }
}
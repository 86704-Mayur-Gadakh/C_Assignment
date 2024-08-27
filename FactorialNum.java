import java.util.*;

class FactorialNum{


int factorialNumber(int num){
    int fac=1;

    if(num==0){
        System.out.print("Factorial Number is :"+1);
    }else{
        for(int i=2;i<=num;i++){
            fac=fac*i;
        }
    }

    return fac;
}


    public static void main(String []args){


Scanner sc=new Scanner (System.in);
System.out.print("Enter the number :");

int num=sc.nextInt();

FactorialNum fn=new FactorialNum();

System.out.print("The factorial Number is :"+fn.factorialNumber(num));



    }
}
import java.util.*;

class FebonachiSeries{

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the number :");
        int feboNum=sc.nextInt();
        
        int num1=0;

        int num2=1;

System.out.print(num1+ " "+num2);

for(int i =2;i<feboNum;i++){
    int num3=num1+num2;
    System.out.print(" "+num3);

    num1=num2;
    num2=num3;
}




    }
}
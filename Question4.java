import java.util.Scanner;
public class Question4 {
    public static void main(String[] args) {
        //Program to find the smallest number among three numbers
        Scanner sc=new Scanner(System.in);
        int num1,num2,num3;
        int smallest=0;
        System.out.println("Enter the 1st number:");
        num1=sc.nextInt();
        System.out.println("Enter the 2nd number:");
        num2=sc.nextInt();
        System.out.println("Enter the 3rd number:");
        num3=sc.nextInt();
        smallest=num1;

        if((num2<smallest)&&(num2<num3)){
            smallest=num2;
        }else if((num3<smallest)&&(num3<num2)){
            smallest=num3;
        }
        System.out.println("The smallest of three numbers is:"+smallest);

    }
    
}

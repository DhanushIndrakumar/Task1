import java.util.Scanner;
public class Question3 {
    public static void main(String args[]){
        //program to reverse a number
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();//Taking input from the user
        int revNum=0;
        while(num!=0){
            int digit=num%10; //extracting the last digit
            revNum=revNum*10+digit;//adding it to the revNum in such a way that it perfectly aligns
            num=num/10;//changing the value of num
        }
        System.out.println("The reverse of the entered number is:"+revNum);


    }
    
}

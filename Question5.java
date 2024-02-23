import java.util.Scanner;
public class Question5 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int pAmount;
        double finalAmount;
        double discountAmount;
        System.out.println("Enter the purchase amount:");
        pAmount=sc.nextInt();
        if(pAmount<500){
            discountAmount=0;
            finalAmount=pAmount-discountAmount;
            System.out.println("Sorry no discount is applied");
            System.out.println("Amount payable:"+finalAmount);
        }else if((pAmount>=500)&&(pAmount<=1000)){
            discountAmount=0.1*pAmount;
            finalAmount=pAmount-discountAmount;
            System.out.println("discount of 10% is applied");
            System.out.println("Amount payable:"+finalAmount);
        }else if(pAmount>=1000){
            discountAmount=0.2*pAmount;
            finalAmount=pAmount-discountAmount;
            System.out.println("discount of 20% is applied");
            System.out.println("Amount payable:"+finalAmount);
        }else{
            System.out.println("Invalid purchase Amount entered");
        }

    }
    
}

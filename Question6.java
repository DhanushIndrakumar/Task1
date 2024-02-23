import java.util.Scanner;
public class Question6 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int rows=sc.nextInt();
        for (int i = rows; i >= 1; i--) { // Controlling Rows of the pattern
            for (int j = rows; j >= 1; j--) { //Controlling columns of the pattern
                if (j <= i) //If the current column is less than or equal to current row index just print current row number
                    System.out.print(i);
                else
                    System.out.print(j); //Otherwise print the column number this ensures that it always starts from highest number 
            }
            System.out.println();//moving to the next Line after each iteration
        }

    }
    
}

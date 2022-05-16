package Inheritance.Lab;
import java.util.Scanner;

public class CdAccount extends Account{

    private int months;
    Scanner input = new Scanner(System.in);

    public CdAccount(int accountNum, double amount)
    {
       super(accountNum, "certificate of deposit", amount);
    }
 
    public void term(int months)
    {
       int month;
       System.out.println("Please choose how many months between: 6, 12, 24, 36");
      month = input.nextInt();
      if(month == 6 || month == 12 || month == 24 || month == 36){
         months = month;
      }
       this.months = months;
    }

    public int getTerm()
    {
       return months;
    }

}


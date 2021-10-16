import java.io.*;

 class Account
 {
   int balance;
   float salary;
   Account()
    {
     balance=100;
     salary=6000;
    }
 }

 class Programmer extends Account
 {
  
   float bonus;
   Programmer()
    {
     bonus=5000;
    }
   void dis()
    {
      System.out.println("\nbalance="+balance+", salary="+salary+",bonus="+bonus);
    }
  }

 class SingleInherit
  {
    public static void main(String args[])
     {
        Programmer p=new Programmer();

        p.dis();

        System.out.println("\nbalance: "+p.balance);
        System.out.println("Salary: "+p.salary);
	System.out.println("bonus: "+p.bonus);
	
      }
  }

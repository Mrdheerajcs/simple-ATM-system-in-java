package com.example.atm;

import org.springframework.boot.SpringApplication;
import java.util.Scanner;

class ATM {
    private double bal = 10000;
    private int pwd;
    private int n_pwd,c_pwd,password=1256;

    public void bal_cheak()
    {
        System.out.print("Enter Password: ");
        Scanner s=new Scanner(System.in);
        pwd = s.nextInt();
        if(pwd==password)
        {
            System.out.print("Total Balance: "+bal);
        }
        else
        {
            System.out.println("Incorrect Password");
        }
    }

    public void deposite()
    {
        System.out.print("Enter Password: ");
        Scanner s=new Scanner(System.in);
        pwd = s.nextInt();
        if(pwd==password)
        {
            double money;
            System.out.print("Enter Deposite Money: ");
            Scanner s1=new Scanner(System.in);
            money = s1.nextDouble();
            bal = bal+money;
            System.out.println("Deposite Money: "+money);
            System.out.print("Total Balance: "+bal);
        }
        else
        {
            System.out.println("Incorrect Password");
        }
    }

    public void withdrow()
    {
        System.out.print("Enter Password: ");
        Scanner s=new Scanner(System.in);
        pwd = s.nextInt();
        if(pwd==password)
        {
            double money;
            System.out.print("Enter Withdrow Money: ");
            Scanner s1=new Scanner(System.in);
            money = s1.nextDouble();
            if(money <= bal){
                bal = bal-money;
                System.out.println("Withdrow Money: "+money);
                System.out.print("Total Balance: "+bal);
            }
            else {
                System.out.println("Enciffience Balance");
            }
        }
        else
        {
            System.out.println("Incorrect Password");
        }
    }

    public void change_pwd()
    {

        System.out.print("Enter Old Password: ");
        Scanner s=new Scanner(System.in);
        pwd = s.nextInt();
        if(pwd==password)
        {
            System.out.print("Enter New Password: ");
            Scanner s1=new Scanner(System.in );
            n_pwd=s1.nextInt();
            System.out.print("Enter Comform Password: ");
            Scanner sc=new Scanner(System.in);
            c_pwd=sc.nextInt();
            if(n_pwd==c_pwd)
            {
                System.out.print("Your New Password: "+n_pwd);
            }
            else
            {
                System.out.println("Incorrect Password");
            }
        }
        else
        {
            System.out.println("Incorrect Password");
        }
    }
}
class AtmApplication {
    public static void main(String[] args) {
        System.out.println("WELCOM TO AITS ATM");
        int ch;
        ATM AtmApplication = new ATM();
        while (true) {
            System.out.println("\nPress 1: For Deposite Money");
            System.out.println("Press 2: For Withdrow Money");
            System.out.println("Press 3: For Change Password");
            System.out.println("Press 4: For Balance Enquiry");
            System.out.println("Press 5: For Exit");
            System.out.print("Enter Your Coise: ");
            Scanner s2 = new Scanner(System.in);
            ch = s2.nextInt();

            switch (ch)
            {
                case 1:
                    AtmApplication.deposite();
                    break;
                case 2:
                    AtmApplication.withdrow();
                    break;
                case 3:
                    AtmApplication.change_pwd();
                    break;
                case 4:
                    AtmApplication.bal_cheak();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid Choise Please Try Again");
            }
        }
    }
}

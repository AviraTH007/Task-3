

package com.mycompany.atminterface;


import java.util.*;
public class AtmInterface {
    int balance=10000;
    public static void main(String[] args) {
        int choice,check=1;
        Scanner sc=new Scanner(System.in);
        AtmInterface obj=new AtmInterface();
        while(check==1){
            System.out.println("Withdraw---->1\nDeposit---->2\nCheck Balance---->3\n");
            System.out.println("Enter your choice");
            choice=sc.nextInt();
            switch(choice){
                case 1:obj.Withdraw();
                    break;
                case 2:obj.Deposit();
                    break;
                case 3:obj.CheckBalance();
                    break;
                case 4:System.exit(0);
                    break;
                default:System.out.println("Invalid Option");
            }
            System.out.println("\n1---->Continue\n0---->Exit");
            check=sc.nextInt();
        }
    }

    public void Withdraw() {
        int amount=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount to be withdrawn");
        amount=sc.nextInt();
        if(balance>=amount){
            if(amount%500==0){
                balance=balance-amount;
                System.out.println("Withdraw Successful");
                System.out.println("Balance\n"+balance);
            }
            else
                System.out.println("Enter amount in multiples of 500");
        }
        else
            System.out.println("Insufficient Balance");

    }

    public void Deposit() {
        int amount=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter amount to deposit");
        amount=sc.nextInt();
        if(amount%100==0){
            balance=balance+amount;
            System.out.println("Deposit Successful");
            System.out.println("Balance\n"+balance);
        }
        else
            System.out.println("Enter amount in multiples of 100");
    }

    public void CheckBalance() {
        System.out.println("Balance\n"+balance);
    }

}
package overdrawn.at.the.bank;

import java.io.*;

import java.util.*;
//includes ArrayList import java.text.*;

public class OverdrawnAtTheBank {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        String name;
        ArrayList al = new ArrayList();
        do {
            
            System.out.print("Please enter the name to whom the account belongs. (\"Exit\" to abort)");
            
            name = sc.next();
            

            if (!name.equalsIgnoreCase(
                    "EXIT")) {
                System.out.print("Please enter the amount of the deposit. ");
                double amount = sc.nextDouble();
                System.out.println(" ");
                BankAccount ba = new BankAccount(name,amount);
                al.add(ba);
                
            }
        } while (!name.equalsIgnoreCase("EXIT"));
        //Search aryList and print out the name and amount of the largest bank account    
        BankAccount ba = (BankAccount)(al.get(0));
        double maxBalance = ba.balance;
        String maxName = ba.name;
        for (int j = 1; j < al.size(); j++) {
            BankAccount batemp = (BankAccount)(al.get(j));
            if(batemp.balance>maxBalance){
                maxName = batemp.name;
                maxBalance = batemp.balance;
            }
        }
        System.out.println(maxName);
        System.out.println(maxBalance);
    }

}

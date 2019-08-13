package isabella;

import java.io.File;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Scanner;

/**
 * @Henderson Computer Science UIL team
 * Captain - Clint Boyett
 */
public class Isabella {

    public static void main(String[] args) throws IOException {
        LedgerChecker ledgerChecker = new LedgerChecker();
        ledgerChecker.checkLedgers();
    }

}

final class LedgerChecker {

    private Scanner sc;
    private Hashtable<String, Double> conversions;

    LedgerChecker() throws IOException {
        sc = new Scanner(new File("isabella.dat"));
        conversions = new Hashtable<>();
    }
    
    public void checkLedgers(){
        fillConvertions();
        processLedgers();
    }

    private boolean checkIfEqual() {
        int count = sc.nextInt();
        sc.nextLine();
        String [] deposits = new String[count];
        for (int i = 0; i < count; i++) {
            deposits[i] = sc.nextLine();
        }
        String line = sc.nextLine();
        double total = Double.parseDouble(line.substring(0, line.lastIndexOf(" ")).trim());
        String country = line.substring(line.lastIndexOf(" ")).trim();
        double sum = 0;
        for(String el: deposits){
            double amount = Double.parseDouble(el.substring(0, el.lastIndexOf(" ")).trim());
            String depositCountry = el.substring(el.lastIndexOf(" ")).trim();
            if(depositCountry.equals(country)){
                sum += amount;
            }
            else{
                amount *= conversions.get(depositCountry+" "+country);
                sum += amount;
            }
        }
        return sum==total;
    }
    
    private void processLedgers(){
        int count = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < count; i++) {
            if (checkIfEqual()) {
                System.out.println("GOOD LEDGER");
            } else {
                System.out.println("BAD LEDGER");
            }
        }
    }

    private void fillConvertions() {
        int count = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < count; i++) {
            String line = sc.nextLine().trim();
            String ID = line.substring(0, 7);
            double rate = Double.parseDouble(line.substring(7).trim());
            conversions.put(ID, rate);
        }
    }
}

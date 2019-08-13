package the.quizzer;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Qc {

    private int base1, base2, base3, fakeb1, fakeb2, fakeb3;

    private int num1, num2, num3;

    private boolean add;

     String q1q = "5", q1a1="5", q1a2="5", q1a3="5", q1a4="5", corrA="5";
    private String qqa[];

    private int getBases() {
        int k = 0;
        double r = Math.floor((Math.random() * 100) + 1);

        if (r >= 75) {
            k = 16;
        }
        if (75 >= r & r >= 50) {
            k = 10;
        }
        if (50 >= r & r >= 25) {
            k = 8;
        }
        if (25 >= r & r >= 0) {
            k = 2;
        }

        return k;
    }

    private void setBases() {
        base1 = getBases();
        base2 = getBases();
        base3 = getBases();
        fakeb1 = getBases();
        fakeb2 = getBases();
        fakeb3 = getBases();
    }

    private String getBaseSt(int b) {
        String sus;
        switch (b) {
            case 10:
                sus = "₁₀";
                break;
            case 8:
                sus = "₈";
                break;
            case 16:
                sus = "₁₆";
                break;
            default:
                sus = "₂";
                break;
        }
        return sus;
    }

    private void getNum1() {
        num1 = (int) Math.floor((Math.random() * 100) + 1);
        num2 = (int) Math.floor((Math.random() * 100) + 1);

    }

    private void getOP() {
        int r = (int) Math.floor((Math.random() * 100) + 1);

        if (r > 50) {
            add = true;
        } else {
            add = false;
        }

    }

    private void doMath() {
        if (add) {
            num3 = num1 + num2;
        } else {
            num3 = num1 - num2;
            if (num3 < 0) {
                getNum1();
                doMath();
            }
        }
    }

    private String baseCon(int n, int b) {

        String snum;
        switch (b) {
            case 10:
                snum = Integer.toString(n);
                break;
            case 8:
                snum = Integer.toOctalString(n);
                break;
            case 16:
                snum = Integer.toHexString(n);
                break;
            default:
                snum = Integer.toBinaryString(n);
                break;
        }

        return snum;

    }

    private void set_q1q() {
        getBases();
        getNum1();
        getOP();
        doMath();
        setBases();
        q1q = "What is " + baseCon(num1, base1)+" base "+ base1 + ((add) ? " + " : " - ") + baseCon(num2, base2)+" base "+base2 + "?";
    }
    
    String get_q1q(){
        set_q1q();
        set_q1a();
        return q1q;
        
    }

    private String[] arr_q1a() {
        String a1, a2, a3, a4;
        //stoping here, add randum numbers for randum answer
        int r = (int) Math.floor((Math.random() * 100) + 1);
        String zq1a1 = "" + baseCon(num3, base3) + getBaseSt(base3);
        corrA = zq1a1;
        String zq1a2 = "" + baseCon(r, fakeb1) + getBaseSt(fakeb1);
        r = (int) Math.floor((Math.random() * 100) + 1);
        String zq1a3 = "" + baseCon(r, fakeb2) + getBaseSt(fakeb2);
        r = (int) Math.floor((Math.random() * 100) + 1);
        String zq1a4 = "" + baseCon(r, fakeb3) + getBaseSt(fakeb3);
        String[] q1a = {zq1a1, zq1a2, zq1a3, zq1a4};
        return q1a;

    }

    private void scrammbleA(String[] ar) {

        Random rnd = ThreadLocalRandom.current();
        for (int i = ar.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);

            String a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;
        }
    }

    void set_q1a() {
        String[] arr = arr_q1a();
        scrammbleA(arr);
        q1a1 = arr[0];
        q1a2 = arr[1];
        q1a3 = arr[2];
        q1a4 = arr[3];
    }
/*
    String get_q1a1() {
        return q1a1;
    }

    String get_q1a2() {
        return q1a2;
    }

    String get_q1a3() {
        return q1a3;
    }

    String get_q1a4() {
        return q1a4;
    }
*/

    String get_rightA() {
        return corrA;
    }

}

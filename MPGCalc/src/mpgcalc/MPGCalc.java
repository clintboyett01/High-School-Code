
package mpgcalc;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;


class roads{
    String roadName;
    int miles;
    double fillUp;
    double Av;
    int timesA= 0;
    roads(int m,double f,String r){
        miles =m;
        fillUp=f;
        roadName=r;
        timesA++;
        getAvfst();
    }
    void getAvfst(){
        Av = miles/fillUp;
        
    }
    double getAvn(int m, double f){
        return m/f;
    }
    void getAv(int m, double f){
        Av = ((Av*timesA) + getAvn(m,f))/(timesA+1);
        timesA++;
    }
    
}

public class MPGCalc {

    
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("mpgcalc.dat"));
        Map<String,Double> hm;
        hm = new TreeMap();
        
        //ArrayList<roads> al = new ArrayList<>();
        int currentMiles = sc.nextInt();
        sc.nextLine();
        while(sc.hasNext()){
            String line [] = sc.nextLine().split(" ");
            int nm = Integer.parseInt(line[0]);
            double fl = Double.parseDouble(line[1]);
            String hwnm = line[2];
            int m = nm-currentMiles  ;
            currentMiles = nm;
            //roads r = new roads(m,fl,hwnm);
            double mpg = m/fl;
            hm.put(hwnm,mpg);
            
        }
        Set s = hm.entrySet();
        Iterator<String> i = s.iterator();
        System.out.println(hm.size());
        while(i.hasNext()){
            Object key = i.next();
            Double value  = hm.get(key);
            System.out.println(key+"------------"+value);
            
        }
        
        
    }
    
}

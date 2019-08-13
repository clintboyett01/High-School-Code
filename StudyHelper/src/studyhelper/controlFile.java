/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studyhelper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author Clint
 */
public class controlFile {

    Scanner sc;
    Map<String, ArrayList> data = new TreeMap<>();

    public controlFile() throws IOException {
        sc = new Scanner(new File("tests.dat"));
        while(sc.hasNext()){
            ArrayList<String> al = new ArrayList<>();
            String name = sc.nextLine();
            al.add(sc.nextLine());            
            String tot = sc.nextLine();
            al.add(tot);  
            al.add(sc.nextLine());  
            String wron = sc.nextLine();
            al.add(wron);              
            al.add("Percent");  
            al.add(per(tot,wron));              
            data.put(name, al);
            try{
            sc.nextLine();
            }
            catch(Exception e){
            }
        }
    }

    public void printData() {
        System.out.println(data);
        for(String key: data.keySet()){
            System.out.println(key);
            ArrayList<String> temp = data.get(key);
            for(String el: temp){
                System.out.println(" "+el);
            }
            System.out.println("");
        }
    }
    
    private String per(String s1, String s2){
        int bot = Integer.parseInt(s1);
        int top = Integer.parseInt(s2);
        double p = (top/(bot*1.0))*100;
        String ret = ""+p;
        return ret;
    }
}


package worldedit;

import java.io.*;
import java.awt.GraphicsEnvironment;
import java.net.URISyntaxException;
import java.util.Scanner;
public class WorldEdit{
    public static void main (String [] args) throws IOException, InterruptedException, URISyntaxException{
        Console console = System.console();
        Scanner sc = new Scanner(System.in);
        if(console == null && !GraphicsEnvironment.isHeadless()){
            String filename = WorldEdit.class.getProtectionDomain().getCodeSource().getLocation().toString().substring(6);
            Runtime.getRuntime().exec(new String[]{"cmd","/c","start","cmd","/k","java -jar \"" + filename + "\""});
        }else{
            System.out.println("Program has ended, please type 'exit' to close the console");
        }
        
    }
}
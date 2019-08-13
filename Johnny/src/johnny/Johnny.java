package johnny;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * @Henderson Computer Science UIL team
 */
public class Johnny {

    public static void main(String[] args) throws IOException {
        Scanner count = new Scanner(new File("johnny.dat"));
        int terms = 0;
        while (count.hasNext()) {
            String temp = count.nextLine();
            if((temp.charAt(0)+"").matches("\\p{Alnum}")){
                break;
            }
            terms++;
        }
        count.close();
        translation[] dictionary = new translation[terms];
        Scanner sc = new Scanner(new File("johnny.dat"));
        int index = 0;
        while (index < terms) {
            String line = sc.nextLine();
            String symbol = line.charAt(0) + "";
            line = line.substring(2);
            String[] words = line.split("/");
            translation temp = new translation(symbol, words);
            dictionary[index] = temp;
            index++;
        }
        while(sc.hasNext()){
            String phrase = sc.nextLine();
            String sentenceWords[] = phrase.split(" ");
            String translation = "";
            for (int i = 0; i < sentenceWords.length; i++) {
                for (int j = 0; j < dictionary.length; j++) {
                    for (int k = 0; k < dictionary[j].words.length; k++) {
                        if(dictionary[j].words[k].equalsIgnoreCase(sentenceWords[i])){
                            translation+=dictionary[j].symbol;
                        }
                    }
                }
            }
            System.out.println(translation);
        }
    }

}

class translation {

    String symbol;
    String words[];

    translation(String symbol, String arr[]) {
        this.symbol = symbol;
        words = arr.clone();
    }
}

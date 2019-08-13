import javafx.scene.shape.Circle;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Scanner;
import java.util.function.BinaryOperator;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("data.dat"));
        int count = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < count; i++) {
            System.out.println("I like "+sc.nextLine()+".");
        }

        BinaryOperator
    }
}

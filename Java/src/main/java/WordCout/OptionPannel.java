package WordCout;

import java.io.IOException;
import java.util.Scanner;

public class OptionPannel {

    Scanner scanner = new Scanner(System.in);
    String userChoice;

    public void chooseOption () throws IOException {

        System.out.println("---Welcome to WordCount App---");

        do {
            System.out.println("---Please Choose Your Option below---");
            System.out.println("C: take input from console" );
            System.out.println("F: take input from a text file" );
            System.out.println("E: exit" );

            userChoice = scanner.nextLine();

            if (userChoice.equals("c")){
                System.out.println("Please input from commandline:");
                FromCommand fc = new FromCommand();
                fc.reformat();
                fc.numberOfWords();
                fc.numberOfTimes();
                fc.distinctWords();
            } else if(userChoice.equals("f")){
                System.out.println("Type in the text file directory: ex E:\\CodingTest\\Java\\TestSample.txt");
                FromFile ff = new FromFile();
                ff.reformat();
                ff.numberOfWords();
                ff.numberOfTimes();
                ff.distinctWords();
            }
        } while (!userChoice.equals("e"));

        System.out.println("Bye Bye!");
    }

}


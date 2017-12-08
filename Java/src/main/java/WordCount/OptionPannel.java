package WordCount;

import org.apache.commons.io.FileUtils;

import java.io.File;
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
                Scanner scanner = new Scanner(System.in);
                String input = scanner.nextLine();

                Layout lo = new Layout();
                lo.output(input);

            } else if(userChoice.equals("f")){

                System.out.println("Type in the text file directory: ex E:\\CodingTest\\Java\\TestSample.txt");
                Scanner scanner = new Scanner(System.in);
                String input = scanner.nextLine();
                String path = input.replaceAll("\\\\", "\\\\\\\\");

                File file = new File(path);
                String str = FileUtils.readFileToString(file);

                Layout lo = new Layout();
                lo.output(str);

            }
        } while (!userChoice.equals("e"));

        System.out.println("Thanks You!");
    }

}


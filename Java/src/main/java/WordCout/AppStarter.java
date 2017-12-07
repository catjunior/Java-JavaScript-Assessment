package WordCout;

import java.io.FileNotFoundException;

public class AppStarter {
    public static void main(String[] args) throws FileNotFoundException {
//        System.out.println("Please enter your words");
//
//        FromCommand cl = new FromCommand();
//        cl.reformat();
//        cl.numberOfWords();
//        cl.numberOfTimes();
//        cl.distinctWords();

        FromFile a = new FromFile();
        a.print();
    }
}

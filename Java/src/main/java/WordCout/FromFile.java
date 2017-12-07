package WordCout;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class FromFile {

    File file = new File("E:\\CodingTest\\Java\\FromFileSample.txt");
    Scanner scanner = new Scanner(file);
    String input = scanner.nextLine();

    public FromFile() throws FileNotFoundException {
    }

    public void print(){
        System.out.println(input);
    }


}

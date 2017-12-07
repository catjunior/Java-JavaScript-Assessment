package WordCout;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Layout {

    private String str;
    WordCountService wcs = new WordCountService();

    public void output (String input){

        str = input;

        System.out.println("---Total number of words---");
        System.out.println(wcs.numberOfWords(str));

        System.out.println("---Each word count---");
        Map<String, Integer> map = wcs.numberOfTimes(str);
        for (String word : map.keySet()) {
            System.out.println(word + ": " + map.get(word));
        }

        System.out.println("---Distinct Words---");
        Set<String> set = wcs.distinctWords(str);
        for (String word : set) {
            System.out.println(word);
        }

    }

}

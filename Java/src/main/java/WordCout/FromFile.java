package WordCout;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

import java.util.*;

public class FromFile {

    private String [] wordsArr;
    private Map<String, Integer> wordMap;

    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();

    String path = input.replaceAll("\\\\", "\\\\\\\\");

    File file = new File(path);
    String str = FileUtils.readFileToString(file);


    FromFile() throws IOException {}

    public void reformat (){
        String wordsOnly = str.replaceAll("[^A-Za-z]+", " ").toLowerCase();
        wordsArr = wordsOnly.split(" ");
    }

    //count the length of the array which is the total number of words
    public int numberOfWords(){
        int count = wordsArr.length;
        System.out.println("---Total number of words---");
        System.out.println(count);
        return count;
    }

    //use TreeMap to store the words and its occurrence by alphabetical order
    public Map<String, Integer> numberOfTimes(){
        Map<String, Integer> map = new TreeMap<String, Integer>();
        for (String word : wordsArr) {
            Integer numberOfWords = map.get(word);
            if (numberOfWords == null) {
                numberOfWords = 0;
            }
            map.put(word, ++numberOfWords);
        }
        System.out.println("---Each word count---");
        for (String word : map.keySet()) {
            System.out.println(word + ": " + map.get(word));
        }
        wordMap = map;
        return map;
    }

    //input the TreeMap from previous into set, filtering out the duplicates
    public Set<String> distinctWords(){
        Set<String> set = new TreeSet<String>();
        for (String word : wordMap.keySet()) {
            set.add(word);
        }
        System.out.println("---Distinct Words---");
        for (String word : set) {
            System.out.println(word);
        }
        return set;
    }

}

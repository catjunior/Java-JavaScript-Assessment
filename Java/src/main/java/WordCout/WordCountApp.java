package WordCout;

import java.util.*;

public class WordCountApp {

    Scanner scanner = new Scanner(System.in);
    String initialInput = scanner.nextLine();
    String [] wordsArr;
    private Map<String, Integer> wordMap;

    public String[] reformat (){
        String wordsOnly = initialInput.replaceAll("[^A-Za-z]+", " ").toLowerCase();
        String[] trimmedInput = wordsOnly.split(" ");
        wordsArr =  trimmedInput;
        return wordsArr;
    }

    public int numberOfWords(){
        int count = wordsArr.length;
        System.out.println("---Total number of words---");
        System.out.println(count);
        return count;
    }

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

    public static void main(String[] args) {

        System.out.println("Please enter your words");

        WordCountApp test = new WordCountApp();

        test.reformat();
        test.numberOfWords();
        test.numberOfTimes();
        test.distinctWords();

    }
}

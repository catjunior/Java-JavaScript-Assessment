package WordCout;

import java.util.*;

public class WordCountService {

    //format initial input into words only
    public String [] reformat (String input){
        String result = input.replaceAll("[^A-Za-z]+", " ").toLowerCase();
        String [] wordsArr = result.split(" ");
        return wordsArr;
    }

    //count the length of the array which is the total number of words
    public int numberOfWords(String input1){
        //reformat the input
        String [] wordsArr1 = reformat(input1);
        int count = wordsArr1.length;
        return count;
    }

    //use TreeMap to store the words and its occurrence by alphabetical order
    public Map<String, Integer> numberOfTimes(String input2){
        String [] wordsArr2 = reformat(input2);
        Map<String, Integer> map = new TreeMap<String, Integer>();
        for (String word : wordsArr2) {
            Integer numberOfWords = map.get(word);
            //null means the word as not been enter yet
            //set it to zero now, when map.put() called will add by one
            if (numberOfWords == null) {
                numberOfWords = 0;
            }
            //if it already has value, add by one
            map.put(word, ++numberOfWords);
        }
        return map;
    }

    //return a set of key from Map<words, count>, I only need the key
    public Set<String> distinctWords(String input3){
        //called numberOfTimes() get to the map with words as key
        Map<String, Integer> wordMap = numberOfTimes(input3);
        Set<String> set = new TreeSet<String>();
        for (String word : wordMap.keySet()) {
            set.add(word);
        }
        return set;
    }

}

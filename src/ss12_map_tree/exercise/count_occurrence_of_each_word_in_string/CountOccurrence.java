package ss12_map_tree.exercise.count_occurrence_of_each_word_in_string;

import java.util.*;

public class CountOccurrence {
    public static void main(String[] args) {
        String str="mot la hai la ba la bon la nam";
        String[]arr=str.split(" ");
        Map<String,Integer> strMap= new TreeMap<>();
        strMap.put("la",1);
        Map.Entry<String,Integer> entrySet= strMap.entrySet().iterator().next();
        for (int i = 0; i <arr.length ; i++) {
            if("la".equalsIgnoreCase(arr[i])){

            }
        }
    }
}

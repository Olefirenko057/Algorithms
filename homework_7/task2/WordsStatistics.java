package org.example.lesson7.homework_7.task2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WordsStatistics {
    public static void main(String[] args) {
        // Постройте частотный словарь букв русского (или английского) алфавита (количество различных букв,
        //   которые встречаются в тексте);
        //
        //
        //
        //для решения можно использовать Array или HashMap ( на ваше усмотрение).
        String text = "In addition to the keywords, Java reserves three " +
                "other names that have been part of Java from the " +
                "start: true, false, and null. These are values defined by Java. You may not use these words for" +
                " the names of variables, classes, and so on.";

        System.out.println(getOccurrencesWithMap(text));
       getOccurrencesWithArray(text);
    }

    public static Map<Character,Integer> getOccurrencesWithMap(String text) {
        List<Character> list = text.toLowerCase().chars()
                .mapToObj(x -> (char) x)
                .filter(x -> x != ',' && x != '.' && x != ':' && x != ' ')
                .collect(Collectors.toList());
        Map<Character,Integer> map = new HashMap<>();
        for (Character character : list) {
            if(!map.containsKey(character)) {
                map.put(character,1);
            } else {
                map.put(character,map.get(character) + 1);
            }
        }
        return map;
    }

    public static void getOccurrencesWithArray(String text) {
        int[] lettersDigits = new int[26];
        for (char character : text.toCharArray()) {
            if(Character.isLetter(character)) {
                char ch = Character.toUpperCase(character);
                int index = ch - 'A';
                lettersDigits[index]++;
            }
        }
        for (char i = 'A'; i <= 'Z' ; i++) {
            int index = i - 'A';
            System.out.println(i + " " + lettersDigits[index]);
        }
    }
}

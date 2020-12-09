package de.advent_of_code.days;

import de.utils.ReadFile;

import java.util.ArrayList;
import java.util.List;

public class day6 {

    public static void main(String[] args) {

        List<String> list = ReadFile.readFile("/home/juha/Downloads/AdventCode/resource/data/day6");

        ArrayList<String> resultArray = day6.getGroupedArray(list);

        int count = 0;

        for (String s : resultArray) {
            count += s.length();
        }

        System.out.println("\nFinal count: " + count);

    }

    public static ArrayList<String> getGroupedArray(List<String> list){

        StringBuilder groupString = new StringBuilder();
        ArrayList<String> resultArray = new ArrayList<>();

        for (String s : list) {

            // empty lne = new group
            if (s.isEmpty()) {

                // add finished groupstring & reset
                resultArray.add(groupString.toString());
                groupString = new StringBuilder();
            }

            for (int i = 0; i < s.length(); i++) {

                // if char not in string, add it
                if (!groupString.toString().contains(Character.toString(s.charAt(i)))) {
                    groupString.append(s.charAt(i));
                }
            }
        }
        return resultArray;
    }

}



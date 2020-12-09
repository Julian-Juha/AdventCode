package de.advent_of_code.days;

import de.utils.ReadFile;

import java.util.List;

public class day3 {

    public static void main(String[] args) {

        List<String> list;
        list = ReadFile.readFile("/home/juha/Downloads/AdventCode/resource/data/day3");

        int treesHit = 0;
        int i = 0;

        for (int j = 1; j < list.size(); j++) {

            i += 3;

            if (i > list.get(i).length() - 1) {
                i = i - list.get(i).length();
            }

            if (list.get(j).charAt(i) == '#') {

                treesHit++;

            }

        }
        System.out.print("Trees hit: " + treesHit);
    }
}


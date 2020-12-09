package de.advent_of_code.days;

import de.utils.ReadFile;

import java.util.*;

public class day5 {

    public static void main(String[] args) {

        List<String> list = ReadFile.readFile("/home/juha/Downloads/AdventCode/resource/data/day5");

        List<Integer> arrayIDs = new ArrayList<>();

        for (String s : list) {

            // get row, only 0-7 in string relevant
            int row = day5.getResult(s.substring(0, 7), 127, 'F');

            // get column, only 7-10 relevant
            int column = day5.getResult(s.substring(7, 10), 7, 'L');

            int resultID = row * 8 + column;

            // all IDs to array
            arrayIDs.add(resultID);

        }

        System.out.print("Highest ID: " + Collections.max(arrayIDs));

        System.out.print("\nMissing Seat found: " + day5.findSeat(arrayIDs));

    }

    public static int getResult(String line, int maxCount, char upperChar) {

        int min = 0;
        int max = maxCount;
        int diff;

        // part 1 - get final half
        for (int i = 0; i < line.length(); i++) {

            diff = max - min;

            if (line.charAt(i) == upperChar) {
                max = (min + (diff / 2));
            } else {
                min = (int) (min + Math.ceil((double) diff / 2));
            }

        }

        // part 2 - get final row/ column
        int finalRow;

        if (line.charAt(line.length() - 1) == upperChar) {
            finalRow = min;
        } else {
            finalRow = max;
        }
        return finalRow;
    }

    public static int findSeat(List<Integer> arrayIDs) {

        Collections.sort(arrayIDs);

        int counter = arrayIDs.get(0);

        for (Integer arrayID : arrayIDs) {

            if (arrayID != counter) {
                return counter;
            }
            counter++;
        }
        return 0;
    }
}



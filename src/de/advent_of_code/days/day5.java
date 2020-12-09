package de.advent_of_code.days;

import de.utils.ReadFile;

import java.util.*;

public class day5 {

    public static void main(String[] args) {

        List<String> list = ReadFile.readFile("/home/juha/Downloads/AdventCode/resource/data/day5");

        List<Integer> arrayIDs = new ArrayList<>();

        for (String s : list) {

//        String s = "BBFFBBFRLL";

            int row = day5.getResult(s.substring(0, 7), 127, 'F');

            int column = day5.getResult(s.substring(7, 10), 7, 'L');

            int resultID = row * 8 + column;

            System.out.print(resultID + "\n");

            arrayIDs.add(resultID);

        }

        System.out.print("Highest ID: " + Collections.max(arrayIDs));

        day5.findSeat(arrayIDs);

    }

    public static int getResult(String line, int maxCount, char upperChar) {

        int min = 0;
        int max = maxCount;
        int diff;

        for (int i = 0; i < line.length(); i++) {

            diff = max - min;

            if (line.charAt(i) == upperChar) {

                max = (min + (diff / 2));

            } else {

                min = (int) (min + Math.ceil((double) diff / 2));

            }

//            System.out.print("Iteration " + i + " Minimum row: " + (min) + " Maximum row: " + max + "\n");

        }

//        System.out.print(line.charAt(line.length() - 1));

        // final row/ column
        int finalRow;

        if (line.charAt(line.length() - 1) == upperChar) {
            finalRow = min;
        } else {
            finalRow = max;
        }

        // final column
//        System.out.print("Final result: " + finalRow + "\n");

        return finalRow;
    }

    public static int findSeat(List<Integer> arrayIDs) {

        Collections.sort(arrayIDs);

        int missingID = 0;

        for (int i = 1; i < arrayIDs.size() - 1; i++) {

            if ((arrayIDs.get(i) != arrayIDs.get(i - 1)+1)) {

                missingID = arrayIDs.get(i);

                // 662 is wrong

            }

            System.out.print((i) + "\n");

        }

        System.out.print("GEFUNDEN " + missingID);


        return 0;
    }
}



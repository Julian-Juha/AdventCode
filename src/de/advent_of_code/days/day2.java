package de.advent_of_code.days;

import de.utils.ReadFile;

import java.util.List;

public class day2 {

    public static void main(String[] args) {

        List<String> list = ReadFile.readFile("resource/data/day2");

        // end result to find
        int totalNumberValidPasswords = 0;
        int resultSecondPart = 0;

        // iterate through data list
        for (String s : list) {

            // split into array with 3 parts
            // 0 prefix with count
            // 1 char to count
            // 2 string to count in
            String[] array = s.split(" ");

            // 0 get how many chars are allowed
            int[] minMax;
            minMax = getCount(array[0]);

            // 1 which char to count?
            char expChar = array[1].charAt(0);

            // 2 count in string
            int actCount;
            actCount = countChars(array[2], expChar);

            // 2.1 part to check index
            if (getSecondPart(array, minMax, expChar)) {
                resultSecondPart++;
            }

            // check & count if pw is correct
            if (actCount >= minMax[0] & actCount <= minMax[1]) {
                totalNumberValidPasswords++;
            }
        }

        System.out.print("Total number of legit passwords: " + totalNumberValidPasswords);
        System.out.print("\n" + "PART 2: Total number of legit passwords: " + resultSecondPart);

    }

    private static int countChars(String passwordToCount, char expChar) {

        // Actual count result
        int actCount = 0;

        for (int i = 0; i < passwordToCount.length(); i++) {
            if (passwordToCount.charAt(i) == expChar)
                actCount++;
        }

        return actCount;
    }

    private static int[] getCount(String arrayPrefix) {

        // Get expCount
        String[] arrayCount = arrayPrefix.split("-");

        // make it a number
        int minimum = Integer.parseInt(arrayCount[0]);
        int maximum = Integer.parseInt(arrayCount[1]);

        return new int[]{minimum, maximum};
    }

    private static boolean getSecondPart(String[] array, int[] minMax, char expChar) {

        if ((array[2].charAt(minMax[0] - 1) == expChar) || (array[2].charAt(minMax[1] - 1) == expChar)) {
            if (!((array[2].charAt(minMax[0] - 1) == expChar) && (array[2].charAt(minMax[1] - 1) == expChar))) {

                return true;

            }
        }
        return false;
    }
}

